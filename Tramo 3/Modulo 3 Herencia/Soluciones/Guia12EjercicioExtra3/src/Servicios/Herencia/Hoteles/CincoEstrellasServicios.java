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
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
 */
package Servicios.Herencia.Hoteles;

import Entidad.Herencia.Hoteles.CincoEstrellas;
import Entidad.Herencia.Hoteles.CuatroEstrellas;

public class CincoEstrellasServicios extends CuatroEstrellasServicios {

    CincoEstrellas cincoestrellas = new CincoEstrellas();

    @Override
    public CincoEstrellas nuevoAlojamiento() {
        String[] nombre = {"The Ritz-Carlton", "Four Seasons Hotel", "Burj Al Arab",
            "Hotel George V", "The Peninsula"};

        String[] direccion = {"111 Luxury Avenue", "222 Elegance Street", "333 Opulence Road",
            "444 Prestige Lane", "555 Sophistication Boulevard"};

        String[] localidad = {"Cityville", "Townsville", "Villageland",
            "Beachtown", "Mountainview"};

        CuatroEstrellas nuevoHotel = super.nuevoAlojamiento();
        CincoEstrellas nuevoCincoEstrellas = new CincoEstrellas();

        Integer posicion = (int)(Math.random() * 5);

        nuevoCincoEstrellas.setNombre(nombre[posicion]);
        nuevoCincoEstrellas.setDireccion(direccion[posicion]);
        nuevoCincoEstrellas.setGerente(nuevoHotel.getGerente());
        nuevoCincoEstrellas.setLocalidad(localidad[posicion]);
        nuevoCincoEstrellas.setPrecio(nuevoHotel.getPrecio());
        nuevoCincoEstrellas.setPisos(nuevoHotel.getPisos());
        nuevoCincoEstrellas.setCantidadDeHabitaciones(nuevoHotel.getCantidadDeHabitaciones());
        nuevoCincoEstrellas.setNumeroDeCamas(nuevoHotel.getNumeroDeCamas());
        nuevoCincoEstrellas.setCategoria("***** Cinco Estrellas *****");
        nuevoCincoEstrellas.setGimnasio(nuevoHotel.getGimnasio());
        nuevoCincoEstrellas.setCapacidadRestaurant(nuevoHotel.getCapacidadRestaurant());
        nuevoCincoEstrellas.setNombreRestaurant(nuevoHotel.getNombreRestaurant());

        nuevoCincoEstrellas.setLimosinas((int) (Math.max(1, (int) (Math.random() * 10))));
        nuevoCincoEstrellas.setSalonesDeConferencia((int) (Math.max(1, (int) (Math.random() * 10))));
        nuevoCincoEstrellas.setSuites((int) (Math.max(1, (int) (Math.random() * 10))));

        nuevoCincoEstrellas.setPrecio(precioHabitacion(nuevoCincoEstrellas));

        return nuevoCincoEstrellas;

    }
    
    public int precioHabitacion(CincoEstrellas habitacionA) {
      return habitacionA.getPrecio()*15*habitacionA.getLimosinas();
    }
}
