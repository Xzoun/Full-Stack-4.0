/*
Realizar un algoritmo que llene un vector con los 100 
primeros números enteros y los muestre por pantalla en orden descendente.

 */
package ejercicio.pkg1.guia5;




public class Ejercicio1Guia5 {


    public static void main(String[] args) {
        
        int [] vector = new int[100];
            for(int i = 99;i>=0;i--){
    	 
        	vector[i]= i;

        System.out.print(" " + vector[i]);
            }
            System.out.println(" ");
            
    
    }
}
    