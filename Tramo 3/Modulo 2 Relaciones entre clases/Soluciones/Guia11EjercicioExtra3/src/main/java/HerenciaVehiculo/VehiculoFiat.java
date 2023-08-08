
package HerenciaVehiculo;

import Entidad.Vehiculo;
import Enum.Colores;
import Enum.Marca;


public class VehiculoFiat extends Vehiculo{
       private String modelo;

    public VehiculoFiat() {
    } 

    public VehiculoFiat(Marca marca, Colores color, String modelo, String tipo, String motor, String chasis, Integer año) {
        super(marca, color, modelo, tipo, motor, chasis, año);
    } 

}
