package Tienda.servicios;

import Tienda.entidades.Producto;
import Tienda.persistencia.ProductoDao;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicios {

    ProductoDao consultarProductos = new ProductoDao();
    Errores errores = new Errores();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Producto> productos = new ArrayList();

    public void cargarDB() throws Exception {
        productos = consultarProductos.listarProductos();
    }

    public void crearProducto(Integer codigo) throws Exception {
        Producto nuevoProducto = new Producto();
        nuevoProducto.setCodigoFabricante(codigo);
        System.out.print("Bien, ahora ingrese el nombre del producto nuevo: ");
        nuevoProducto.setNombre(leer.next());

        System.out.print("Por último ingrese el precio: ");
        nuevoProducto.setPrecio(errores.inputInt());
        consultarProductos.crearProducto(nuevoProducto);
        System.out.println("Producto creado con éxito!");
    }

    public ArrayList<Producto> verProductos(String condicion) throws Exception {
        System.out.println("                    -------------  Productos  ------------");

        switch (condicion) {
            case "nombre":
                for (Producto p : productos) {
                    System.out.println(p.getNombre());
                }
                break;
            case "nombrePrecio":
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + " | Precio: $" + p.getPrecio());
                }
                break;
            case "entre_120_202":
                for (Producto p : productos) {
                    if (p.getPrecio() >= 120 && p.getPrecio() <= 202) {
                        System.out.println(p.getNombre() + " | Precio: $" + p.getPrecio());
                    }
                }
                break;
            case "portatiles":
                String busqueda = "portátil";
                for (Producto p : productos) {
                    if (p.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
                        System.out.println(p.getNombre() + " | Precio: $" + p.getPrecio());
                    }
                }
                break;
            case "masBarato":
                Producto aux = new Producto(0, 0, "a", 200000);
                for (Producto p : productos) {
                    if (p.getPrecio() < aux.getPrecio()) {
                        aux = p;
                    }
                }
                System.out.println(aux.getNombre() + " | Precio: $" + aux.getPrecio());
                break;
            default:
                break;

        }
        return productos;
    }

    public void verPortatiles() throws Exception {

    }

    public Integer validarProducto(Integer respuesta) throws Exception {

        boolean respuestaValida = false;

        if (respuesta == 0) {

            for (Producto p : productos) {
                System.out.println(p.getNombre() + " | Código: " + p.getCodigo());
            }

            System.out.print("Ingrese un código de la lista: ");
            respuesta = errores.inputInt();

        }

        do {

            for (Producto p : productos) {
                if (p.getCodigo() == respuesta) {
                    respuestaValida = true;
                    break;
                }
            }

            if (!respuestaValida) {
                System.out.print("Ingrese un código de producto correcto o 0 para cancelar ");
                respuesta = errores.inputInt();
            }

            if (respuesta == 0) {
                respuestaValida = true;
            }

        } while (!respuestaValida);

        return respuesta;
    }

    public void eliminarProducto() throws Exception {

        System.out.println("                    ---------  Eliminar Producto  --------");
        System.out.print("Ingrese el código del producto o 0 para ver la lista: ");
        Integer respuesta = validarProducto(errores.inputInt());
        if (respuesta == 0) {
            System.out.println("Solicitud cancelada!");
        } else {
            consultarProductos.eliminarProducto(respuesta);
            System.out.println("Producto Eliminado Correctamente!");
        }
    }

    public void modificarProducto() throws Exception {
        System.out.println("                    --------  Modificar Producto  -------");
        Producto nuevoProducto = new Producto();
        System.out.print("Ingrese el código del producto o 0 para ver la lista: ");
        Integer respuesta = validarProducto(errores.inputInt());
        boolean operacionCancelada = false;

        if (respuesta == 0) {
            operacionCancelada = true;

        } else {
            operacionCancelada = false;
            nuevoProducto.setCodigo(respuesta);
            System.out.println("Bien, que desea modificar del producto?");
            System.out.println("---- 1 ---- Nombre");
            System.out.println("---- 2 ---- Precio");
            System.out.println("---- 3 ---- Ambos");
            System.out.println("---- 4 ---- Cancelar");

            Integer opcion = errores.inputInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nuevo nombre");
                    nuevoProducto.setNombre(leer.next());

                    break;
                case 2:
                    System.out.println("Bien, ahora el nuevo precio");
                    nuevoProducto.setPrecio(errores.inputInt());
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo nombre");
                    nuevoProducto.setNombre(leer.next());
                    System.out.println("Bien, ahora el nuevo precio");
                    nuevoProducto.setPrecio(errores.inputInt());
                    break;
                case 4:
                    operacionCancelada = true;
                    break;
            }
            if (!operacionCancelada) {
                consultarProductos.modificarProducto(opcion, nuevoProducto);
            } else {
                System.out.println("Solicitud cancelada!");
            }
        }
    }

}
