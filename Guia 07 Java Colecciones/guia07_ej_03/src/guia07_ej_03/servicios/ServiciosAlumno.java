/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_ej_03.servicios;

import guia07_ej_03.entidades.Alumno;
import java.util.ArrayList;
import java.util.HashSet;
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
        HashSet<Integer> notas = new HashSet(3);
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
    
    public void crearAlumnos(){
        char op;
        do {
            creaAlumno();
            System.out.println("Desea agregar otro Alumno"
                    + "'S' para Continuar o 'N' para Salir");
            op = leer.next().toUpperCase().charAt(0);
        } while (op != 'N');
    }
 
    public void notaFinal(){
        System.out.println("Ingrese el nombre del alumno a calcular");
        String buscado = leer.next().toUpperCase();
        
        
    }
}
 