/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) 
y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El 
constructor con frase como atributo debe setear la longitud de la frase de manera automática. Crear una 
clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: 
"casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas 
veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con 
otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
devuelve verdadero si la contiene y falso si no.
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

public class cadenaServicio {

    Scanner leer = new Scanner(System.in);
    Cadena texto = new Cadena("Hola mundo");

    public void mostrarVocales() {
        int vocales = 0;
        String frase = texto.getFrase().toUpperCase();
        for (int i = 0; i < frase.length(); i++) {
            //System.out.println(frase.substring(i,i++));
            if (frase.substring(i, i + 1).equals("A")
                    || frase.substring(i, i + 1).equals("E")
                    || frase.substring(i, i + 1).equals("I")
                    || frase.substring(i, i + 1).equals("O")
                    || frase.substring(i, i + 1).equals("U")) {
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales es " + vocales);
    }

    public void invertirFrase() {
        String letra = "";
        System.out.println(texto.getLongitud());
        for (int i = texto.getLongitud(); i > 0; i--) {
            letra = letra.concat(texto.getFrase().substring(i - 1, i));
        }
        System.out.println(letra);
    }

    public void vecesRepetido(String letra) {

        int contador = 0;
        for (int i = 0; i < texto.getLongitud(); i++) {
            if (texto.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        System.out.println("La letra aparece " + contador + " veces.");
    }

    public void compararLongitud(String frase2) {
        System.out.println(frase2);
        if (texto.getLongitud() > frase2.length()) {
            System.out.println("Es mas larga la frase " + texto.getFrase());
        } else {
            System.out.println("Es mas larga la frase " + frase2);
        }
    }

    public void unirFrases(String frase2) {
        System.out.print(texto.getFrase().concat(" " + frase2 + "\n"));
    }

    public void reemplazar(String letra) {
        String fraseA = "";
        for (int i = 0; i < texto.getLongitud(); i++) {
            if (texto.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {
                fraseA = fraseA.concat(letra);
            } else {
                fraseA = fraseA.concat(texto.getFrase().substring(i, i + 1));
            }
        }
        System.out.print(fraseA+"\n");
    }
    public boolean contiene(String letra){       
           return texto.getFrase().contains(letra);
        }
        
// Comparar longitud de la frase con otra frase
//        System.out.println("Ingrese una frase nueva:");
//        String otraFrase = sc.nextLine();
//        System.out.println(cadena.compararLongitud(miCadena, otraFrase));
//
//        // Unir frases
//        System.out.println("Ingrese una frase para unir:");
//        String unirFrase = sc.nextLine();
//        cadena.unirFrases(miCadena, unirFrase);
//
//        // Reemplazar caracteres
//        System.out.println("Ingrese una letra a reemplazar:");
//        String letraareemplazar = sc.nextLine();
//        System.out.println("Ingrese una letra de reemplazo:");
//        String reemplazo = sc.nextLine();
//        cadena.reemplazar(miCadena, letraareemplazar, reemplazo);
//
//        // Comprobar si contiene una letra
//        System.out.println("Ingrese una letra a comparar:");
//        String letraacomparar = sc.nextLine();
//        cadena.contiene(miCadena, letraacomparar);
}
