/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Escriba un programa que pida una frase o palabra y valide si la primera
    letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
    de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
    se deberáimprimir “INCORRECTO”. 
    Nota: investigar la función Substring y equals() de Java.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Dame un frase");
        String frase = leer.next();
        
        frase = frase.toUpperCase();
        
        if ("A".equals (frase.substring(0,1))){
            System.out.println("CORRECTO!!");
        }
        else{
            System.out.println("INCORRECTO");
        }
    }
    
}
