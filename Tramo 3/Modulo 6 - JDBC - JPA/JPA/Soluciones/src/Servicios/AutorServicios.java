package Servicios;

import Entidades.Autor;
import Persistencia.Controladora;
import java.util.ArrayList;

public class AutorServicios {

    ArrayList<Autor> autores = new ArrayList();
    Input input = new Input();
    Controladora ctrl = new Controladora();

    public void cargarDB() {
        autores = ctrl.cargarDBAutor();
    }

    public Autor logicaAgregacion() {
        //CREAMOS UNA INSTANCIA DEL AUTOR || SE RETORNARA SI INGRESA 3 VECES MAL EL CODIGO
        Autor nuevoAutor = null;
        //SIRVE PARA SALIR DEL BUCLE CUANDO SEA CORRECTO EL CODIGO
        boolean codigoValido = false;
        //SIRVE PARA LIMITAR LOS INTENTOS DEL INGRESO DEL CODIGO
        Integer contador = 0;

        do {
            System.out.print("Ingrese el ID del Autor | Si no ingrese 0 (cero): ");
            Long id = input.inputLong();

            if (id != 0) {

                //SI INGRESA UN ID LO VALIDAMOS 
                if (validarCodigo(id)) {

                    //SI ES VALIDO LO ASIGNAMOS 
                    nuevoAutor = obtenerAutor(id);
                    codigoValido = true;

                } else {

                    //SI NO ES VALIDO SUMAMOS UN INTENTO 
                    System.out.print("Ingresaste " + id + " | ID no encontrado.");
                    contador++;
                }

            } else {
                // SI NO INGRESA UN ID LE LO TIENE QUE CREAR O BUSCAR.
                System.out.print("Quiere buscar el ID o cargar un Autor nuevo: ");

                //VERDADERO OPCION 1 FALSO OPCION 2
                if (input.inputBoolean("Buscar Codigo", "Crear Autor")) {
                    filtrar();
                } else {
                    nuevoAutor = new Autor(true);

                    try {
                        ctrl.crearAutor(nuevoAutor);
                        cargarDB();
                        codigoValido = true;
                        System.out.println("Registro de Autor Exitoso!");
                    } catch (Exception a) {
                        System.out.println("Lo sentimos. No se pudo realizar la carga del Autor.");
                    }
                }
            }

        } while (!codigoValido && contador < 3);
        //RETORNAMOS LA INSTANCIA DEL AUTOR NUEVO |O| LA INSTANCIA DEL ARRAY |O| NULL
        return nuevoAutor;
    }

    public Autor obtenerAutor(Long id) {
        Integer contador = 0;
        boolean codigoValido = false;

        while (!codigoValido && contador < autores.size()) {
            if (autores.get(contador).getId().equals(id)) {
                codigoValido = true;
            } else {
                contador++;
            }
        }

        return autores.get(contador);
    }

    public Boolean validarCodigo(Long id) {
        boolean codigoValido = false;
        Integer contador = 0;

        if (!autores.isEmpty()) {

            while (!codigoValido && contador < autores.size()) {
                if (autores.get(contador).getId().equals(id)) {
                    codigoValido = true;
                }
                contador++;
            }

        } else {
            System.out.println("No se registran autores cargados.");
        }
        return codigoValido;
    }

    public void filtrar() {
        System.out.println("Mientras mas especifico seas mas corta sera la lista:");
        System.out.print("Ingrese el nombre / apellido del autor: ");
        String nombre = input.leer();
        System.out.println("-------------------------  Autores  -----------------------");
        System.out.println("");
        Boolean coincidencia = false;

        for (Autor autor : autores) {
            if (autor.getAlta() == true && autor.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println(autor.getNombre() + " | ID: " + autor.getId());
            }
        }

        if (!coincidencia) {
            System.out.println("No hay registros de ese autor.");
        }
    }

}
