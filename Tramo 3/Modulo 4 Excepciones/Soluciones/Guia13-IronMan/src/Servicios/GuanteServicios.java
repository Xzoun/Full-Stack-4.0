package Servicios;

import Entidad.Armadura;
import Entidad.Guante;


public class GuanteServicios extends ArmaduraServicios {

    @Override
    public double consumo(Integer consumo, Integer tiempo) {
        Double consumoX = super.consumo(consumo, tiempo);
        return consumoX;
    }

    public boolean ConsultarDanho(Armadura armadura) {

        return (armadura.getGuanteDer().getRepulsorDanhado() &&
                armadura.getGuanteIzq().getRepulsorDanhado());
    }    
    public Guante crearGuante(){
        Guante guanteX = new Guante(false,false);
        return guanteX;
    }
}
