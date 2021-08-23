/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package entidades;

import enumeradores.Palo;
import java.util.*;

/**
 *
 * @author Adrian E. Camus
 */
public class Baraja {

    private int numero;
    private Set<Carta> baraja;

    public Baraja() {
        this.baraja = new HashSet();
        //CUATRO VUELTAS 
        for (int i = 0; i < 4; i++)
        {
            //12 VUELTAS EMPEZANDO DESDE EL 1
            for (int j = 1; j < 13; j++)
            {
                if (j != 8 && j != 9)
                {//AGREGO UNA CARTA DE CADA PALO POR VUELTA
                    this.baraja.add(new Carta(j, Palo.BASTOS));
                    this.baraja.add(new Carta(j, Palo.COPAS));
                    this.baraja.add(new Carta(j, Palo.ESPADA));
                    this.baraja.add(new Carta(j, Palo.ORO));
                }
            }
        }

    }

    public Baraja(int numero, Set<Carta> baraja) {
        this.numero = numero;
        this.baraja = baraja;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Set<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(Set<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "numero=" + numero + ", baraja=" + baraja + '}';
    }

}
