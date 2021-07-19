/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Crear una clase llamada Libro que contenga los siguientes atributos:
    ISBN, Título, Autor, Número de páginas,y un constructor con todos los 
    atributos pasados por parámetro y un constructor vacío.
    Crear un método para cargar un libro pidiendo los datos al usuario y 
    luego informar mediante otro método el número de ISBN, el título, el 
    autor del libro y el numero de páginas.

 */

package ej01;

import ej01.entidades.Libro;
import ej01.servicios.ServiciosLibros;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServiciosLibros sv = new ServiciosLibros();
        Libro l1 = sv.crearLibro();
        System.out.println(l1);
        
        
    }
}