package Entidad;

import Entidad.Funcionalidades.Consola;
import Servicios.BotaServicios;
import Servicios.GuanteServicios;
import Servicios.JARVISServicios;
import Servicios.RadarServicios;

public class JARVIS {

    JARVISServicios serviciosPrincipales = new JARVISServicios();
    Consola consola = new Consola();
    RadarServicios radarServ = new RadarServicios();

    public Armadura crearArmadura() {
        Armadura nuevaArmadura = new Armadura();
        GuanteServicios guante = new GuanteServicios();
        BotaServicios bota = new BotaServicios();

        nuevaArmadura.setColorPrinc("Rojo");
        nuevaArmadura.setColorSec("Amarillo");
        nuevaArmadura.setBateria(100.0);
        nuevaArmadura.setRadar(radarServ.crearRadar());
        nuevaArmadura.setGuanteIzq(guante.crearGuante());
        nuevaArmadura.setGuanteDer(guante.crearGuante());
        nuevaArmadura.setBotaIzq(bota.crearBota());
        nuevaArmadura.setBotaDer(bota.crearBota());

        return nuevaArmadura;
    }

    public void menu(Armadura armadura) {
        if (armadura.getBateria() >= 0.0) {

            consola.menu();
            consola.radar(armadura.getRadar());
            consola.bateriaBaja(armadura, true);
            consola.eleccion();
            
            int respuesta = serviciosPrincipales.imput();

            System.out.println("----------------------------------------------------------------------------");

            switch (respuesta) {
                case 1:
                    serviciosPrincipales.caminar(armadura, 15);
                    menu(armadura);
                    break;

                case 2:
                    serviciosPrincipales.correr(armadura, 15);
                    menu(armadura);
                    break;
                case 3:
                    serviciosPrincipales.propulsar(armadura);
                    menu(armadura);
                    break;
                case 4:
                    serviciosPrincipales.volar(armadura, 15);
                    menu(armadura);
                    break;
                case 5:
                    if (radarServ.enemigoHostilEnRango(armadura.getRadar())) {
                        armadura = serviciosPrincipales.disparar(armadura, false);
                    } else {
                        consola.mensaje("No hay enemigos hostiles en rango");
                    }
                    menu(armadura);
                    break;
                case 6:
                    if (radarServ.enemigoHostilEnRango(armadura.getRadar())) {
                        armadura = serviciosPrincipales.disparar(armadura, true);
                    } else {
                        consola.mensaje("No hay enemigos hostiles en rango");
                    }
                    menu(armadura);
                    break;
                case 7:
                    serviciosPrincipales.verEstado(armadura);
                    menu(armadura);
                    break;
                case 8:
                    serviciosPrincipales.reparar(armadura);
                    menu(armadura);
                    break;
                case 9:
                    break;
                default:
                    consola.mensaje("Ingrese una opción válida");
                    menu(armadura);
                    break;
            }
        } else {
            consola.bateriaBaja(armadura, true);
        }
    }
}
