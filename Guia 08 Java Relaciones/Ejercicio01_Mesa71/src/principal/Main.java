/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a 
contar de dos clases. 

Clase Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
Clase Persona: con atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros.

Después, vamos a tener que pensar la lógica necesaria para asignarle a 
cada Persona un Perro y por ultimo, mostrar desde la clase Persona, 
la información del Perro y de la Persona.


 */
package principal;

import entidades.*;
import servicio.ServicioAdopcion;

/**
 *
 * @author Mesa 71
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("AGUANTE LA 71");
        ServicioAdopcion sa = new ServicioAdopcion();

        //String nombre, Integer edad, Raza raza, Tamanio tamanio
        Perro m1 = new Perro("Lolo", 4);
        sa.adoptaPerro(m1);
        Perro m2 = new Perro("Dinamita", 1);
        sa.adoptaPerro(m2);

        //String nombre, String apellido, Integer edad, long dni, Perro mascota
        Person p1 = new Person("Dolape", "DeEGG", 36, 27422257, m1);
        Person p2 = new Person("Juan", "Perez", 40, 27424587, m2);

        System.out.println(p1);
        System.out.println(p2);

    }

}
