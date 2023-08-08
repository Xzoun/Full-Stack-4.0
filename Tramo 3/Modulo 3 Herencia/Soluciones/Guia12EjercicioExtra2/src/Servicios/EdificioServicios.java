/*
La clase edificio tendrá como métodos:

• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo
• Clase EdificioDeOficinas 
*/
package Servicios;

import Entidad.Edificio;

public abstract class EdificioServicios {
    public abstract Double calcularSuperficie(Edificio edificio);
    public abstract Double calcularVolumen(Edificio edificio);
}
