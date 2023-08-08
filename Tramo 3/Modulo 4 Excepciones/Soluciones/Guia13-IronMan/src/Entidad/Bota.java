package Entidad;

public class Bota {

    private boolean propulsorDanhado;
    private boolean reparable;

    public Bota() {
    }

    public Bota(boolean propulsorDanhado, boolean reparable) {
        this.propulsorDanhado = propulsorDanhado;
        this.reparable = reparable;
    }

    public Boolean getPropulsorDanhado() {
        return propulsorDanhado;
    }

    public void setPropulsorDanhado(Boolean propulsorDanhado) {
        this.propulsorDanhado = propulsorDanhado;
    }

    public boolean getReparable() {
        return reparable;
    }

    public void setReparable(boolean reparable) {
        this.reparable = reparable;
    }

}
