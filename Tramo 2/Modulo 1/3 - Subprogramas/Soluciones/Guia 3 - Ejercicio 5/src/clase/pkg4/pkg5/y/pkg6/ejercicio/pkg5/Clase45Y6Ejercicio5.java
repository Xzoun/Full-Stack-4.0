/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion solicite 
numeros al usuario hasta que la suma de los numeros introducidos supere el limite inicial.
 */
package clase.pkg4.pkg5.y.pkg6.ejercicio.pkg5;

import java.util.Scanner;


public class Clase45Y6Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número como límite.");
        int num1 = leer.nextInt();
        int num3 = 0;
        do{
                System.out.println("Ingrese un número");
        int num2 = leer.nextInt();
        num3 = (num2 + num3);
        }while(num3<num1);
        System.out.println("La suma de los números ingresados supera al límite y es " + num3);
    }
    
}
