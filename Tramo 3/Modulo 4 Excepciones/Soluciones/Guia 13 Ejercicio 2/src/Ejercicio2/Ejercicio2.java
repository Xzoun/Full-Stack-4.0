/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package Ejercicio2;

public class Ejercicio2 {

    public void Ejercicio2() {
        String[] A = new String[5];
        try{
        for (int i = 0; i < 6; i++) {
            A[i]="ABC" + i;
            System.out.print(A[i] + " | ");
        }
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("");
            System.out.println(a);
        }
    }

}
