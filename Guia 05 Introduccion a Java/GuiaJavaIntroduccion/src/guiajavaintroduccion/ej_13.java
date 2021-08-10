/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    13.Escriba un programa que valide si una nota está entre 0 y 10, sino 
    está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta. 

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int nota = 11;
        
        while (nota >= 10 && nota >= 0) {
            System.out.println("Ingrese una nota del 0 a 10");
            nota = leer.nextInt();
        if (nota <= 10 && nota >= 0){
            System.out.println("La nota fue ingresada correctamente");
        }
        
        } 
        
        
    }
    
}
