/*Implemente la clase Persona en el paquete entidades. 
Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
constructor vacío, constructor parametrizado, get y set. Crear una clase 
PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y 
la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la
edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
*/
package guia.pkg9.ejercicio.pkg5;

import Entidades.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

public class Guia9Ejercicio5 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       PersonaService ps = new PersonaService();
       Persona P1 = ps.crearPersona();
       ps.calcularEdad(P1);
       System.out.println("Ingrese la edad a consultar");
       int edad = leer.nextInt();
        System.out.println(ps.menorQue(P1,edad));
       ps.mostrarPersona(P1);
    }
    
}
