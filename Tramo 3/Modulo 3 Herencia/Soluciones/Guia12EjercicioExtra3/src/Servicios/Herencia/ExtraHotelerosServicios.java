
package Servicios.Herencia;

import Entidad.Alojamientos;
import Entidad.Herencia.ExtraHoteleros;
import Servicios.AlojamientoServicios;

public class ExtraHotelerosServicios extends AlojamientoServicios {
    
     @Override
    public ExtraHoteleros nuevoAlojamiento() {
        Alojamientos nuevoAlojamiento = super.nuevoAlojamiento();

        ExtraHoteleros nuevoExtraHotelero = new ExtraHoteleros();
        nuevoExtraHotelero.setDireccion(nuevoAlojamiento.getDireccion());
        nuevoExtraHotelero.setGerente(nuevoAlojamiento.getGerente());
        nuevoExtraHotelero.setLocalidad(nuevoAlojamiento.getLocalidad());
        
        if (Math.random() > 0.5) {
            nuevoExtraHotelero.setPrivado(true);
        } else {
            nuevoExtraHotelero.setPrivado(false);
        }
        
        nuevoExtraHotelero.setM2((int)Math.max(200,(int)( Math.random()*10000)));
        
        return nuevoExtraHotelero;
    }
}
