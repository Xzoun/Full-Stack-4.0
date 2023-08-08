package Servicios;

import Entidad.BarajaServicios;
import java.util.Scanner;

public class MenuServicios {

    BarajaServicios barajaServ = new BarajaServicios();

    Scanner leer = new Scanner(System.in);

    public void reiniciar() {
        barajaServ.nuevaBaraja();
    }

    public void menu() {

        System.out.println("--------------------------------------");
        System.out.println("---------------  Menu  ---------------");
        System.out.println("");
        System.out.println("-- 1 -- Barajar.");
        System.out.println("-- 2 -- Siguiente Carta.");
        System.out.println("-- 3 -- Ver cartas Disponibles.");
        System.out.println("-- 4 -- Pedir Cartas.");
        System.out.println("-- 5 -- Ver cartas jugadas.");
        System.out.println("-- 6 -- Salir");
        System.out.println("--------------------------------------");
        System.out.println("Elija una opción:");
        int respuesta = leer.nextInt();
        System.out.println("--------------------------------------");
        switch (respuesta) {

            case 1:
                barajaServ.barajar();
                menu();
                break;
            case 2:
                barajaServ.next();
                menu();
                break;
            case 3:
                barajaServ.cartasDisponibles();
                menu();
                break;
            case 4:
                System.out.println("Cuantas cartas necesita?");
                int cartasCant = leer.nextInt();
                barajaServ.pedirCarta(cartasCant);
                menu();
                break;
            case 5:
                barajaServ.verCartasJugadas();
                menu();
                break;
            case 6:
                break;
            default:
                System.out.println("Ingrese una opción válida");
                menu();
                break;
        }
    }
}
