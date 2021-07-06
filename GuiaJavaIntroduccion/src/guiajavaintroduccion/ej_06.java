/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    6.Escribir un programa que lea un número entero por teclado y muestre
    por pantalla el doble, el triple y la raíz cuadrada de ese número.
    Nota: investigar la función Math.sqrt().

*/
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        
        //float raizcuad = Math.sqrt(num);
        //int doble = num+num;
        //int triple = num+num+num;
        
        System.out.println("El numero ingresado es: "+num);
        System.out.println("el doble es: "+num*2);
        System.out.println("el triple es: "+num*3);
        System.out.println("La raiz cuadrada es: "+Math.sqrt(num));
    }
    
}
