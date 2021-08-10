/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
de String) y su longitud. En el main se creará el objeto y se le pedirá al 
usuario que ingrese una frase que puede ser una palabra o varias palabras 
separadas por un espacio en blanco  y  a  través  de  los  métodos  set,  se  
guardará  la  frase  y  la  longitud  de  manera automática según la longitud 
de la frase ingresada. Deberá además implementar los siguientes métodos:

 */
package ej08.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Cadena {
    
    private String frase;
    private int longFrase;
        
    public Cadena(String frase) {
        this.frase = frase;
    }

    
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongFrase() {
        return frase.length();
    }

    @Override
    public String toString() {
        return frase;
    }

      
    
}
