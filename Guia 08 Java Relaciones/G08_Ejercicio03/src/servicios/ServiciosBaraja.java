/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package servicios;

import entidades.*;
import enumeradores.Palo;
import java.util.Scanner;

/**
 * 
 * @author Adrian E. Camus
 */
public class ServiciosBaraja {

    Scanner leer;
    
    public Baraja creaBaraja(){
        
        Baraja b = new Baraja();
        
        for (int i = 0; i < 40; i++){
            Carta c = new Carta();
            for (Palo aux : Palo.values()){
                c.setPalo(aux);
                
            }
            
        }
        
        return null;
        
    }
    
    
    
}
