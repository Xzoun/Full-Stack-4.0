package Servicios.Tiempo;

import java.time.LocalDate;

public class Cuotas {

 public static int calcularCuotasAbonadas(LocalDate fechaInicio, LocalDate fechaFinalizacion) {
        LocalDate fechaActual = LocalDate.now();
        int cuotasAbonadas = 0;

        LocalDate fechaRenovacion = fechaInicio.plusYears(1);
        while ((fechaRenovacion.isBefore(fechaActual)
                || fechaRenovacion.isEqual(fechaActual))
                && (fechaRenovacion.isBefore(fechaFinalizacion)
                || fechaRenovacion.isEqual(fechaFinalizacion))) {
            cuotasAbonadas += 12;
            fechaInicio = fechaRenovacion;
            fechaRenovacion = fechaRenovacion.plusYears(1);
        }

        if (fechaFinalizacion.isBefore(fechaActual)
                || fechaFinalizacion.isEqual(fechaActual)
                || fechaFinalizacion.isBefore(fechaRenovacion)
                || fechaFinalizacion.isEqual(fechaRenovacion)) {
            int mesesHastaFinalizacion = fechaInicio.until(fechaFinalizacion).getMonths();
            cuotasAbonadas += mesesHastaFinalizacion;
        }

        return cuotasAbonadas;
    }

}
