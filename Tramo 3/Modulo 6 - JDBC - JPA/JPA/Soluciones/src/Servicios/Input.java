package Servicios;

import java.util.Scanner;

public class Input {

    Scanner leer = new Scanner(System.in);

    public Integer inputInt() {

        int input = -1;
        do {

            try {
                input = leer.nextInt();
            } catch (Exception a) {
                leer.next();
                System.out.print("Ingrese un valor valido: ");
            }

        } while (input < 0);
        System.out.println("--------------------------------------------------------");
        return input;
    }

    public String leer() {
        Scanner leer2 = new Scanner(System.in).useDelimiter("\n");
        String nombre = leer2.next();
        System.out.println("--------------------------------------------------------");
        return nombre;
    }

    public Long inputLong() {
        long input = -1;
        do {

            try {
                input = leer.nextInt();
            } catch (Exception a) {
                leer.next();
                System.out.print("Ingrese un valor numérico: ");
            }

        } while (input < 0);
        System.out.println("--------------------------------------------------------");
        return input;
    }
    
    public Boolean inputBoolean(String opcion1, String opcion2) {

        System.out.print("\n\t-- 1 -- " + opcion1 + ".\n\t-- 2 -- " + opcion2 + ".\nOpcion: ");

        switch (inputInt()) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                System.out.println("Ingrese una opcion valida: ");
                return inputBoolean(opcion1, opcion2);
        }

    }
}
