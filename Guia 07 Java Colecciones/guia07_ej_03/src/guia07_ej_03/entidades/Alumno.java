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
    private String nombreAlumno;
    private ArrayList<Integer> notas;

    public Alumno() {
        this.notas = new ArrayList();
    }

    public Alumno(String nombreAlumno, ArrayList<Integer> notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", notas=" + notas + '}';
    }
    
}
