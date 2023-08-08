package Persistencia;

import Entidades.Autor;
import Entidades.Cliente;
import Entidades.Editorial;
import Entidades.Libro;
import Entidades.Prestamo;
import java.util.ArrayList;
import java.util.List;

public class Controladora {

    EditorialJpaController ctrlEditorial = new EditorialJpaController();
    AutorJpaController ctrlAutor = new AutorJpaController();
    LibroJpaController ctrlLibro = new LibroJpaController();
    ClienteJpaController ctrlCliente = new ClienteJpaController();
    PrestamoJpaController ctrlPrestamo = new PrestamoJpaController();

    public ArrayList<Editorial> cargarDBEditorial() {
        List<Editorial> editorialList = ctrlEditorial.findEditorialEntities();
        ArrayList<Editorial> editorialArray = new ArrayList<>(editorialList);
        return editorialArray;
    }

    public void crearEditorial(Editorial editorial) throws Exception {
        ctrlEditorial.create(editorial);
    }

    public void modificarEditorial(Editorial editorial) throws Exception {
        ctrlEditorial.edit(editorial);
    }

    public ArrayList<Autor> cargarDBAutor() {
        List<Autor> autorList = ctrlAutor.findAutorEntities();
        ArrayList<Autor> autorArray = new ArrayList<>(autorList);
        return autorArray;
    }

    public void crearAutor(Autor autor) {
        ctrlAutor.create(autor);
    }

    public void modificarAutor(Autor autor) throws Exception {
        ctrlAutor.edit(autor);
    }

    public ArrayList<Libro> cargarDBLibro() {
        List<Libro> librosList = ctrlLibro.findLibroEntities();
        ArrayList<Libro> librosArray = new ArrayList<>(librosList);
        return librosArray;
    }

    public void crearLibro(Libro libro) {
        ctrlLibro.create(libro);
    }

    public void modificarLibro(Libro libro) throws Exception {
        ctrlLibro.edit(libro);
    }

    public ArrayList<Cliente> cargarDBCliente() {
        List<Cliente> clienteList = ctrlCliente.findClienteEntities();
        ArrayList<Cliente> clienteArray = new ArrayList<>(clienteList);
        return clienteArray;
    }

    public void crearCliente(Cliente cliente) throws Exception {
        ctrlCliente.create(cliente);
    }

    public void modificarCliente(Cliente cliente) throws Exception {
        ctrlCliente.edit(cliente);
    }

    public ArrayList<Prestamo> cargarDBPrestamo() {
        List<Prestamo> prestamoList = ctrlPrestamo.findPrestamoEntities();
        ArrayList<Prestamo> prestamoArray = new ArrayList<>(prestamoList);
        return prestamoArray;

    }

    public void crearPrestamo(Prestamo prestamo) {
        ctrlPrestamo.create(prestamo);
    }

    public void modificarPrestamo(Prestamo prestamo) throws Exception {
        ctrlPrestamo.edit(prestamo);
    }
}
