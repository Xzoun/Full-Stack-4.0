package Servicios;

import Entidad.Mascota;
import Entidad.Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Scanner;

public class MascotaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Errores errores = new Errores();
    private ArrayList<Mascota> mascotas = new ArrayList();
    ControladoraPersistencia ctrl = new ControladoraPersistencia();

    public void cargarDB() {
        mascotas = ctrl.cargarMascotaDB();
    }

    public Mascota crearMascota() {

        Mascota nuevoRegistro = new Mascota();

        System.out.print("Para iniciar una carga ingrese la especie del animal: ");
        nuevoRegistro.setEspecie(leer.next());

        System.out.print("Ingrese el nombre: ");
        String nombre = leer.next();
        nuevoRegistro.setNombre(nombre);

        System.out.print("Bien, ahora ingrese la edad de " + nombre + ": ");
        nuevoRegistro.setEdad(errores.inputInt());

        System.out.print("Por último ingrese el tamaño de " + nombre + ": ");
        nuevoRegistro.setTamano(leer.next());

        nuevoRegistro.setAdoptada(false);
        nuevoRegistro.setVivo(true);

        System.out.println("----------------------");
        ctrl.crearMascota(nuevoRegistro);
        return nuevoRegistro;
    }

    public boolean filtrarPorEspecie() {
        boolean especieValida = false;
        System.out.print("Ingrese la especie del animal que desea adoptar:");
        String especie = leer.next();
        System.out.println("--------------------------------------");

        for (Mascota m : mascotas) {
            if (m.getEspecie().equalsIgnoreCase(especie) && !m.getAdoptada() && m.isVivo()) {
                especieValida = true;
            }
        }

        if (!especieValida) {

            System.out.println("No se encontro ningun " + especie + " disponible para adoptar ");

        } else {

            System.out.println(especie + "s en adopción:");

            for (Mascota m : mascotas) {
                if (m.getEspecie().equalsIgnoreCase(especie) && !m.getAdoptada() && m.isVivo()) {
                    System.out.println(m.toString());
                }
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("-- 1 -- Continuar con la adopción.");
        System.out.println("-- 2 -- Volver al menu principal.");
        System.out.println("--------------------------------------");
        System.out.print("Elija una opcion: ");

        switch (errores.inputInt()) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                System.out.println("Opción no válida, redireccion al menu principal.");
                return false;
        }

    }

    public Mascota elegirMascota(Integer id) throws Exception {

        for (Mascota m : mascotas) {
            if (m.getId() == id) {
                m.setAdoptada(true);
                ctrl.modificarMascota(m);
                return m;
            }
        }
        System.out.println("No se encontraron mascotas con ese ID.");

        return null;
    }

    public void listarMascotas() {

        for (Mascota m : mascotas) {
            System.out.println(m.getNombre() + " | ID: " + m.getId());
        }

    }

    public void modificarMascota() throws Exception {
        Integer eleccion = 0,
                id;
        Mascota nuevaMascota = new Mascota();
        boolean idValido = false;
        System.out.println("---------- Modificar mascota ---------");
        System.out.print("Ingrese el id o presione 0 (cero) para ver la lista: ");
        id = errores.inputInt();

        if (id == 0) {
            listarMascotas();
        }

        do {

            for (Mascota m : mascotas) {
                if (m.getId() == id) {
                    nuevaMascota = m;
                    idValido = true;
                    break;
                }
            }

            if (!idValido) {
                System.out.println("Ingrese un id valido");
                id = errores.inputInt();
            }

        } while (!idValido);

        do {
            System.out.println("-- 1 -- Nombre.\n"
                    + "-- 2 -- Especie.\n"
                    + "-- 3 -- Tamaño.\n"
                    + "-- 4 -- Edad.\n"
                    + "-- 5 -- Adopcion.\n"
                    + "-- 6 -- Fallecimiento.\n"
                    + "-- 0 -- Finalizar modificacion.");
            System.out.println("--------------------------------------");
            System.out.print("Elija una opcion: ");
            eleccion = errores.inputInt();
            switch (eleccion) {
                case 1:
                    System.out.print("Ingrese el nuevo nombre: ");
                    nuevaMascota.setNombre(leer.next());
                    break;
                case 2:
                    System.out.print("Ingrese la nueva especie: ");
                    nuevaMascota.setEspecie(leer.next());
                    break;
                case 3:
                    System.out.print("Ingrese el nuevo tamano: ");
                    nuevaMascota.setTamano(leer.next());
                    break;
                case 4:
                    System.out.print("Ingrese la nueva edad: ");
                    nuevaMascota.setEdad(errores.inputInt());
                    break;
                case 5:
                    System.out.print("La mascota fue adoptada? S/N: ");
                    nuevaMascota.setAdoptada(errores.validacionBoolean(leer.next()));
                    break;
                case 6:
                    System.out.print("La mascota fallecio? S/N: ");
                    nuevaMascota.setAdoptada(errores.validacionBoolean(leer.next()));
                    break;

            }
        } while (eleccion != 0);

        ctrl.modificarMascota(nuevaMascota);
    }

    public void cancelarAdopcion(Integer idMascota) throws Exception {
        Mascota nuevaMascota = new Mascota();
        for (Mascota m : mascotas) {
            if (m.getId() == idMascota) {
                m.setAdoptada(false);
                nuevaMascota = m;
                break;
            }
        }
        ctrl.modificarMascota(nuevaMascota);
    }

//    public void enviarDatosAlSV() {
//        Mascota nuevoRegistro1 = new Mascota("Gato", "Pequeño", "Jade", 1, 1, false, true);
//        Mascota nuevoRegistro2 = new Mascota("Perro", "Mediano", "Sky", 2, 3, false, true);
//        Mascota nuevoRegistro3 = new Mascota("Gato", "Mediano", "Richard", 3, 1, false, true);
//        Mascota nuevoRegistro4 = new Mascota("Tortuga", "Grande", "Raquel", 4, 12, false, true);
//        Mascota nuevoRegistro5 = new Mascota("Loro", "Pequeño", "Francisco", 5, 10, false, true);
//        Mascota nuevoRegistro6 = new Mascota("Perro", "Mediano", "Claudia", 6, 2, false, true);
//        Mascota nuevoRegistro7 = new Mascota("Gato", "Mediano", "Fran", 7, 6, false, true);
//        Mascota nuevoRegistro8 = new Mascota("Perro", "Grande", "Moni", 8, 7, false, true);
//
//        ctrlPers.crearMascota(nuevoRegistro1);
//        ctrlPers.crearMascota(nuevoRegistro2);
//        ctrlPers.crearMascota(nuevoRegistro3);
//        ctrlPers.crearMascota(nuevoRegistro4);
//        ctrlPers.crearMascota(nuevoRegistro5);
//                ctrlPers.crearMascota(nuevoRegistro6);
//        ctrlPers.crearMascota(nuevoRegistro7);
//        ctrlPers.crearMascota(nuevoRegistro8);
//    }
}
