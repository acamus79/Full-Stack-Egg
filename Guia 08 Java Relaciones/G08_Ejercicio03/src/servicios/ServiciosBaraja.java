/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• barajar(): cambia de posición todas las cartas aleatoriamente.

• siguienteCarta(): devuelve la siguiente carta que está en la baraja, 
cuando no haya más o se haya llegado al final, se indica al usuario que 
no hay más cartas.

• cartasDisponibles(): indica el número de cartas que aún se puede repartir.

• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
número de cartas. En caso de que haya menos cartas que las pedidas, no
devolveremos nada, pero debemos indicárselo al usuario.

• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
ninguna indicárselo al usuario

• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se 
saca una carta y luego se llama al método, este no mostrara esa primera carta.


 */
package servicios;

import entidades.*;
import enumeradores.*;
import java.util.*;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosBaraja {

    private Scanner leer;
    private Baraja baraja;
    private ArrayList<Carta> mazo;
    

    public ServiciosBaraja() {
        this.baraja= new Baraja();
        this.mazo = new ArrayList(baraja.getBaraja());
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void muestraBaraja() {

        for (Object aux : mazo)
        {
            System.out.println(aux);
        }
    }

    public void barajar(){
        Collections.shuffle(mazo);
    }
    
    public Carta siguienteCarta(){
        return mazo.get(0);
    }
    
    
    
    public static Comparator<Carta> porPalo = new Comparator<Carta>() {
        @Override
        public int compare(Carta c1, Carta c2) {
        return c2.getPalo().compareTo(c1.getPalo());
        }
    };
    
    
    
    
    
}
