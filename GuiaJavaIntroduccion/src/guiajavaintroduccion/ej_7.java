/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
    
    7.Implementar un programa que dado dos números enteros determine 
    cuál es el mayor y lo muestre por pantalla.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros enteros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        if (n1>n2){
            System.out.println("El numero "+n1+" es el mayor");
                               
        }
        else {
            System.out.println("El numero "+n2+" es el mayor");
        }
            
        
    }
    
}
