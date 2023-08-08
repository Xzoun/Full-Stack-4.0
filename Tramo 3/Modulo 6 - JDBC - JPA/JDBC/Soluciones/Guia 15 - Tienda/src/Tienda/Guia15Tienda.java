/*

 */
package Tienda;

import Tienda.servicios.Menu;

public class Guia15Tienda {

    public static void main(String[] args) throws Exception {
      
        Menu menu = new Menu();
        menu.cargarDB();
        menu.menu();
    }
}
