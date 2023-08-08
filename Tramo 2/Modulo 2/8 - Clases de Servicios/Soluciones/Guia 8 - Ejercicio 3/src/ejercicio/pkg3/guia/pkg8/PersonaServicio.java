/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre,
edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo,
puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se
le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido
sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta
fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la 
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la 
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor
mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada 
objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal
e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso 
ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos 
menores. Para esto, podemos crear unos métodos adicionales.
 */
package ejercicio.pkg3.guia.pkg8;

import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    Persona nuevoRegistro = new Persona();

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre");
        nuevoRegistro.setNombre(leer.next());

        System.out.println("Ingrese el sexo");
        String nuevoSexo = leer.next();

        while (!"f".equalsIgnoreCase(nuevoSexo) && !"m".equalsIgnoreCase(nuevoSexo)
                && !"o".equalsIgnoreCase(nuevoSexo)) {
            System.out.println("Ingreso un valor erroneo. Intentelo otra vez por favor");
            nuevoSexo = leer.next();
        }
        nuevoRegistro.setSexo(nuevoSexo);
        System.out.println("Ingrese la edad");
        nuevoRegistro.setEdad(leer.nextInt());
        System.out.println("Ingrese el peso (kg)");
        nuevoRegistro.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura (mts)");
        nuevoRegistro.setAltura(leer.nextDouble());
        return nuevoRegistro;
    }

    public boolean esMayorDeEdad(Persona nuevoRegistro) {
        return nuevoRegistro.getEdad() >= 18;
    }

    public int calcularIMC() {
        double nuevoPeso = nuevoRegistro.getPeso();
        double nuevaAltura = nuevoRegistro.getAltura();
        double IMC = nuevoPeso / (Math.pow(nuevaAltura, 2));
        
        if (IMC > 25) {
            return 1;
        }else if (IMC < 25 && IMC > 20) {
            return 0;
        } else {
            return -1;
        }
    }

    public double PorcentajeMayoresdeEdad(boolean verificacionEdad[]) {
        int mayoresdeEdad = 0;

        for (int i = 0; i < 2; i++) {

            if (verificacionEdad[i] == true) {
                mayoresdeEdad++;
            } else {
                int menoresdeEdad = 2 - mayoresdeEdad;
            }
        }
        return (mayoresdeEdad*100) / 2;
    }

    public void PorcentajeIMC(int registroresultados[]) {
        int pesobajo = 0;
        int pesoideal = 0;
        int sobrepeso = 0;

        for (int i = 0; i < 2; i++) {

            switch (registroresultados[i]) {
                case 1:
                    sobrepeso++;
                    break;
                case 0:
                    pesoideal++;
                    break;
                case -1:
                    pesobajo++;
            }
            }
            System.out.println("El " + (sobrepeso*100)/2 + "% tiene sobre peso.");
            System.out.println("El " + (pesoideal*100)/2 + "% esta en su peso ideal.");
            System.out.println("El " + (pesobajo*100)/2 + "% tiene peso bajo.");
        
    }
}
