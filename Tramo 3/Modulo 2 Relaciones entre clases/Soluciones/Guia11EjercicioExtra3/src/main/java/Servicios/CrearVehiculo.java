package Servicios;

import Entidad.Vehiculo;
import Enum.Colores;
import Enum.Marca;
import static Enum.Marca.*;
import HerenciaVehiculo.*;
import java.util.Scanner;

public class CrearVehiculo {

    private static int motor = 123456;
    private static int chasis = 123456;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Marca marcas[] = Marca.values();
    Colores colores[] = Colores.values();
    String[] chevroletX = {"prisma", "onix"};
    String[] fiatX = {"cronos", "uno"};
    String[] fordX = {"focus", "Ka"};
    String[] dodgeX = {"caravan", "1500"};
    String[] rollsRoyceX = {"phantom", "rice"};
    String[] renaultX = {"nueve", "megane", "sandero"};

    public Vehiculo nuevoRegistro() {
        System.out.println("--------------------------------------");
        System.out.println("Carga del Vehiculo:");
        System.out.println("--------------------------------------");

        for (int i = 1; i <= marcas.length; i++) {
            System.out.println(i + ". " + marcas[i - 1]);
        }

        System.out.println("Para elegir una marca ingrese el numero.");

        Vehiculo autoAseguradoX = null;
        Integer marcaIndex = leer.nextInt();

        switch (marcaIndex) {
            case 1:
                System.out.println("--------------------------------------");

                autoAseguradoX = new VehiculoChevrolet();
                for (int i = 1; i <= chevroletX.length; i++) {
                    System.out.println(i + ". " + chevroletX[i - 1]);
                }
                System.out.println("Para elegir un modelo ingrese el numero.");
                Integer modeloInd = leer.nextInt();
                if (modeloInd < chevroletX.length && modeloInd > 0) {
                    ((VehiculoChevrolet) autoAseguradoX).setModelo(chevroletX[modeloInd - 1]);
                }
                break;

            case 2:
                System.out.println("--------------------------------------");

                autoAseguradoX = new VehiculoFiat();
                for (int i = 1; i <= fiatX.length; i++) {
                    System.out.println(i + ". " + fiatX[i - 1]);
                }
                System.out.println("Para elegir un modelo ingrese el numero.");
                modeloInd = leer.nextInt();
                if (modeloInd < fiatX.length && modeloInd > 0) {
                    ((VehiculoFiat) autoAseguradoX).setModelo(fiatX[modeloInd - 1]);
                }
                break;

            case 3:
                System.out.println("--------------------------------------");

                autoAseguradoX = new VehiculoDodge();
                for (int i = 1; i <= dodgeX.length; i++) {
                    System.out.println(i + ". " + dodgeX[i - 1]);
                }
                System.out.println("Para elegir un modelo ingrese el numero.");
                modeloInd = leer.nextInt();
                if (modeloInd < dodgeX.length && modeloInd > 0) {
                    ((VehiculoDodge) autoAseguradoX).setModelo(dodgeX[modeloInd - 1]);
                }
                break;
            case 4:
                System.out.println("--------------------------------------");

                autoAseguradoX = new VehiculoFord();
                for (int i = 1; i <= fordX.length; i++) {
                    System.out.println(i + ". " + fordX[i - 1]);
                }
                System.out.println("Para elegir un modelo ingrese el numero.");
                modeloInd = leer.nextInt();
                if (modeloInd < fordX.length && modeloInd > 0) {
                    ((VehiculoFord) autoAseguradoX).setModelo(fordX[modeloInd - 1]);
                }
                break;
            case 5:
                System.out.println("--------------------------------------");

                autoAseguradoX = new VehiculoRollsRoyce();
                for (int i = 1; i <= rollsRoyceX.length; i++) {
                    System.out.println(i + ". " + rollsRoyceX[i - 1]);
                }
                System.out.println("Para elegir un modelo ingrese el numero.");
                modeloInd = leer.nextInt();
                if (modeloInd < rollsRoyceX.length && modeloInd > 0) {
                    ((VehiculoRollsRoyce) autoAseguradoX).setModelo(rollsRoyceX[modeloInd - 1]);
                }
                break;
            case 6:
                System.out.println("--------------------------------------");

                autoAseguradoX = new VehiculoRenault();
                for (int i = 1; i <= renaultX.length; i++) {
                    System.out.println(i + ". " + renaultX[i - 1]);
                }
                System.out.println("Para elegir un modelo ingrese el numero.");
                modeloInd = leer.nextInt();
                if (modeloInd < renaultX.length && modeloInd > 0) {
                    ((VehiculoRenault) autoAseguradoX).setModelo(renaultX[modeloInd - 1]);
                }
                break;
            default:
                System.out.println("--------------------------------------");

                System.out.println("Marca no valida.");
                nuevoRegistro();
                break;
        }
        System.out.println("--------------------------------------");
        autoAseguradoX.setMarca(marcas[marcaIndex - 1]);
        System.out.println("Color:");
        autoAseguradoX.setColor(validarColor());
        System.out.println("--------------------------------------");

        System.out.println("Tipo:");
        autoAseguradoX.setTipo(leer.next());
        System.out.println("--------------------------------------");

        System.out.println("Motor:");
        autoAseguradoX.setMotor(leer.next());
        System.out.println("--------------------------------------");

        System.out.println("Chasis:");
        autoAseguradoX.setChasis(leer.next());
        System.out.println("--------------------------------------");

        System.out.println("Año:");
        autoAseguradoX.setAño(leer.nextInt());
        System.out.println("--------------------------------------");

        return autoAseguradoX;
    }

    public Colores validarColor() {

        String colorIngresado;
        Colores color = colores[1];
        boolean colorValida = false;
        do {

            colorIngresado = leer.next();

            for (Colores colorX : colores) {
                if (colorX.toString().equalsIgnoreCase(colorIngresado)) {
                    color = colorX;
                    colorValida = true;
                }
            }
            if (!colorValida) {
                System.out.println("Ingrese un color de esta lista.");
                for (Colores colorX : colores) {
                    System.out.println(colorX);
                }
            }
        } while (!colorValida);

        return color;
    }

    public Vehiculo nuevaMuestraPrueba() {
        String[] tipo = {"hatchback", "deportivo", "Camioneta", "SUV"};
        Integer[] año = {2016, 2017, 2018, 2018, 2019, 2020, 2021, 2022, 2023};
        Marca marcaX = marcas[(int) (Math.random() * 6)];
        Colores colorX = colores[(int) (Math.random() * 10)];

        Vehiculo autoAseguradoX = null;
        switch (marcaX) {
            case chevrolet:
                autoAseguradoX = new VehiculoChevrolet();
                ((VehiculoChevrolet) autoAseguradoX).setModelo(chevroletX[(int) (Math.random() * 2)]);
                break;
            case ford:
                autoAseguradoX = new VehiculoFord();
                ((VehiculoFord) autoAseguradoX).setModelo(fordX[(int) (Math.random() * 2)]);
                break;
            case dodge:
                autoAseguradoX = new VehiculoDodge();
                ((VehiculoDodge) autoAseguradoX).setModelo(dodgeX[(int) (Math.random() * 2)]);
                break;
            case rollsRoyce:
                autoAseguradoX = new VehiculoRollsRoyce();
                ((VehiculoRollsRoyce) autoAseguradoX).setModelo(rollsRoyceX[(int) (Math.random() * 2)]);
                break;
            case fiat:
                autoAseguradoX = new VehiculoFiat();
                ((VehiculoFiat) autoAseguradoX).setModelo(fiatX[(int) (Math.random() * 2)]);
                break;
            case renault:
                autoAseguradoX = new VehiculoRenault();
                ((VehiculoRenault) autoAseguradoX).setModelo(renaultX[(int) (Math.random() * 3)]);
                break;
        }
        autoAseguradoX.setMarca(marcaX);
        autoAseguradoX.setColor(colorX);
        autoAseguradoX.setTipo(tipo[(int) (Math.random() * 4)]);
        autoAseguradoX.setMotor("ABC" + motor++);
        autoAseguradoX.setChasis("ABCDE" + chasis++);
        autoAseguradoX.setAño(año[(int) (Math.random() * 9)]);

        return autoAseguradoX;
    }
}
