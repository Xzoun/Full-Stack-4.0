/*
Crea una clase "Empleado" que tenga atributos como "nombre", 
"edad" y "salario". Luego, crea un método "calcular_aumento" que 
calcule el aumento salarial de un empleado en función de su edad y 
salario actual. El aumento salarial debe ser del 10% si el empleado tiene 
más de 30 años o del 5% si tiene menos de 30 años.
 */
package ejercicio.extra5.guia.pkg7;


public class EjercicioExtra5Guia7 {

    
    public static void main(String[] args) {
       Empleado e1 = new Empleado("Juan Carlos",100000,29 );       
       Empleado e2 = new Empleado("Juan Jose",100000,33 );  
       e1.calcular_aumento();
       e2.calcular_aumento();
    }
    
}
