package Tienda.persistencia;

import Tienda.entidades.Fabricante;
import java.util.ArrayList;

public class FabricanteDao extends DAO {

    public ArrayList<Fabricante> listarFabricantes() throws Exception {
        try {
            String consulta = "select * from fabricante;";
            consultarBase(consulta);
            Fabricante nuevoFabricante = null;
            ArrayList<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                nuevoFabricante = new Fabricante();
                nuevoFabricante.setNombre(resultado.getString(2));
                nuevoFabricante.setCodigo(resultado.getInt(1));
                fabricantes.add(nuevoFabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            desconectarBase();
            throw new Exception("Error de Sistema.");
        }
    }

    public void crearFabricante(String nombre) throws Exception {
        try {
            String consulta = "insert into fabricante(nombre) values ('" + nombre + "');";
            insertarModificarEliminar(consulta);
        } catch (Exception e) {
            throw e;
        }
    }
}
