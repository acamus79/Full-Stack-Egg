/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se 
    trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
    la función equals() de la clase String.

 */

package guiajavaintroduccion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa una letra");
        String var = leer.nextLine();
        var = var.toUpperCase();
        var = var.substring(0, 1);
        switch (var){
                case "A":System.out.println(var+" Es la primera Vocal");
                break;
                case "E":System.out.println(var+" Es la segunda Vocal");
                break;
                case "I":System.out.println(var+" Es la tercer Vocal");
                break;
                case "O":System.out.println(var+" Es la cuarta Vocal");
                break;
                case "U":System.out.println(var+" Es la quinta Vocal");
                break;
                default:
                            System.out.println("No hay vocal");
                            System.out.println("Presione ENTER para continuar");
                            System.in.read();// espera un Enter, no cualquier tecla
        }    
    }

}
