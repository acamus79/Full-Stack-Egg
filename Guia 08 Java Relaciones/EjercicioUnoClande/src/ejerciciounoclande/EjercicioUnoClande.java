/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.

 */
package ejerciciounoclande;

import entidades.*;

/**
 *
 * @author Adrian E. Camus
 */
public class EjercicioUnoClande {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Persona p1 = new Persona("Pedro","Delospalotes",29, 44040404,new Perro("Firulais", "Callejero",7));
        Persona p2 = new Persona("Pedro","Delospalotes",29, 44040404,new Perro("Colita","pichicho",3));
        
        System.out.println(p1);
        System.out.println(p2);
        
    }
    
}
