/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de 
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Crear una clase 
PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de
la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento 
y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor 
que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package Servicio;

import java.util.Date;
import java.util.Scanner;
import Entidades.Persona;

public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona nuevoIngreso = new Persona();
        System.out.println("Buenas, ingresa tu nombre");
        nuevoIngreso.setNombre(leer.next());
        System.out.println("Ingrese el dia de su nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        int anio = leer.nextInt();
        nuevoIngreso.setFechaNacimiento(new Date(anio - 1900, mes - 1, dia));
        return nuevoIngreso;
    }

//       public Date fechaActual() {    
//        return new Date(); 
//    }
    public int calcularEdad(Persona nuevoIngreso) {
        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = new Date().getTime() - nuevoIngreso.getFechaNacimiento().getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);
        return edad;
    }

    public boolean menorQue(Persona nuevoIngreso,int edad) {       
            return calcularEdad(nuevoIngreso) < edad ;
        }
    public void mostrarPersona(Persona nuevoIngreso){
        System.out.println(nuevoIngreso);
    }
}
