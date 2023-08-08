/*
Área circulo: PI * radio ^ 2
Perímetro circulo: PI * diámetro.
 */
package Herencia.Entidad;

import Interfaz.calculosFormas;

public class Circulo implements calculosFormas {

    private double diametro;

    public Circulo() {
    }

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double area() {
        double radio = diametro / 2;
        return PI * (Math.pow(radio, 2));

    }

    @Override
    public double perimetro() {
        return PI * diametro;
    }
}
