package Servicios.Tiempo;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class GenerarFecha {

    public static LocalDate generarFechaInicio() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaHace5Anios = fechaActual.minusYears(5);

        long minDay = fechaHace5Anios.toEpochDay();
        long maxDay = fechaActual.toEpochDay();

        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay + 1);

        return LocalDate.ofEpochDay(randomDay);
    }

    public static LocalDate generarFechaFinalizacion(LocalDate fechaInicio) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaRenovacion = fechaInicio.plusYears(1);

        if (fechaRenovacion.isAfter(fechaActual)) {
            return fechaRenovacion;
        } else {
            long minDay = fechaRenovacion.toEpochDay();
            long maxDay = fechaActual.toEpochDay();

            long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay + 1);

            return LocalDate.ofEpochDay(randomDay);
        }
    }
    
     public static LocalDate proximoVencimiento(LocalDate fechaInicio, LocalDate fechaFinalizacion) {
        LocalDate fechaActual = LocalDate.now();

        LocalDate fechaRenovacion = fechaInicio.plusMonths(1);
        while ((fechaRenovacion.isBefore(fechaActual) || fechaRenovacion.isEqual(fechaActual)) && fechaRenovacion.isBefore(fechaFinalizacion)) {
            fechaRenovacion = fechaRenovacion.plusMonths(1);
        }

        return fechaRenovacion;
    }
}
