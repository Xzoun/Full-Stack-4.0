/*
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de 
personas por oficina y número de pisos. Esta clase implementará los dos métodos
abstractos y los atributos del padre.

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el
edificio, el usuario dirá cuántas personas entran en cada oficina, cuantas oficinas
y el número de piso (suponiendo que en cada piso hay una oficina). Crear el método
cantPersonas(), que muestre cuantas personas entrarían en un piso y cuantas en todo
el edificio.
 */
package Servicios.Herencia.Edificio;

import Entidad.Edificio;
import Entidad.Herencia.EdificioDeOficinas;
import Entidad.Oficina;
import Servicios.EdificioServicios;
import java.util.ArrayList;
import java.util.Scanner;

public class EdificioDeOficinasServicios extends EdificioServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdificioDeOficinas cantPersonas() {
        ArrayList<Oficina> oficina = new ArrayList();
        EdificioDeOficinas nuevoEdOf = new EdificioDeOficinas();
        Oficina nuevaOffice = new Oficina();
        System.out.println("Ingrese el numero de personas que caben en cada oficina");
        nuevaOffice.setCapacidad(leer.nextInt());

        System.out.println("Cuantos pisos hay en el edificio?");
        Integer pisos = leer.nextInt();
        nuevoEdOf.setPisos(pisos);

        System.out.println("Cuantas oficinas hay en un piso?");
        Integer oficinas = leer.nextInt();
        nuevoEdOf.setNumeroDeOficinas(pisos * oficinas);
        nuevoEdOf.setCapacidadMaxima(nuevoEdOf.getNumeroDeOficinas() * nuevaOffice.getCapacidad());

        nuevoEdOf.setAlto(pisos * 3.0);
        nuevoEdOf.setAncho(oficinas * 5.0);
        nuevoEdOf.setLargo(oficinas * 5.0);

        for (int i = 0; i < pisos; i++) {
            for (int j = 0; j < oficinas; j++) {
                Integer key;
                if (i == 0) {
                    key = j + 1;
                } else {
                    key = (i) * 100 + j;
                }
                nuevaOffice.setNumero(key);
                oficina.add(nuevaOffice);
            }
        }
        nuevoEdOf.setOficina(oficina);
        return nuevoEdOf;
    }

    @Override
    public Double calcularSuperficie(Edificio edificio) {
        EdificioDeOficinas nuevoEdOf = (EdificioDeOficinas) edificio;
        return edificio.getLargo() * edificio.getAncho() * nuevoEdOf.getNumeroDeOficinas();
    }

    @Override
    public Double calcularVolumen(Edificio edificio) {
        return edificio.getLargo() * edificio.getAncho() * edificio.getLargo();
    }
}
