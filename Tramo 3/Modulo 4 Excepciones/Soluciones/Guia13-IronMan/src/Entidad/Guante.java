package Entidad;

public class Guante {

    private boolean repulsorDanhado;
    private boolean reparable;

    public Guante() {
    }

    public Boolean getRepulsorDanhado() {
        return repulsorDanhado;
    }

    public void setRepulsorDanhado(Boolean repulsorDanhado) {
        this.repulsorDanhado = repulsorDanhado;
    }

    public Boolean getReparable() {
        return reparable;
    }

    public void setReparable(Boolean reparable) {
        this.reparable = reparable;
    }

    public Guante(boolean repulsorDanhado, Boolean reparable) {
        this.repulsorDanhado = repulsorDanhado;
        this.reparable = reparable;
    }

}
