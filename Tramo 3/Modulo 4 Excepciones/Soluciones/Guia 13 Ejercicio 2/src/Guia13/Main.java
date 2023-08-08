package Guia13;

import Ejercicio1.Ejercicio1;
import Ejercicio2.Ejercicio2;
import Ejercicio3Y4.Ejercicio3;
import Ejercicio5.Ejercicio5;
import Ejercicio6.Ejercicio6;
import Ejercicio7.Ejercicio7;
import Ejercicio8.Ejercicio8;
import Ejercicio9.Ejercicio9;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                    --------------  Guia 13  -------------");
        System.out.println("");
        System.out.println("                    -- 1 -- Ejercicio 1");
        System.out.println("                    -- 2 -- Ejercicio 2");
        System.out.println("                    -- 3 -- Ejercicio 3 Y 4");
        System.out.println("                    -- 5 -- Ejercicio 5");
        System.out.println("                    -- 6 -- Ejercicio 6");
        System.out.println("                    -- 7 -- Ejercicio 7");
        System.out.println("                    -- 8 -- Ejercicio 8");
        System.out.println("                    -- 9 -- Ejercicio 9");
        System.out.println("                    -- 0 -- Salir");
        System.out.println("                    --------------------------------------");
        System.out.println("                    Elija una opción:");
        System.out.print("                    ");

        int respuesta = leer.nextInt();

        System.out.println("----------------------------------------------------------------------------");

        switch (respuesta) {
            case 1:
                System.out.println("                    ------ Ejercicio 1: -------");
                System.out.println("                    --------------------------------------");
                Ejercicio1();
                menu();
                break;

            case 2:
                System.out.println("                    ------ Ejercicio 2: -------");
                System.out.println("                    --------------------------------------");
                Ejercicio2();
                menu();
                break;

            case 3:
                System.out.println("                    ----- Ejercicio 3 Y 4: -----");
                System.out.println("                    --------------------------------------");
                Ejercicio3();
                menu();
                break;          

            case 5:
                System.out.println("                    ------ Ejercicio 5: -------");
                System.out.println("                    --------------------------------------");
                Ejercicio5();
                menu();
                break;

            case 6:
                System.out.println("                    ------ Ejercicio 6: -------");
                System.out.println("                    --------------------------------------");
                Ejercicio6();
                menu();
                break;

            case 7:
                System.out.println("                    ------ Ejercicio 7: -------");
                System.out.println("                    --------------------------------------");
                Ejercicio7();
                menu();
                break;

            case 8:
                System.out.println("                    ------ Ejercicio 8: -------");
                System.out.println("                    --------------------------------------");
                Ejercicio8();
                menu();
                break;

            case 9:
                System.out.println("                    ------ Ejercicio 9: -------");
                System.out.println("                    --------------------------------------");
                Ejercicio9();
                menu();
                break;

            case 0:
                break;

            default:
                System.out.println("Ingrese una opción válida");
                menu();
                break;
        }
    }

    public static void Ejercicio1() {
        Ejercicio1 ejercicio = new Ejercicio1();
        ejercicio.Ejercicio1();
    }

    public static void Ejercicio2() {
        Ejercicio2 ejercicio = new Ejercicio2();
        ejercicio.Ejercicio2();
    }

    public static void Ejercicio3() {
        Ejercicio3 ejercicio = new Ejercicio3();
        ejercicio.Ejercicio3();
    }   

    public static void Ejercicio5() {
        Ejercicio5 ejercicio = new Ejercicio5();
        ejercicio.Ejercicio5();
    }

    public static void Ejercicio6() {
        Ejercicio6 ejercicio = new Ejercicio6();
        ejercicio.Ejercicio6();
    }

    public static void Ejercicio7() {
        Ejercicio7 ejercicio = new Ejercicio7();
        ejercicio.Ejercicio7();
    }

    public static void Ejercicio8() {
        Ejercicio8 ejercicio = new Ejercicio8();
        ejercicio.Ejercicio8();
    }

    public static void Ejercicio9() {
        Ejercicio9 ejercicio = new Ejercicio9();
        ejercicio.Ejercicio9();
    }
}
