/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package ej02;

import java.util.Scanner;

/**
 * 
 * @author Adrian E. Camus
 */
public class Control {

    public Tiempo creaReloj(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("VAMOS A SIMULAR UN RELOJ");
        System.out.println("Dame la hora...");
        int hr = leer.nextInt();
        System.out.println("Dame los minutos...");
        int min = leer.nextInt();
        System.out.println("y ahora los segundos");
        int seg = leer.nextInt();
        return new Tiempo(hr,min,seg);
    }
    
    public void imprimirHoraCompleta(Tiempo t){
        System.out.println(t.getHora()+" : "+t.getMinuto()+" : "+t.getSegundo()+"\n");
    }
    
    
    
}
