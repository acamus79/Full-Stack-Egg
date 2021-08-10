/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Crear un programa que dibuje una escalera de números, donde cada línea 
    de números comience en uno y termine en el número de la línea. 
    Solicitar la altura de la escalera al usuario al comenzar. 
    Ejemplo: si se ingresa el número 3: 
    1
    12
    123

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;
        System.out.println("Ingresa un numero entero");
        int num = leer.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println("");
        }
    }
}
