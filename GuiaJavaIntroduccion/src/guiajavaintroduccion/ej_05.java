/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    5.Dada una cantidad de grados centígrados se debe mostrar su 
    equivalente en grados Fahrenheit. 
    La fórmula correspondiente es: F = 32 + (9* C / 5).
 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("que temperatura hace?");
        float centigrados = leer.nextInt(); //si declaro uno como entero el resultado da entero
        
        float farenheit = 32+(9*centigrados/5);
        
        
        System.out.println("La temperatura en Farenheit es "+farenheit);
        
        
        
    }
    
}
