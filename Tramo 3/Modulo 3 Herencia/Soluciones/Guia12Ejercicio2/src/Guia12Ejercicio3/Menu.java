/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o televisores,
con valores ya asignados. Luego, recorrer este array y ejecutar el método 
precioFinal() en cada electrodoméstico. Se deberá también mostrar el precio de cada
tipo de objeto, es decir, el precio de todos los televisores y el de las lavadoras.
Una vez hecho eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) 
 */
package Guia12Ejercicio3;

import Entidad.ED;
import Entidad.Herencias.*;
import Servicios.Herencias.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    HerenciaMuestra nuevaMuestra = new HerenciaMuestra();
    ArrayList<ED> EDArrayList = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        System.out.println("--------------------------------------");
        System.out.println("---------------  Menu  ---------------");
        System.out.println("");
        System.out.println("-- 1 -- Ingreso manual.");
        System.out.println("-- 2 -- Generar muestras.");
        System.out.println("-- 3 -- Ver Productos.");
        System.out.println("-- 4 -- Salir.");
        System.out.println("Elija una opcion: ");
        switch (leer.nextInt()) {
            case 1:
                System.out.println("--------------------------------------");
                cargaManual();
                menu();
                break;
            case 2:
                System.out.println("--------------------------------------");
                generarMuestras();
                menu();
                break;
            case 3:
                System.out.println("--------------------------------------");
                opcionesDeMuestra();
                menu();
                break;
            case 4:
                break;
            default:
                System.out.println("--------------------------------------");
                System.out.println("Opcion invalida.");
                menu();
                break;
        }
    }

    public void generarMuestras() {
        System.out.println("Cuantas muestras quiere crear?");
        Integer muestras = leer.nextInt();
        for (int i = 0; i < muestras; i++) {
            ED nuevoObj = new ED();
            if (Math.random() > 0.5) {
                nuevoObj = nuevaMuestra.crearLavadora();
            } else {
                nuevoObj = nuevaMuestra.crearTelevisor();
            }
            EDArrayList.add(nuevoObj);
        }
        System.out.println("----------------------------------------");
        System.out.println(muestras + " muestras generadas correctamente");
    }

    public void cargaManual() {
        System.out.println("-- 1 -- Cargar un televisor");
        System.out.println("-- 2 -- Cargar una lavadora");
        System.out.println("-- 0 -- Cancelar");
        System.out.println("Elija una opcion: ");
        boolean respuestaValida;
        do {
            ED nuevoObj = new ED();
            switch (leer.nextInt()) {
                case 0:
                    System.out.println("Operacion Cancelada");
                    respuestaValida = true;
                    break;
                case 1:
                    TelevisorServicios nuevoTelevisor = new TelevisorServicios();
                    nuevoObj = nuevoTelevisor.crearTelevisor();
                    respuestaValida = true;
                    EDArrayList.add(nuevoObj);
                    break;
                case 2:
                    LavadoraServicios nuevaLavadora = new LavadoraServicios();
                    nuevoObj = nuevaLavadora.crearLavadora();
                    respuestaValida = true;
                    EDArrayList.add(nuevoObj);
                    break;
                default:
                    respuestaValida = false;
                    System.out.println("Respuesta invalida");
                    break;
            }
        } while (!respuestaValida);
    }

    public void opcionesDeMuestra() {

        System.out.println("-- 1 -- Ver todos los productos");
        System.out.println("-- 2 -- Ver final de todos los televisores");
        System.out.println("-- 3 -- Ver final de todos los lavarropas");
        System.out.println("-- 4 -- Ver final de todos los productos");
        System.out.println("-- 0 -- Cancelar");
        System.out.println("Elija una opcion: ");
        boolean respuestaValida;
        Double precioFinal = 0.0;
        do {
            switch (leer.nextInt()) {
                case 0:
                    System.out.println("Operacion Cancelada");
                    respuestaValida = true;
                    break;
                case 1:
                    for (ED electrodomesticos : EDArrayList) {
                        System.out.println("----------------------------------------");
                        if (electrodomesticos instanceof Lavadora) {
                            System.out.println("Lavadora");
                        } else if (electrodomesticos instanceof Televisor) {
                            System.out.println("Televisor");
                        }
                        System.out.println(electrodomesticos.toString());
                    }
                    respuestaValida = true;
                    break;
                case 2:

                    for (ED electrodomesticos : EDArrayList) {
                        if (electrodomesticos instanceof Televisor) {
                            precioFinal += electrodomesticos.getPrecio();
                        }
                    }
                    System.out.println("La suma de todos los televisores es: $" + precioFinal);
                    respuestaValida = true;
                    break;
                case 3:
                    for (ED electrodomesticos : EDArrayList) {
                        if (electrodomesticos instanceof Lavadora) {
                            precioFinal += electrodomesticos.getPrecio();
                        }
                    }
                    respuestaValida = true;
                    System.out.println("La suma de todos los lavarropas es: $" + precioFinal);
                    break;
                case 4:
                    for (ED electrodomesticos : EDArrayList) {                        
                        precioFinal += electrodomesticos.getPrecio();
                    }
                    respuestaValida = true;
                    System.out.println("La suma de todos los productos es: $" + precioFinal);
                    break;
                default:
                    respuestaValida = false;
                    System.out.println("Respuesta invalida");
                    break;
            }
        } while (!respuestaValida);

    }

}
