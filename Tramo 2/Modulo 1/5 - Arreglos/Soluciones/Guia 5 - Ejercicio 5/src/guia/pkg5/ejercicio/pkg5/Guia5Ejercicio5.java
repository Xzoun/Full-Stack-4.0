/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
*/
package guia.pkg5.ejercicio.pkg5;

public class Guia5Ejercicio5 {
    
    public static void main(String[] args) {
       int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] transpuesta = new int[3][3];
        boolean comprobacion = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("****************");
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[i][j] = matriz[j][i];
                System.out.print("[" + transpuesta[i][j] + "]");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == (transpuesta[j][i])) {
                    comprobacion = true;
                }
            }
        }
        if (comprobacion) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] != (transpuesta[i][j]) * -1) {
                        comprobacion = false;
                    }
                }
            }
        }
        if (comprobacion) {
            System.out.println("la matriz es antisimetrica");
        }
    }
}
   
