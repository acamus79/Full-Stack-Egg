/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
    
    3.Escribir un programa que pida tu nombre, lo guarde
    en una variable y lo muestre por pantalla.

*/
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Como te llamas?");
        String nombre = leer.next();
        System.out.println("Mucho gusto "+nombre);
        
        
    }
    
}
