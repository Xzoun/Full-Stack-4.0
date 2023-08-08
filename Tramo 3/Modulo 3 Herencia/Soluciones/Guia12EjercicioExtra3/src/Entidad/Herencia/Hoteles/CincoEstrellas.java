/*
 • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”,
de acuerdo a las prestaciones observadas. Las limosinas están disponibles para
cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas 
tenga el hotel, más caro será.
 */
package Entidad.Herencia.Hoteles;

import Enum.Gimnasio;

public class CincoEstrellas extends CuatroEstrellas {

    private Integer salonesDeConferencia,
            suites,
            limosinas;

    public CincoEstrellas() {
    }

    @Override
    public String toString() {
        String Str = super.toString();
        return Str + "salonesDeConferencia: " + salonesDeConferencia
                + " | suites: " + suites
                + " | limosinas: " + limosinas
                + " |\n";              
    }

    public CincoEstrellas(Integer salonesDeConferencia, Integer suites, Integer limosinas, Gimnasio gimnasio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantidadDeHabitaciones, Integer numeroDeCamas, Integer pisos, Integer precio, String categoria) {
        super(gimnasio, nombreRestaurant, capacidadRestaurant, cantidadDeHabitaciones, numeroDeCamas, pisos, precio, categoria);
        this.salonesDeConferencia = salonesDeConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Integer getSalonesDeConferencia() {
        return salonesDeConferencia;
    }

    public void setSalonesDeConferencia(Integer salonesDeConferencia) {
        this.salonesDeConferencia = salonesDeConferencia;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(Integer limosinas) {
        this.limosinas = limosinas;
    }

}
