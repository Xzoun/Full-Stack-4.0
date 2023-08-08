/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e 
imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package clase4ejercicio10guia;

import java.util.Scanner;

public class Clase4Ejercicio10GUIA {
    
    public static void main(String[] args) {
        int num1;
        Scanner leer = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
           do{
            System.out.print("Ingrese un número entre 1 y 20 ");
           num1 = leer.nextInt();
          }while(num1<1 || num1>20);
           System.out.print(num1 + " = ");
        for(int j = 0;j < num1; j++){
            System.out.print("*");
        }
        System.out.println(" ");
        }
    }
    
}
