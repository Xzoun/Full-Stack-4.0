package Entidad.Herencia.Barco;

import Entidad.Barco;

public class Velero extends Barco {

    private Integer mastiles;

    @Override
    public String toString() {
        String BarcoString = super.toString();
        return "\n-------------------------------\n"
                + BarcoString + " mastiles: " + mastiles;
    }

    public Velero() {
    }

    public Velero(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(Integer mastiles, String matricula, Double eslora, Integer modelo) {
        super(matricula, eslora, modelo);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

}
