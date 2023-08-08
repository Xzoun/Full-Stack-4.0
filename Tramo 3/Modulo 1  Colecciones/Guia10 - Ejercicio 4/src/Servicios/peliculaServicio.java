/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class peliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculasList = new ArrayList();


    
    public Pelicula crearPelicula() {
        String continuar;
        Pelicula objPelicula;
        do {
            objPelicula = new Pelicula();
            System.out.println("Ingrese el titulo de la película");
            objPelicula.setTitulo(leer.next());
            System.out.println("Bien, ahora el director");
            objPelicula.setDirector(leer.next());
            System.out.println("Por último ingrese la duración en horas");
            objPelicula.setDuracion(leer.nextDouble());
            peliculasList.add(objPelicula);
            System.out.println("Presione 's' para agregar otro título.");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("s"));

        mostrar();
        mostrarPelisLargas();
        
        Collections.sort(peliculasList, Pelicula.compararNombre);
        mostrar();
        Collections.sort(peliculasList, Pelicula.compararDirector);
        mostrar();
        Collections.sort(peliculasList, Pelicula.compararDuracion);
        mostrar();
        Collections.sort(peliculasList, Pelicula.compararDuracion.reversed());
        mostrar();
        return objPelicula;
    }

    public void mostrar() {
        peliculasList.forEach((pelicula) -> {
            System.out.println(pelicula.toString());
        });
        System.out.println(" ");
    }

    public void mostrarPelisLargas() {
        System.out.println("Las películas con duración mayor a una hora son: ");
        peliculasList.forEach((pelicula) -> {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.getTitulo());
            }
        });
    }

}
