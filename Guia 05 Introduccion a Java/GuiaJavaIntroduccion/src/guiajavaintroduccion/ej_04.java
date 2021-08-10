/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    4.Escribir un programa que pida una frase y la muestre toda 
    en mayúsculas y después toda en minúsculas. 
    Nota: investigar la función toUpperCase() y toLowerCase() en Java.

*/
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Dame un frase");
        String frase = leer.next();
        
        System.out.println("La frase en mayusculas queda "+frase.toUpperCase());
        System.out.println("La frase en minusculas queda "+frase.toLowerCase());
    }
    
}
