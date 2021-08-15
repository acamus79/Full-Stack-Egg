/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

HashSet de tipo Libro que guardará todos los 
libros creados.

 */
package guia07_extra_ej_03.servicios;

import guia07_extra_ej_03.entidades.Libro;
import java.util.*;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosLibro {
    Scanner leer;
    HashSet<Libro> biblioteca;

    public ServiciosLibro() {
        this.biblioteca = new HashSet<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    
    
    
    
}
