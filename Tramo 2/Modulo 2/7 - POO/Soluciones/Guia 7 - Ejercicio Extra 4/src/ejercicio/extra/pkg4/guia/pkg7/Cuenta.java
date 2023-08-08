/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package ejercicio.extra.pkg4.guia.pkg7;

import java.util.Scanner;

public class Cuenta {

    public double saldo;
    public String titular;

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }

    public boolean retirar_dinero() {
        boolean retorno;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto que quiere retirar");
        double retiro = leer.nextDouble();
        if (saldo >= retiro) {
            saldo = saldo - retiro;
            retorno = true;
            System.out.println("El saldo retirado es $"+ retiro + "\nSu nuevo saldo es de $"+saldo);
        } else {
            retorno = false;
            System.out.println("Intentelo nuevamente. El saldo disponible es $" + saldo);
        }

        return retorno;
    }

}
