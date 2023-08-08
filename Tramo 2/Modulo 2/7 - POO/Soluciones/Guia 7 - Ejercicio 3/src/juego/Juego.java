/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
jugadores jugar un juego de adivinanza de números. El primer jugador elige un número 
y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos 
y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el 
segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos necesarios 
para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package juego;

import java.util.Scanner;

public class Juego {

    public int ganador;
    public int intentos;
    Scanner leer = new Scanner(System.in);

    public Juego() {
    }

    public Juego(int ganador, int intentos) {
        this.ganador = ganador;
        this.intentos = intentos;
    }

    public void iniciarjuego() {

        System.out.println("Ingrese el valor a adivinar");
        ganador = leer.nextInt();
        System.out.println("Bien, ahora la cantidad de intentos");
        intentos = leer.nextInt();
    }

    public boolean jugar() {
        boolean retorno = false;
        int contador = intentos-1;
        int player2;
        do {
            
        System.out.println("Ingrese un numero");
        player2 = leer.nextInt();
        
            if (player2 == ganador) {
                System.out.println("Ganaste! el numero era " + ganador);
                System.out.println("Lo adivinaste en el intento " + (intentos - contador));
                retorno = true;
                
            } else if (player2 < ganador) {
              
                System.out.println("Segui intentando, el numero es menor al que hay que adivinar");               
                System.out.println("Te quedan " + contador-- + " intentos.");
                
            } else {
                System.out.println("Segui intentando, el numero es mayor al que hay que adivinar");                
                System.out.println("Te quedan " + contador-- + " intentos.");
                            }
        } while (player2 != ganador && contador > 0);
        
        return retorno;
    }
    
    
}
