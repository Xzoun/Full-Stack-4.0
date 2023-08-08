/*
Realizar un programa en el que se representen todas las relaciones 
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes
criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package Servicios;

import Entidad.Alojamientos;
import Entidad.Herencia.*;
import Entidad.Herencia.ExtraHotelerosH.Camping;
import Entidad.Herencia.ExtraHotelerosH.Residencia;
import Servicios.Herencia.ExtraHoteleros.*;
import Servicios.Herencia.Hoteles.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<Alojamientos> AlojamientosArray = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CampingServicios campServ = new CampingServicios();
    ResidenciaServicios resiServ = new ResidenciaServicios();
    CuatroEstrellasServicios cuatEstrServ = new CuatroEstrellasServicios();
    CincoEstrellasServicios cincEstrServ = new CincoEstrellasServicios();

    public void menu() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                    ---------------  Menu  ---------------");
        System.out.println("");
        System.out.println("                    -- 1 -- Ver todos los alojamientos.");
        System.out.println("                    -- 2 -- Ver hoteles.");
        System.out.println("                    -- 3 -- Ver Campings con restaurant.");
        System.out.println("                    -- 4 -- Ver Residencias con descuento.");
        System.out.println("                    -- 5 -- Salir");
        System.out.println("                    --------------------------------------");
        System.out.println("                    Elija una opción:");
        System.out.print("                    ");
        int respuesta = leer.nextInt();
        System.out.println("----------------------------------------------------------------------------");

        switch (respuesta) {
            case 1:
                System.out.println("                    ------ Todos los alojamientos: -------");
                System.out.println("                    --------------------------------------");
                ver();
                menu();
                break;

            case 2:
                System.out.println("                    --------- Todos los hoteles: ---------");
                System.out.println("                    --------------------------------------");

                verHoteles();
                menu();
                break;

            case 3:
                System.out.println("                    ------ Campings con restaurant: ------");
                System.out.println("                    --------------------------------------");

                verCampingsConRestaurant();
                menu();
                break;

            case 4:
                System.out.println("                    ----- Residencias con descuento: -----");
                System.out.println("                    --------------------------------------");

                verResidenciasConDescuento();
                menu();
                break;

            case 5:
                break;

            default:
                System.out.println("Ingrese una opción válida");
                menu();
                break;
        }
    }

    public void DB() {
        System.out.println("                    Cuantas muestras quiere crear?");
        System.out.print("                    ");
        Integer muestras = leer.nextInt();

        for (int i = 0; i < muestras; i++) {
            Double random = Math.random();
            if (random < 0.25) {
                AlojamientosArray.add(campServ.nuevoAlojamiento());
            } else if (random > 0.25 && random < 0.5) {
                AlojamientosArray.add(resiServ.nuevoAlojamiento());
            } else if (random >= 0.5 && random < 0.75) {
                AlojamientosArray.add(cuatEstrServ.nuevoAlojamiento());
            } else {
                AlojamientosArray.add(cincEstrServ.nuevoAlojamiento());
            }

        }
        System.out.println("                    " + muestras + " muestras creadas con exito!");
        System.out.println("----------------------------------------------------------------------------");
    }

    public void ver() {
        for (Alojamientos a : AlojamientosArray) {
            System.out.println(a);
            System.out.println("----------------------------------------------------------------------------");
        }
    }

    public void verHoteles() {
        for (Alojamientos a : AlojamientosArray) {
            if (a instanceof Hotel) {
                System.out.println(a);
                System.out.println("----------------------------------------------------------------------------");
            }
        }
    }

    public void verCampingsConRestaurant() {
        Boolean restaurant = false;
        for (Alojamientos a : AlojamientosArray) {
            if (a instanceof Camping) {
                if (((Camping) a).getRestaurant()) {
                    System.out.println(a);
                    System.out.println("----------------------------------------------------------------------------");
                    restaurant = true;
                }
            }
        }
        if (!restaurant) {
            System.out.println("                    No encontramos campings con restaurant.");
        }
    }

    public void verResidenciasConDescuento() {
        Boolean descuento = false;
        for (Alojamientos a : AlojamientosArray) {
            if (a instanceof Residencia) {
                if (((Residencia) a).getDescuentos()) {
                    System.out.println(a);
                    System.out.println("----------------------------------------------------------------------------");
                    descuento = true;
                }
            }
        }
        if (!descuento) {
            System.out.println("                    No encontramos residencias con descuentos.");
        }
    }
}
