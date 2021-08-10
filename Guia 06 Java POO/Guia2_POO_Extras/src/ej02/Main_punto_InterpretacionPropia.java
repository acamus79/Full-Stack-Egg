/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Mismo enunciado interpretacion propia
discusion foro:

https://moodle.eggeducacion.app/mod/forum/discuss.php?d=2198#p8945

 */
package ej02;

import ej02.entidades.Punto;
import ej02.servicios.ServiciosPunto;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_punto_InterpretacionPropia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServiciosPunto sp = new ServiciosPunto();
        Punto p1 = sp.crearPuntos();
        Punto p2 = sp.crearPuntos();
        sp.calculaDistancia(p1, p2);
        
    }
    
}
