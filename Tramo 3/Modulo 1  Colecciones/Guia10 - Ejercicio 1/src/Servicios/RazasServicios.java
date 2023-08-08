/*
1) Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */

 /*
2) Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazasServicios {

    Scanner leer = new Scanner(System.in);
    ArrayList<String> razasList = new ArrayList();

    public void MenuIngreso() {
        String continuar;
        do {
            System.out.println("Ingrese la raza.");
            String ingreso = leer.next();
            razasList.add(ingreso);
            System.out.println("Bien, para ingresar otra raza presiona s");
            continuar = leer.next();
            System.out.println(" ");
        } while (continuar.equalsIgnoreCase("s"));
        System.out.println(razasList);
    }

    public void MenuEliminar() {
        Iterator<String> it = razasList.iterator();

        int tamaño = razasList.size();
        System.out.println("Ingrese una raza para eliminar");
        String eliminada = leer.next();

        while (it.hasNext()) {
            if (eliminada.equals(it.next())) {
                it.remove();
                System.out.println(razasList);
            }
        }
        if (tamaño != razasList.size()) {
            System.out.println("No se eliminó la raza. No pertenece a la lista");
        }
    }

//        for (String raza : razasList) {
//            if (eliminada.equalsIgnoreCase(raza)) {
//                razasList.remove(raza);
//                contador++;
//            }
//        }
//        if (contador > 0) {
//            System.out.println("");
//            System.out.println(razasList);
//        } else {
//            System.out.println("No se eliminó la raza. No pertenece a la lista");
//            System.out.println("");
//            System.out.println(razasList);
//        }
}
