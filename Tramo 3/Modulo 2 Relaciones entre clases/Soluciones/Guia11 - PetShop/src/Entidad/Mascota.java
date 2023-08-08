package Entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mascota implements Serializable {

    private String especie,
            tamano,
            nombre;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer edad;
    private boolean adoptada;
    private boolean vivo;

    @Override
    public String toString() {
        return nombre + "| ID: " + id + " | Tamano: " + tamano + " | Edad " + edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getAdoptada() {
        return adoptada;
    }

    public void setAdoptada(boolean adoptada) {
        this.adoptada = adoptada;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Mascota() {
    }

    public Mascota(String especie, String tamano, String nombre, Integer id, Integer edad, boolean adoptada, boolean vivo) {
        this.especie = especie;
        this.tamano = tamano;
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.adoptada = adoptada;
        this.vivo = vivo;
    }

}
