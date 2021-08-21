/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package servicios;

import entidades.*;
import enumeradores.Numero;
import enumeradores.Palo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosBaraja {

    Scanner leer;

    public Baraja creaBaraja() {
        Baraja b = new Baraja();
        for (int i = 0; i < 40; i++) {
            Carta c = new Carta();
            b.getBaraja().add(c);
        }
        Iterator it = b.getBaraja().iterator();
        
        while(it.hasNext()){
            
        }


return b;

    }

    public void muestraBaraja(ArrayList<Carta> b){
        b.forEach(carta -> {
            System.out.println(carta);
        });
        
    }
    
    
}
