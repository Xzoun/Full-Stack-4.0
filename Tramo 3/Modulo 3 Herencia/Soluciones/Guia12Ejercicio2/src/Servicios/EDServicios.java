/*
Los métodos a implementar son:
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
correcta, sino es correcta usara la letra F por defecto. Este método se
debe invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto,
y si no lo es, usa el color blanco por defecto. Los colores disponibles
para los electrodomésticos son blanco, negro, rojo, azul y gris. No
importa si el nombre está en mayúsculas o en minúsculas. Este método se
invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y
llena el electrodoméstico, también llama los métodos para comprobar el
color y el consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
LETRA    PRECIO                PESO                 PRECIO
A        $1000                 Entre1 y 19 kg       $100
B        $800                  Entre 20 y 49 kg     $500
C        $600                  Entre 50 y 79 kg     $800
D        $500                  Mayor que 80 kg      $1000
E        $300
F        $100

 */
package Servicios;

import Entidad.ED;
import Enums.Colores;
import Enums.Consumo;
import static Enums.Consumo.A;
import java.util.Scanner;

public class EDServicios {

    Consumo[] tiposConsumo = Consumo.values();
    Colores[] colores = Colores.values();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ED crearElectrodomestico() {
        ED nuevoProducto = new ED();

        nuevoProducto.setPrecio(1000.00);
        System.out.println("El precio base es de $" + nuevoProducto.getPrecio());
        System.out.println("----------------------------------------");
        System.out.println("Para continuar con la carga ingrese el peso (kg)");
        nuevoProducto.setPeso(leer.nextDouble());
        System.out.println("----------------------------------------");
        System.out.println("Bien, ahora ingrese el consumo");
        nuevoProducto.setConsumo(comprobarConsumo(leer.next()));
        System.out.println("----------------------------------------");
        System.out.println("Por último ingrese el color");
        nuevoProducto.setColor(comprobarColor(leer.next()));
        System.out.println("----------------------------------------");
        
        return nuevoProducto;
    }

    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
LETRA    PRECIO                PESO                 PRECIO
A        $1000                 Entre1 y 19 kg       $100
B        $800                  Entre 20 y 49 kg     $500
C        $600                  Entre 50 y 79 kg     $800
D        $500                  Mayor que 80 kg      $1000
E        $300
F        $100

     */
    public ED precioFinal(ED elecDomes) {
        switch (elecDomes.getConsumo()) {
            case A:
                elecDomes.setPrecio(elecDomes.getPrecio() + 1000);
                break;
            case B:
                elecDomes.setPrecio(elecDomes.getPrecio() + 800);
                break;
            case C:
                elecDomes.setPrecio(elecDomes.getPrecio() + 600);
                break;
            case D:
                elecDomes.setPrecio(elecDomes.getPrecio() + 500);
                break;
            case E:
                elecDomes.setPrecio(elecDomes.getPrecio() + 300);
                break;
            case F:
                elecDomes.setPrecio(elecDomes.getPrecio() + 100);
                break;
        }
        
        if (elecDomes.getPeso()>1 && elecDomes.getPeso() < 20) {
            elecDomes.setPrecio(elecDomes.getPrecio() + 100);
        } else if (elecDomes.getPeso() > 19 && elecDomes.getPeso() < 50) {
            elecDomes.setPrecio(elecDomes.getPrecio() + 500);
        }else if(elecDomes.getPeso() > 49 && elecDomes.getPeso() < 80){
            elecDomes.setPrecio(elecDomes.getPrecio() + 800);
        }else if(elecDomes.getPeso() > 79){
            elecDomes.setPrecio(elecDomes.getPrecio() + 1000);
        }
        
        return elecDomes;
    }

    public Consumo comprobarConsumo(String a) {
        Consumo ingresado = null;
        String A = a.toUpperCase();

        for (Consumo b : tiposConsumo) {
            if (b.name().equals(A)) {
                ingresado = b;
                break;
            }
        }

        if (ingresado != null) {
            return ingresado;
        } else {
            System.out.println("Tipo de consumo no válido, usaremos 'F'");
            return Consumo.F;
        }
    }

    public Colores comprobarColor(String a) {
        Colores ingresado = null;
        String A = a.toUpperCase();

        for (Colores b : colores) {
            if (b.name().equals(A)) {
                ingresado = b;
                break;
            }
        }

        if (ingresado != null) {
            return ingresado;
        } else {
            System.out.println("Ups, no tenemos ese color, pero tenemos blanco!");
            return Colores.BLANCO;
        }
    }
}
