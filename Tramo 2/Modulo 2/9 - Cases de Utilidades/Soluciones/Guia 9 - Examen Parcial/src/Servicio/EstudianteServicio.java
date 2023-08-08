/*
Ejercicio integrador
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. 
La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos y saber 
qué alumnos han recibido una nota por encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos van a ser nombre y 
nota (representando la nota obtenida en el final). 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus
respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante,
usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombres de los alumnos que recibieron una nota mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

 */
package Servicio;

import Estudiantes.Estudiante;

public class EstudianteServicio {

    public void crearCurso() {
        Estudiante alumno[] = new Estudiante[8];
        for (int i = 0; i < alumno.length; i++) {
            alumno[i] = new Estudiante();
        }
        asignarValores(alumno);
    }

    public void asignarValores(Estudiante[] alumno) {
        alumno[0].setNombre("Maria");
        alumno[1].setNombre("Manuel");
        alumno[2].setNombre("Jose");
        alumno[3].setNombre("Joaquin");
        alumno[4].setNombre("Fernando");
        alumno[5].setNombre("Paula");
        alumno[6].setNombre("Claudia");
        alumno[7].setNombre("Veronica");
        alumno[0].setNota(5);
        alumno[1].setNota(8);
        alumno[2].setNota(6);
        alumno[3].setNota(9);
        alumno[4].setNota(4);
        alumno[5].setNota(10);
        alumno[6].setNota(7);
        alumno[7].setNota(8);
        mejoresPromedios(alumno);
    }

    public double promedio(Estudiante[] alumno) {
        double sumatoria = 0;
        for (int i = 0; i < alumno.length; i++) {
            sumatoria += alumno[i].getNota();
        }
        double promedio = sumatoria / alumno.length;
        System.out.println("El promedio de notas del curso es " + promedio);
        return promedio;
    }

    public void mejoresPromedios(Estudiante[] alumno) {
        double promedio = promedio(alumno);
        System.out.println("Mejores finales:");
        System.out.println(" ");      
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i].getNota() > promedio) {
                System.out.println("Alumno: " + alumno[i].getNombre() + ". Nota del exámen Final: " + alumno[i].getNota()+ ".");
                System.out.println(" ");
            }
        }

    }
}
