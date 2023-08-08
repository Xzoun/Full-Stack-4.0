package ejercicio5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ejercicio5 {


public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un número: ");
        num1= leer.nextInt();
        System.out.println("el doble de ese número es: " + num1*2);
        System.out.println("el triple de ese número es: "+ num1*3);
        System.out.println("la raiz cuadrada de ese número es: "+ sqrt(num1));
    }
    
} 


