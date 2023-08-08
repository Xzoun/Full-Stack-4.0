package Servicios;

import Entidades.Prestamo;
import Persistencia.Controladora;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class PrestamoServicios {

    ClienteServicios clienteServ = new ClienteServicios();
    LibroServicios libroServ = new LibroServicios();
    ArrayList<Prestamo> prestamos = new ArrayList();
    Controladora ctrl = new Controladora();
    Input input = new Input();

    public void cargarDB() {
        prestamos = ctrl.cargarDBPrestamo();
    }

    public Prestamo crearPrestamo() throws Exception {
        // CREAMOS EL OBJETO VACIO 
        Prestamo nuevoPrestamoAuxiliar = new Prestamo();

        //CARGAMOS EL LIBRO
        nuevoPrestamoAuxiliar.setLibro(libroServ.logicaAgregacion());

        // VALIDAMOS EL LIBRO Y CARGAMOS EL CLIENTE
        if (nuevoPrestamoAuxiliar.getLibro() != null) {
            nuevoPrestamoAuxiliar.setCliente(clienteServ.logicaAgregacion());

            // VALIDAMOS EL CLIENTE Y CARGAMOS EN LA BASE DE DATOS
            if (nuevoPrestamoAuxiliar.getCliente() != null) {
                //CREAMOS EL OBJETO Y CARGAMOS LOS DATOS EN EL CONSTRUCTOR
                Prestamo nuevoPrestamo = new Prestamo(true);
                nuevoPrestamo.setLibro(nuevoPrestamoAuxiliar.getLibro());
                nuevoPrestamo.setCliente(nuevoPrestamoAuxiliar.getCliente());
                try {
                    ctrl.crearPrestamo(nuevoPrestamo);
                    cargarDB();
                    System.out.println("\t ---- Prestamo cargado con exito! ----");

                    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", new Locale("es", "ES"));
                    String devolucion = formato.format(nuevoPrestamo.getFechaDevolucion());

                    System.out.println("Devolucion esperada para el dia: " + devolucion);
                } catch (Exception e) {
                    System.out.println("Lo sentimos. No se pudo realizar la carga del Prestamo.");
                }
                return nuevoPrestamo;
            } else {
                System.out.println("Lo sentimos intentelo de nuevo.");
            }
            //SI NO CONSIGUIO ESCRIBIR EL CODIGO CORRECTO 
        } else {
            System.out.println("Lo sentimos intentelo de nuevo.");
        }
        return null;
    }

    public void cargarDevolucion() throws Exception {
        if (!prestamos.isEmpty()) {
            //SIRVE PARA SALIR DEL BUCLE CUANDO SEA CORRECTO EL CODIGO
            boolean codigoValido = false;
            //SIRVE PARA LIMITAR LOS INTENTOS DEL INGRESO DEL CODIGO
            Integer contador = 0;

            do {
                System.out.print("Ingrese el ID del Prestamo | Si no ingrese 0 (cero): ");
                Long id = input.inputLong();

                if (id != 0) {

                    //SI INGRESA UN ID LO VALIDAMOS 
                    if (validarCodigo(id)) {

                        //SI ES VALIDO LO ASIGNAMOS                    
                        Prestamo prestamo = obtenerPrestamo(id);
                        prestamo.setPrestado(false);
                        ctrl.modificarPrestamo(prestamo);
                        cargarDB();
                        codigoValido = true;
                        System.out.println("Devolucion cargada con Exito!");

                    } else {

                        //SI NO ES VALIDO SUMAMOS UN INTENTO 
                        System.out.print("Ingresaste " + id + " | ID no encontrado.");
                        contador++;
                    }

                } else {

                    // SI NO INGRESA UN ID LE MOSTRAMOS LOS PRESTAMOS
                    filtrar();
                }
            } while (!codigoValido && contador < 3);
        } else {
            System.out.println("No se registran prestamos.");
        }
    }

    public void filtrar() {
        Boolean coincidencia = false;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getPrestado()) {
                System.out.println(prestamo.toString());
                coincidencia = true;
            }
        }
        if (!coincidencia) {
            System.out.println("No se registran libros sin devolver");
        }

    }

    public Prestamo obtenerPrestamo(Long id) {
        Integer contador = 0;
        boolean codigoValido = false;

        while (!codigoValido && contador < prestamos.size()) {
            if (prestamos.get(contador).getId().equals(id)) {
                codigoValido = true;
            } else {
                contador++;
            }
        }

        return prestamos.get(contador);
    }

    public Boolean validarCodigo(Long id) {
        boolean codigoValido = false;
        Integer contador = 0;

        if (!prestamos.isEmpty()) {

            while (!codigoValido && contador < prestamos.size()) {
                if (prestamos.get(contador).getId().equals(id)) {
                    codigoValido = true;
                }
                contador++;
            }

        } else {
            System.out.println("No se registran prestamos cargados.");
        }
        return codigoValido;
    }

}
