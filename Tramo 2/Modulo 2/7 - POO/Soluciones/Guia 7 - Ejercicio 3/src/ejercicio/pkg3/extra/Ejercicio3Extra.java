/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a 
dos jugadores jugar un juego de adivinanza de números. El primer jugador elige un 
número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado 
de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina 
cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos 
necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package ejercicio.pkg3.extra;

import java.util.Scanner;
import juego.Juego;

public class Ejercicio3Extra {

    public static void main(String[] args) {
        Juego j1 = new Juego();
        int contador;
        int ganador1 = 0;
        int ganador2 = 0;
        contador = 0;
        Scanner leer = new Scanner(System.in);
        String respuesta;
        do{
        if ((contador % 2) == 0) {
            System.out.println("Turno jugador 1");
            j1.iniciarjuego();
            System.out.println("Turno jugador 2");
            if (j1.jugar()) {
                ganador2++;
                contador++;
            }
        } else {
            System.out.println("Turno jugador 2");
            j1.iniciarjuego();
            System.out.println("Turno jugador 1");
            j1.jugar();
            if (j1.jugar()) {
                ganador1++;
            }
        }
            System.out.println("Presione F para finalizar");
            respuesta = leer.next();
        }while(!respuesta.equalsIgnoreCase("F"));
        
        System.out.println("eljugador 1 gano " + ganador1 +"  veces");
        System.out.println("eljugador 2 gano " + ganador2 +" veces");
    }
    
}
