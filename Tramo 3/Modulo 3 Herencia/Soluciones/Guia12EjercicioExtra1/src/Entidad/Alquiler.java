/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
*/
package Entidad;

import java.time.LocalDate;


public class Alquiler {
    private String nombre;
    private Integer DNI,
            posicion;
    private LocalDate inicio,
            devolucion;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer DNI, Integer posicion, LocalDate inicio, LocalDate devolucion, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.posicion = posicion;
        this.inicio = inicio;
        this.devolucion = devolucion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
}
