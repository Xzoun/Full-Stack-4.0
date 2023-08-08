
package HerenciaVehiculo;

import Entidad.Vehiculo;
import Enum.Colores;
import Enum.Marca;


public class VehiculoRenault extends Vehiculo{
       private String modelo;

    public VehiculoRenault() {
    }

    public VehiculoRenault(Marca marca, Colores color, String modelo, String tipo, String motor, String chasis, Integer año) {
        super(marca, color, modelo, tipo, motor, chasis, año);
        this.modelo = modelo;
    }

  
}

