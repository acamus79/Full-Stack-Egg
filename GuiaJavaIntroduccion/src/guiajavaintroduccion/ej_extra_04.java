/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
    muestre su equivalente en romano.

 */

package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa un numero del 1 al 10");
            int num = leer.nextInt();
            
            switch (num){
                    case 1:System.out.println(num+" En romanos es I");
                    break;
                    case 2:System.out.println(num+" En romanos es II");
                    break;
                    case 3:System.out.println(num+" En romanos es III");
                    break;
                    case 4:System.out.println(num+" En romanos es IV");
                    break;
                    case 5:System.out.println(num+" En romanos es V");
                    break;
                    case 6:System.out.println(num+" En romanos es VI");    
                    break;
                    case 7:System.out.println(num+" En romanos es VII");
                    break;
                    case 8:System.out.println(num+" En romanos es VIII");
                    break;
                    case 9:System.out.println(num+" En romanos es IX");
                    break;
                    case 10:System.out.println(num+" En romanos es X");
                    break;
                    default:
                        System.out.println("Ingresaste un valor que no corresponde");
                        
            }
        
    }

}
