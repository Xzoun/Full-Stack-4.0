package Entidad.Funcionalidades;

import Entidad.*;
import Servicios.ObjetoServicios;

public class Consola {

    ObjetoServicios objServ = new ObjetoServicios();

    public Consola() {
    }

    public void menu() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                    ---------------  Menu  ---------------");
        System.out.println("");
        System.out.print("---- 1 ---- Caminar.    ");
        System.out.print("---- 2 ---- Correr.    ");
        System.out.print("---- 3 ---- Propulsar. ");
        System.out.println("---- 4 ---- Volar. ");
        System.out.print("---- 5 ---- Disparar.   ");
        System.out.println("---- 6 ---- Disparar rafaga. ");
        System.out.print("---- 7 ---- Ver Estado. ");
        System.out.print("---- 8 ---- Reparación rápida. ");
        System.out.println("---- 9 ---- Salir ");
        System.out.println("----------------------------------------------------------------------------");
    }

    public void eleccion() {
        System.out.println("                    Elija una opción:");
        System.out.print("                    ");
    }

    public void bateriaBaja(Armadura armadura, boolean alerta) {

        Double bateriaActual = armadura.getBateria();

        if (alerta) {

            if (bateriaActual <= 0.0) {
                System.out.println("                    ---------------  Alerta!  -------------");
                System.out.println("Bateria agotada!");
                System.out.println("                                                                      Adios.");
                System.out.println("----------------------------------------------------------------------------");

            } else if (bateriaActual < 10) {
                System.out.println("                    ---------------  Alerta!  -------------");
                System.out.println("Queda menos del 10% de batería");
                System.out.println("----------------------------------------------------------------------------");

            } else if (bateriaActual < 30) {
                System.out.println("                    ---------------  Alerta!  -------------");
                System.out.println("Queda menos del 30% de batería");
                System.out.println("----------------------------------------------------------------------------");
            }

        } else {
            System.out.println("Bateria: " + bateriaActual);
        }
    }

    public void mensaje(String mensaje) {
        System.out.println(mensaje);
        System.out.println("---------------------------------------------------------");
    }

    public void informeArmadura(Armadura armadura) {
        bateriaBaja(armadura, false);
        System.out.println("---------------------------------------------------------");

        if (armadura.getGuanteDer().getRepulsorDanhado()) {
            System.out.print("Guante derecho: Dañado. | ");
        } else {
            System.out.print("Guante derecho: Utilizable. | ");
        }
        if (armadura.getGuanteIzq().getRepulsorDanhado()) {
            System.out.println("Guante izquierdo: Dañado.");
        } else {
            System.out.println("Guante izquierdo: Utilizable.");
        }
        if (armadura.getBotaDer().getPropulsorDanhado()) {
            System.out.print("Bota derecha: Dañada. | ");
        } else {
            System.out.print("Bota derecha: Utilizable. | ");
        }
        if (armadura.getBotaIzq().getPropulsorDanhado()) {
            System.out.println("Bota izquierda: Dañada.");
        } else {
            System.out.println("Bota izquierda: Utilizable.");
        }
    }

    public void informeDeAciertos(Integer contador, Boolean descarga, Boolean acierto) {
        if (descarga) {
            if (contador < 1) {
                System.out.println("Señor solo gastamos bateria dejeme apuntar a mi.");
            } else if (contador == 1) {
                System.out.println("Le dimos " + contador + " vez.");
                System.out.println("Dejeme apuntar a mi señor.");
            } else {
                System.out.println("Señor acerto " + contador + " veces.");
            }

        } else {
            if (acierto) {
                System.out.println("Excelente disparo!");
            } else {
                System.out.println("No le dimos.");

            }
        }
    }

    public void informeDeReparacion(String parte, Integer derIzq, Boolean reparado) {
        String genero = "a";

        if (parte.equals("Guante")) {
            genero = "o";
        }

        if (parte.equalsIgnoreCase("Armadura")) {
            System.out.println("La armadura funciona perfectamente!");
        }

        if (reparado) {
            switch (derIzq) {
                case 3:
                    System.out.println(parte + "s  reparad" + genero + "s con éxito!");
                    break;
                case 2:
                    System.out.println(parte + " izquierd" + genero + " reparad" + genero + " con éxito!");
                    break;
                case 1:
                    System.out.println(parte + " derech" + genero + " reparad" + genero + " con éxito!");
                    break;
            }
        } else {
            switch (derIzq) {
                case 3:
                    System.out.println(parte + "s muy dañad+" + genero + "s para reparar en este momento");
                    break;
                case 2:
                    System.out.println(parte + " izquierd" + genero + " imposible de reparar en este momento");
                    break;
                case 1:
                    System.out.println(parte + " derech" + genero + " imposible de reparar en este momento");
                    break;
            }
        }
    }

    public void informeDeDanhos(String parte, Integer derIzq) {
        switch (parte) {
            case "Bota":
                switch (derIzq) {
                    case 3:
                        System.out.println("Los propulsores estan dañados");
                        break;
                    case 2:
                        System.out.println("Se daño el propulsor izquierdo");
                        break;
                    default:
                        System.out.println("Se daño el propulsor derecho");
                        break;
                }
            case "Guante":
                switch (derIzq) {
                    case 3:
                        System.out.println("Los repulsores estan dañados");
                        break;
                    case 2:
                        System.out.println("Se daño el repulsor izquierdo");
                        break;
                    default:
                        System.out.println("Se daño el repulsor derecho");
                        break;
                }
        }
    }

    public void radar(Radar radar) {
        System.out.println("                    ---------------  Radar  ---------------");
        System.out.println("");
        for (Objeto objetos : radar.getRadarCompleto()) {
            System.out.println(objetos.toString());
            System.out.println("El objeto se encuentra a : " + objServ.medirDistancia(objetos) + " metros");
        }
        System.out.println("----------------------------------------------------------------------------");
    }
}
