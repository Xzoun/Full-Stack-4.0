/*
 Escriba un programa que lea números enteros. 
Si el número es múltiplo de cinco debe detener la lectura y mostrar 
la cantidad de números leídos, la cantidad de números pares y la cantidad de 
números impares. Al igual que en el ejercicio anterior los números negativos no deben 
sumarse. Nota: recordar el uso de la sentencia break.

 */
package ejercicio.pkg8.extra;

import java.util.Scanner;

public class Ejercicio8Extra {
    
    public static void main(String[] args) {
        boolean salir = false;
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numeros enteros");
        int num; int imp = 0; int par = 0;
do{
    num = leer.nextInt();
    
        if(num>0){
  
  if((num % 5) == 0){
       salir = true;      
    
   }else if((num % 2) == 0){
    par++;
   }else if((num % 2) == 1){
    imp++;
   }

   

      
   
   }else{
       System.out.println("Numero erroneo, debe ser mayor a 0");
            continue;
        }
   
}while(salir == false);

        System.out.println("La cantidad de numeros ingresados es de " +(imp+par));
        System.out.println("La cantidad de numeros impares ingresados es de " +imp);
        System.out.println("La cantidad de numeros pares ingresados es de " +par);
       
    }
    
}
