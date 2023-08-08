/*
Crea una aplicación que le pida dos números al usuario 
y este pueda elegir entre sumar, restar, multiplicar y 
dividir. La aplicación debe tener una función para cada 
operación matemática y deben devolver sus resultados para imprimirlos en el main. 

 */
package ejercicio1guia4;

import java.util.Scanner;

public class Ejercicio1Guia4 {

    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos valores para operar");
    int num1 = leer.nextInt(); int num2 = leer.nextInt();
         System.out.println("Ingrese la operacion");
         System.out.println("1. Suma");
         System.out.println("2. Resta");
         System.out.println("3. Multiplicar");
         System.out.println("4. Dividir");
    int opcion = leer.nextInt();
    switch(opcion){
        case 1 :  System.out.println("El resultado es" + suma(num1,num2));
        break;        
        case 2 :  System.out.println("El resultado es" + resta(num1,num2) );
        break;
        case 3 :  System.out.println("El resultado es" + multiplicacion(num1,num2));
        break;
        case 4 :  System.out.println("El resultado es" + division(num1,num2));
        break;
    }
    }
    public static int suma(int num1, int num2){
        return num1+num2;
    }
    public static int resta(int num1, int num2){
        return num1-num2;
    }
    public static int multiplicacion(int num1, int num2){
        return num1*num2;
    }
    public static double division(double num1, double num2){
        if(num2==0)  {
            System.out.println("No se puede dividir por cero");
           return 0;
            }
       return num1/num2;
    }
                            
}
