/*
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”,
de acuerdo a las prestaciones observadas.
 */
package Entidad.Herencia.Hoteles;

import Entidad.Herencia.Hotel;
import Enum.Gimnasio;

public class CuatroEstrellas extends Hotel {

    private Gimnasio gimnasio;
    private String nombreRestaurant;
    private Integer capacidadRestaurant;

    @Override
    public String toString() {
        String str = super.toString();
        return str + "Gimnasio tipo: " + gimnasio
                + " | Restaurant: " + nombreRestaurant
                + " | Capacidad del restaurant: " + capacidadRestaurant
                + " |\n";
    }

    public CuatroEstrellas(Gimnasio gimnasio, String nombreRestaurant, Integer capacidadRestaurant) {
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public CuatroEstrellas() {
    }

    public CuatroEstrellas(Gimnasio gimnasio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer pisos, Integer precio, String categoria, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadDeHabitaciones, numeroDeCamas, pisos, precio, categoria, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public CuatroEstrellas(Gimnasio gimnasio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer pisos, Integer precio, String categoria) {
        super(cantidadDeHabitaciones, numeroDeCamas, pisos, precio, categoria);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public Integer getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(Integer capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }

}
