package Servicios.Herencia;

import Entidad.Barco;
import Entidad.Herencia.Barco.BarcoMotor;
import Servicios.BarcoServicios;
import java.util.Scanner;

public class BarcoMotorServicios extends BarcoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Barco crearBarco() {
        BarcoMotor nuevoBarcoMotor = new BarcoMotor();
        Barco nuevoBarco = super.crearBarco();
        nuevoBarcoMotor.setModelo(nuevoBarco.getModelo());
        nuevoBarcoMotor.setMatricula(nuevoBarco.getMatricula());
        nuevoBarcoMotor.setEslora(nuevoBarco.getEslora());
        System.out.println("Ingrese la potencia (CV)");
        nuevoBarcoMotor.setPotencia(leer.nextInt());
      
        return nuevoBarcoMotor;
    }
  
    public Double costoFinal(Double generico,BarcoMotor barco){
       return generico + barco.getPotencia();
    }
}
