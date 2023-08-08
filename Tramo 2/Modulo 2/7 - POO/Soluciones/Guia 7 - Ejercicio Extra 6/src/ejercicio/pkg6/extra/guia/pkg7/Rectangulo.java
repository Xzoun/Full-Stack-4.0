/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y 
un método "calcular_area" que calcule y devuelva el área del rectángulo. 
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 
y imprime el área del rectángulo.
 */
package ejercicio.pkg6.extra.guia.pkg7;

public class Rectangulo {
    public int lado1;
    public int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo() {
    }
    
    public int calcular_area(){
        int area = lado1*lado2;
        return area;        
    }
    
   
    
}
