package Entidades;

import Servicios.Input;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Prestamo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Libro libro;

    @OneToOne
    private Cliente cliente;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaPrestamo;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaDevolucion;

    Boolean prestado;

    public Prestamo() {

    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", new Locale("es", "ES"));

        return "Prestamo: " + id + " | " + cliente.getNombre() + ", " + cliente.getApellido() + " | "
                + libro.getTitulo() + " - " + libro.getAutor().getNombre() + " - " + libro.getEditorial().getNombre() + "\n"
                + "Plazo del prestamo: " + formato.format(fechaPrestamo) + " - " + formato.format(fechaDevolucion);
    }

    public Prestamo(Boolean datos) {

        if (datos) {
            Input input = new Input();

            fechaPrestamo = new Date();
            System.out.print("Ingrese cuantos días se prestará el libro:");
            Integer dias = input.inputInt();
            // Crear una instancia de Calendar y asignar la fecha de préstamo
            Calendar calFechaDevolucion = Calendar.getInstance();
            calFechaDevolucion.setTime(fechaPrestamo);

            // Sumar los días ingresados a la fecha de préstamo para obtener la fecha de devolución
            calFechaDevolucion.add(Calendar.DAY_OF_MONTH, dias);

            // Obtener la fecha de devolución como objeto Date
            fechaDevolucion = calFechaDevolucion.getTime();
            prestado = true;
        }
    }

    public Prestamo(Long id, Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente, Boolean prestado) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.cliente = cliente;
        this.prestado = prestado;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
