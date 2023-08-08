package Servicios;

import Entidad.Poliza;
import Enum.FormaPago;
import Enum.TipoDeCobertura;
import Servicios.Tiempo.Cuotas;
import Servicios.Tiempo.GenerarFecha;
import static Servicios.Tiempo.GenerarFecha.generarFechaFinalizacion;
import static Servicios.Tiempo.GenerarFecha.generarFechaInicio;
import java.time.LocalDate;
import java.util.Scanner;

public class CrearPoliza {

    CrearCliente servCliente = new CrearCliente();
    CrearVehiculo servVehiculo = new CrearVehiculo();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TipoDeCobertura cobertura[] = TipoDeCobertura.values();
    FormaPago pago[] = FormaPago.values();
    GenerarFecha fecha = new GenerarFecha();
    Cuotas cuotas = new Cuotas();

    public Poliza nuevoRegistro(Integer polizaNum) {
        Poliza nuevaPoliza = new Poliza();
        nuevaPoliza.setCliente(servCliente.nuevoRegistro());
        nuevaPoliza.setVehiculo(servVehiculo.nuevoRegistro());
        nuevaPoliza.setPolizaNum(polizaNum);
        nuevaPoliza.setCuotasPagas(0);

        System.out.println("Ingrese el monto total asegurado");
        Integer montoTotal = leer.nextInt();
        nuevaPoliza.setMontoTotalAsegurado(montoTotal);
        System.out.println("--------------------------------------");
        nuevaPoliza.setCuotaMensual(montoTotal / 12);
        boolean respuestaValida = false;
        do {
            System.out.println("Seguro contra granizo? s/n");
            String granizo = leer.next();
            System.out.println("--------------------------------------");

            switch (granizo.toUpperCase()) {
                case "S":
                    nuevaPoliza.setIncluyeGranizo(true);
                    System.out.println("Ingrese el monto Máximo asegurado contra granizo.");
                    nuevaPoliza.setMontoMaximoGranizo(leer.nextInt());
                    System.out.println("--------------------------------------");
                    respuestaValida = true;
                    break;
                case "N":
                    nuevaPoliza.setIncluyeGranizo(false);
                    nuevaPoliza.setMontoMaximoGranizo(0);
                    respuestaValida = true;
                    break;
                default:
                    System.out.println("Ingrese una respuesta valida.");
                    break;
            }
        } while (!respuestaValida);
        nuevaPoliza.setFechaInicio(LocalDate.now());
        nuevaPoliza.setFechaFin(generarFechaFinalizacion(LocalDate.now()));
        nuevaPoliza.setTipo(eleccionTipo());
        nuevaPoliza.setPago(eleccionPago());
        System.out.println("Poliza registrada con Exito, numero de Poliza: " + polizaNum);
        return nuevaPoliza;
    }

    public TipoDeCobertura eleccionTipo() {
        TipoDeCobertura asd = null;
        for (int i = 1; i <= cobertura.length; i++) {
            System.out.println((i) + ". " + cobertura[i - 1]);
        }
        System.out.println("Seleccione un tipo de cobertura ingresando el numero");
        Integer eleccion = leer.nextInt();
        System.out.println("--------------------------------------");

        for (int i = 1; i <= cobertura.length; i++) {
            if (eleccion == i) {
                asd = cobertura[i-1];
            }
        }
        return asd;
    }

    public FormaPago eleccionPago() {
        FormaPago asd = null;
        for (int i = 1; i <= pago.length; i++) {
            System.out.println((i) + ". " + pago[i - 1]);
        }
        System.out.println("Seleccione un metodo de pago ingresando el numero");
        Integer eleccion = leer.nextInt();
        System.out.println("--------------------------------------");

        for (int i = 1; i <= pago.length; i++) {
            if (eleccion == i) {
                asd = pago[i-1];
            }
        }
        return asd;
    }

    public Poliza nuevaMuestraPrueba(Integer polizaNum) {
        LocalDate nuevaFechaInicio = generarFechaInicio();
        LocalDate nuevaFechaFin = fecha.generarFechaFinalizacion(nuevaFechaInicio);
        Integer montoTotal = Math.max(90000, (int) (Math.random() * 300000));
        Poliza nuevaPoliza = new Poliza(null,
                null,
                polizaNum,
                montoTotal,
                cuotas.calcularCuotasAbonadas(nuevaFechaInicio, nuevaFechaFin),
                (int) (montoTotal / 1.5),
                montoTotal / 12,
                nuevaFechaInicio,
                nuevaFechaFin,
                cobertura[(int) (Math.random() * 9)],
                pago[(int) (Math.random() * 4)],
                false);
        if ((Math.random() < 0.5)) {
            nuevaPoliza.setIncluyeGranizo(true);
            nuevaPoliza.setMontoMaximoGranizo((int) (Math.random() * 150000));
        } else {
            nuevaPoliza.setIncluyeGranizo(false);
            nuevaPoliza.setMontoMaximoGranizo(0);
        }
        nuevaPoliza.setCliente(servCliente.nuevaMuestraPrueba());
        nuevaPoliza.setVehiculo(servVehiculo.nuevaMuestraPrueba());
        System.out.println("Poliza de prueba creada: Numero de Poliza " + polizaNum);
        polizaNum++;
        return nuevaPoliza;
    }

}
