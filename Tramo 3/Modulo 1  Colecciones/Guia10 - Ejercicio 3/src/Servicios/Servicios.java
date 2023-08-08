/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Entidad.alumno;
import java.util.Scanner;
import java.util.ArrayList;

public class Servicios {

    Scanner leer = new Scanner(System.in);
    ArrayList<alumno> notasListAlumno = new ArrayList();

    public void cargarAlumno() {
        String continuar;
    
        
        do {
            alumno cargar = new alumno();
            ArrayList<Integer> notasList = new ArrayList(); 
            System.out.println("Ingrese el nombre del alumno");
            String NombreAlumno = leer.next();
            System.out.println("Bien, ahora ingrese las tres notas del alumno");
            notasList.add(leer.nextInt());
            notasList.add(leer.nextInt());
            notasList.add(leer.nextInt());
            cargar.setNombre(NombreAlumno);
            cargar.setNotasList(notasList);
            notasListAlumno.add(cargar);
            System.out.println("Para ingresar otro alumno presione s");
            continuar = leer.next();

        } while (continuar.equalsIgnoreCase("s"));
    }
    
    public void notaFinal(){
        System.out.println("Calcular nota final.");
        System.out.println("Ingrese el nombre del alumno.");
        String nombreABuscar = leer.next();
        boolean encontrado = false;
        double promedio;
     for (alumno alumnoActual : notasListAlumno) {
        if (alumnoActual.getNombre().equalsIgnoreCase(nombreABuscar)) {
            ArrayList<Integer> notas = alumnoActual.getNotasList();
            int notaFinal = 0;
            encontrado = true;
            for (int nota : notas) {
                notaFinal += nota;
            }
            promedio = (double) notaFinal / 3;
            System.out.println("La nota final del alumno es: " + promedio);
            break;
        }       
        }
      if(encontrado!=true){
            System.out.println("No se encontró el nombre.");
    }
    }
}

//    public void mostar(){
//        Iterator <Integer> it = clase.getNotasList().Iterator();
//    while (it.hasNext()) {
//        System.out.println(clase.getNombre());
//                System.out.println(clase.getNotasList());
//            }
//        }

