package Entidad;

import Entidad.Funcionalidades.Radar;

public class Armadura {

    private Double bateria;
    private String colorPrinc,
            colorSec;
    private Bota botaIzq,
            botaDer;
    private Guante guanteIzq,
            guanteDer;
    private Radar radar;

    public Armadura() {
    }

    public Armadura(Double bateria, String colorPrinc, String colorSec, Bota botaIzq, Bota botaDer, Guante guanteIzq, Guante guanteDer,Radar radar) {
        this.bateria = bateria;
        this.colorPrinc = colorPrinc;
        this.colorSec = colorSec;
        this.botaIzq = botaIzq;
        this.botaDer = botaDer;
        this.guanteIzq = guanteIzq;
        this.guanteDer = guanteDer;
        this.radar = radar;
    }

    public Double getBateria() {
        return bateria;
    }

    public void setBateria(Double bateria) {
        this.bateria = bateria;
    }

    public String getColorPrinc() {
        return colorPrinc;
    }

    public void setColorPrinc(String colorPrinc) {
        this.colorPrinc = colorPrinc;
    }

    public String getColorSec() {
        return colorSec;
    }

    public void setColorSec(String colorSec) {
        this.colorSec = colorSec;
    }

    public Bota getBotaIzq() {
        return botaIzq;
    }

    public void setBotaIzq(Bota botaIzq) {
        this.botaIzq = botaIzq;
    }

    public Bota getBotaDer() {
        return botaDer;
    }

    public void setBotaDer(Bota botaDer) {
        this.botaDer = botaDer;
    }

    public Guante getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(Guante guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public Guante getGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(Guante guanteDer) {
        this.guanteDer = guanteDer;
    }

    public Radar getRadar() {
        return radar;
    }

    public void setRadar(Radar radar) {
        this.radar = radar;
    }
    

}
