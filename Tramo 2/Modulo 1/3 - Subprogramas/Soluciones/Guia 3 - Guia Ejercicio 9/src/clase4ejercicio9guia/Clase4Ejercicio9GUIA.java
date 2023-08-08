/*
 * Escriba un programa que lea 20 números. Si el número leído 
es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número 
es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package clase4ejercicio9guia;

import java.util.Scanner;

public class Clase4Ejercicio9GUIA {

    public static void main(String[] args) {
        int num1;
        int cont = 0;
        int suma = 0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un número distinto a cero");
            num1 = leer.nextInt();
            cont++;

            if (num1 == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            }
            if (num1 < 0) {
                continue;
               
          } else {
               if(num1>0){
                
                   suma = suma + num1;
                } 
            
       }
            }while(cont<3);
     System.out.println("La suma de los valores ingresados es" +suma);
            
          
        }
        }