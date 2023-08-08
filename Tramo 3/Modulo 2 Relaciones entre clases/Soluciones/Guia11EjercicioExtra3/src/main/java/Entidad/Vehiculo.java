/*
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. 
Marca, modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 */
package Entidad;

import Enum.Colores;
import Enum.Marca;

public class Vehiculo {

    private Marca marca;
    private Colores color;
    private String modelo,
            tipo,
            motor,
            chasis;
    private Integer año;

    @Override
    public String toString() {
        return marca + ", " + modelo + ", " + color + ", " + tipo + ", " + año;
    }

    public Vehiculo() {
    }

    public Vehiculo(Marca marca, Colores color, String modelo, String tipo, String motor, String chasis, Integer año) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tipo = tipo;
        this.motor = motor;
        this.chasis = chasis;
        this.año = año;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
