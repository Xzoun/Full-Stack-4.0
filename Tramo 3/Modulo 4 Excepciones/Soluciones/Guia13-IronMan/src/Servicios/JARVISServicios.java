package Servicios;

import Entidad.Armadura;
import Entidad.Funcionalidades.Consola;
import java.util.Scanner;

public class JARVISServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    BotaServicios botasServ = new BotaServicios();
    GuanteServicios guantesServ = new GuanteServicios();
    ObjetoServicios objServ = new ObjetoServicios();
    RadarServicios radarServ = new RadarServicios();
    Consola consola = new Consola();

    public Integer imput() {
        int tiempo = 0;
        do {
            try {
                tiempo = leer.nextInt();
            } catch (Exception a) {
                leer.next();
                System.out.println("Intene nuevamente");
            }
        } while (tiempo == 0);
        return tiempo;
    }

    public Armadura caminar(Armadura armadura, Integer tiempo) {
        armadura.setBateria(armadura.getBateria() - botasServ.consumo(1, tiempo));
        consola.mensaje("Desplazando a pie...");
        armadura = radarServ.actualizacion(armadura, tiempo * 50);
        return armadura;
    }

    public Armadura correr(Armadura armadura, Integer tiempo) {
        armadura.setBateria(armadura.getBateria() - botasServ.consumo(2, tiempo));
        consola.mensaje("Corriendo...");
        armadura = radarServ.actualizacion(armadura, tiempo * 100);
        return armadura;
    }

    public Armadura propulsar(Armadura armadura) {

        if (!armadura.getBotaDer().getPropulsorDanhado() && !armadura.getBotaIzq().getPropulsorDanhado()) {
            armadura.setBateria(armadura.getBateria() - botasServ.consumo(3, 3));
            consola.mensaje("Propulsión!");
            armadura = radarServ.actualizacion(armadura, 70);
        } else {
            consola.informeDeDanhos("Bota", 3);
        }
        armadura = posibleDanho(armadura, 2);
        return armadura;
    }

    public Armadura volar(Armadura armadura, Integer tiempo) {
        Boolean guantesRotos = guantesServ.ConsultarDanho(armadura);
        Boolean botasRotas = botasServ.ConsultarDanho(armadura);
        if (!guantesRotos) {
            if (!botasRotas) {
                armadura.setBateria(armadura.getBateria() - botasServ.consumo(3, 3) - guantesServ.consumo(2, tiempo));
                armadura = posibleDanho(armadura, 1);
                armadura = posibleDanho(armadura, 2);
                consola.mensaje("Volando...");
                armadura = radarServ.actualizacion(armadura, tiempo * 300);
            } else {
                consola.informeDeDanhos("Bota", 3);
            }
        } else {
            consola.informeDeDanhos("Guante", 3);
        }

        return armadura;
    }

    public void verEstado(Armadura armadura) {
        consola.informeArmadura(armadura);
    }

    public Armadura reparar(Armadura armadura) {

        Boolean danhadoGI = armadura.getGuanteIzq().getRepulsorDanhado();
        Boolean danhadoGD = armadura.getGuanteDer().getRepulsorDanhado();

        if (danhadoGD || danhadoGI) {

            Boolean reparableGI = armadura.getGuanteIzq().getReparable();
            Boolean reparableGD = armadura.getGuanteDer().getReparable();
            Integer derIzq = 0;

            if (reparableGD && danhadoGD) {
                derIzq = 1;
                armadura.getGuanteDer().setRepulsorDanhado(false);
            }
            if (reparableGI && danhadoGI) {
                derIzq = 2;
                armadura.getGuanteIzq().setRepulsorDanhado(false);
            }
            if (reparableGI && reparableGD && danhadoGD && danhadoGI) {
                derIzq = 3;
            }

            if (danhadoGI && !reparableGI) {
                consola.informeDeReparacion("Guante", 2, false);
            }
            if (danhadoGD && !reparableGD) {
                consola.informeDeReparacion("Guante", 1, false);
            }

            consola.informeDeReparacion("Guante", derIzq, true);
            armadura.setBateria(armadura.getBateria() - guantesServ.consumo(3, 10));

        }

        Boolean danhadoBI = armadura.getBotaIzq().getPropulsorDanhado();
        Boolean danhadoBD = armadura.getBotaDer().getPropulsorDanhado();

        if (danhadoBI || danhadoBD) {

            Integer derIzq = 0;
            Boolean reparableBI = armadura.getBotaIzq().getReparable();
            Boolean reparableBD = armadura.getBotaDer().getReparable();

            if (danhadoBI && reparableBI) {
                derIzq = 2;
                armadura.getBotaIzq().setPropulsorDanhado(false);
            }
            if (danhadoBD && reparableBD) {
                derIzq = 1;
                armadura.getBotaDer().setPropulsorDanhado(false);
            }
            if (reparableBI && reparableBD && danhadoBI && danhadoBD) {
                derIzq = 3;
            }

            if (danhadoBI && !reparableBI) {
                consola.informeDeReparacion("Bota", 2, false);
            }
            if (danhadoBD && !reparableBD) {
                consola.informeDeReparacion("Bota", 1, false);
            }

            consola.informeDeReparacion("Bota", derIzq, true);
            armadura.setBateria(armadura.getBateria() - guantesServ.consumo(3, 10));
        }

        if (!danhadoGI && !danhadoGD && !danhadoBI && !danhadoBD) {
            consola.informeDeReparacion("Armadura", 0, true);
        }

        return armadura;
    }

    public Armadura disparar(Armadura armadura, Boolean descarga) {
        Boolean guantesRotos = guantesServ.ConsultarDanho(armadura);
        Integer objetos = armadura.getRadar().getRadarCompleto().size();

        if (!guantesRotos) {
            Integer disparos = 1;
            Integer contador = 0;
            Boolean acierto = false;
            if (descarga) {
                disparos = 5;
                for (int i = 0; i < disparos; i++) {
                    if (Math.random() >= 0.3) {
                        contador++;
                        armadura = objServ.objetivoDanhado(armadura);
                        if (armadura.getRadar().getRadarCompleto().size() < objetos) {
                            consola.mensaje("Objetivo Eliminado!");
                            objetos = armadura.getRadar().getRadarCompleto().size();
                        }
                    }
                }
            } else {
                if (Math.random() >= 0.3) {
                    acierto = true;
                    armadura = objServ.objetivoDanhado(armadura);
                    if (armadura.getRadar().getRadarCompleto().size() < objetos) {
                        consola.mensaje("Objetivo Eliminado!");
                        objetos = armadura.getRadar().getRadarCompleto().size();
                    }
                }
            }
            armadura.setBateria(armadura.getBateria() - guantesServ.consumo(3, disparos * 50));
            armadura = posibleDanho(armadura, 1);
            consola.informeDeAciertos(contador, descarga, acierto);
        } else {
            consola.informeDeDanhos("Guante", 3);
        }
        return armadura;
    }

    public Armadura posibleDanho(Armadura armadura, Integer parte) {
        if (parte.equals(1)) {
            if (Math.random() <= 0.2) {
                if (armadura.getGuanteDer().getRepulsorDanhado()) {

                    if (!armadura.getGuanteIzq().getRepulsorDanhado()) {
                        armadura.getGuanteIzq().setRepulsorDanhado(true);
                        reparable(armadura, 2);
                    }

                } else if (armadura.getGuanteIzq().getRepulsorDanhado()) {

                    if (!armadura.getGuanteDer().getRepulsorDanhado()) {
                        armadura.getGuanteDer().setRepulsorDanhado(true);
                        reparable(armadura, 1);
                    }

                } else {
                    if (Math.random() >= 0.5) {
                        armadura.getGuanteDer().setRepulsorDanhado(true);
                        reparable(armadura, 1);
                    } else {
                        armadura.getGuanteIzq().setRepulsorDanhado(true);
                        reparable(armadura, 2);
                    }
                }
            }
        } else {
            if (Math.random() <= 0.2) {
                if (armadura.getBotaDer().getPropulsorDanhado()) {

                    if (!armadura.getBotaIzq().getPropulsorDanhado()) {
                        armadura.getBotaIzq().setPropulsorDanhado(true);
                        reparable(armadura, 4);
                    }

                } else if (armadura.getBotaIzq().getPropulsorDanhado()) {

                    if (!armadura.getBotaDer().getPropulsorDanhado()) {
                        armadura.getBotaDer().setPropulsorDanhado(true);
                        reparable(armadura, 3);
                    }

                } else {
                    if (Math.random() >= 0.5) {
                        armadura.getBotaDer().setPropulsorDanhado(true);
                        reparable(armadura, 3);
                    } else {
                        armadura.getBotaIzq().setPropulsorDanhado(true);
                        reparable(armadura, 4);
                    }
                }

            }
        }
        return armadura;

    }

    public void reparable(Armadura armadura, Integer parte) {
        switch (parte) {
            case 1:
                if (Math.random() < 0.7) {
                    armadura.getGuanteDer().setReparable(true);
                } else {
                    armadura.getGuanteDer().setReparable(false);
                }
                break;
            case 2:
                if (Math.random() < 0.7) {
                    armadura.getGuanteIzq().setReparable(true);
                } else {
                    armadura.getGuanteIzq().setReparable(false);
                }
                break;
            case 3:
                if (Math.random() < 0.7) {
                    armadura.getBotaDer().setReparable(true);
                } else {
                    armadura.getBotaDer().setReparable(false);
                }
                break;
            case 4:
                if (Math.random() < 0.7) {
                    armadura.getBotaIzq().setReparable(true);
                } else {
                    armadura.getBotaIzq().setReparable(false);
                }
                break;
        }

    }

}
