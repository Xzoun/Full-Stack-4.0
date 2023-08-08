/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package Servicio;

import java.util.Arrays;
//import java.util.Collections;

public class ArregloServicio {

    public void inicializarA(Double[] X) {
        for (int i = 0; i < X.length; i++) {
            Arrays.fill(X, i, i + 1, (Double) (Math.random() * 10));
        }
    }
    
    public void inicializarB(Double []A, Double[]X){
         for (int i = 0; i < 10; i++) {
            Arrays.fill(X, i, i + 1, A[i]);
        }         
            Arrays.fill(X, 10, 20, 0.5);
        
    }

    public void mostrar(Double[] X) {
        for (Double X1 : X) {
            System.out.print("[" + X1 + "]");
        }
        System.out.println(" ");
    }

    public void ordenar(Double [] X) {
        Double aux;
        for (int i = 1; i < X.length; i++) {
            aux = X[i];
            for (int j = i - 1;j >=0 && X[j]<aux;j--) {
                X[j+1]=X[j];
                X[j]=aux;
            }
        }
    }
    
    
    
//    public void ordenar(Integer[] X) {
//            Collections.sort( X , new ComparadorDeEnteros());
//    }

}
