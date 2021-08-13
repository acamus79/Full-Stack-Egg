/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Se requiere un programa que lea y guarde países, y para evitar que se ingresen 
repetidos  usaremos  un  conjunto.  El  programa  pedirá  un  país  en  un  
bucle,  se guardará  el  país  en  el  conjunto  y  después  se  le  preguntará
al  usuario  si  quiere guardar  otro  país  o  si  quiere  salir,  si  decide
salir,  se  mostrará  todos  los  países guardados en el conjunto.  
Después  deberemos  mostrar  el  conjunto  ordenado  alfabéticamente  para  
esto recordar como se ordena un conjunto. 

Y  por  ultimo,  al  usuario  se  le  pedirá  un  país  y  se  recorrerá  el 
conjunto  con  un Iterator, se buscará el país en el conjunto y si está en el 
conjunto se eliminará el país que ingresó el usuario y se mostrará el conjunto.
Si el país no se encuentra en el conjunto se le informará al usuario. 

 */
package guia07_ej_05;

import guia07_ej_05.servicios.ServiciosPais;

/**
 *
 * @author Adrian E. Camus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServiciosPais sp = new ServiciosPais();
        sp.creaMundo();
        sp.muestraMundo();
        
        
    }
    
}
