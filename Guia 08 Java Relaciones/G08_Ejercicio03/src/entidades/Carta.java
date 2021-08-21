/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package entidades;

import enumeradores.*;

/**
 * 
 * @author Adrian E. Camus
 */
public class Carta {

    private Numero numero;
    private Palo palo;

    public Carta() {
    }

    public Carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

       public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return  numero + " de " + palo;
    }
    
    


}
