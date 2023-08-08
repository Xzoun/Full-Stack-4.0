/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes 
o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje 
indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package ejercicio3guia4;

import java.util.Scanner;

public class Ejercicio3Guia4 {

  
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Hola buenas tardes");
        System.out.println("Por favor ingrese el monto a convertir");
        double monto = leer.nextInt();
        String euros = "euros";
        funcion(euros,monto);
    }
    public static void funcion(String euros,double monto){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor indique la moneda de salida");
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        int opcion = leer.nextInt(); double resultado = 0;
        switch(opcion){
            case 1: resultado = 0.86 * monto;
                System.out.println(monto + " Euros son " + resultado + " Libras." );
                break;
            case 2: resultado = 1.28611 * monto;
            System.out.println(monto + " Euros son " + resultado + " Dolares." );
            break;
            case 3: resultado = 129.852 * monto;
            System.out.println(monto + " Euros son " + resultado + " Yenes." );
            break;
            
        }
    }
}
