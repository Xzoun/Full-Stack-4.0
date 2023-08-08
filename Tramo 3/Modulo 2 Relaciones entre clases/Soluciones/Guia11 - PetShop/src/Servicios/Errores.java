package Servicios;

import java.util.Scanner;

class Errores {

    Scanner leer = new Scanner(System.in);

    public Integer inputInt() {

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

    public boolean validacionBoolean(String respuesta) {
        boolean respuestaValida = false;
        do {
            if (respuesta.equalsIgnoreCase("s")) {
                respuestaValida = true;
                return true;
            } else if (respuesta.equalsIgnoreCase("n")) {
                respuestaValida = true;
                return false;
            } else {
                System.out.println("Respuesta invalida");
                System.out.print("Intente nuevamente: ");
                respuesta = leer.next();
                return false;
            }
        } while (!respuestaValida);
    }
}
