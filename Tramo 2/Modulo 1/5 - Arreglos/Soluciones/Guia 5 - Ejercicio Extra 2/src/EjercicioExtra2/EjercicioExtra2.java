/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia 
entre los elementos).
 */
package EjercicioExtra2;

import java.util.Random;
import java.util.Scanner;

public class EjercicioExtra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Ingrese el tamaño del vector.");
        int n = leer.nextInt();
        int cont = 0;
        int[] vector = new int[n];
        int[] vector2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("[" + (i + 1) + "]");
            vector[i] = aleatorio.nextInt(3);
            vector2[i] = aleatorio.nextInt(3);
            if (vector[i] != vector2[i]) {break;}
            else{cont++;}
        }  
            if (cont == (n - 1)) {System.out.println("los vectores son iguales");}
            else { System.out.println("los vectores no son iguales");             
             }
    }
}
