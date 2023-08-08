/*
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. 
Por ultimo realizaruna división con los dos numeros y mostrar el resultado.
 */
package Ejercicio3Y4;

import java.util.Scanner;

public class Ejercicio3 {

    public void Ejercicio3() {
        DivisionNumero division = new DivisionNumero();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros");
        String num1 = leer.next();
        String num2 = leer.next();
        try {
            Integer num1Int = Integer.parseInt(num1);
            Integer num2Int = Integer.parseInt(num2);

            division.dividir(num1Int, num2Int);

        } catch (NumberFormatException a) {
            System.out.println(a);
        } catch (Exception a) {
            System.out.println();
            System.out.println(a);
        }
    }
}
