/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package guia2_POO.ej01;

import guia2_POO.ej01.entidades.Libro;
import guia2_POO.ej01.servicios.ServiciosLibros;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServiciosLibros sv = new ServiciosLibros();
        Libro l1 = sv.crearLibro();
        System.out.println(l1);
        
        
    }
}