package Tienda.servicios;

import Tienda.entidades.Fabricante;
import Tienda.persistencia.FabricanteDao;
import java.util.ArrayList;
import java.util.Scanner;

public class FabricanteServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    FabricanteDao consultarFabricante = new FabricanteDao();
    ArrayList<Fabricante> fabricantes = new ArrayList();
    Errores errores = new Errores();

    public void cargarDB() throws Exception {
        fabricantes = consultarFabricante.listarFabricantes();
    }

    public ArrayList<Fabricante> verFabricantes(Boolean ver) throws Exception {

        if (ver) {
            System.out.println("                   ------------  Fabricantes  ------------");
            for (Fabricante f : fabricantes) {
                System.out.println(f.getNombre() + " | Codigo: " + f.getCodigo());
            }
        }
        return fabricantes;
    }

    public void crearFabricante() throws Exception {

        System.out.println("                ------------ Cargar Frabricante  ----------");
        System.out.print("Para realizar la carga ingrese el nombre del fabricante nuevo: ");
  
        consultarFabricante.crearFabricante(leer.next());
    }

    public Integer validarFabricante(Integer respuesta) {
        boolean respuestaValida = false;

        if (respuesta == 0) {
            for (Fabricante f : fabricantes) {
                System.out.println(f.getNombre() + " | Codigo: " + f.getCodigo());
            }

            System.out.print("Ingrese un código de la lista: ");
            respuesta = errores.inputInt();
        }

        do {
            for (Fabricante f : fabricantes) {
                if (f.getCodigo() == respuesta) {
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
}
