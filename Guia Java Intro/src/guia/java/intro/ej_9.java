/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    9.Crear un programa que pida unafrase y si esa frase es igual a “eureka” 
    el programa pondrá un mensaje de Correcto, sino mostrará un mensaje 
    de Incorrecto. Nota: investigar la función equals() en Java.

 */
package guia.java.intro;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Dame un frase");
        String frase = leer.next();
        
        if ("eureka".equals(frase.toLowerCase())){
            System.out.println("CORRECTO!!");
        }
        else{
            System.out.println("INCORRECTO");
        }
    
    }
    
}
