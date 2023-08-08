/*
Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados
 */
package ejercicio.pkg11.extra;

import java.util.Scanner;

public class Ejercicio11Extra {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
       Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();int cont = 1; int aux;
       aux = num/9;
        do{
          aux = aux/9;        
           cont++; 
        }while(aux != 0);
            
        System.out.println("La cantidad de digitos que tiene el numero que ingreso es de " +cont);
    }
    
}
