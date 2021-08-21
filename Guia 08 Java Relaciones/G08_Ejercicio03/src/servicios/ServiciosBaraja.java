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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosBaraja {

    Scanner leer;

    public Baraja creaBaraja() {
        Baraja b = new Baraja();
        Set<Carta> mazo = new HashSet();
               
        for (int i = 0; i < 40; i++) {
            Carta c = new Carta();
            mazo.add(c);
        }
        
        Iterator<Carta> it = mazo.iterator();
        
        while(it.hasNext()){
            
        }
        
        for (Carta carta : mazo) {
            System.out.println(carta);
        }
         
            
        
            
       


return b;

    }

    public void muestraBaraja(ArrayList<Carta> b){
        b.forEach(carta -> {
            System.out.println(carta);
        });
        
    }
    
    
}
