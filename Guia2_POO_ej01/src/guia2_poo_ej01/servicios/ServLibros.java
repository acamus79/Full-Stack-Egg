/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia2_poo_ej01.servicios;

import guia2_poo_ej01.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServLibros {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        System.out.println("Ingresa el ISNB del Libro");
        String isnb = leer.next();
        System.out.println("Ingresa el Titulo del Libro");
        String titulo = leer.next();
        System.out.println("Ingresa el Autor del Libro");
        String autor = leer.next();
        System.out.println("Ingresa la cantidad de Paginas");
        int nroPaginas = leer.nextInt();
        
        return new Libro(isnb,titulo,autor,nroPaginas);
        
    }
    
}
