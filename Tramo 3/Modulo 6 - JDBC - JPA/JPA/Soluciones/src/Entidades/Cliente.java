package Entidades;

import Servicios.Input;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

    @Id
    private Long documento;
    private String nombre,
            apellido,
            telefono;

    public Cliente() {

    }

    public Cliente(Boolean datos) throws Exception {
        if (datos) {
            Input input = new Input();
            System.out.print("Para registrar un nuevo Cliente ingrese el DNI: ");
            documento = input.inputLong();
            System.out.print("Bien, ingrese el nombre: ");
            nombre = input.leer();
            System.out.print("Perfecto, ahora el apellido: ");
            apellido = input.leer();
            System.out.print("Por ultimo ingrese el numero de telefono: ");
            telefono = input.leer();
        }
    }

    public Cliente(Long documento, String nombre, String apellido, String telefono) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
