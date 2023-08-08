/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package clase.pkg4.pkg5.y.pkg5.ejercicio.pkg8;

import java.util.Scanner;


public class Clase45Y5Ejercicio8 {

    
    public static void main(String[] args) {
       
  Scanner leer = new Scanner(System.in);
  System.out.println("Ingrese un número.");
  int num1 = leer.nextInt();
  for(int i = 0; i < num1; i++){
     
  for(int j = 0; j < num1; j++){ 
      if(i == 0 || i == num1-1 || j == 0 || j == num1-1){
        System.out.print(" * ");
     }else{
     System.out.print("   ");
  }
}
  System.out.println(" ");    
   }
}
}