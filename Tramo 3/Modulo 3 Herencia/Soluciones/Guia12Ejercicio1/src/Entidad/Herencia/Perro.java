
package Entidad.Herencia;

import Entidad.Animal;


public class Perro extends Animal {
        private String alimento;

    public Perro(String nombre, String razaAnimal,Integer edad , String alimento ) {
        super(nombre, razaAnimal,edad, alimento);
        this.alimento = alimento;
    }
}
