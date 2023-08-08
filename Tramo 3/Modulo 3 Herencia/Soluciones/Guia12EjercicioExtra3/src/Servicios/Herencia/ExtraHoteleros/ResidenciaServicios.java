package Servicios.Herencia.ExtraHoteleros;

import Entidad.Herencia.ExtraHoteleros;
import Entidad.Herencia.ExtraHotelerosH.Residencia;
import Servicios.Herencia.ExtraHotelerosServicios;

public class ResidenciaServicios extends ExtraHotelerosServicios {

    @Override
    public Residencia nuevoAlojamiento() {
        String[] nombre = {"Shareton", "Residencia 1", "Residencia 2", "Residencia 3", "Residencia 4"};

        ExtraHoteleros nuevoAlojamiento = super.nuevoAlojamiento();

        Residencia nuevaResidencia = new Residencia();
        nuevaResidencia.setNombre(nombre[(int) Math.max(1, Math.random() * 5)]);
        nuevaResidencia.setDireccion(nuevoAlojamiento.getDireccion());
        nuevaResidencia.setGerente(nuevoAlojamiento.getGerente());
        nuevaResidencia.setLocalidad(nuevoAlojamiento.getLocalidad());
        nuevaResidencia.setPrivado(nuevoAlojamiento.getPrivado());
        nuevaResidencia.setM2(nuevoAlojamiento.getM2());

        nuevaResidencia.setHabitaciones((int) (nuevaResidencia.getM2() / 5));

        if (Math.random() > 0.5) {
            nuevaResidencia.setDescuentos(true);
        } else {
            nuevaResidencia.setDescuentos(false);
        }
        if (Math.random() > 0.5) {
            nuevaResidencia.setDeportivo(true);
        } else {
            nuevaResidencia.setDeportivo(false);
        }

        return nuevaResidencia;
    }
}
