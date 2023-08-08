/*
  Para las residencias se indica la cantidad de habitaciones, si se hacen o no
descuentos a los gremios y si posee o no campo deportivo. Realizar un programa
en el que se representen todas las relaciones descriptas.
 */
package Entidad.Herencia.ExtraHotelerosH;

import Entidad.Herencia.ExtraHoteleros;

public class Residencia extends ExtraHoteleros {

    private Integer habitaciones;
    private Boolean descuentos,
            deportivo;

    @Override
    public String toString() {
        String pension;
        String campo;
        if (descuentos) {
            pension = "Si";
        } else {
            pension = "No";
        }
        if (deportivo) {
            campo = "Si";
        } else {
            campo = "No";
        }
        String str = super.toString();
        return str
                + "Habitaciones: " + habitaciones
                + " | Descuentos por pension: " + pension
                + " | Campo de deportes:" + campo
                + " |\n";
    }

    public Residencia() {
    }

    public Residencia(Integer habitaciones, Boolean descuentos, Boolean deportivo, Boolean privado, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.deportivo = deportivo;
    }

    public Residencia(Integer habitaciones, Boolean descuentos, Boolean deportivo, Boolean privado, Integer m2) {
        super(privado, m2);
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.deportivo = deportivo;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Boolean getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Boolean descuentos) {
        this.descuentos = descuentos;
    }

    public Boolean getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Boolean deportivo) {
        this.deportivo = deportivo;
    }

}
