/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras 
encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
Definir los siguientes métodos con los parámetros que sean necesarios:

 */
package ej06.entidades;

import java.awt.AWTEventMulticaster;
import java.util.Vector;

/**
 *
 * @author Adrian E. Camus
 */
public class Ahorcado {

    private int n;
    private int letrasEncontradas;
    private int jugadasMax;
    private char[] palabra = new char[n];
    //creo otro vector del mismo tamaño para ir mostrando las letras encontradas
    private char[] mostrar = new char[n];

//= {"electroencefalograma","psicofarmaco","prohibido","atencion","","credencial","coronavirus","vacuna","abogado","cirujano","noviembre","abril"};
//constructor vacio
    public Ahorcado() {

    }
//constructor con paramatros recibe un String y rellena el vector de caracteres

    public Ahorcado(String letras, int letrasEncontradas, int jugadas) {
        //recibe un String llamado letras a la longitud de ese string le asigno
        //n, y esa String utilizo el metodo toCharArray para convertirlo en mi
        //vector de caracteres
        this.n = letras.length();
        this.palabra = letras.toCharArray();
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadas;

    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadas() {
        return jugadasMax;
    }

    public void setJugadas(int jugadas) {
        this.jugadasMax = jugadas;
    }

    public char[] getMostrar() {
        return mostrar;
    }

    public void setMostrar(char[] mostrar) {
        this.mostrar = mostrar;
    }

}
