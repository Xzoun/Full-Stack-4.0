package Servicios;

import Entidad.Mascota;
import Entidad.Persistencia.ControladoraPersistencia;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Errores errores = new Errores();
    ControladoraPersistencia ctrl = new ControladoraPersistencia();
    private ArrayList<Persona> personas = new ArrayList();

    public void cargarDB() {
        personas = ctrl.cargarPersonaDB();
    }

    public Persona crearUsuario() throws Exception {

        Persona nuevoRegistro = new Persona();

        nuevoRegistro.setMascota(null);

        System.out.print("Para iniciar una carga ingrese el número de documento: ");
        nuevoRegistro.setDocumento(errores.inputInt());

        System.out.print("Bien, ahora ingrese el nombre: ");
        String nombre = leer.next();
        nuevoRegistro.setNombre(nombre);

        System.out.println("Ingrese el apellido de " + nombre + ": ");
        nuevoRegistro.setApellido(leer.next());

        System.out.println("Por ultimo la edad de " + nombre + ": ");
        nuevoRegistro.setEdad(errores.inputInt());

        System.out.println("----------------------");

        ctrl.crearPersona(nuevoRegistro);

        return nuevoRegistro;
    }

    public boolean comprobacion(Integer dni) {
        boolean dniValido = false;
        for (Persona p : personas) {
            if (p.getDocumento() == dni) {
                dniValido = true;
            }
        }
        if (!dniValido && dni != 0) {
            System.out.println("No se encontraron registros para " + dni);
            System.out.println("Intente nuevamente o presione 0 (cero) para cancelar.");
        }
        return dniValido;
    }

    public boolean setearMascota(Mascota mascota) throws Exception {
        if (mascota != null) {
            boolean dniValido = false;
            Integer dni = 0;
            System.out.println("Para continuar con la adopcion ingrese el DNI del usuario");
            System.out.print("O presione 0 (cero) para ver la lista: ");
            dni = errores.inputInt();
            if (dni == 0) {
                listar(2);
                System.out.print("Elija una opcion: ");
                dni = errores.inputInt();
            }
            do {
                dniValido = comprobacion(dni);
                if (dniValido) {
                    for (Persona p : personas) {
                        if (p.getDocumento() == dni) {
                            p.setMascota(mascota);
                            ctrl.modificarPersona(p);
                            System.out.println("Felicidades " + p.getNombre() + ", has adoptado una mascota.");
                            return true;
                        }
                    }
                } else {
                    dni = errores.inputInt();
                }

            } while (!dniValido && dni != 0);

        }
        return false;
    }

    public void listar(Integer filtro) {
        switch (filtro) {
            case 1:

                boolean adoptada = false;
                for (Persona p : personas) {
                    if (p.getMascota() != null && p.getMascota().getAdoptada()) {
                        System.out.println(p.toString());
                        adoptada = true;
                    }
                }

                if (!adoptada) {
                    System.out.println("No se registran adopciones.");
                }
                break;
            case 2:
                for (Persona p : personas) {
                    System.out.println(p.toString());
                }
                break;
        }
    }

    public void eliminarUsuario() throws Exception {
        System.out.print("Para eliminar un usuario ingrese su numero de DNI o 0 (cero) para ver la lista: ");
        Integer dni = errores.inputInt();

        do {
            if (dni == 0) {
                listar(2);
                System.out.print("Elija un DNI de la lista o presione 0 (cero) para cancelar: ");
                System.out.println("--------------------------------------");
                dni = errores.inputInt();
            }
        } while (comprobacion(dni) && dni != 0);

        if (dni != 0) {
            ctrl.eliminarPersona(dni);
            System.out.println("Usuario eliminado correctamente.");
        }
    }

    public void modificarUsuario() throws Exception {

        Integer eleccion = 0,
                dni;
        Persona nuevaPersona = new Persona();
        boolean dniValido = false;
        System.out.println("---------- Modificar mascota ---------");
        System.out.print("Ingrese el id o presione 0 (cero) para ver la lista: ");
        dni = errores.inputInt();

        do {
            dniValido = comprobacion(dni);

            if (dni == 0) {
                listar(2);
                System.out.print("Elija una opcion: ");
                dni = errores.inputInt();
                dniValido = comprobacion(dni);
            }

            if (dniValido) {
                System.out.println("-- 1 -- Nombre.\n"
                        + "-- 2 -- Apellido.\n"
                        + "-- 3 -- Edad.\n"
                        + "-- 0 -- Finalizar modificacion.");
                System.out.print("Elija una opcion: ");
                eleccion = errores.inputInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre");
                        nuevaPersona.setNombre(leer.next());
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo nombre");
                        nuevaPersona.setApellido(leer.next());
                        break;
                    case 3:
                        System.out.println("Ingrese el nuevo nombre");
                        nuevaPersona.setEdad(errores.inputInt());
                        break;
                }

            } else {
                dni = errores.inputInt();
            }

        } while (!dniValido && dni != 0);

        ctrl.modificarPersona(nuevaPersona);
    }

    public Integer cancelarAdopcion() throws Exception {
        Persona nuevaPersona = new Persona();
        boolean dniValido = false;
        Integer idMascota = 0,
                dni;
        System.out.print("Para iniciar la cancelacion ingrese el numero de DNI: ");
        dni = errores.inputInt();
        do {
            dniValido = comprobacion(dni);

            if (dni == 0) {
                listar(2);
                System.out.print("Elija una opcion: ");
                dni = errores.inputInt();
                dniValido = comprobacion(dni);
            }

            if (dniValido) {
                for (Persona p : personas) {
                    if (p.getDocumento() == dni && p.getMascota() != null) {
                        idMascota = p.getMascota().getId();
                        p.setMascota(null);
                        nuevaPersona = p;
                    }
                }

            } else {
                dni = errores.inputInt();
            }

        } while (!dniValido && dni != 0);

        ctrl.modificarPersona(nuevaPersona);

        return idMascota;
    }

//    public void enviarDatosAlSV() throws Exception {
//        Persona nuevoRegistro1 = new Persona("Claudia", "Benitez", null, 44, 45678912);
//        Persona nuevoRegistro2 = new Persona("Monica", "Benitez", null, 48, 12378945);
//        Persona nuevoRegistro3 = new Persona("Claudio", "Ferreyra", null, 27, 78945612);
//        Persona nuevoRegistro4 = new Persona("Juan Ignacio", "Mazzocchi", null, 27, 12345678);
//        Persona nuevoRegistro5 = new Persona("Ignacio", "Arrieta", null, 27, 154685154);
//        Persona nuevoRegistro6 = new Persona("Leo","Benitez",null,27,39708946);
//
//        ctrlPers.crearPersona(nuevoRegistro1);
//        ctrlPers.crearPersona(nuevoRegistro2);
//        ctrlPers.crearPersona(nuevoRegistro3);
//        ctrlPers.crearPersona(nuevoRegistro4);
//        ctrlPers.crearPersona(nuevoRegistro5);
//        ctrlPers.crearPersona(nuevoRegistro6);
//    }
}
