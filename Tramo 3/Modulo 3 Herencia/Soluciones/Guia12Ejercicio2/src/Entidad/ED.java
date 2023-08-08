/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
• Métodos getters y setters de todos los atributos.
 */
package Entidad;

import Enums.*;

public class ED {

    private Double precio,
            peso;
    private Colores color;
    private Consumo consumo;

    public ED() {
    }

    public ED(Double precio, Double peso, Colores color, Consumo consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "precio: $" + precio
                + ", peso: " + peso
                + " Kg, color: " + color
                + ", consumo: " + consumo + "\n";
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }
}
