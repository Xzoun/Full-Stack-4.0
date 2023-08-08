
package Servicio;

import java.util.Comparator;

public class ComparadorDeEnteros implements Comparator<Integer>  {
//Si el primero va antes que elsegundo numero negativo
//Si es al reves numero positivo
//Sino cero
  

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }


}
