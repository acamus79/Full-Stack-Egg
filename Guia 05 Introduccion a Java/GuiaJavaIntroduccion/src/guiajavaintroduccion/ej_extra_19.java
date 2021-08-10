/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Crear una función rellene un vector con números aleatorios, pasándole 
    un arreglo por parámetro. Después haremos otra función o procedimiento 
    que imprima el vector.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_19 {
    
    public static void llenaVector(int[] vector, int n){
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10+1);
        }
        
        
    }
    
    public static void muestraVector(int[] vector, int n){
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i] + "] ");
        }
        System.out.println("\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de numeros");
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenaVector(vector,n);
        muestraVector(vector,n);
        
    }
    
}
