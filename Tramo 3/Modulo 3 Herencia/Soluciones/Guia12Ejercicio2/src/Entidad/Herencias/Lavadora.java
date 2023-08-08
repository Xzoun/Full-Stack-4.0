/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
• Método get y set del atributo carga.
*/
package Entidad.Herencias;

import Entidad.ED;
import Enums.Colores;
import Enums.Consumo;

public class Lavadora extends ED{
    private Double carga;

    
      @Override
    public String toString() {
     String EDString = super.toString(); 
        return EDString + "Soporta " + carga + " kgs de carga.";
    }
    public Lavadora() {
    }

    public Lavadora(Double carga) {
        this.carga = carga;
    }

    public Lavadora(Double carga, Double precio, Double peso, Colores color, Consumo consumo) {
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
}
