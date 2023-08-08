/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LocalServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> productosHashMap = new HashMap();

    public void menu() {
        System.out.println("--------------------------------------");
        System.out.println("---------------  Menu  ---------------");
        System.out.println("Elija una opción:");
        System.out.println("-- 1 -- Ingresar un nuevo producto");
        System.out.println("-- 2 -- Modificar un  producto");
        System.out.println("-- 3 -- Eliminar");
        System.out.println("-- 4 -- Ver lista completa");
        System.out.println("-- 5 -- Salir");
        System.out.println("--------------------------------------");
        int respuesta = leer.nextInt();
        switch (respuesta) {
            case 1:
                crear();
                break;
            case 2:
                modificar();
                break;
            case 3:
                eliminar();
                break;
            case 4:
                mostrar();
                break;
            case 5:
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
        System.out.println("------------ Cargar Productos -----------");
        do {
            System.out.println("Ingrese el nombre");
            System.out.println("--------------------------------------");
            String nombre = leer.next();
            nombre = nombre.toLowerCase();
            System.out.println("Ingrese el precio");
            System.out.println("--------------------------------------");
            Integer precio = leer.nextInt();
            System.out.println("Presione 's' para agregar otro pais u otra tecla para continuar");
            System.out.println("--------------------------------------");
            continuar = leer.next();
            productosHashMap.put(nombre, precio);
        } while (continuar.equalsIgnoreCase("s"));
        mostrar();
    }

    public void modificar() {
        System.out.println("--------------------------------------");
        System.out.println("------------  Modificar producto  -----------");
        System.out.println("Ingrese el nombre");
        System.out.println("--------------------------------------");
        String nombre = leer.next();
        nombre = nombre.toLowerCase();
        System.out.println("Elija una opción:");
        System.out.println("-- 1 -- Modificar nombre");
        System.out.println("-- 2 -- Modificar precio");
        System.out.println("--------------------------------------");
        int modificar = leer.nextInt();
        Integer precio;
        if (productosHashMap.containsKey(nombre)) {
            switch (modificar) {
                case 1:
                    productosHashMap.remove(nombre);
                    System.out.println("Ingrese un nuevo nombre");
                    System.out.println("--------------------------------------");
                    String nombreNuevo = leer.next();
                    nombreNuevo = nombreNuevo.toLowerCase();
                    System.out.println("Ingrese el precio");
                    System.out.println("--------------------------------------");
                    precio = leer.nextInt();
                    productosHashMap.put(nombreNuevo, precio);
                    break;
                case 2:
                    System.out.println("Ingrese el precio nuevo de " + nombre);
                    System.out.println("--------------------------------------");
                    precio = leer.nextInt();
                    productosHashMap.put(nombre, precio);
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    modificar();
                    break;
            }
            menu();
        } else {
            System.out.println("No se encontró ningún producto con el nombre " + nombre);
            modificar();
        }

    }

    public void eliminar() {
        boolean eliminado = false;
        System.out.println("--------------------------------------");
        System.out.println("------------  Eliminar producto  -----------");
        System.out.println("Ingrese el nombre");
        System.out.println("--------------------------------------");
        String nombre = leer.next();
         nombre = nombre.toLowerCase();
         if (productosHashMap.containsKey(nombre.toLowerCase())) {
        productosHashMap.remove(nombre);
        eliminado = true;
         System.out.println("--------------------------------------");
            System.out.println(nombre + " se elimino correctamente.");
         }
        if (!eliminado) {
            System.out.println("--------------------------------------");
            System.out.println(nombre + " no estaba en la lista.");
        }
        menu();
    }

    public void mostrar() {
        System.out.println("--------------------------------------");
        System.out.println("-----  Lista de productos cargados  -----");
        for (Map.Entry<String, Integer> entry : productosHashMap.entrySet()) {
            System.out.println(" -- " + entry.getKey()
                    + " -- $" + entry.getValue() + " -- ");
        }
        menu();
    }

}
