/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Realice un programa que calcule y visualice el valor máximo, el valor 
    mínimo y el promedio de n números (n>0). El valor de n se solicitará al 
    principio del programa y los números serán introducidos por el usuario.
    Realice dos versiones del programa, una usando el bucle “while” y otra 
    con el bucle “do -while”.

 */

package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el total de numeros");
        int n = leer.nextInt();
        int contador = 0, suma = 0, min = 1000000, max = 0;
        double promedio = 0;
//version While
//        while (contador != n) {
//            contador++;
//            System.out.println("Ingresa el numero " + contador + " de la muestra");
//            int num = leer.nextInt();
//            suma += num;
//            promedio = suma / n;
//
//            if (num > max) {
//                max = num;
//            }
//            if (num < min) {
//                min = num;
//            }
//        }
        //version do-while
        do{
            contador++;
            System.out.println("Ingresa el numero " + contador + " de la muestra");
            int num = leer.nextInt();
            suma += num;
            promedio = suma / n;

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }while (contador != n);
        
        System.out.println("Se analizaron " + n + " numeros");
        System.out.println("El mayor numero ingresado fue " + max);
        System.out.println("El menor numero ingresado fue " + min);
        System.out.println("La suma de todos los numeros es " + suma);
        System.out.println("El promedio de los numeros es " + promedio);
    }
}
