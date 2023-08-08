/*
  Existen dos tipos de alojamientos extrahoteleros: los Camping y las Residencias. 
Para los Camping se indica la capacidad máxima de carpas, 
la cantidad de baños disponibles y si posee o no un restaurante dentro de las
instalaciones.
 */
package Entidad.Herencia.ExtraHotelerosH;

import Entidad.Herencia.ExtraHoteleros;

public class Camping extends ExtraHoteleros {

    private Integer capacidad,
            banhos;
    private Boolean restaurant;

    @Override
    public String toString() {
        String Str = super.toString();
        String rest;
        if (restaurant) {
            rest = "Si";
        } else {
            rest = "No";

        }
        return Str
                + "Capacidad: " + capacidad
                + " | Banhos: " + banhos
                + " | Restaurant: " + rest
                + " |\n";
    }

    public Camping() {
    }

    public Camping(Integer capacidad, Integer banhos, Boolean restaurant, Boolean privado, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.capacidad = capacidad;
        this.banhos = banhos;
        this.restaurant = restaurant;
    }

    public Camping(Integer capacidad, Integer banhos, Boolean restaurant) {
        this.capacidad = capacidad;
        this.banhos = banhos;
        this.restaurant = restaurant;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getBanhos() {
        return banhos;
    }

    public void setBanhos(Integer banhos) {
        this.banhos = banhos;
    }

    public Boolean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Boolean restaurant) {
        this.restaurant = restaurant;
    }

}
