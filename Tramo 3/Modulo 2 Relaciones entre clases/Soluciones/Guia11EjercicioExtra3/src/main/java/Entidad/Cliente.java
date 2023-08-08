/*
a. Gestión Integral de clientes. En este módulo vamos a registrar la información
personal de cada cliente que posea pólizas en nuestra empresa. Nombre y apellido,
documento, mail, domicilio, teléfono.
*/
package Entidad;

public class Cliente {
    private String nombre,
            apellido,
            domicilio,
            email;
    
    private Integer telefono,
            documento;

    @Override
    public String toString() {
        return nombre + ", " + apellido + ", DNI:" + documento;
    }
    
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String domicilio, String email, Integer telefono, Integer documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.email = email;
        this.telefono = telefono;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    
    
            
}
