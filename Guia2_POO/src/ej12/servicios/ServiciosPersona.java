/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.

• Agregar a la clase el método menorQue(int edad) que recibe como parámetro 
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.

• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.

 */

package ej12.servicios;

import ej12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author Adrian E. Camus
 */
public class ServiciosPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
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
        
        Date fecha = new Date(a-1900, m - 1, d);
        
        return new Persona(p1, fecha);
    }
    
    public void calcularEdad (Persona p){
        
    }
    
    
}
