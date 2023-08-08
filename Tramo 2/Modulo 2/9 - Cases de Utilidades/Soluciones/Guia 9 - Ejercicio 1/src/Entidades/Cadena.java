/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (Cadena) 
y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El 
constructor con frase como atributo debe setear la longitud de la frase de manera automática. Crear una 
clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: 
"casa blanca", Salida: "acnalb asac".
Método vecesRepetido(Cadena letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas 
veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(Cadena frase), deberá comparar la longitud de la frase que compone la clase con 
otra nueva frase ingresada por el usuario.
Método unirFrases(Cadena frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(Cadena letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(Cadena letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
devuelve verdadero si la contiene y falso si no.
 */
package Entidades;

public class Cadena {
   private String frase;
   private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
   
}
