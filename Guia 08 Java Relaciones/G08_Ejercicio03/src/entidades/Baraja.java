/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package entidades;

import java.util.ArrayList;

/**
 * 
 * @author Adrian E. Camus
 */
public class Baraja {
    
    private int numero;
    private ArrayList<Carta> baraja;

    public Baraja() {
        this.baraja = new ArrayList();
    }

    public Baraja(int numero, ArrayList<Carta> baraja) {
        this.numero = numero;
        this.baraja = baraja;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "numero=" + numero + ", baraja=" + baraja + '}';
    }
    
}
