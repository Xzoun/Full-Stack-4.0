package guia.pkg11.petshop;

import Entidad.Persistencia.ControladoraPersistencia;
import Servicios.PetShop;

public class Guia11PetShop {

    public static void main(String[] args) throws Exception {
        PetShop PetShop = new PetShop();
        System.out.println("----------------------");
        System.out.println("Bienvenido");
        ControladoraPersistencia ctrlPers = new ControladoraPersistencia();
        PetShop.DB();
        PetShop.menu();
    }
}
