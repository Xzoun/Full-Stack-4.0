
package Entidad.Herencia.Barco;

import Entidad.Barco;

public class Yate extends Barco{
    private Integer potencia,
            camarotes;
@Override
    public String toString() {
        String BarcoString = super.toString();
        return "\n-------------------------------\n"
                + BarcoString + " potencia: " + potencia + " camarotes: "+camarotes;
    }
    public Yate() {
    }

    public Yate(Integer potencia, Integer camarotes) {
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public Yate(Integer potencia, Integer camarotes, String matricula, Double eslora, Integer modelo) {
        super(matricula, eslora, modelo);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }
    
}
