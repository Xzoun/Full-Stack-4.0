
package Entidad.Herencia;

import Entidad.Animal;

public class Caballo extends Animal {
        private String alimento;

    public Caballo(String alimento) {
        this.alimento = alimento;
    }

    public Caballo(String nombre, String razaAnimal,Integer edad , String alimento ) {
        super(nombre, razaAnimal,edad, alimento);
        this.alimento = alimento;
    }
    
}

