/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package ej05.servicios;

import ej05.entidades.Calendario;
import java.util.Scanner;

/**
 * 
 * @author Adrian E. Camus
 */
public class ServiciosCalendario {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void adivinaCalendario(){
        Calendario c = new Calendario();
        int indice = (int) (Math.random() * 12);
        
        System.out.println("Adivine el mes secreto. \n" +
        "Introduzca el nombre del mes en minúsculas: ");
        String adivina = leer.next().toLowerCase();
        
        while (!adivina.equals(c.getCalendario(indice))){
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            adivina = leer.next().toLowerCase();
        }
        if (adivina.equals(c.getCalendario(indice))){
            System.out.println("¡Ha acertado!");
        }
    }
}
