/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad. Después 
de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y 
frenar cuando el usuario ingrese la palabra “No”.

 */
package ejercicio2guia4;

import java.util.Scanner;


public class Ejercicio2guia4 {

    public static void main(String[] args) {
      System.out.println("Hola, buenas tardes.");
        funcion();
    }

    public static void funcion() {
        Scanner leer = new Scanner(System.in);
        String respuesta = "No";
        while (respuesta == "No") {
            System.out.println("Escriba su nombre");
            String nombre = leer.next();
            System.out.println("Bien, ahora indique su edad");
            
            int edad = leer.nextInt();
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad " + edad);
            if (edad > 17) {
                System.out.println(nombre + " es mayor de edad.");

            } else {
                System.out.println(nombre + " es menor de edad.");
            }
            System.out.println("Desea seguir mostrando personas?S/N");
            String rta = leer.next();
             if(rta.equalsIgnoreCase("N")){
                 respuesta = "Si";
             }     
            
        }
       
    }
}
