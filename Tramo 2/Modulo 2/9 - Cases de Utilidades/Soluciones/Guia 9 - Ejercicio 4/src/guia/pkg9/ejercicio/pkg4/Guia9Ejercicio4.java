/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService,
en paquete Servicios,que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
Ejemplo fecha: 
Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
el constructor vacío
de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años
entre una y otra 
(edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package guia.pkg9.ejercicio.pkg4;

import Servicios.FechaServicio;
import java.util.Date;

public class Guia9Ejercicio4 {

   
    public static void main(String[] args) {    
        FechaServicio fechaServicio = new FechaServicio();

        // Obtener la fecha de nacimiento del usuario
        Date fechaNacimiento = fechaServicio.fechaNacimiento();

        // Obtener la fecha actual
        Date fechaActual = fechaServicio.fechaActual();

        // Calcular la diferencia de años (edad del usuario)
        int edad = fechaServicio.diferencia(fechaNacimiento, fechaActual);

        System.out.println("Tu edad es: " + edad + " años");
    }
}
