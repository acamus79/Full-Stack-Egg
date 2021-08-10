/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    10.Realizar un programa que solo permita introducir solo frases o 
    palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8
    de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
    en caso contrario, se deberáimprimir “INCORRECTO”. 
    Nota: investigar la función Lenght() en Java.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Dame un frase o palabra de 8 letras");
        String frase = leer.next();
        
        if (frase.length()==8){
            System.out.println("CORRECTO!!");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
        
        
    }
    
}
