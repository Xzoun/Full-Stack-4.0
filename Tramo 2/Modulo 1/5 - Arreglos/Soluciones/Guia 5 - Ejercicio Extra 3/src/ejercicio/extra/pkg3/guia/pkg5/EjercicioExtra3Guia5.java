/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package ejercicio.extra.pkg3.guia.pkg5;

import java.util.Random;

public class EjercicioExtra3Guia5 {

    public static void main(String[] args) {
        int[] vector = new int[5];
        rellenado(vector);
        imprimir(vector);

    }

    public static void rellenado(int[] vector) {

        Random read = new Random();
        for (int i = 0; i < 5; i++) {
            vector[i] = read.nextInt(30);
        }
    }

    public static void imprimir(int[] vector) {
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");
    }
}

