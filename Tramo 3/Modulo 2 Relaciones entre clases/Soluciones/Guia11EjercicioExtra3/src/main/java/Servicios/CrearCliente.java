package Servicios;

import Entidad.Cliente;
import java.util.Scanner;

public class CrearCliente {

    private static int documento = 12345678;
     private static int email = 1;
     private static int domicilio = 110;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cliente nuevoCliente;

    public Cliente nuevoRegistro() {
        nuevoCliente = new Cliente();
        System.out.println("Formulario de Registro.");
        System.out.println("--------------------------------------");

        System.out.println("Para iniciar ingrese su nombre.");
        String nombre = leer.next();
        nuevoCliente.setNombre(nombre);
        System.out.println("--------------------------------------");

        System.out.println("Perfecto " + nombre + ", ahora ingrese su apellido.");
        nuevoCliente.setApellido(leer.next());
        System.out.println("--------------------------------------");

        System.out.println("Ingrese su numero de documento.");
        System.out.println("--------------------------------------");
        nuevoCliente.setDocumento(leer.nextInt());

        System.out.println("Bien, ahora ingrese su domicilio.");
        nuevoCliente.setDomicilio(leer.next());
        System.out.println("--------------------------------------");

        System.out.println("Datos de Contacto.");
        System.out.println("--------------------------------------");

        System.out.println(nombre + ", ingrese su email.");
        nuevoCliente.setEmail(leer.next());
        System.out.println("--------------------------------------");

        System.out.println("Por ultimo, ingrese su número de teléfono.");
        nuevoCliente.setTelefono(leer.nextInt());
        System.out.println("--------------------------------------");

        return nuevoCliente;
    }

    public Cliente nuevaMuestraPrueba() {
        String[] nombre = {"Claudio", "Francisco", "Claudia", "Hernan", "Federico",
            "Nicolas", "Fara", "Ludmila", "Sofia", "Micaela", "Leonel", "Leonardo", "Denise",
            "Karen", "Rocio", "Marina", "Fernanda", "Luis", "Juan", "Gaston"};
        String[] apellido = {"Ferreyra", "Plaza", "Benitez", "Parodi", "Iglesias",
            "Fiasche", "Leisch", "Ebrard", "Minocchio", "Scopinni", "Godoy",
            "Bauzone", "Kaulen", "Ruiz Diaz", "Veragua",
            "Peralta", "Callejon", "Bolivar", "Goitea", "Ifran"};
        
        nuevoCliente = new Cliente(nombre[(int) (Math.random() * 20)],
                apellido[(int) (Math.random() * 20)],
                "calle falsa " + domicilio++,
                (email++) + "@hotmail.com",
                (int) (((((((Math.random() * 10) * 10) * 10) * 10) * 10) * 10) * 10),
                documento++);
        
        return nuevoCliente;
    }
}

