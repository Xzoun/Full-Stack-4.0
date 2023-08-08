/*
 Un alquiler se calcula multiplicando el número de días de ocupación (calculado con
la fecha de alquiler y devolución), por un valor módulo de cada barco (obtenido
simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo
normal y sumándole el atributo particular de cada barco. En los veleros se suma el
número de mástiles,en los barcos a motor se le suma la potencia en CV y en los 
yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases
y los métodos necesarios que permitan al usuario elegir el barco que quiera alquilar
y mostrarle el precio final de su alquiler. 
 */
package Servicios;

import Entidad.Alquiler;
import Entidad.Herencia.Barco.*;
import Servicios.Herencia.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class AlquilerServicios {

    HashMap<Integer, Alquiler> AlquilerHashMap = new HashMap();
    BarcoMotorServicios nuevoBM = new BarcoMotorServicios();
    VeleroServicios nuevoVelero = new VeleroServicios();
    YateServicios nuevoYate = new YateServicios();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler() {
        Integer key = AlquilerHashMap.size()+1;
        BarcoServicios nuevoBarco = new BarcoServicios();
        Alquiler nuevoAlquiler = new Alquiler();
        boolean respuestaValida;
        System.out.println("Para iniciar una carga ingrese el nombre");
        nuevoAlquiler.setNombre(leer.next());
        System.out.println("Ingrese el DNI");
        nuevoAlquiler.setDNI(leer.nextInt());
        System.out.println("Alquilo la plataforma " + key);
        do {
            System.out.println("Que tipo de barco quiere alquilar?");
            System.out.println("");
            System.out.println("-- 1 -- Con Motor."
                    + "\n-- 2 -- Velero."
                    + "\n-- 3 -- Yate."
                    + "\nElija una opcion: ");
            switch (leer.nextInt()) {
                case 1:

                    System.out.println("--------------------------------------");
                    nuevoAlquiler.setBarco(nuevoBM.crearBarco());
                    respuestaValida = true;
                    break;
                case 2:

                    System.out.println("--------------------------------------");
                    nuevoAlquiler.setBarco(nuevoVelero.crearBarco());
                    respuestaValida = true;
                    break;
                case 3:

                    System.out.println("--------------------------------------");
                    nuevoAlquiler.setBarco(nuevoYate.crearBarco());
                    respuestaValida = true;
                    break;
                default:
                    System.out.println("Ingrese una respuesta valida");
                    respuestaValida = false;
                    crearAlquiler();
                    break;
            }
        } while (!respuestaValida);

        LocalDate fechaInicio = LocalDate.now();
        nuevoAlquiler.setInicio(fechaInicio);

        System.out.println("Cuantos días quiere alquilar?");
        Integer diasAlquiler = leer.nextInt();

        nuevoAlquiler.setDevolucion(fechaInicio.plusDays(diasAlquiler));
        Double generico = nuevoBarco.CostoDeAlquiler(nuevoAlquiler.getBarco(), diasAlquiler);
        if (nuevoAlquiler.getBarco() instanceof Velero) {
            System.out.println("Vehiculo: ");
            System.out.println(nuevoAlquiler.getBarco().toString());
            System.out.println("costo del Alquiler: ");
            System.out.println(nuevoVelero.costoFinal(generico, (Velero) nuevoAlquiler.getBarco()));
        } else if (nuevoAlquiler.getBarco() instanceof BarcoMotor) {
            System.out.println("Vehiculo: ");
            System.out.println(nuevoAlquiler.getBarco().toString());
            System.out.println("costo del Alquiler: ");
            System.out.println(nuevoBM.costoFinal(generico, (BarcoMotor) nuevoAlquiler.getBarco()));
        } else if (nuevoAlquiler.getBarco() instanceof Yate) {
            System.out.println("Vehiculo: ");
            System.out.println(nuevoAlquiler.getBarco().toString());
            System.out.println("costo del Alquiler: ");
            System.out.println(nuevoYate.costoFinal(generico, (Yate) nuevoAlquiler.getBarco()));
        }

        AlquilerHashMap.put(key, nuevoAlquiler);

        return nuevoAlquiler;
    }
}
