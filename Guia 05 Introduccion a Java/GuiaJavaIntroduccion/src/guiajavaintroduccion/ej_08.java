/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    8.Crear un programa que dado un numero determine si es par o impar.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entero");
        int n1 = leer.nextInt();
        
        if (n1%2==0){
            System.out.println("El numero ingresado "+n1+" es PAR");
        }
        else{
            System.out.println("El numero ingresado "+n1+" es IMPAR");
        }
    }
    
}
