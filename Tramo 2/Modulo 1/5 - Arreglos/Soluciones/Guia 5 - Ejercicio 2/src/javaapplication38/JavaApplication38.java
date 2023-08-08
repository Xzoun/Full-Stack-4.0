/*
Realizar un algoritmo que llene un vector de tamaño N con 
valores aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package javaapplication38;

import java.util.Scanner;


public class JavaApplication38 {

    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int tamano = leer.nextInt();int vector[]=new int [tamano];
        
        for(int i = 0;i < tamano;i++){
            int random = (int) (Math.random() * 10);
            vector[i] = random;
        }
        System.out.println("Bien, ahora ingrese el  valor a buscar.");
        int num2 = leer.nextInt();int cont = 0;
        for(int i =0;i<tamano;i++){
            if(num2==vector[i]){
                System.out.println("El numero ingresado está en la posicion "+i);
            cont++;
            
            }
        }
            if(cont==0){
                System.out.println("El numero no esta en el vector.");
        }
    }    
}
