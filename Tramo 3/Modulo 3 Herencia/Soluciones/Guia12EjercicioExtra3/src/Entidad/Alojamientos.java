/*
 Los alojamientos se  identifican por un nombre, una dirección, una localidad y
un gerente encargado del lugar. La compañía trabaja con dos tipos de alojamientos:
Hoteles y Alojamientos Extrahoteleros. Los Hoteles tienen como atributos: Cantidad
de Habitaciones, Número de Camas, Cantidad de Pisos, Precio de Habitaciones. Y estos
pueden ser de cuatro o cinco estrellas. Las características de las distintas 
categorías son las siguientes:
 */
package Entidad;

public class Alojamientos {

    @Override
    public String toString() {
        return  "Direccion: " + direccion
                + " |Localidad: " + localidad
                + " |Gerente: " + gerente
                + " |\n";
    }

    private String nombre,
            direccion,
            localidad,
            gerente;

    public Alojamientos(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public Alojamientos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

}
