/*
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por 
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
 */
package Servicios.Herencia.Hoteles;

import Entidad.Herencia.Hotel;
import Entidad.Herencia.Hoteles.CuatroEstrellas;
import Enum.Gimnasio;
import Servicios.Herencia.HotelServicios;
import static Enum.Gimnasio.*;

public class CuatroEstrellasServicios extends HotelServicios {

    CuatroEstrellas cuatroestrellas = new CuatroEstrellas();

    @Override
    public CuatroEstrellas nuevoAlojamiento() {

        Hotel nuevoHotel = super.nuevoAlojamiento();
        CuatroEstrellas nuevoCuatroEstrellas = new CuatroEstrellas();

        Integer posicion = (int) (Math.random() * 5);

        String[] nombre = {"Hotel Excelsior", "Hotel Plaza", "Hotel Renaissance",
            "Hotel Royal ", "Hotel Hilton"};

        String[] direccion = {"123 Main Street", "456 Park Avenue", "789 Grand Boulevard",
            "321 Ocean Drive", "987 High Street"};

        String[] localidad = {"Cityville", "Townsville", "Villageland",
            "Beachtown", "Mountainview"};
        
        String[] restaurant = {"Restaurant 1", "Restaurant 2", "Restaurant 3",
            "Restaurant 4", "Restaurant 5"};

        nuevoCuatroEstrellas.setNombre(nombre[posicion]);
        nuevoCuatroEstrellas.setDireccion(direccion[posicion]);
        nuevoCuatroEstrellas.setGerente(nuevoHotel.getGerente());
        nuevoCuatroEstrellas.setLocalidad(localidad[posicion]);
        nuevoCuatroEstrellas.setPrecio(nuevoHotel.getPrecio());
        nuevoCuatroEstrellas.setPisos(nuevoHotel.getPisos());
        nuevoCuatroEstrellas.setCantidadDeHabitaciones(nuevoHotel.getCantidadDeHabitaciones());
        nuevoCuatroEstrellas.setNumeroDeCamas(nuevoHotel.getNumeroDeCamas());
        nuevoCuatroEstrellas.setCategoria("**** Cuatro Estrellas ****");
        if (Math.random() < 0.5) {
            nuevoCuatroEstrellas.setGimnasio(Gimnasio.A);
        } else {
            nuevoCuatroEstrellas.setGimnasio(Gimnasio.B);
        }
        nuevoCuatroEstrellas.setCapacidadRestaurant(Math.max(10, (int) (Math.random() * 70)));
        nuevoCuatroEstrellas.setNombreRestaurant(restaurant[posicion]);
 
        nuevoCuatroEstrellas.setPrecio(precioHabitacion(nuevoCuatroEstrellas));

        return nuevoCuatroEstrellas;
    }

    public int precioHabitacion(CuatroEstrellas habitacionA) {

        Integer precio = habitacionA.getPrecio() + habitacionA.getNumeroDeCamas();

        if (habitacionA.getCapacidadRestaurant() < 30) {
            precio += 10;
        } else if (habitacionA.getCapacidadRestaurant() > 29
                && habitacionA.getCapacidadRestaurant() < 50) {
            precio += 30;
        } else {
            precio += 50;
        }

        if (habitacionA.getGimnasio().equals(A)) {
            precio += 50;
        } else {
            precio += 30;
        }
        return precio;
    }
}
