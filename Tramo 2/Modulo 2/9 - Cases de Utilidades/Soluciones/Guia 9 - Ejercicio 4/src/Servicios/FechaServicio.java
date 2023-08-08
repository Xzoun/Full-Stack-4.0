package Servicios;
import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    //Método fechaNacimiento que pregunte al usuario día, mes y año de su 
    //nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    public Date fechaNacimiento(){
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese dia de nacimiento");
        int dia = read.nextInt();
        System.out.println("ingrese mes de nacimiento");
        int mes = read.nextInt();
        System.out.println("ingrese año de nacimiento");
        int anio = read.nextInt();
        return new Date(anio-1900, mes-1, dia);
    }
    //Método fechaActual que cree un objeto fecha con el día actual. Para esto
    //usaremos el constructor vacío de la clase Date.
    //Ejemplo: Date fechaActual = new  Date();El método debe retornar el objeto Date.
    public Date fechaActual(){
        return new Date();
    }
    //Método diferencia que reciba las dos fechas por parámetro y retorna la 
    //diferencia de años entre una y otra (edad del usuario).Si necesiten acá 
    //tienen más información en clase Date: Documentacion Oracle
    public int diferencia(Date fechaNacimiento, Date fechaActual){
        long milisegundosPorAnio = 1000L * 60 *60 * 24 * 365;
        long diferenciaMilisegundos = fechaActual.getTime()- fechaNacimiento.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);
        return edad;
    }    
}

