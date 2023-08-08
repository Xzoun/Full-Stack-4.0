/*
Radar Versión 1.0
JARVIS posee también incorporado un sistema que usa ondas electromagnéticas para medir
distancias, altitudes, ubicaciones de objetos estáticos o móviles como aeronaves barcos,
vehículos motorizados, formaciones meteorológicas y por su puesto enemigos de otro planeta.
Su funcionamiento se basa en emitir un impulso de radio, que se refleja en el objetivo y se 
recibe típicamente en la misma posición del emisor.
Las ubicaciones de los objetos están dadas por las coordenadas X, Y y Z. Los objetos pueden ser
marcados o no como hostiles. JARVIS también puede detectar la resistencia del objeto, y puede
detectar hasta 10 objetos de manera simultánea.
JARVIS puede calcular la distancia a la que se encuentra cada uno de los objetos, para esto
siempre considera que la armadura se encuentra situada en la coordenada (0,0,0).
Hacer un método que informen a qué distancia se encuentra cada uno de los enemigos. Usar la
clase Math de Java.
 */
package Entidad.Funcionalidades;

import java.util.ArrayList;

public class Radar {

    private Integer limite;
    private final ArrayList<Objeto> radarCompleto = new ArrayList();

    public Radar() {
    }

    public Radar(Integer limite) {
        this.limite = limite; 
    }

    public ArrayList<Objeto> getRadarCompleto() {
        return radarCompleto;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    public void agregarObjeto(Objeto objeto) {
      
        if (radarCompleto.size() < limite) {
            radarCompleto.add(objeto);
        } else {
            System.out.println("El radar ha alcanzado su límite de capacidad.");
        }
    }

//CREAR UN METODO PARA CALCULAR DISTANCIA, SI SUPERA X NUM SE BORRA DEL RADAR
}
