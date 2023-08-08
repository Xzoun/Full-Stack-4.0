/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar
luego un mensaje por pantalla informando de que se alimenta. Generar una
clase Main que realice lo siguiente:
 */
package guia12ejercicio1;

import Entidad.Animal;
import Entidad.Herencia.Caballo;
import Entidad.Herencia.Gato;
import Entidad.Herencia.Perro;

public class Guia12Ejercicio1 {

    public static void main(String[] args) {
        Animal perro1 = new Perro("asd", "doberman", 15,"carne" );
        perro1.alimentarse();
        Animal perro2 = new Perro("sdf", "chihuahua", 15, "croqueta");
        perro2.alimentarse();
        Animal gato1 = new Gato("tuca","siames" , 15, "Galletas");
        gato1.alimentarse();
        Animal caballo1 = new Caballo("jhj", "fino", 15, "pasto");
        caballo1.alimentarse();
    }

}
