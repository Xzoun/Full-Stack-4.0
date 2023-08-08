/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

 */
package Entidad;

public class Barco {

    private String matricula;
    private Double eslora;
    private Integer modelo;

    @Override
    public String toString() {
        return "-- Matricula: " + matricula + "-- Eslora: " + eslora
                + "\n-- Modelo:" + modelo;
    }

    public Barco() {
    }

    public Barco(String matricula, Double eslora, Integer modelo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double Eslora) {
        this.eslora = Eslora;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

}
