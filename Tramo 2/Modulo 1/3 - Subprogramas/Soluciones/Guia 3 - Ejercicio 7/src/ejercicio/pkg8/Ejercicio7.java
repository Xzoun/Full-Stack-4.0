/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: 
tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que 
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicio.pkg8;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
      boolean salir = false;
        Scanner leer = new Scanner(System.in); 
        System.out.println("Buenos días. Recuerde finalizar con &&&&& ");
        int cont = 0;int cont2 = 0;
      
        do{
        System.out.println("Ingrese una palabra de 5 letras por favor.");
         String palabra = leer.next();
        
         if (palabra.equals("&&&&&")){
             break;
                     
         }
          palabra = palabra.toUpperCase();
            System.out.println("Mayuscula ingresada "+ palabra);
            if(palabra.length()<=5&&palabra.startsWith("X")&&palabra.endsWith("O")){
             cont++;
           } else{
                System.out.println("Palabra no válida.");
             cont2++;
        }
            }while(salir == false);
                
        System.out.println("Gracias por participar.");
        System.out.println("Ingresó " + (cont) + " palabras válidas.");
        System.out.println("Ingresó " + (cont2) + " palabras inválidas.");
             
                }
}