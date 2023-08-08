package Servicios.Herencias;

import Entidad.ED;
import Entidad.Herencias.*;
import Servicios.EDMuestra;

public class HerenciaMuestra extends EDMuestra {

    public ED crearLavadora() {
        Lavadora nuevaLavadora = new Lavadora();

        ED electrodomestico = super.crearElectrodomestico();
        nuevaLavadora.setPrecio(electrodomestico.getPrecio());
        nuevaLavadora.setPeso(electrodomestico.getPeso());
        nuevaLavadora.setColor(electrodomestico.getColor());
        nuevaLavadora.setConsumo(electrodomestico.getConsumo());
        nuevaLavadora.setCarga(Math.max(30, (Math.random() * 120)));
        nuevaLavadora = (Lavadora) precioFinalLavadora(nuevaLavadora);
       
        return nuevaLavadora;
    }

    public ED crearTelevisor() {
        Televisor nuevoTV = new Televisor();

        ED electrodomestico = super.crearElectrodomestico();
        nuevoTV.setPeso(electrodomestico.getPeso());
        nuevoTV.setColor(electrodomestico.getColor());
        nuevoTV.setConsumo(electrodomestico.getConsumo());
        nuevoTV.setPrecio(electrodomestico.getPrecio());
        nuevoTV.setResolucion(Math.max(30, (Math.random() * 120)));
        if (Math.random() > 0.5) {
            nuevoTV.setTDT(Boolean.TRUE);
        } else {
            nuevoTV.setTDT(Boolean.FALSE);
        }

        nuevoTV = (Televisor) precioFinalTelevision(nuevoTV);

        return nuevoTV;
    }

    public ED precioFinalLavadora(ED elecDomes) {
        Lavadora nuevaLavadora = (Lavadora) super.precioFinal(elecDomes);
        if (nuevaLavadora.getCarga() > 30) {
            nuevaLavadora.setPrecio(nuevaLavadora.getPrecio() + 500);
        }
        return nuevaLavadora;
    }

    public ED precioFinalTelevision(ED elecDomes) {
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
