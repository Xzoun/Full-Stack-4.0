package Servicios;

import Entidad.ED;
import Enums.Colores;
import Enums.Consumo;

public class EDMuestra extends EDServicios {

    @Override
    public ED crearElectrodomestico() {
        ED nuevoProducto = new ED();
        Colores coloresA[] = Colores.values();
        Consumo consumo[] = Consumo.values();
        nuevoProducto.setPrecio(1000.00);

        nuevoProducto.setPeso(Math.max(25, Math.random() * 100));
        nuevoProducto.setConsumo(consumo[(int) (Math.random() * 6)]);
        nuevoProducto.setColor(coloresA[(int) (Math.random() * 5)]);

        return nuevoProducto;
    }

    @Override
    public ED precioFinal(ED elecDomes) {
        elecDomes = super.precioFinal(elecDomes);
        return elecDomes;
    }

}
