package Servicios;

import Entidad.Armadura;
import Entidad.Funcionalidades.Objeto;

public class ObjetoServicios {

    public Objeto crearObjeto() {
        Objeto nuevoObjeto = new Objeto();
        String[] tipo = {"Extraterrestre", "Aeronave", "Barco", "Vehiculo Motorizado",
            "Formación metereológica"};

        Boolean[] bool = {true, false, true, true, true, false, true};

        Integer x = (int) (Math.random() * 5500);
        if (Math.random() >= 0.5) {
            x = x * -1;
        }

        Integer y = (int) (Math.random() * 5500);
        if (Math.random() >= 0.5) {
            y = y * -1;
        }

        Integer z = (int) (Math.random() * 5500);
        if (Math.random() >= 0.5) {
            z = z * -1;
        }

        Integer[] coordenadas = {x, y, z};

        nuevoObjeto.setCoordenadas(coordenadas);
        nuevoObjeto.setHostil(bool[(int) (Math.random() * 7)]);
        nuevoObjeto.setMovil(bool[(int) (Math.random() * 7)]);
        nuevoObjeto.setDestruido(false);
        nuevoObjeto.setResistencia((Math.max(1, (int) (Math.random() * 5))));
        nuevoObjeto.setTipo(tipo[(int) (Math.random() * 5)]);

        return nuevoObjeto;
    }

    public double medirDistancia(Objeto objeto) {
        Integer armaduraX = 0;
        Integer armaduraY = 0;
        Integer armaduraZ = 0;

        Integer[] coordenadas = objeto.getCoordenadas();
        Integer objetoX = coordenadas[0];
        Integer objetoY = coordenadas[1];
        Integer objetoZ = coordenadas[2];

        double distancia = Math.hypot(Math.hypot(objetoX - armaduraX, objetoY - armaduraY), objetoZ - armaduraZ);

        return distancia;
    }

    public Armadura objetivoDanhado(Armadura armadura) {
        Double distancia = 5000.0;
        Objeto objetivoDanhado = null;
        
        for (Objeto objeto : armadura.getRadar().getRadarCompleto()) {           
            if (objeto.getHostil() && medirDistancia(objeto) < distancia) {         
                objeto.setResistencia(objeto.getResistencia() - 1);
                objetivoDanhado = objeto;
                break;
            }
        }

        if (objetivoDanhado != null && objetivoDanhado.getResistencia() <= 0) {
            armadura.getRadar().getRadarCompleto().remove(objetivoDanhado);
        }

        return armadura;
    }
}
