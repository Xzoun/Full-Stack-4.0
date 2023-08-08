/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 	
 */
package ejercicio.pkg4.guia.pkg4;

import java.util.Scanner;

public class Ejercicio4Guia4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero.");
        int num1 = leer.nextInt();
        programa(num1);
    }
    public static void programa(int num1){
        int cont = 0;        
        for (int i = 1; i < num1+1; i++) {
            if(num1==1){
                System.out.println("El numero no es primo");
            }
            if (num1 % i == 0) {

                cont++;
            }
        }   if (cont == 2) {
                    System.out.println("El numero es primo");
                
            }   else if(cont > 2){
                    System.out.println("El numero no es primo");
        }                
    }         
}
    


