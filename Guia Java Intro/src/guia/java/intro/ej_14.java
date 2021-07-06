/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    14.Escriba un programa en el cual se ingrese un valor límite positivo, 
    y a continuación solicite números al usuario hasta que la suma de los
    números introducidos supere el límite inicial. 

 */
package guia.java.intro;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma = 0;
        System.out.println("Ingrese el limite inicial");
        int limite = leer.nextInt();
        
        do {
            System.out.println("Ingrese un numero");
                int n1 = leer.nextInt();
                suma = suma + n1;
                
        }while (limite>suma);
        
    }
    
}
