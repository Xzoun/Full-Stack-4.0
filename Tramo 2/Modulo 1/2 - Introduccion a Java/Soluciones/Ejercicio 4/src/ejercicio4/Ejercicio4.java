
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int temperatura;
        System.out.println("Ingrese la temperatura en °C:");
        temperatura = leer.nextInt();
        temperatura = 32 + (9*temperatura/5);
        System.out.println("La temperatura ingresada es equivalente a " + temperatura + "°F");
    }
    
}

