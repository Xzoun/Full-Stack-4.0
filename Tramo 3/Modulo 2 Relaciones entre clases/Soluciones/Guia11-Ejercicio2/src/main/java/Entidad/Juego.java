package Entidad;

import java.util.ArrayList;
import java.util.Scanner;
public class Juego {

    ArrayList<Jugador> jugadoresList;
    Revolver revolver1;

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores.");
        int jugadoresCant = leer.nextInt();
        if (jugadoresCant < 1 || jugadoresCant > 6) {
            jugadoresCant = 6;
        }

        for (int i = 1; i < jugadoresCant; i++) {
            jugadoresList.add(new Jugador(i));
        }
        revolver1 = r;
        jugadoresList = jugadores;
    }
    
    public void ronda(){
        revolver1.mojado();
        revolver1.siguienteChorro();
    }
}
