package Servicios;

public class PetShop {

    Errores errores = new Errores();
    MascotaServicios mascotaServ = new MascotaServicios();
    PersonaServicios personaServ = new PersonaServicios();

    public void DB() throws Exception {
        mascotaServ.cargarDB();
        personaServ.cargarDB();
//        personaServ.enviarDatosAlSV();
//        mascotaServ.enviarDatosAlSV();
    }

    public void menu() throws Exception {
        System.out.println("--------------------------------------");
        System.out.println("---------------  Menu  ---------------");
        System.out.println("");
        System.out.println("-- 1 -- Cargar nuevo ingreso.");
        System.out.println("-- 2 -- Cargar usuario de adopción.");
        System.out.println("-- 3 -- Ver mascotas disponibles para adoptar.");
        System.out.println("-- 4 -- Ver registro de adopción.");
        System.out.println("-- 5 -- Cancelar adopción");
        System.out.println("-- 6 -- Eliminar usuario.");
        System.out.println("-- 7 -- Modificar una mascota.");
        System.out.println("-- 8 -- Modificar un usuario.");
        System.out.println("-- 9 -- Salir.");
        System.out.println("--------------------------------------");
        System.out.print("Elija una opción: ");
        int respuesta = errores.inputInt();
        System.out.println("--------------------------------------");

        switch (respuesta) {
            case 1:
                crearMascota();
                DB();
                menu();
                break;

            case 2:
                crearPersona();
                DB();
                menu();
                break;

            case 3:
                adoptar();
                DB();
                menu();
                break;

            case 4:
                registro();
                menu();
                break;

            case 5:
                cancelarAdopcion();
                menu();
                break;

            case 6:
                eliminarUsuario();
                DB();
                menu();
                break;

            case 7:
                modificarMascota();
                DB();
                menu();
                break;

            case 8:
                modificarUsuario();
                DB();
                menu();
                break;

            case 9:
                break;

            default:
                System.out.println("Ingrese una opción válida.");
                menu();
                break;
        }
    }

    public void crearMascota() {
        mascotaServ.crearMascota();
        System.out.println("Carga finalizada correctamente.");
    }

    public void crearPersona() throws Exception {
        personaServ.crearUsuario();
        System.out.println("Carga finalizada correctamente.");
    }

    public void adoptar() throws Exception {
        if (mascotaServ.filtrarPorEspecie()) {

            System.out.println("--------------------------------------");
            System.out.print("Ingrese el ID de la mascota elegida: ");
            int idAdopcion = errores.inputInt();
            System.out.println("--------------------------------------");
            if (idAdopcion == 0) {
                System.out.println("Operación cancelada.");
            } else {
// Aca se ejecuta el metodo elegir mascota y se cambia el valor del boolean adoptado y se carga en la base y se envia al metodo.
//Setear Mascota. Ahi se puede cancelar por loque devuelve un boolean. Si no se cumple se cancelan los cambios anteriores
                if (!personaServ.setearMascota(mascotaServ.elegirMascota(idAdopcion))) {
                    mascotaServ.cancelarAdopcion(idAdopcion);
                }
            }
        }
    }

    public void registro() {
        personaServ.listar(1);
    }

    public void eliminarUsuario() throws Exception {
        personaServ.eliminarUsuario();
    
    }

    public void modificarMascota() throws Exception {
        mascotaServ.modificarMascota();
        System.out.println("Modificacion realizada correctamente.");
    }

    public void modificarUsuario() throws Exception {
        personaServ.modificarUsuario();
        System.out.println("Modificacion realizada correctamente.");
    }

    public void cancelarAdopcion() throws Exception {
        Integer idMascota = personaServ.cancelarAdopcion();
        if (idMascota == 0) {
            System.out.println("Operacion cancelada.");
        } else {
            mascotaServ.cancelarAdopcion(idMascota);
            System.out.println("Adopcion cancelada correctamente.");
        }
    }

}
