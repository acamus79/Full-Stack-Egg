/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Realizar un algoritmo que calcule la suma de todos los elementos 
    de un vector de tamaño N, con los valores ingresados por el usuario.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de numeros");
        int n = leer.nextInt();
        int suma = 0;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento "+(i+1));
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los "+n+" numeros es: " + suma);
        leer.close();
        
        
    }
    
}
