/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

2. Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, 
el juego se trata de un número de jugadores, que, con un revolver de agua, 
el cual posee una sola carga de agua, se dispara y se moja. 
Las clases a hacer del juego son las siguientes:

Clase Jugador: esta clase posee los siguientes atributos: id (representa el
número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” 
por ejemplo) y mojado (indica si está mojado o no el jugador). El número 
de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no 
está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los 
métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta, 
aprieta el gatillo y si el revolver tira el agua, el jugador se moja. 
El atributo mojado pasa a false y el método devuelve true, sino false.



 */
package ej_02;

import ej_02.entidades.Revolver;
import ej_02.servicio.RuletaRusa;

/**
 *
 * @author Adrian E. Camus
 */
public class Ej_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RuletaRusa rr = new RuletaRusa();
        Revolver r = new Revolver();
        rr.armaMesa(8, r);
        rr.ronda();
        rr.muestraJugadores();
    }
    
}
