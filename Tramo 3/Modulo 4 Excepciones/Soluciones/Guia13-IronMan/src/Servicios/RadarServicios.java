package Servicios;

import Entidad.Armadura;
import Entidad.Funcionalidades.Objeto;
import Entidad.Funcionalidades.Radar;
import java.util.ArrayList;
import java.util.Iterator;

public class RadarServicios {

    ObjetoServicios objServ = new ObjetoServicios();

    public Radar crearRadar() {
        Radar radar = new Radar();
        radar.setLimite(10);
        Integer inicio = Math.max((int) (Math.random() * radar.getLimite()), 1);
        for (int i = 0; i < inicio; i++) {
            radar.agregarObjeto(objServ.crearObjeto());
        }

        return radar;
    }

    public Armadura actualizacion(Armadura armadura, Integer desplazamiento) {
        armadura = mover(armadura, desplazamiento);

        Iterator<Objeto> iterator = armadura.getRadar().getRadarCompleto().iterator();
        while (iterator.hasNext()) {
            Objeto objeto = iterator.next();
            if (objServ.medirDistancia(objeto) > 10000) {
                iterator.remove();
            }
            if (objeto.getTipo().equalsIgnoreCase("formacion metereologica")) {
                iterator.remove();
            }
        }

        Integer diferencia = (armadura.getRadar().getLimite() - armadura.getRadar().getRadarCompleto().size());
        Integer actualizar = (int) (Math.min((int) (Math.random() * 3), diferencia));

        for (int i = 0; i < actualizar; i++) {
            armadura.getRadar().agregarObjeto(objServ.crearObjeto());
        }

        return armadura;
    }

    public Boolean enemigoHostilEnRango(Radar radar) {
        for (Objeto objeto : radar.getRadarCompleto()) {
            if (objeto.getHostil() && objServ.medirDistancia(objeto) < 5000) {
                return true;
            }
        }
        return false;
    }

    public Armadura mover(Armadura armadura, Integer desplazamiento) {
        Integer[] coordenadas;
        Integer eje = (int) (Math.random() * 3);

        for (Objeto objeto : armadura.getRadar().getRadarCompleto()) {

            coordenadas = objeto.getCoordenadas();
            coordenadas[eje] += desplazamiento;
        }

        return armadura;
    }

}
