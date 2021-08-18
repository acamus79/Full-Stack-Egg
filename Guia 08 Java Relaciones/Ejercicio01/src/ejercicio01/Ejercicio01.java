/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a 
contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y 
tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y 
Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a 
tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y 
por ultimo, mostrar desde la clase Persona, la información del Perro y de la 
Persona.


 */
package ejercicio01;

import ejercicio01.entidades.Perro;
import java.util.Scanner;
import ejercicio01.entidades.Persona;

/**
 *
 * @author Adrian E. Camus
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //String nombre, String raza, String tamaño, byte edad
        Perro m1 = new Perro("Chiquito","Beagle","Pequeño",(byte)2);
        Perro m2 = new Perro("Lola","Doverman","Grande",(byte)3);
        
        Persona p1 = new Persona("El pelado","de EGG","20202020",30,m1);
        Persona p2 = new Persona("Franchesca","de EGG","31212121",25,m2);
        
        System.out.println(p1);
        System.out.println(p2);
        
        
        
        
    }
    
}
