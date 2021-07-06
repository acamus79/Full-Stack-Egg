/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    2.Escribir un programa que pida dos números enteros por teclado y calcule 
    la suma de los dos. 
    El programa deberá después mostrar el resultado de la suma
*/


package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros enteros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        int suma = n1+n2;
        
        System.out.println("La suma de los dos numeros es "+suma);
        
    }
    
}
