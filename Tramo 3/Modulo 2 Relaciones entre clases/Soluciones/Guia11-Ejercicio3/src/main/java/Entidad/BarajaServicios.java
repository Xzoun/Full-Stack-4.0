package Entidad;

import Enum.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class BarajaServicios {

    private ArrayList<Carta> nuevaBaraja;
    private ArrayList<Carta> cartasJugadas = new ArrayList();

    public void nuevaBaraja() {

        cartasJugadas.removeAll(cartasJugadas);

        nuevaBaraja = new ArrayList();
        Palos palo[] = Palos.values();
        for (Palos tipo : palo) {

            for (int i = 0; i < 10; i++) {
                Carta objCarta = new Carta();
                objCarta.setPalo(tipo);
                if (i == 7 || i == 8 || i == 9) {
                    objCarta.setNumero(i + 3);
                    nuevaBaraja.add(objCarta);
                } else {
                    objCarta.setNumero(i + 1);
                    nuevaBaraja.add(objCarta);
                }
            }
        }
    }

    public void cartasDisponibles() {
        for (Carta Naipe : nuevaBaraja) {
            System.out.println(Naipe);
        }
    }

    public void verCartasJugadas() {
        for (Carta Naipe : cartasJugadas) {
            System.out.println(Naipe);
        }
    }

    public void barajar() {

        Collections.shuffle(nuevaBaraja);

    }

    public void next() {

        if (!nuevaBaraja.isEmpty()) {
            Iterator<Carta> iterator = nuevaBaraja.iterator();
            Carta primeraCarta = iterator.next();
            cartasJugadas.add(primeraCarta);
            iterator.remove();

            if (iterator.hasNext()) {
                Carta segundaCarta = iterator.next();
                System.out.println(segundaCarta);
            } else {
                System.out.println("La baraja está vacía.");
            }
        } else {
            System.out.println("La baraja está vacía.");
        }
    }

    public void pedirCarta(int cartasCant) {
        int contador = 0;
        do {
            if (!nuevaBaraja.isEmpty()) {
                Iterator<Carta> iterator = nuevaBaraja.iterator();
                Carta primeraCarta = iterator.next();
                cartasJugadas.add(primeraCarta);
                System.out.println(primeraCarta);
                iterator.remove();

            } else {
                System.out.println("La baraja está vacía.");
            }

            contador++;
        } while (contador < cartasCant);
    }
}
