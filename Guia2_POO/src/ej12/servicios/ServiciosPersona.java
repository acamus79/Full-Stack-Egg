/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej12.servicios;

import ej12.entidades.Persona;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMM yyyy");
    
    /*
Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.    
     */
    public Persona crearPersona() {
        System.out.println("\n *** NOMBRE ***");
        System.out.println("Ingrese el nombre de la Persona");
        String p1 = leer.next();
        System.out.println("\n *** FECHA DE NACIMIENTO ***");
        System.out.println("Ingrese el Dia de nacimiento (dd)");
        int d = leer.nextInt();
        System.out.println("Ingrese el Mes de nacimiento (mm)");
        int m = leer.nextInt();
        System.out.println("Ingrese el Año de nacimiento (aaa)");
        int a = leer.nextInt();

        LocalDate fecha = LocalDate.of(a, m, d);

        return new Persona(p1, fecha);
    }

    /*
Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.    
     */
    public void calcularEdad(Persona p) {
        LocalDate ahora = LocalDate.now();
        int year = ahora.getYear() - p.getFechaNac().getYear();
        System.out.println("Edad: " + year);
    }

    /*
Agregar a la clase el método menorQue(int edad) que recibe como parámetro 
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
     */
    public boolean menorQue(Persona p, int edad) {
        LocalDate ahora = LocalDate.now();
        int year = ahora.getYear() - p.getFechaNac().getYear();
        return edad > year;
    }

    /*
Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.    
     */
    public void mostrarPersona(Persona p) {
        System.out.println("NOMBRE             : " + p.getNombre());
        System.out.println("FECHA DE NACIMIENTO: " + p.getFechaNac());
    }
}
