/*
 Escribir un programa que pida dos números enteros por teclado
y calcule la suma de los dos. El programa deberá después mostrar 
el resultado de la suma
 */
package ejercicio.pkg1;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {

Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los números que quiere sumar");
      int num1 = leer.nextInt(); int num2 = leer.nextInt();
        System.out.println("El resultado de la suma es" + " " + (num1 + num2));
        
    }
    
}
