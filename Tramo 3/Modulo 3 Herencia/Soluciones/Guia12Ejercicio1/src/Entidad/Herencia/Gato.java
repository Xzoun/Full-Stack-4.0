
package Entidad.Herencia;

import Entidad.Animal;


public class Gato extends Animal{
    private String alimento;

    public Gato(String alimento) {
        this.alimento = alimento;
    }

    public Gato(String nombre, String razaAnimal,Integer edad , String alimento ) {
        super(nombre, razaAnimal,edad, alimento);
        this.alimento = alimento;
    }
    
}
