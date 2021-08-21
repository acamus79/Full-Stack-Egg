/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego

 */
package servicio;

import entidades.Jugador;
import entidades.Revolver;
import java.util.*;

/**
 *
 * @author Drok
 */
public class RuletaRusa {

    Revolver colt;

    ArrayList<Jugador> listaJugador;
    Scanner leer;

    public RuletaRusa() {
        this.colt = new Revolver();
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaJugador = new ArrayList();
    }

    /**
     * llenarJuego: este método recibe la cantidad de jugadores para guardarlos
     * en la Lista de Jugadores del juego.
     * @param cantJugadores int entre 1 y 6
     */
    public void llenarJuego() {
        int cantJugadores;
        System.out.println("Cuantos jugadores ?");
        cantJugadores = leer.nextInt();
        
        if(cantJugadores>7 || cantJugadores<=0){
            cantJugadores =6;
            System.out.println("Solo pueden jugar 6");
        }
                        
        for (int i = 0; i < cantJugadores; i++) {
                Jugador j = new Jugador();
                System.out.println("Ingrese el nombre del Jugador");
                j.setNombre(leer.next());
                j.setId(i+1);
                listaJugador.add(j);
            } 
        }

    
    /**
     * cada ronda consiste en un jugador que se apunta con el revolver y aprieta
     * el gatillo. Sí el revolver tira el jugador se muere se termina el juego,
     * y los otros se rien sino se muere, se pasa al siguiente jugador hasta que
     * uno se muera. Si o si alguien se tiene que morir. Al final del juego, 
     * se debe mostrar que jugador se Murio.
     */
    public void ronda(){
        boolean bandera = false;
        int cont = 1;
        Jugador j = new Jugador();
        
        do{
            
            
        for (Jugador aux : listaJugador) {
            System.out.println("**** RONDA ******");
            System.out.println("******* "+cont+" *******");
            cont++;
            j=aux;
            colt.siguienteDisparo();
            if(colt.matar()){
                j.setMuerto(true);
                bandera = true;
                System.out.println(j.toString());
                break;
            }       
        }
        
        }while(!bandera);
        
        
        
        
    }

}
