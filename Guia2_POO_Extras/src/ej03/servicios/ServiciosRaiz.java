/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej03.servicios;

import ej03.entidades.Raiz;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosRaiz {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raiz crearRaiz() {
        System.out.println("Ingresa valor de a");
        int a = leer.nextInt();
        System.out.println("Ingresa valor de b");
        int b = leer.nextInt();
        System.out.println("Ingresa valor de c");
        int c = leer.nextInt();
        return new Raiz(a, b, c);

    }
    
    

    
    
    
    
}
