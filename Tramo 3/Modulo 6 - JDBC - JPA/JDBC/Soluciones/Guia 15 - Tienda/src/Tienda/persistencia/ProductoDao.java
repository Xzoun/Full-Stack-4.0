package Tienda.persistencia;

import Tienda.entidades.Producto;
import java.util.ArrayList;

public class ProductoDao extends DAO {

    public ArrayList<Producto> listarProductos() throws Exception {
        try {
            String consulta = "select * from producto;";
            consultarBase(consulta);
            Producto nuevoProducto = null;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                nuevoProducto = new Producto();
                nuevoProducto.setCodigo(resultado.getInt(1));
                nuevoProducto.setNombre(resultado.getString(2));
                nuevoProducto.setPrecio(resultado.getInt(3));
                productos.add(nuevoProducto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de Sistema.");
        }
    }

    public void crearProducto(Producto nuevoProducto) throws Exception {
        try {
            String consulta = "insert into producto(nombre,precio,codigo_fabricante) values ('"
                    + nuevoProducto.getNombre() + "'," + nuevoProducto.getPrecio() + "," + nuevoProducto.getCodigoFabricante() + ");";
            insertarModificarEliminar(consulta);
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Producto> listarProductosPortatiles() throws Exception {
        try {
            String consulta = "select * from producto where nombre like \"%portátil%\";";
            consultarBase(consulta);
            Producto nuevoProducto = null;
            ArrayList<Producto> productos = new ArrayList();
            while (resultado.next()) {
                nuevoProducto = new Producto();
                nuevoProducto.setNombre(resultado.getString(2));
                nuevoProducto.setPrecio(resultado.getInt(3));
                productos.add(nuevoProducto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de Sistema.");
        }

    }

    public void eliminarProducto(Integer codigo) throws Exception {
        try {
            String consulta = "delete from producto where codigo = " + codigo + ";";
            insertarModificarEliminar(consulta);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(Integer modificacion, Producto producto) throws Exception {
        try {
            String consulta = "";
            switch (modificacion) {
                case 1:
                    consulta = "update producto set nombre = '"
                            + producto.getNombre() + "' where codigo = " + producto.getCodigo() + "; ";
                    break;
                case 2:
                    consulta = "update producto set precio = "
                            + producto.getPrecio() + " where codigo = " + producto.getCodigo() + "; ";
                    break;
                case 3:

                    consulta = "update producto set nombre = '"
                            + producto.getNombre() + "', precio = "
                            + producto.getPrecio() + " where codigo = " + producto.getCodigo() + "; ";
                    break;
            }
            insertarModificarEliminar(consulta);
        } catch (Exception e) {
            throw e;
        }
    }
}
