package Servicios;

import Entidad.Armadura;
import Entidad.Bota;

public class BotaServicios extends ArmaduraServicios {

    @Override
    public double consumo(Integer consumo, Integer tiempo) {
        Double consumoX = super.consumo(consumo, tiempo);
        return consumoX;
    }

    public boolean ConsultarDanho(Armadura armadura) {

        return (armadura.getBotaDer().getPropulsorDanhado()
                && armadura.getBotaIzq().getPropulsorDanhado());
    }

    public Bota crearBota() {
        Bota botaX = new Bota(false, false);
        return botaX;
    }

}
