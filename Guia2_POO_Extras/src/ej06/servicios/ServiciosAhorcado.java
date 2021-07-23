/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.

• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra
o se quede sin intentos. Este método se llamará en el main.

 */

package ej06.servicios;

import ej06.entidades.Ahorcado;
import java.util.Scanner;

/**
 * 
 * @author Adrian E. Camus
 */
public class ServiciosAhorcado {
    
Scanner leer = new Scanner(System.in).useDelimiter("\n");
/*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas 
máxima. Con la palabra del usuario, pone la longitud de la palabra, como la 
longitud del vector. Después ingresa la palabra en el vector, letra por letra, 
quedando cada letra de la palabra en un índice del vector. Y también, guarda en
cantidad de jugadas máximas, el valor que ingresó el usuario y encontradas en 0.
*/    
    public Ahorcado crearJuego(){
        
        System.out.println("Ingresa la Palabra para adivinar");
        String palabra = leer.next();
        System.out.println("Ingresa la cantidad de jugadas maximas");
        int cantJug = leer.nextInt();
        String[] vector = new String[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
             vector[i]=palabra.substring(i);
        }
                       
        return new Ahorcado(vector,0,cantJug);
        
    }
            
/*
Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
Nota: buscar como se usa el vector.length.
*/
private static int longitud(Ahorcado a){
    return a.getPalabra().length;
}

/*
Método buscar(letra): este método recibe una letra dada por el usuario y 
busca si la letra ingresada es parte de la palabra o no. También informará si 
la letra estaba o no.
*/
private static void buscar(Ahorcado a, String l){

    for (String palabra : a.getPalabra()) {
        if (l.equals(palabra)) {
            System.out.println("La letra ingresada es parte de la palabra");
        }else {
            System.out.println("La letra no es parte de la palabra");
        }
    }
       
/*
Método encontradas(letra): que reciba una letra ingresada por el usuario y 
muestre cuantas letras han sido encontradas y cuantas le faltan. Este método 
además deberá devolver true si la letra estaba y false si la letra no estaba, 
ya que, cada vez que se busque una letra que no esté, se le restará uno a 
sus oportunidades.    
*/    
private static boolean encontradas(){
    
    return false;
    
}
    
   
    
    



}
