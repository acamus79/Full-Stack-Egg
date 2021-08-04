/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Ejercicio1
Crear una clase llamada fracción que contenga 2 atributos
(denominador y numerador de cada fracción). 
Crear la clase servicio que contenga métodos para sumar, restar, 
multiplicar y dividir fracciones. 
Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

 */

package ej01;

import ej01.servicios.ServiciosFraccion;

/**
 *
 * @author Adrian E. Camus
 */
public class Principal01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        
        ServiciosFraccion sf = new ServiciosFraccion();
        sf.menu();
        
    }

}
