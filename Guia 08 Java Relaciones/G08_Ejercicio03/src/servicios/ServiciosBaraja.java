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
import java.util.*;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosBaraja {
    
    private Baraja baraja;
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> monton;
    
    public ServiciosBaraja() {
        this.baraja = new Baraja();
        this.mazo = new ArrayList(baraja.getBaraja());
    }
    
    public void muestraBaraja() {
        
        for (Carta aux : mazo)
        {
            System.out.println(aux);
        }
    }
    
    public void barajar() {
        System.out.println("BARAJA MEZCLADA");
        Collections.shuffle(mazo);
    }
    
    public Carta siguienteCarta() {
        Carta aux = mazo.get(0);
        mazo.remove(0);
        monton.add(aux);
        return aux;
    }
    
    public void darCartas(int cantidad) {
        ArrayList<Carta> mano = new ArrayList();
        
        for (int i = 0; i < cantidad; i++)
        {
            mano.add(mazo.get(i));
            monton.add(mazo.get(i));
            mazo.remove(i);
        }
        
        System.out.println("La mano dada es");
        for (Carta carta : mano)
        {
            System.out.println(carta);
        }
        
    }
    
    public void muestraMonton() {
        for (Carta aux : monton)
        {
            System.out.println(aux);
        }
    }
    
    public static Comparator<Carta> porPalo = new Comparator<Carta>() {
        @Override
        public int compare(Carta c1, Carta c2) {
            return c1.getPalo().compareTo(c2.getPalo());
        }
    };
    
    public static Comparator<Carta> porNumero = new Comparator<Carta>() {
        @Override
        public int compare(Carta c1, Carta c2) {
            return c1.getNumero().compareTo(c2.getNumero());
        }
    };
    
        
    public void ordenaBaraja() {
        System.out.println("BARAJA ORDENADA");
        Collections.sort(mazo, porNumero);
        Collections.sort(mazo, porPalo);
        
        for (Carta carta : mazo)
        {
            System.out.println(carta);
        }
    }
    
}
