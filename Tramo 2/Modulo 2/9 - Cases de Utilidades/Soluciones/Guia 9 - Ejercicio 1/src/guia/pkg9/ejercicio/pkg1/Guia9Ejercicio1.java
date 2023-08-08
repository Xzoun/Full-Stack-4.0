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
package guia.pkg9.ejercicio.pkg1;

import Servicio.cadenaServicio;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia9Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // Scanner leer1 = new Scanner(System.in);

        cadenaServicio textoServicio = new cadenaServicio();
//      textoServicio.mostrarVocales();      
//      textoServicio.invertirFrase();
//      System.out.println("Ingrese una letra");
//      String letra = leer.next(); 
//      textoServicio.vecesRepetido(letra);
//      System.out.println("Ingrese una frase");
//      String frase2 = leer.next();
//      textoServicio.compararLongitud(frase2);   
//      System.out.println("Ingrese una frase para unir:");
//      String unirFrase = leer.nextLine();
//      textoServicio.unirFrases(unirFrase);
//        System.out.println("Ingrese un caracter");
//        String letraA = leer.next();
//        textoServicio.reemplazar(letraA);
        System.out.println("Ingrese un caracter");
        String letraestaba = leer.next();
        if ( textoServicio.contiene(letraestaba)){
            System.out.println("La letra "+ letraestaba+" estaba en la frase");
        }else{
            System.out.println("La letra "+ letraestaba+" no estaba en la frase");
        }
    }

}
