package biblioteca;

import Servicios.BibliotecaServicios;

public class Biblioteca {

    public static void main(String[] args) throws Exception {
        BibliotecaServicios bilbiotecaServ = new BibliotecaServicios();
        bilbiotecaServ.cargarDB();
        bilbiotecaServ.menu();
    }

}
