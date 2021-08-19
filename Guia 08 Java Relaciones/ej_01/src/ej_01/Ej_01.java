/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a 
contar de dos clases. 

Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a 
tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y 
por ultimo, mostrar desde la clase Persona, la información del Perro y de la 
Persona.


 */
package ej_01;

import ej_01.entidades.Perro;
import ej_01.servicio.ServicioAdopcion;

/**
 *
 * @author Adrian E. Camus
 */
public class Ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioAdopcion sa = new ServicioAdopcion();
        
        Perro choco1 = new Perro("Firulais", 7);
        Perro choco2 = new Perro("Ares", 2);
        
        
        sa.llenaPerro(choco1);
        sa.llenaPerro(choco2);
   
        
    }
    
}
