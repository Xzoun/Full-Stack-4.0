package Servicios.Herencias;

/*
Los métodos que se implementara serán:
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después
llenamos el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las condiciones
que hemos visto en la clase Electrodoméstico también deben afectar al precio.
 */
import Entidad.ED;
import Entidad.Herencias.Lavadora;
import Servicios.EDServicios;
import java.util.Scanner;

public class LavadoraServicios extends EDServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ED crearLavadora() {
        Lavadora nuevaLavadora = new Lavadora();

        ED electrodomestico = super.crearElectrodomestico();
        nuevaLavadora.setPrecio(electrodomestico.getPrecio());
        nuevaLavadora.setPeso(electrodomestico.getPeso());
        nuevaLavadora.setColor(electrodomestico.getColor());
        nuevaLavadora.setConsumo(electrodomestico.getConsumo());

        System.out.println("Ingrese el tipo de carga (Kg)");
        nuevaLavadora.setCarga(leer.nextDouble());
        nuevaLavadora = (Lavadora) precioFinal(nuevaLavadora);
        System.out.println("Producto cargado correctamente");
        System.out.println(nuevaLavadora.toString());
        System.out.println("----------------------------------------");
        return nuevaLavadora;
    }

    @Override
    public ED precioFinal(ED elecDomes) {
        Lavadora nuevaLavadora = (Lavadora) super.precioFinal(elecDomes);
        if (nuevaLavadora.getCarga() > 30) {
            nuevaLavadora.setPrecio(nuevaLavadora.getPrecio() + 500);
        }
        return nuevaLavadora;
    }
}
