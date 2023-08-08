
package Entidad;

public class Oficina {
   private Integer numero,
           capacidad;

    @Override
    public String toString() {
        return "Oficina N° " + numero + ", capacidad: " + capacidad;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Oficina(Integer numero, Integer capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public Oficina() {
    }
}
