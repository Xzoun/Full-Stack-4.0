/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo
y el promedio de n números (n>0). El valor de n se solicitará al principio del programa 
y los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.
 */
package ejercicio7extra;

import static java.lang.Double.max; 
import static java.lang.Double.min;
import java.util.Scanner;

public class Ejercicio7Extra {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Determine la cantidad de numeros a ingresar");
        int n = leer.nextInt();
        System.out.println("Ingrese los numeros");
        int num; int cont = 0; int maximo = 0; int minimo=1000000; int promedio = 0; int suma = 0;
       /** 
        do{
            num = leer.nextInt();
            cont++;
           maximo = (int) max(num, maximo);
           minimo = (int) min(num, minimo);
           suma = suma + num;
        }while(cont<n);
        */
        while(cont<n){
            num = leer.nextInt();
            cont++;
           maximo = (int) max(num, maximo);
           minimo = (int) min(num, minimo);
           suma = suma + num;
            
        }
        promedio = (suma/n);
        System.out.println("El numero maximo es " + maximo);
        System.out.println("El numero minimo es " + minimo);
        System.out.println("El promedio es " + promedio);
    } 
}
