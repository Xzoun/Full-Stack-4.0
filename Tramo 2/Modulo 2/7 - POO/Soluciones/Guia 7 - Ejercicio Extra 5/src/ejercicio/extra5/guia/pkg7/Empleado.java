/*
Crea una clase "Empleado" que tenga atributos como "nombre", 
"edad" y "salario". Luego, crea un método "calcular_aumento" que 
calcule el aumento salarial de un empleado en función de su edad y 
salario actual. El aumento salarial debe ser del 10% si el empleado tiene 
más de 30 años o del 5% si tiene menos de 30 años.
 */
package ejercicio.extra5.guia.pkg7;

public class Empleado {
    public String nombre;
    public int salario;
    public int edad;

    public Empleado(String nombre, int salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public Empleado() {
    }
    public void calcular_aumento(){
        double aumento; 
        if(edad>30){
            aumento = (salario * 0.10);
            System.out.println("El aumento sera de $" + aumento);
        }else{
            aumento = (salario * 0.05);
            System.out.println("El aumento sera de $" + aumento);
        }
    }
}
