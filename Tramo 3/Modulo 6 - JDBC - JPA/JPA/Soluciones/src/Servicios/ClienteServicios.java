package Servicios;

import Entidades.Cliente;
import Persistencia.Controladora;
import java.util.ArrayList;

public class ClienteServicios {

    Input input = new Input();
    ArrayList<Cliente> clientes = new ArrayList();
    Controladora ctrl = new Controladora();

    public void cargarDB() {
        clientes = ctrl.cargarDBCliente();
    }

    public Cliente logicaAgregacion() throws Exception {
        //CREAMOS UNA INSTANCIA DEL AUTOR || SE RETORNARA SI INGRESA 3 VECES MAL EL CODIGO
        Cliente nuevoCliente = null;
        //SIRVE PARA SALIR DEL BUCLE CUANDO SEA CORRECTO EL CODIGO
        boolean codigoValido = false;
        //SIRVE PARA LIMITAR LOS INTENTOS DEL INGRESO DEL CODIGO
        Integer contador = 0;

        do {
            System.out.print("Ingrese el DNI del Cliente | Si no ingrese 0 (cero): ");
            Long id = input.inputLong();

            if (id != 0) {

                //SI INGRESA UN ID LO VALIDAMOS 
                if (validarCodigo(id)) {

                    //SI ES VALIDO LO ASIGNAMOS 
                    nuevoCliente = obtenerCliente(id);
                    codigoValido = true;

                } else {

                    //SI NO ES VALIDO SUMAMOS UN INTENTO 
                    System.out.print("Ingresaste " + id + " | DNI no encontrado.");
                    contador++;
                }

            } else {
                // SI NO INGRESA UN ID LE LO TIENE QUE CREAR O BUSCAR.
                System.out.print("Quiere buscar el DNI o cargar un Cliente nuevo: ");

                //VERDADERO OPCION 1 FALSO OPCION 2
                if (input.inputBoolean("Buscar Codigo", "Crear Cliente")) {
                    filtrar();
                } else {
                    nuevoCliente = new Cliente(true);
                    
                    try {
                        ctrl.crearCliente(nuevoCliente);
                        cargarDB();
                        codigoValido = true;
                        System.out.println("Registro de Cliente Exitoso!");
                    } catch (Exception a) {
                        System.out.println("Lo sentimos. No se pudo realizar la carga del Cliente.");
                    }
                }
            }

        } while (!codigoValido && contador < 3);
        //RETORNAMOS LA INSTANCIA DEL AUTOR NUEVO |O| LA INSTANCIA DEL ARRAY |O| NULL
        return nuevoCliente;
    }

    public Cliente obtenerCliente(Long id) {
        Integer contador = 0;
        boolean codigoValido = false;

        while (!codigoValido && contador < clientes.size()) {
            if (clientes.get(contador).getDocumento().equals(id)) {
                codigoValido = true;
            } else {
                contador++;
            }
        }

        return clientes.get(contador);
    }

    public Boolean validarCodigo(Long id) {
        boolean codigoValido = false;
        Integer contador = 0;

        if (!clientes.isEmpty()) {

            while (!codigoValido && contador < clientes.size()) {
                if (clientes.get(contador).getDocumento().equals(id)) {
                    codigoValido = true;
                }
                contador++;
            }

        } else {
            System.out.println("No se registran clientes cargados.");
        }
        return codigoValido;
    }

    public void filtrar() {
        System.out.println("Mientras mas especifico seas mas corta sera la lista:");
        System.out.print("Ingrese el nombre / apellido del cliente: ");
        String dato = input.leer();
        System.out.println("-------------------------  Clientes  -----------------------");
        System.out.println("");
        Boolean coincidencia = false;

        for (Cliente cliente : clientes) {
            if (cliente.getNombre().toLowerCase().contains(dato.toLowerCase())
                    || cliente.getApellido().toLowerCase().contains(dato.toLowerCase())) {
                System.out.println(cliente.getNombre() + " | ID: " + cliente.getDocumento());
                coincidencia = true;
            }
        }
        
        if(!coincidencia){
            System.out.println("No hay registros de ese cliente.");
        }
    }
}
