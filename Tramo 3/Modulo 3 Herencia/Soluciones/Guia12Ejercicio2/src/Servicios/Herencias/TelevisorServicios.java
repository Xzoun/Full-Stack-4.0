/*
Los métodos que se implementara serán:
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase ED
también deben afectar al precio.

 */
package Servicios.Herencias;

import Entidad.ED;
import Entidad.Herencias.Televisor;
import Servicios.EDServicios;
import java.util.Scanner;

public class TelevisorServicios extends EDServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ED crearTelevisor() {
        Televisor nuevoTV = new Televisor();

        ED electrodomestico = super.crearElectrodomestico();
        nuevoTV.setPeso(electrodomestico.getPeso());
        nuevoTV.setColor(electrodomestico.getColor());
        nuevoTV.setConsumo(electrodomestico.getConsumo());
        nuevoTV.setPrecio(electrodomestico.getPrecio());

        System.out.println("Ingrese la resolucion en pulgadas");
        nuevoTV.setResolucion(leer.nextDouble());
        System.out.println("Bien, ahora ingrese 'S' si tiene TDT");
        switch (leer.next().toUpperCase()) {
            case "S":
                nuevoTV.setTDT(Boolean.TRUE);
                break;
            default:
                nuevoTV.setTDT(Boolean.FALSE);
                break;
        }
        nuevoTV = (Televisor) precioFinal(nuevoTV);
        System.out.println("Producto cargado correctamente");
        System.out.println(nuevoTV.toString());
        System.out.println("----------------------------------------");

        return nuevoTV;
    }

    @Override
    public ED precioFinal(ED elecDomes) {
        Televisor nuevoTelevisor = (Televisor) super.precioFinal(elecDomes);
        if (nuevoTelevisor.getResolucion() > 40) {
            nuevoTelevisor.setPrecio(nuevoTelevisor.getPrecio() + (nuevoTelevisor.getPrecio() * 0.3));
        }
        if (nuevoTelevisor.getTDT()) {
            nuevoTelevisor.setPrecio(nuevoTelevisor.getPrecio() + 500);
        }
        return nuevoTelevisor;
    }
}
