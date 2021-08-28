/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

que tiene una sala con un conjunto de
asientos (8 filas por 6 columnas)

 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Adrian E. Camus
 */
public class Sala {
    
    Butaca[][] butacas;
    private ArrayList<ArrayList<String>> salaCine;

    public Sala() {
        this.salaCine = new ArrayList();
        ArrayList<String> aux = new ArrayList<String>();
        aux.add("[ ]");
        aux.add("[ ]");
        aux.add("[ ]");
        aux.add("[ ]");
        aux.add("[ ]");
        aux.add("[ ]");

        for (int i = 0; i < 8; i++)
        {
            this.salaCine.add(aux);
        }
    }

    public ArrayList<ArrayList<String>> getSalaCine() {
        return salaCine;
    }

    public void setSalaCine(ArrayList<ArrayList<String>> salaCine) {
        this.salaCine = salaCine;
    }

    
    
}
