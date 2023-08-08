
package Entidad;

import Enum.Palos;

public class Carta {
    private Palos palo;
    private Integer numero;

    @Override
    public String toString() {
        return numero + " de " + palo;
    }

    public Carta() {
    }

    public Carta(Palos palo, Integer numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    
}
