package Servicios.Herencia;

import Entidad.Barco;
import Entidad.Herencia.Barco.Velero;
import Servicios.BarcoServicios;
import java.util.Scanner;

public class VeleroServicios extends BarcoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Barco crearBarco() {
        Velero nuevoVelero = new Velero();
        Barco nuevoBarco = super.crearBarco();
        nuevoVelero.setModelo(nuevoBarco.getModelo());
        nuevoVelero.setMatricula(nuevoBarco.getMatricula());
        nuevoVelero.setEslora(nuevoBarco.getEslora());
        
        System.out.println("Ingrese el numero de mastiles");
        nuevoVelero.setMastiles(leer.nextInt());
        
        return nuevoVelero;
    }
     public Double costoFinal(Double generico,Velero barco){
       return generico + barco.getMastiles();
    }
}
