/*
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de 
personas por oficina y número de pisos. Esta clase implementará los dos métodos
abstractos y los atributos del padre.
 */
package Entidad.Herencia;

import Entidad.Edificio;
import Entidad.Oficina;
import java.util.ArrayList;

public class EdificioDeOficinas extends Edificio {

    private Integer numeroDeOficinas,
            capacidadMaxima,
            pisos;
    private ArrayList<Oficina> oficina;

    @Override
    public String toString() {
        String edificio = super.toString();
        return edificio + "Cantidad de oficinas: " + numeroDeOficinas
                + ", Capacidad: " + capacidadMaxima + " personas"
                + ", pisos: " + pisos
                + "\n";
    }

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numeroDeOficinas, Integer capacidadMaxima, Integer pisos) {
        this.numeroDeOficinas = numeroDeOficinas;
        this.capacidadMaxima = capacidadMaxima;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(Integer numeroDeOficinas, Integer capacidadMaxima, Integer pisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.capacidadMaxima = capacidadMaxima;
        this.pisos = pisos;
    }

    public Integer getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(Integer numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public ArrayList<Oficina> getOficina() {
        return oficina;
    }

    public void setOficina(ArrayList<Oficina> oficina) {
        this.oficina = oficina;
    }

}
