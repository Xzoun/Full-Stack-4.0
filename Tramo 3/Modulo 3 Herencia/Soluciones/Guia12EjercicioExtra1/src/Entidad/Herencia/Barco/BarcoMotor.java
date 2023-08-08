package Entidad.Herencia.Barco;

import Entidad.Barco;

public class BarcoMotor extends Barco {

    private Integer potencia;

    @Override
    public String toString() {
        String BarcoString = super.toString();
        return "\n-------------------------------\n"
                + BarcoString + " potencia: " + potencia;
    }

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(Integer potencia, String matricula, Double eslora, Integer modelo) {
        super(matricula, eslora, modelo);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

}
