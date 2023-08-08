/*
Realizar un programa que pida dos números enteros positivos por 
teclado y muestre por pantalla el siguiente menú:El usuario deberá 
elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea 
salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
contrario se vuelve a mostrar el menú.
 */
package clase.pkg4.pkg5.y.pkg6.ejercicio.pkg6;

import java.util.Scanner;

public class Clase45Y6Ejercicio6 {

    public static void main(String[] args) {
        boolean booleansalir = true;
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese dos números.");
        int num1 = leer.nextInt(); int num2 = leer.nextInt();
        do{
        System.out.println("Elija una opción:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        int opcion = leer.nextInt();
        switch(opcion){
               case 1:
                   System.out.println("la suma es" + " " + (num1 + num2));
                   break;
               case 2:
                   System.out.println("la resta es" + " " + (num1 - num2));
                   break;
               case 3:
                   System.out.println("la multiplicación es" + " " + (num1 * num2));
                   break;
               case 4:
                   System.out.println("la división es" + " " + (num1 / num2));
                   break;
               case 5:
                   System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String salir = leer.next();
                if (salir.equalsIgnoreCase("s")){
                    booleansalir = false;
                    break;
                }
                break;
               default:
                   System.out.println("Ingrese un número válido.");
                   break;
        }
        }while(booleansalir==true);
    }
   } 

