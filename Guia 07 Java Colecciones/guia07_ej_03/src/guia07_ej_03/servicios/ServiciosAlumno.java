/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_ej_03.servicios;

import guia07_ej_03.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosAlumno {

    private Scanner leer;
    //aca creo mi Coleccion de Objetos Perros
    private ArrayList<Alumno> alumnosList;


 /**
  * constructor sin parametros (o vacio) pero 
  * que instacia el scanner y la lista
  */
    public ServiciosAlumno() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumnosList = new ArrayList();
    }

    public Alumno creaAlumno() {
        System.out.println("Ingrese el nombre del Alumno");
        String nombre = leer.next().toUpperCase();
        ArrayList<Integer> notas = new ArrayList(3);
        System.out.println("Ingrese las 3 notas del alumno");
        int n1 = leer.nextInt();
        notas.add(n1);
        int n2 = leer.nextInt();
        notas.add(n2);
        int n3 = leer.nextInt();
        notas.add(n3);
               
        Alumno a = new Alumno (nombre,notas);
        alumnosList.add(a);
        
        return a;
    }
    
    
}
 