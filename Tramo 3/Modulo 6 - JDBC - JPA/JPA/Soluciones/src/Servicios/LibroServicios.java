package Servicios;

import Entidades.Libro;
import Persistencia.Controladora;
import java.util.ArrayList;

public class LibroServicios {

    AutorServicios autorServ = new AutorServicios();
    EditorialServicios editorialServ = new EditorialServicios();
    ArrayList<Libro> libros = new ArrayList();
    Controladora ctrl = new Controladora();
    Input input = new Input();

    public void cargarDB() {
        libros = ctrl.cargarDBLibro();
    }

    public Libro crearLibro() throws Exception {

        // CREAMOS EL OBJETO Y CARGAMOS LOS DATOS EN EL CONSTRUCTOR
        Libro nuevoLibro = new Libro(true);

        //CARGAMOS EL AUTOR
        nuevoLibro.setAutor(autorServ.logicaAgregacion());

        // VALIDAMOS EL AUTOR Y CARGAMOS LA EDITORIAL
        if (nuevoLibro.getAutor() != null) {
            nuevoLibro.setEditorial(editorialServ.logicaAgregacion());

            // VALIDAMOS LA EDITORIAL Y CARGAMOS EN LA BASE DE DATOS
            if (nuevoLibro.getEditorial() != null) {
                try {
                    ctrl.crearLibro(nuevoLibro);
                    cargarDB();
                    System.out.println("Libro cargado correctamente!");
                } catch (Exception e) {
                    System.out.println("Lo sentimos. No se pudo realizar la carga del libro.");
                }
            }
            //SI NO CONSIGUIO ESCRIBIR EL CODIGO CORRECTO 
        } else {
            System.out.println("Lo sentimos intentelo de nuevo.");
        }
        return nuevoLibro;
    }

    public Libro logicaAgregacion() throws Exception {
        //CREAMOS UNA INSTANCIA DEL AUTOR || SE RETORNARA SI INGRESA 3 VECES MAL EL CODIGO
        Libro nuevoLibro = null;
        //SIRVE PARA SALIR DEL BUCLE CUANDO SEA CORRECTO EL CODIGO
        boolean codigoValido = false;
        //SIRVE PARA LIMITAR LOS INTENTOS DEL INGRESO DEL CODIGO
        Integer contador = 0;

        do {
            System.out.print("Ingrese el ISBN del libro | Si no ingrese 0 (cero): ");
            Long id = input.inputLong();

            if (id != 0) {

                //SI INGRESA UN ID LO VALIDAMOS 
                if (validarCodigo(id)) {

                    //SI ES VALIDO LO ASIGNAMOS 
                    nuevoLibro = obtenerLibro(id);
                    codigoValido = true;

                } else {

                    //SI NO ES VALIDO SUMAMOS UN INTENTO 
                    System.out.print("Ingresaste " + id + " | ID no encontrado.");
                    contador++;
                }

            } else {
                // SI NO INGRESA UN ID LE LO TIENE QUE CREAR O BUSCAR.
                System.out.print("Quiere buscar el ISBN o cargar un Libro nuevo: ");

                //VERDADERO OPCION 1 FALSO OPCION 2
                if (input.inputBoolean("Buscar ISBN", "Cargar Libro")) {
                    filtrar();
                } else {
                    nuevoLibro = crearLibro();
                    codigoValido = true;
                }
            }

        } while (!codigoValido && contador < 3);
        //RETORNAMOS LA INSTANCIA DEL AUTOR NUEVO |O| LA INSTANCIA DEL ARRAY |O| NULL
        return nuevoLibro;
    }

    public Libro obtenerLibro(Long id) {
        Integer contador = 0;
        boolean codigoValido = false;

        while (!codigoValido && contador < libros.size()) {
            if (libros.get(contador).getIsbn().equals(id)) {
                codigoValido = true;
            } else {
                contador++;
            }
        }

        return libros.get(contador);
    }

    public Boolean validarCodigo(Long id) {
        boolean codigoValido = false;
        Integer contador = 0;

        if (!libros.isEmpty()) {

            while (!codigoValido && contador < libros.size()) {
                if (libros.get(contador).getIsbn().equals(id)) {
                    codigoValido = true;
                }
                contador++;
            }

        } else {
            System.out.println("No se registran libros cargados.");
        }
        return codigoValido;
    }

    public void filtrar() {        
        System.out.print("Ingrese el nombre del libro: ");
        String nombre = input.leer();
        System.out.println("-------------------------  Libros  -----------------------");
        System.out.println("");
        Boolean coincidencia = false;
        
        for (Libro libro : libros) {
            if (libro.getAlta() == true && libro.getTitulo().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println(libro.getTitulo() + " | ID: " + libro.getIsbn());
                coincidencia = true;
            }
        }
        
         if(!coincidencia){
            System.out.println("No hay registros de ese libro.");
        }
    }
}
