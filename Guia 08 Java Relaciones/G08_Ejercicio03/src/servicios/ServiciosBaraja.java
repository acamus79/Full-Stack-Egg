/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
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

    Scanner leer;

    public Baraja creaBaraja() {
        Baraja b = new Baraja();
//        Set<Carta> mazo = new HashSet();
        List<Carta> mazo = new ArrayList();
        
        for (int i = 0; i < 40; i++) {
            Carta c = new Carta();
            c.setPalo(Palo.getRandom());
            c.setNumero(Numero.getRandom());
            mazo.add(c);
        }
        
        Iterator<Carta> it = mazo.iterator();
        
        while(it.hasNext()){
            it.next().setNumero(Numero.getRandom());
            
        }
        
        while(it.hasNext()){
            it.next().setPalo(Palo.getRandom());
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
