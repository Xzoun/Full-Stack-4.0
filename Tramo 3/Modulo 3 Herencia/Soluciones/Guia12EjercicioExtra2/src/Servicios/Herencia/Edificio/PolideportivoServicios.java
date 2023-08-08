/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del
padre.
 */
package Servicios.Herencia.Edificio;

import Entidad.Edificio;
import Entidad.Herencia.Polideportivo;
import Servicios.EdificioServicios;

public class PolideportivoServicios extends EdificioServicios {

    public Polideportivo crearPolideportivo(Integer b) {
        Polideportivo a = new Polideportivo();
        a.setAlto(Math.max(Math.random() * 5, 2.0));
        a.setLargo(Math.max(Math.random() * 100, 20.0));
        a.setAncho(Math.max(Math.random() * 100, 20.0));
        if (Math.random() > 0.5) {
            a.setTechado(true);
        } else {
            a.setTechado(false);
        }
        a.setNombre("Polideportivo " + b);
        return a;
    }

    @Override
    public Double calcularSuperficie(Edificio edificio) {
        return edificio.getAncho() * edificio.getLargo();
    }

    @Override
    public Double calcularVolumen(Edificio edificio) {
        return edificio.getAncho() * edificio.getLargo() * edificio.getAlto();
    }

}
