package Servicios.Herencia.ExtraHoteleros;

import Entidad.Herencia.ExtraHoteleros;
import Entidad.Herencia.ExtraHotelerosH.Camping;
import Servicios.Herencia.ExtraHotelerosServicios;

public class CampingServicios extends ExtraHotelerosServicios {

    @Override
    public Camping nuevoAlojamiento() {
        String[] nombre = {"Shareton Camping", "Camping 1", "Camping 2", "Camping 3", "Camping 4"};
        ExtraHoteleros nuevoAlojamiento = super.nuevoAlojamiento();

        Camping nuevoCamping = new Camping();

        nuevoCamping.setNombre(nombre[(int) Math.max(1, Math.random() * 5)]);
        nuevoCamping.setDireccion(nuevoAlojamiento.getDireccion());
        nuevoCamping.setGerente(nuevoAlojamiento.getGerente());
        nuevoCamping.setLocalidad(nuevoAlojamiento.getLocalidad());
        nuevoCamping.setPrivado(nuevoAlojamiento.getPrivado());
        nuevoCamping.setM2(nuevoAlojamiento.getM2());
        nuevoCamping.setBanhos(Math.max(1, (int) (Math.random() * 4)));
        nuevoCamping.setCapacidad((int) (nuevoCamping.getM2() / 2));

        if (Math.random() > 0.5) {
            nuevoCamping.setRestaurant(true);
        } else {
            nuevoCamping.setRestaurant(false);
        }

        return nuevoCamping;
    }
}
