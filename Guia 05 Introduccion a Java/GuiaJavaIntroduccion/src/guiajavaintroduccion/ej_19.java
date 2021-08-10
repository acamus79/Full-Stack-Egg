/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    19.Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá 
    dibujar lo siguiente:
    
    * * * *
    *     *
    *     *
    * * * *

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
                int a;
		int b;
		int n;
		System.out.println("ingrese un entero");
		n = leer.nextInt();
		for (a=1;a<=n;a++) {
			for (b=1;b<=n;b++) {
				if (a==1 || a==n || b==1 || b==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}

        
    }
    
