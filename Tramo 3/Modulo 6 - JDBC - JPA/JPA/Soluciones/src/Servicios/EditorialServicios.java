package Servicios;

import Entidades.Editorial;
import Persistencia.Controladora;
import java.util.ArrayList;

public class EditorialServicios {

    ArrayList<Editorial> editoriales = new ArrayList();
    Input input = new Input();
    Controladora ctrl = new Controladora();

    public void cargarDB() {
        editoriales = ctrl.cargarDBEditorial();
    }

    public Editorial logicaAgregacion() throws Exception {
        //CREAMOS UNA INSTANCIA DE EDITORIAL || SE RETORNARA SI INGRESA 3 VECES MAL EL CODIGO
        Editorial nuevaEditorial = null;
        //SIRVE PARA SALIR DEL BUCLE CUANDO SEA CORRECTO EL CODIGO
        boolean codigoValido = false;
        //SIRVE PARA LIMITAR LOS INTENTOS DEL INGRESO DEL CODIGO
        Integer contador = 0;

        do {
            System.out.print("Ingrese el ID de la Editorial | Si no ingrese 0 (cero): ");
            Long id = input.inputLong();

            if (id != 0) {

                //SI INGRESA UN ID LO VALIDAMOS 
                if (validarCodigo(id)) {

                    //SI ES VALIDO LO ASIGNAMOS 
                    nuevaEditorial = obtenerEditorial(id);
                    codigoValido = true;

                } else {

                    //SI NO ES VALIDO SUMAMOS UN INTENTO 
                    System.out.print("Ingresaste " + id + " | ID no encontrado.");
                    contador++;
                }

            } else {
                // SI NO INGRESA UN ID LE LO TIENE QUE CREAR O BUSCAR.
                System.out.print("Quiere buscar el ID o cargar una Editorial nueva: ");

                //VERDADERO OPCION 1 FALSO OPCION 2
                if (input.inputBoolean("Buscar Codigo", "Crear Editorial")) {
                    filtrar();
                } else {
                    nuevaEditorial = new Editorial(true);
                    try {
                        ctrl.crearEditorial(nuevaEditorial);
                        cargarDB();
                        codigoValido = true;
                        System.out.println("Libro cargado correctamente!");
                    } catch (Exception e) {
                        System.out.println("Lo sentimos. No se pudo realizar la carga del libro.");
                    }
                }
            }

        } while (!codigoValido && contador < 3);
        //RETORNAMOS LA INSTANCIA DE LA EDITORIAL NUEVA |O| LA INSTANCIA DEL ARRAY |O| NULL
        return nuevaEditorial;
    }

    public Editorial obtenerEditorial(Long id) {
        Integer contador = 0;
        boolean codigoValido = false;

        while (!codigoValido && contador < editoriales.size()) {
            if (editoriales.get(contador).getId().equals(id)) {
                codigoValido = true;
            } else {
                contador++;
            }
        }

        return editoriales.get(contador);
    }

    public Boolean validarCodigo(Long id) {
        boolean codigoValido = false;
        Integer contador = 0;

        if (!editoriales.isEmpty()) {

            while (!codigoValido && contador < editoriales.size()) {
                if (editoriales.get(contador).getId().equals(id)) {
                    codigoValido = true;
                }
                contador++;
            }

        } else {
            System.out.println("No se registran editoriales cargadas.");
        }
        return codigoValido;
    }

    public void filtrar() {
        System.out.print("Ingrese el nombre de la editorial: ");
        String nombre = input.leer();
        System.out.println("-------------------------  Editoriales  -----------------------");
        System.out.println("");
        Boolean coincidencia = false;

        for (Editorial editorial : editoriales) {
            if (editorial.getAlta() == true && editorial.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println(editorial.getNombre() + " | ID: " + editorial.getId());
            }
        }

        if (!coincidencia) {
            System.out.println("No hay registros de esa editorial.");
        }
    }
}
