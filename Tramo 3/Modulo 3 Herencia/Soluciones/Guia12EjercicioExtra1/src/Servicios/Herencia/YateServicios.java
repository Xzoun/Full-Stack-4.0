package Servicios.Herencia;

import Entidad.Barco;
import Entidad.Herencia.Barco.BarcoMotor;
import Entidad.Herencia.Barco.Yate;
import Servicios.BarcoServicios;
import java.util.Scanner;

public class YateServicios extends BarcoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Barco crearBarco() {
        Yate nuevoYate = new Yate();
        Barco nuevoBarco = super.crearBarco();
        nuevoYate.setModelo(nuevoBarco.getModelo());
        nuevoYate.setMatricula(nuevoBarco.getMatricula());
        nuevoYate.setEslora(nuevoBarco.getEslora());
        System.out.println("Ingrese la potencia (CV)");
        nuevoYate.setPotencia(leer.nextInt());
        System.out.println("Ingrese el numero de camarotes");
        nuevoYate.setCamarotes(leer.nextInt());
        return nuevoYate;
    }
    
     public Double costoFinal(Double generico,Yate barco){
       return generico + barco.getPotencia()+barco.getPotencia();
    }
}
