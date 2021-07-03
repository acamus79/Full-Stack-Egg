/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package inicial.definiciones;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class InicialDefiniciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TIPOS DE DATOS DEFINIR
        
        int num = 0;                    //tipo ENTERO
        double numReal = 0.0;           //tipo Real
        String cadena = "Hola Mundo";   //tipo CADENA
        char letra = 'A';               //tipo CARACTER
        boolean logico = true;          //tipo LOGICO

        //ESCRIBIR (como atajo sout + tab)
        
        System.out.println("El texto que quiero mostrar: " + cadena);

        System.out.println("Hola mundo"); // Escribir normal

        System.out.print("Hola"); // Escribir Sin Saltar

        System.out.print("Mundo"); // Escribir Sin Saltar

        int numero = 20;

        System.out.println("El valor del numero es: " + numero); // Mostramos el valor de numero

        //LEER (mucha atencion!)
        //Un nuevo objeto de la clase Scanner llamado 'leer'
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar una cadena de texto");
        String palabra = leer.next(); //Leer la variable 'palabra'

        System.out.println("Ingresar un numero entero");
        num = leer.nextInt(); //Leer un entero

        System.out.println("Ingrese un Real");
        numReal = leer.nextDouble();

        System.out.println("Ingrese un valor Booleano");
        logico = leer.hasNextBoolean();

        System.out.println("Ingrese un caracter");
        letra = leer.next().charAt(0);

        System.out.println("La cadena ingresada fue: " + palabra);
        System.out.println("El entero ingresado fue: " + num);
        System.out.println("El numero real ingresado fue: " + numReal);
        System.out.println("El valor logico ingresado es: " + logico);
        System.out.println("El caracter ingresado fue: " + letra);

    }

}
