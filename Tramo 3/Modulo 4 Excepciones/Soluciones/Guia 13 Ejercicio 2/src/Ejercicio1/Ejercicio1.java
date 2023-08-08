
package Ejercicio1;

public class Ejercicio1 {

    public Persona nuevaMuestraPrueba() {
     
        Persona nuevaPersona = null;
        System.out.println(nuevaPersona);
        return nuevaPersona;
    }
    
    public boolean esMayorDeEdad(Persona nuevoRegistro) {
        return nuevoRegistro.getEdad() >= 18;
    }
    
    public void Ejercicio1(){
         try {
            esMayorDeEdad(nuevaMuestraPrueba());
        } catch (Exception a) {
            System.out.println(a);
        }
    }
}
