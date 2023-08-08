/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
• Método get y set de los atributos resolución y sintonizador TDT.

*/
package Entidad.Herencias;

import Entidad.ED;
import Enums.Colores;
import Enums.Consumo;

public class Televisor extends ED{
    private Double resolucion;
    private Boolean TDT;

    public Televisor() {
    }

    @Override
    public String toString() {
     String EDString = super.toString(); 
        return EDString + "resolucion:" + resolucion + ", TDT:" + TDT;
    }

    public Televisor(Double resolucion, Boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(Double resolucion, Boolean TDT, Double precio, Double peso, Colores color, Consumo consumo) {
        super(precio, peso, color, consumo);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }
    
}
