/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Realizar un algoritmo que rellene un vector de tamaño N con valores 
    aleatorios y le pida al usuario un numero a buscar en el vector. 
    El programa mostrará donde se encuentra el numero y si se encuentra 
    repetido

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_23 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int n;
        System.out.println("Ingresa el tamañ del arreglo");
        n=leer.nextInt();
        
        int[] vectorN = new int[n];
        
        //lleno con enteros aleatorios del 1 al 60
        for (int i=0;i<n;i++){
        //fuerzo que los generados sean enteros con (in) y luego limito que sean
        //desde 0 a 60 los aleatorios pero al final le sumo +1 para que nunca
        //me toque el 0 como aleatorio
            vectorN[i]=(int)(Math.random()*60)+1;;
        }
        
        System.out.println("Ingresa el numero a buscar");
        n=leer.nextInt();
    
    
    }
    
}
