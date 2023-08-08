package Tienda.servicios;

import java.util.Scanner;

class Errores {

    public Integer inputInt() {

        Scanner leer = new Scanner(System.in);
        int input = 1560265012;
        do {
            try {
                input = leer.nextInt();
            } catch (Exception a) {
                leer.next();
                System.out.print("Ingrese un valor numérico: ");
            }
        } while (input == 1560265012);
        return input;
    } 
}
