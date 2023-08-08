/*
Área rectángulo: base * altura
Perímetro rectángulo: (base + altura) * 2.
 */
package Herencia.Entidad;

import Interfaz.calculosFormas;

public class Rectangulo implements calculosFormas {

    private double base,
            altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
       return  (base+altura)*2;
    }
}
