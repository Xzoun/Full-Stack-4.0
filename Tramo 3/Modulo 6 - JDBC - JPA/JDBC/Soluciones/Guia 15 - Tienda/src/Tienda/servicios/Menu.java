/*
Paquete servicios:
En este paquete se almacenarán aquellas clases que llevarán adelante lógica del negocio. En
general se crea un servicio para administrar cada una de las entidades y algunos servicios
para manejar operaciones muy específicas como las estadísticas.
Realizar un menú en Java a través del cual se permita elegir qué consulta se desea realizar.
Las consultas a realizar sobre la BD son las siguientes:
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
 */
package Tienda.servicios;

public class Menu {

    ProductoServicios ProductoServ = new ProductoServicios();
    FabricanteServicios fabricanteServ = new FabricanteServicios();
    Errores errores = new Errores();

    public void cargarDB() throws Exception {
        fabricanteServ.cargarDB();
        ProductoServ.cargarDB();
    }

    public void menu() throws Exception {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                    ---------------  Menu  ---------------");
        System.out.println("");
        System.out.println("----  1 ---- Ver todos los productos.    ");
        System.out.println("----  2 ---- Ver todos los productos con precio.    ");
        System.out.println("----  3 ---- Ver productos con precio entre 120 y 202. ");
        System.out.println("----  4 ---- Ver todos los productos portátiles. ");
        System.out.println("----  5 ---- Ver producto mas barato.   ");
        System.out.println("----  6 ---- Crear producto. ");
        System.out.println("----  7 ---- Crear fabricante. ");
        System.out.println("----  8 ---- Modificar producto. ");
        System.out.println("----  9 ---- Eliminar producto. ");
        System.out.println("---- 10 ---- Salir. ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese una opción: ");
        Integer respuesta = errores.inputInt();
        System.out.println("----------------------------------------------------------------------------");
        switch (respuesta) {
            case 1:
                ProductoServ.verProductos("nombre");
                menu();
                break;

            case 2:
                ProductoServ.verProductos("nombrePrecio");
                menu();
                break;
            case 3:
                ProductoServ.verProductos("entre_120_202");
                menu();
                break;
            case 4:
                ProductoServ.verProductos("portatiles");
                menu();
                break;
            case 5:
                ProductoServ.verProductos("masBarato");
                menu();
                break;
            case 6:
                crearProducto();
                cargarDB();
                menu();
                break;
            case 7:
                fabricanteServ.crearFabricante();
                cargarDB();
                menu();
                break;
            case 8:
                ProductoServ.modificarProducto();
                cargarDB();
                menu();
                break;
            case 9:
                ProductoServ.eliminarProducto();
                cargarDB();
                menu();
                break;
            case 10:
                System.out.println("Gracias, hasta pronto!");
                break;
            default:
                System.out.println("Opción inválida!");
                menu();
                break;
        }
    }

    public void crearProducto() throws Exception {

        System.out.println("                ------------- Cargar Producto  ------------");
        System.out.print("Para iniciar la carga ingrese el código de fabricante o 0 para ver la lista: ");
        Integer respuesta = errores.inputInt();
        Integer validacion = fabricanteServ.validarFabricante(respuesta);

        if (validacion == 0) {
            System.out.println("Carga Cancelada");
        } else {
            ProductoServ.crearProducto(validacion);

        }

    }
}
