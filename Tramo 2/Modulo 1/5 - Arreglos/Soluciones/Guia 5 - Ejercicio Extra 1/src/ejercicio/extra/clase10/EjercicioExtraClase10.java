/*
Realizar un algoritmo que calcule la suma de todos los elementos 
de un vector de tamaño N, con los valores ingresados por el usuario.
 */
package ejercicio.extra.clase10;

import java.util.Scanner;

public class EjercicioExtraClase10 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
    int n = leer.nextInt();int suma = 0;
        System.out.println("Bien, ahora ingrese los numeros que completen el vector.");
    int[] vector = new int [n];
        for (int i = 0; i < n; i++) { 
            System.out.println("[" + (i+1) +"]");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es "+ suma);
    }   
}
