/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> paisesHash = new HashSet();
    
    public void menu() {
        System.out.println("--------------------------------------");
        System.out.println("---------------  Menu  ---------------");
        System.out.println("Elija una opción:");
        System.out.println("-- 1 -- Ingresar un nuevo país");
        System.out.println("-- 2 -- Eliminar");
        System.out.println("-- 3 -- Ver la lista completa");
        System.out.println("-- 4 -- Salir");
        System.out.println("--------------------------------------");
        int respuesta = leer.nextInt();
        switch (respuesta) {
            case 1:
                crear();
                break;
            case 2:
                eliminar();
                break;
            case 3:
                mostrar();
                break;
            case 4:
                break;
            default:
                System.out.println("Ingrese una opción válida");
                menu();
                break;
        }
    }

    public void crear() {
        String continuar;
        System.out.println("--------------------------------------");
        System.out.println("------------ Cargar Países -----------");
        do {
            System.out.println("Ingrese el nombre");
            System.out.println("--------------------------------------");
            String nombre = leer.next();
            System.out.println("Presione 's' para agregar otro pais u otra tecla para continuar");
            System.out.println("--------------------------------------");
            continuar = leer.next();
            paisesHash.add(nombre);
        } while (continuar.equalsIgnoreCase("s"));
        mostrar();
    }

    public void mostrar() {
        ArrayList<String> paisesList = new ArrayList(paisesHash);
        Collections.sort(paisesList);
        System.out.println("--------------------------------------");
        System.out.println("-----  Lista de países cargados  -----");
        for (String pais : paisesList) {
            System.out.print(" -- " + pais + " -- ");
        }
        System.out.println(" ");
        menu();
    }

    public void eliminar() {
        boolean eliminado = false;
        System.out.println("--------------------------------------");
        System.out.println("------------  Eliminar País  -----------");
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        Iterator<String> it = paisesHash.iterator();
        if (it.hasNext()) {
            String pais = it.next();
            if (nombre.equalsIgnoreCase(pais)) {
                paisesHash.remove(pais);
                eliminado = true;
            }
        }
        if (!eliminado) {
            System.out.println("--------------------------------------");
            System.out.println(nombre + " no estaba en la lista.");
        }
        menu();
    }
}
