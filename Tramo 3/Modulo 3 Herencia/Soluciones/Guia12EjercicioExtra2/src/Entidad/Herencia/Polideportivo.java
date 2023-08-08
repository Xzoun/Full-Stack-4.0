/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del
padre.
 */
package Entidad.Herencia;

import Entidad.Edificio;

public class Polideportivo extends Edificio {

    private String nombre;
    private Boolean techado;

    public Polideportivo() {
    }

    @Override
    public String toString() {
        String edificio = super.toString();
        String sout = "nombre: " + nombre + ", Techo: ";
        if (techado) {
            return edificio + sout + "Cubierto" + "\n";
        } else {
            return edificio + sout + "Descubierto" + "\n";
        }
    }

    public Polideportivo(String nombre, Boolean techado) {
        this.nombre = nombre;
        this.techado = techado;
    }

    public Polideportivo(String nombre, Boolean techado, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return techado;
    }

    public void setTechado(Boolean techado) {
        this.techado = techado;
    }

}
