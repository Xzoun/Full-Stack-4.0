/*
 Los Hoteles tienen como atributos: Cantidad
de Habitaciones, Número de Camas, Cantidad de Pisos, Precio de Habitaciones. Y estos
pueden ser de cuatro o cinco estrellas. Las características de las distintas c
 */
package Entidad.Herencia;

import Entidad.Alojamientos;

public class Hotel extends Alojamientos {

    private Integer cantidadDeHabitaciones,
            numeroDeCamas,
            pisos,
            precio;
    private String categoria;

    @Override
    public String toString() {
        String Str = super.toString();
        return super.getNombre() + " | " + categoria + "\n"
                + Str
                + "cantidad de habitaciones: " + cantidadDeHabitaciones
                + " | Capacidad: " + numeroDeCamas + " | pisos: " + pisos
                + " | Precio: " + precio
                + " |\n";
    }

    public Hotel() {
    }

    public Hotel(Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer pisos, Integer precio, String categoria, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.pisos = pisos;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Hotel(Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer pisos, Integer precio, String categoria) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.pisos = pisos;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Integer getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(Integer cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public Integer getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(Integer numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
