package Entidad;

public class Animal {

    private String nombre,
            razaAnimal;
    private Integer edad;
    private String alimento;

    public Animal() {
    }

    public Animal(String nombre, String razaAnimal, Integer edad, String alimento) {
        this.nombre = nombre;
        this.razaAnimal = razaAnimal;
        this.edad = edad;
        this.alimento = alimento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void alimentarse() {
        System.out.println(nombre + " come : " + alimento);
    }
}
