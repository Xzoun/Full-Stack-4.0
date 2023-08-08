/*
Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
class A {
public void metodoA() {
sentencia_a1
sentencia_a2
try {
sentencia_a3
sentencia_a4
} catch (MioException e){
sentencia_a6
}
sentencia_a5
}
}
 */
package Ejercicio6;

public class Ejercicio6 {

    public void Ejercicio6() {       
        String[] nombre = {"Claudio", "Francisco", "Claudia", "Hernan", "Federico",
            "Nicolas", "Fara", "Ludmila", "Sofia", "Micaela", "Leonel", "Leonardo", "Denise",
            "Karen", "Rocio", "Marina", "Fernanda", "Luis", "Juan", "Gaston"};

        System.out.println("Sentencia 1: " + nombre[(int) (Math.random() * 19)]);
        System.out.println("Sentencia 2: " + nombre[(int) (Math.random() * 19)]);
        try {
            System.out.println("Sentencia 3: " + nombre[(int) (Math.random() * 40)]);
            System.out.println("Sentencia 4: " + nombre[(int) (Math.random() * 40)]);
        } catch (Exception a) {
            System.out.println("Error en: "+ a);
            System.out.println("Sentencia 6: " + nombre[(int) (Math.random() * 19)]);
        }
        System.out.println("Sentencia 5: " + nombre[(int) (Math.random() * 19)]);
    }
}
