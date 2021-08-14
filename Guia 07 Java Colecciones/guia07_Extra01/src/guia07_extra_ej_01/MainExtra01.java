/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).

 */
package guia07_extra_ej_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class MainExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> numeros = new ArrayList<>();
        Integer num = 0, suma = 0;

        do {
            System.out.println("Ingrese un numero entero");
            num = leer.nextInt();
            if (num != 99) {
                numeros.add(num);
                suma += num;
            } else {
                System.out.println("Escribiste 99...Chau!!\n");
            }

        } while (num != 99);

        System.out.println("Se ingresaron " + numeros.size() + " numeros");
        System.out.println("La suma de todos los numeros es: " + suma);
        System.out.println("La media de los numeros ingresados es: " + suma / numeros.size()+"\n");

    }

}
