/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package servicios;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServicioAlquiler {
    
    
    Scanner leer;

    public ServicioAlquiler() {
    this.leer = new Scanner(System.in).useDelimiter("\n");
    
    }
    
    
    public void menu(){
        int op=0;
        System.out.println("***** PUERTO PIRATA *****");
        System.out.println("*1. Velero              *");
        System.out.println("*2. Barco con Motor     *");
        System.out.println("*3. Yate de lujo        *");
        System.out.println("*4. Salir               *");
        System.out.println("*************************");
        op=leer.nextInt();
     
        
        
        
    }
    
    
    
}
