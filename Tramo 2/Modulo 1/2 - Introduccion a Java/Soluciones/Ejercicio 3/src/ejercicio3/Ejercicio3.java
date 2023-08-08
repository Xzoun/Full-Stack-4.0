package ejercicio3;
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        String frace;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Frase");
        frace = leer.nextLine();
        System.out.println("La frase ingresada es en modo minusculas " + frace.toLowerCase());
        System.out.println("La frase ingresada es en modo mayusculas " + frace.toUpperCase());
    }
    }
 
    
