/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así como
la cantidad de metros cuadrados que ocupa. Existen dos tipos de alojamientos
extrahoteleros: los Camping y las Residencias. Para los Camping se indica la 
capacidad máxima de carpas, la cantidad de baños disponibles y si posee o no un
restaurante dentro de las instalaciones. Para las residencias se indica la cantidad
de habitaciones, si se hacen o no descuentos a los gremios y si posee o no campo
deportivo. Realizar un programa en el que se representen todas las relaciones 
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes
criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package Entidad.Herencia;

import Entidad.Alojamientos;

public class ExtraHoteleros extends Alojamientos {

    private Boolean privado;
    private Integer m2;

    @Override
    public String toString() {
        String Str = super.toString();
        String priv;

        if (privado) {
            priv = "| Privado";
        } else {
            priv = "| Publico";
        }

        return super.getNombre() + " |\n" + Str
                + "Establecimiento " + priv + " | " + m2 + " metros cuadrados.\n";
    }

    public ExtraHoteleros(Boolean privado, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.m2 = m2;
    }

    public ExtraHoteleros(Boolean privado, Integer m2) {
        this.privado = privado;
        this.m2 = m2;
    }

    public ExtraHoteleros() {
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

}
