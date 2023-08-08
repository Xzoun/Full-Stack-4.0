/*
 c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto
de un vehículo, como los datos de un solo cliente. Los datos incluidos en ella son:
número de póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de
pago, monto total asegurado, incluye granizo, monto máximo granizo, tipo de 
cobertura (total, contra terceros, etc.). Nota: prestar atención al principio de
este enunciado y pensar en las relaciones entre clases. Recuerden que pueden ser de
uno a uno, de uno a muchos, de muchos a uno o de muchos a muchos.
 */
package Entidad;

import Enum.FormaPago;
import Enum.TipoDeCobertura;
import java.time.LocalDate;

public class Poliza {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private Integer polizaNum,
            montoTotalAsegurado,
            cuotasPagas,
            montoMaximoGranizo,
            cuotaMensual;
    private LocalDate fechaInicio,
            fechaFin;
    private TipoDeCobertura tipo;
    private FormaPago pago;
    private Boolean incluyeGranizo;

    public Poliza(Cliente cliente, Vehiculo vehiculo, Integer polizaNum, Integer montoTotalAsegurado, Integer cuotasPagas, Integer montoMaximoGranizo, Integer cuotaMensual, LocalDate fechaInicio, LocalDate fechaFin, TipoDeCobertura tipo, FormaPago pago, Boolean incluyeGranizo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.polizaNum = polizaNum;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.cuotasPagas = cuotasPagas;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.cuotaMensual = cuotaMensual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipo = tipo;
        this.pago = pago;
        this.incluyeGranizo = incluyeGranizo;
    }

    @Override
    public String toString() {
        String toString = "Titular: " + cliente.toString()
                + "\n--------------------------------------"
                + "\nVehiculo: " + vehiculo.toString()
                + "\n--------------------------------------"
                + "\nNumero de Poliza: " + polizaNum + ", Importe mensual: $" + cuotaMensual
                + "\nIncluye Granizo: " + incluyeGranizo;

        if (incluyeGranizo) {
            toString += ", Importe adicional: $" + (montoMaximoGranizo / 12)
                    + "\nFinal: $" + (cuotaMensual + montoMaximoGranizo / 12);
        } else {
            toString += ", Importe adicional: $" + 0
                    + "\nFinal: $" + cuotaMensual;

        }

        return toString;
    }

    public Poliza() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getPolizaNum() {
        return polizaNum;
    }

    public void setPolizaNum(Integer polizaNum) {
        this.polizaNum = polizaNum;
    }

    public Integer getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Integer montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public Integer getCuotasPagas() {
        return cuotasPagas;
    }

    public void setCuotasPagas(Integer cuotasPagas) {
        this.cuotasPagas = cuotasPagas;
    }

    public Integer getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(Integer montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public TipoDeCobertura getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeCobertura tipo) {
        this.tipo = tipo;
    }

    public FormaPago getPago() {
        return pago;
    }

    public void setPago(FormaPago pago) {
        this.pago = pago;
    }

    public Boolean getIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(Boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public Integer getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Integer cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

}
