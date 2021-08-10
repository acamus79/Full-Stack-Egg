/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.

 */
package guia07_ej_03.entidades;

import java.util.ArrayList;

/**
 *
 * @author Adrian E. Camus
 */
public class Alumno {
    String nombreAlumno;
    ArrayList<Integer> notas;

    public Alumno() {
        
        
    }

    public Alumno(String nombreAlumno, ArrayList<Integer> notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }
    
}
