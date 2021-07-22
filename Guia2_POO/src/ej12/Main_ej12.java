/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, 
get y set. Y los siguientes métodos: 

Ejemplo Date como atributo: DateAtributo

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
package ej12;

import ej12.entidades.Persona;
import ej12.servicios.ServiciosPersona;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiciosPersona sp = new ServiciosPersona();
        Persona p1 = sp.crearPersona();
        
        sp.mostrarPersona(p1);
        System.out.println("Es menor de 25 años: "+sp.menorQue(p1, 25));
        sp.calcularEdad(p1);
        
        
    }
    
}
