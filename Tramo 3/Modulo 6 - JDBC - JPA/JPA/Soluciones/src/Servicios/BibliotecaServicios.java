package Servicios;

public class BibliotecaServicios {

    PrestamoServicios prestamo = new PrestamoServicios();
    ClienteServicios cliente = new ClienteServicios();
    LibroServicios libro = new LibroServicios();
    AutorServicios autor = new AutorServicios();
    EditorialServicios editorial = new EditorialServicios();
    Input input = new Input();

    public void cargarDB() {
        autor.cargarDB();
        editorial.cargarDB();
        libro.cargarDB();
        cliente.cargarDB();
        prestamo.cargarDB();
    }

    public void menu() throws Exception {
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------------  Menu  -----------------------");
        System.out.println("");
        System.out.println("-- 1 -- Cargar un prestamo.");
        System.out.println("-- 2 -- Cargar una devolucion.");
        System.out.println("-- 3 -- Buscar libro/s.");
        System.out.println("-- 4 -- Buscar Autor/s.");
        System.out.println("-- 5 -- Buscar Editorial/s.");
        System.out.println("-- 6 -- Buscar Cliente/s.");
        System.out.println("-- 7 -- Registro de prestamos.");
        System.out.println("-- 0 -- Salir.");
        System.out.print("Elija una opcion: ");
        Integer eleccion = input.inputInt();

        switch (eleccion) {
            case 0:
                break;
            case 1:
                cargarPrestamo();
                menu();
                break;
            case 2:
                cargarDevolucion();
                menu();
                break;
            case 3:
                buscarLibro();
                menu();
                break;
            case 4:
                buscarAutor();
                menu();
                break;
            case 5:
                buscarEditorial();
                menu();
                break;
            case 6:
                buscarCliente();
                menu();
                break;
            case 7:
                BuscarPrestamos();
                menu();
                break;
            default:
                System.out.println("Opcion invalida.");
                menu();
                break;
        }
    }

    public void cargarPrestamo() throws Exception {
        prestamo.crearPrestamo();
    }

    public void cargarDevolucion() throws Exception {
        prestamo.cargarDevolucion();
    }

    public void buscarLibro() {
        libro.filtrar();
    }

    public void buscarAutor() {
        autor.filtrar();
    }

    public void buscarEditorial() {
        editorial.filtrar();
    }

    public void buscarCliente() {
        cliente.filtrar();
    }

    public void BuscarPrestamos() {
        prestamo.filtrar();
    }
}
