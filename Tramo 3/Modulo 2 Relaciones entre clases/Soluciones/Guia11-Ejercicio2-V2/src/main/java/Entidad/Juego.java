/*
Clase Juego: esta clase posee los siguientes atributos: 
Jugadores (conjunto de Jugadores) y revolver.

Métodos:

• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método
recibe los jugadores y el revolver para guardarlos en los atributos
del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el
revolver de agua y aprieta el gatillo. Sí el revolver tira el agua el
jugador se moja y se termina el juego, sino se moja, se pasa al siguiente
jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al
final del juego, se debe mostrar que jugador se mojó.

Pensar la lógica necesaria para realizar esto, usando los atributos
de la clase Juego.
 */
package Entidad;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    public void ronda(){
        boolean mojado = false;
        do{
        for (Jugador jugadorActual : jugadores) {
            if(jugadorActual.getMojado()){
                System.out.println("Perdiste!");
                mojado = true;
                break;
            }
        }
        }while(!mojado);
    }
    
}
