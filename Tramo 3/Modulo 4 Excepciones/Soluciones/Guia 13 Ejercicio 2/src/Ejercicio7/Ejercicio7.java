/*
 Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
class B {
public void metodoB() {
sentencia_b1
try {
sentencia_b2
} catch (MioException e){
sentencia_b3
}
finally
sentencia_b4
}
}
 */
package Ejercicio7;

public class Ejercicio7 {

    public void Ejercicio7() {
        String[] nombre = {"Claudio", "Francisco", "Claudia", "Hernan", "Federico",
            "Nicolas", "Fara", "Ludmila", "Sofia", "Micaela", "Leonel", "Leonardo", "Denise",
            "Karen", "Rocio", "Marina", "Fernanda", "Luis", "Juan", "Gaston"};

        System.out.println("Sentencia 1: " + nombre[(int) (Math.random() * 19)]);
        try {
            System.out.println("Sentencia 2: " + nombre[(int) (Math.random() * 40)]);
        } catch (Exception a) {
            System.out.println("Error en: " + a);
            System.out.println("Sentencia 3: " + nombre[(int) (Math.random() * 19)]);
        } finally {
            System.out.println("Sentencia 4: " + nombre[(int) (Math.random() * 19)]);
        }
    }
}
