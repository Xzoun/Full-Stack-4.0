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
package guia.pkg9.ejercicio.pkg2;

import Servicio.PardeNumerosService;

public class Guia9Ejercicio2 {

    public static void main(String[] args) {
         PardeNumerosService cs = new PardeNumerosService();
         cs.mostrarValores();
         if(cs.devolverMayor()==0){
             System.out.println("Los dos valores son iguales");
         }else{
             System.out.println("El número más grande es "+cs.devolverMayor());
         }
         cs.calcularPotencia();
         cs.calcularRaiz();
         
    }
    
}
