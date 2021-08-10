/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ejemplosiniciales;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class EjemploScanner {
    
    public static void main(String[] args) 
    {

        Scanner leer = new Scanner(System.in); // Creamos el Scanner

        System.out.println("Ingrese un numero entero");
        int numEntero = leer.nextInt(); // Leer un entero

        System.out.println("Ingrese un numero real");
        double numReal = leer.nextDouble(); // Leer un real

        System.out.println("Ingrese un numero long");
        long numLong = leer.nextLong(); // Leer un long

        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine(); // Leer una cadena

        System.out.println("Ingrese un booleano");
        boolean logico = leer.nextBoolean(); // Leer un lÃ³gico 

        System.out.println("Numero Entero " + numEntero); // Se imprime el entero

        System.out.println("Numero Real " + numReal); // Se imprime el real

        System.out.println("Numero Long " + numLong); // Se imprime el long

        System.out.println("Cadena " + cadena);

        System.out.println("Logico " + logico);
        
    }
}
    
