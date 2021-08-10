/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Escribir un programa que lea un número entero y devuelva el número de 
    dígitos que componen ese número. Por ejemplo, si introducimos el número 
    12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
    matemáticamente utilizando el operador de división. 
    Nota: recordar que las variables de tipo entero truncan los
    números o resultados.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;
        System.out.println("Ingresa un numero entero");
        int num = leer.nextInt();

        while (num > 0) {
            num = num / 10;
            contador++;
        }
        System.out.println("El numero ingresado tiene " + contador + " dígitos");

    }

}
