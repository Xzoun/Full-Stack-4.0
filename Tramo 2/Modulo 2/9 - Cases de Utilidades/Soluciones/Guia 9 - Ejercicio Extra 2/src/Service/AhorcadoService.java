/*
Definir los siguientes métodos en AhorcadoService:

Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario,
pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector,
letra por letra, quedando cada letra de la palabra en un índice del vector.
Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.

Método longitud(): muestra la longitud de la palabra que se debe encontrar.
Nota: buscar como se usa el vector.length.

Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte
de la palabra o no. También informará si la letra estaba o no.

Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido
encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra 
no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.

Método intentos(): para mostrar cuántas oportunidades le queda al jugador.

Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará 
cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades

 */
package Service;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {

    Ahorcado juego = new Ahorcado();
    Scanner leer = new Scanner(System.in);

    public void crearJuego() {
        System.out.println("Ingrese la dificulad, definiendo el límite de errores permitidos.");
        juego.setErrores(leer.nextInt());
        System.out.println("Bien, ahora ingrese la palabra ganadora.");
        String ganadora = leer.next();
        Ahorcado ahorcado = new Ahorcado(ganadora.length());
        juego.setPalabraWin(ahorcado.getPalabraWin());

        String[] letras = new String[ganadora.length()];
        for (int i = 0; i < ganadora.length(); i++) {
            letras[i] = Character.toString(ganadora.charAt(i));
        }
        juego.setPalabraWin(letras);
    }

    public void longitud() {
        System.out.println("La longitud de la palabra a encontar es de : " + juego.getPalabraWin().length + " caracteres.");
    }

    public void buscar(String letra, String[] animacion) {
        int cont = 0;
        boolean encontrada = false;

        for (int i = 0; i < juego.getPalabraWin().length; i++) {

            if (letra.equalsIgnoreCase(juego.getPalabraWin()[i])) {
                encontrada = true;
                cont++;
                animacion[i] = juego.getPalabraWin()[i];                
            }           
            System.out.print(" " + animacion[i]);            
        }
        System.out.println(" ");

        if (encontrada) {
            juego.setLetrasEncontradas(juego.getLetrasEncontradas() + cont);
        } else {
            System.out.println("La letra '" + letra + "' no está en la palabra.");
        }
    }

    public void encontradas(String letra) {
        int faltantes = juego.getPalabraWin().length - juego.getLetrasEncontradas();
        System.out.println("Se encontraron " + juego.getLetrasEncontradas() + " letras, faltan " + faltantes + ".");

        boolean encontrada = false;

        for (String palabraWin : juego.getPalabraWin()) {
            if (letra.equalsIgnoreCase(palabraWin)) {
                encontrada = true;
            }
        }
        if (encontrada) {
        } else {
            juego.setErrores(juego.getErrores() - 1);
            System.out.println("Quedan " + juego.getErrores() + "intentos.");
        }
    }

    public void Juego() {
    
        crearJuego();
        String[] animacion = new String[juego.getPalabraWin().length];
        for (int i = 0; i < juego.getPalabraWin().length; i++) {
            animacion[i] = "__";
        }            
        System.out.println("Perfecto, iniciando juego!");
        do {
             System.out.println(" ");
            System.out.println("Okay! Ingrese una letra");
            String letra = leer.next();
              for (int i = 0; i < juego.getPalabraWin().length; i++) {
            if (letra.equalsIgnoreCase(animacion[i])){
                System.out.println("Intenta con una letra diferente");
                letra = leer.next();
            }}           
            buscar(letra,animacion);
            encontradas(letra);
        } while (juego.getErrores() != 0 && juego.getPalabraWin().length > juego.getLetrasEncontradas());
        if(juego.getErrores() != 0){
            System.out.println("Felicidades pa. Ganaste!");
        }else{
            System.out.println("Buen intento!");
        }
    }
}
