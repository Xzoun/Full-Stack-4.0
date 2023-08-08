/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void Ejercicio5() {

        System.out.println("Para iniciar ingrese un numero: ");
        boolean victoria = false;
        Integer ganador = Math.max(1, (int) (Math.random() * 500)),
                num,
                contador = 0;

        do {

            try {
                num = leer.nextInt();
                victoria = comprobarNumero(ganador, num, victoria);

            } catch (Exception a) {
                System.out.println("Incorrecto, ingrese un número: ");
                leer.next();
            } finally {
                contador++;
            }
            
        } while (!victoria);
  
        if (contador > 1) {
            System.out.println("Ganaste en:" + contador + " intetos.");
        } else {
            System.out.println("Woow: Hoyo en uno! Felicidades.");
        }
    }

    public boolean comprobarNumero(Integer ganador, Integer num, Boolean victoria) {

        if (ganador == num) {
            System.out.println("Felicidades, ganaste!");
            victoria = true;
        } else if (ganador > num) {
            System.out.println("Mm Incorrecto, ingrese un número más grande");
        } else {
            System.out.println("Noo, ingrese un número más chico");
        }
        return victoria;
    }
}
