/*
Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al 
usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe 
permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue 
como utilizar la función Math.random() de Java.
 */
package ejercicio.pkg10.extra;

import java.util.Scanner;

public class Ejercicio10Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Buenas tardes, en el juego de hoy deberá adivinar un numero entre 0 y 100. Mucha suerte!");
        int num = 0; int aleatorio = 0; int aux1;int aux2;
        
        aux1 = (int) (Math.random() * 10);
        aux2 = (int) (Math.random() * 10);
        aleatorio = (aux1*aux2);
        do{
            num = leer.nextInt();
     
            if (num == aleatorio){
                System.out.println("Felicidades! " + num + " es el numero elegido.");
                System.out.println("Usted es el ganador!");
            }else{
                System.out.println("Intentelo nuevamente!"+ aleatorio);
                }                
            }while(num != aleatorio);
            
        
      
    }
}
