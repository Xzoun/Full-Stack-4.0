/*
 Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, 
getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números. Crear 
una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz 
se debe obtener el valor absoluto del número.
 */
package Servicio;

import Entidades.PardeNumeros;

public class PardeNumerosService {

    PardeNumeros num = new PardeNumeros();

    public void mostrarValores() {
        System.out.println("Los dos números guardados son: " + num.getNum1() + " y " + num.getNum2());
    }

    public double devolverMayor() {
        if (num.getNum1() > num.getNum2()) {
            return num.getNum1();
        } else if (num.getNum1() < num.getNum2()) {
            return num.getNum2();
        } else {
            return 0;
        }
    }

    public void calcularPotencia() {
        double rN1 = Math.round(num.getNum1());
        double rN2 = Math.round(num.getNum2());
        if (rN1 > rN2) {
            System.out.println("El mayor elevado al menor es " + Math.pow(rN1, rN2));
        } else {
            System.out.println("El mayor elevado al menor es " + Math.pow(rN2, rN1));

        }
    }

    public void calcularRaiz() {
        double raN1 = Math.round(Math.abs(num.getNum1()));
        double raN2 = Math.round(Math.abs(num.getNum2()));
        if (raN1 > raN2) {
            System.out.println("La raiz cuadrada del menor es " + Math.sqrt(raN2));
        } else {
            System.out.println("La raiz cuadrada del menor es " + Math.sqrt(raN1));
        }
    }
    }
