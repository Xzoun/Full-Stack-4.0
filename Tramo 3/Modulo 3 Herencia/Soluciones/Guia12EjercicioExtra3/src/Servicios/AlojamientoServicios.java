
package Servicios;

import Entidad.Alojamientos;

public class AlojamientoServicios {
    
    public Alojamientos nuevoAlojamiento(){
        Alojamientos nuevoAlojamiento = new Alojamientos();
     
        String [] direccion = {"direccion 1", "direccion 2", "direccion 3", "direccion 4", "direccion 5"};
        String [] nombreEncargado = {"Raul", "Pedro", "Juan", "Marcela", "Maria"};
        String []apellidoEncargado = {"Benitez", "Cerles", "Ifran", "Mazzocchi", "Ebrard"};
        String [] localidad = {"CABA", "Espeleta","Ezeiza","Rosario","Bahia Blanca"};
        Integer posicion = (int) Math.max(1,Math.random()*5);
        
        nuevoAlojamiento.setDireccion(direccion[posicion]);
        nuevoAlojamiento.setGerente(nombreEncargado[posicion]+" "+apellidoEncargado[(int) Math.max(1,Math.random()*5)]);
        nuevoAlojamiento.setLocalidad(localidad[posicion]);
        
        return nuevoAlojamiento;
    }
}
