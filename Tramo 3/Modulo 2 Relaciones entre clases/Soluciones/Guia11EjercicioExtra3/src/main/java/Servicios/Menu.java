/*
 d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en 
cada póliza. Esas cuotas van a contener la siguiente información: número de cuota,
monto total de la cuota, si está o no pagada, fecha de vencimiento, forma de pago 
(efectivo, transferencia,etc.).

 */
package Servicios;

import Entidad.Poliza;
import Servicios.Tiempo.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    private static int idPoliza = 123455;
    private final HashMap<Integer, Poliza> polizasHashMap = new HashMap();
    CrearPoliza poliza = new CrearPoliza();
    GenerarFecha fecha = new GenerarFecha();
    Cuotas cuotasX = new Cuotas();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        System.out.println("--------------------------------------");

        System.out.println("---------------  Menu  ---------------");
        System.out.println("");
        System.out.println("-- 1 -- Registrar Nueva Poliza");
        System.out.println("-- 2 -- Consultar Poliza");
        System.out.println("-- 3 -- Generar muestra de prueba");
        System.out.println("-- 4 -- Salir.");
        System.out.println("--------------------------------------");

        System.out.println("Elija una opción:");
        switch (leer.nextInt()) {
            case 1:

                System.out.println("--------------------------------------");
                polizasHashMap.put(idPoliza, poliza.nuevoRegistro(idPoliza));
                idPoliza++;
                menu();
                break;
            case 2:

                System.out.println("--------------------------------------");
                consultarPoliza();
                menu();
                break;
            case 3:

                System.out.println("--------------------------------------");
                DB();
                menu();
                break;
            case 4:

                System.out.println("--------------------------------------");
                break;
            default:

                System.out.println("--------------------------------------");
                System.out.println("Ingrese una opción válida");
                menu();
                break;
        }
    }

    public void DB() {
        System.out.println("Cuantas muestras quiere realizar?");
        Integer cantidad = leer.nextInt();
        System.out.println("--------------------------------------");

        for (int i = 0; i < cantidad; i++) {
            polizasHashMap.put(idPoliza, poliza.nuevaMuestraPrueba(idPoliza));
            idPoliza++;
        }

    }

    public void consultarPoliza() {
        System.out.println("Ingrese el numero de su póliza.");
        Poliza polizas = polizasHashMap.get(leer.nextInt());
        System.out.println("--------------------------------------");
        System.out.println(polizas.toString());
        System.out.println("--------------------------------------");
        System.out.println("Alta: " + polizas.getFechaInicio());
        System.out.println("Cuotas abonadas: " + polizas.getCuotasPagas());

        if (polizas.getFechaFin().isAfter(LocalDate.now())) {
            System.out.println("Renovación anual: " + polizas.getFechaFin());
            System.out.println("Proximo vencimiento: "
                    + fecha.proximoVencimiento(polizas.getFechaInicio(),
                            polizas.getFechaFin()));
            System.out.println("Medio de pago: " + polizas.getPago());
        } else {
            if (Math.random() > 0.5) {
                System.out.println("Cuota dada de baja. ");
                System.out.println("Baja: " + polizas.getFechaFin());
            } else {
                System.out.println("Cuota vencida.");
                System.out.println("Medio de pago: " + polizas.getPago());
                System.out.println("Vehiculo sin seguro");
                System.out.println("Tasa de interes 35% por atraso.");
                Integer mesesVencido = (cuotasX.calcularCuotasAbonadas(polizas.getFechaFin(), LocalDate.now()));
                System.out.println("Meses de retraso: " + mesesVencido);

                if (polizas.getIncluyeGranizo()) {
                    Integer finalMensual = (polizas.getCuotaMensual() + (polizas.getMontoMaximoGranizo() / 12));
                    System.out.println("Se adeuda : $" + (finalMensual + (mesesVencido * finalMensual * 0.35)));
                } else {
                    System.out.println("Se adeuda : $" + (mesesVencido * polizas.getCuotaMensual() * 0.35) + polizas.getCuotaMensual());
                }
                System.out.println("Fecha de suspension: " + polizas.getFechaFin());

            }

        }
    }
}
