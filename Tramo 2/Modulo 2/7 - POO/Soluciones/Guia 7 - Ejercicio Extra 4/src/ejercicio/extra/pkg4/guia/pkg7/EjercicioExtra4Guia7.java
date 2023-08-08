/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.
 */
package ejercicio.extra.pkg4.guia.pkg7;

public class EjercicioExtra4Guia7 {

    public static void main(String[] args) {
        Cuenta C1 = new Cuenta(5000, "Cacho");
        C1.retirar_dinero();
    }

}
