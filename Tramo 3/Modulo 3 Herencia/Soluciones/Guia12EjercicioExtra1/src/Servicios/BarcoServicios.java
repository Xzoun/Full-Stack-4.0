package Servicios;

import Entidad.Barco;

import java.util.Scanner;

public class BarcoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Barco crearBarco() {
        Barco nuevoBarco = new Barco();
        System.out.println("Ingrese la matricula");
        nuevoBarco.setMatricula(leer.next());
        System.out.println("Ahora año del vehiculo");
        nuevoBarco.setModelo(leer.nextInt());
        System.out.println("Bien, ahora ingrese la Slora (mts)");
        nuevoBarco.setEslora(leer.nextDouble());
        return nuevoBarco;
    }
    public Double CostoDeAlquiler(Barco eleccion,Integer diasAlquilado){
        Double modulo = eleccion.getEslora()*10;
        return diasAlquilado*modulo;
    }
}
