package Entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Persona implements Serializable {

    private String nombre,
            apellido;

    @OneToOne
    private Mascota mascota;
    private int edad;
    @Id
    private int documento;

    @Override
    public String toString() {
        return nombre + ", " + apellido + " | " + documento + " | Adoptó a :" + mascota;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, Mascota mascota, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mascota = mascota;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

}
