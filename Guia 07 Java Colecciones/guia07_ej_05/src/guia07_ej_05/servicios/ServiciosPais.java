/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_ej_05.servicios;

import guia07_ej_05.entidades.Pais;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosPais {

    private static Scanner leer;
    //aca creo mi Coleccion de Objetos Pais
    private static Set<Pais> alMundo;

    public ServiciosPais() {
        ServiciosPais.leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosPais.alMundo = new TreeSet();
    }

    private Pais creaPais() {
        System.out.println("Ingresa el Nombre del Pais");
        String nomb = leer.next().toUpperCase();
        return new Pais(nomb);
    }

    public void creaMundo() {
        char op;
        do {
            alMundo.add(creaPais());
            System.out.println("Desea agregar otro Pais?");
            op = leer.next().toUpperCase().charAt(0);
        } while (op != 'N');
    }

    public void muestraMundo(){
        alMundo.forEach(System.out::println);
    }
    
    
    
    
}
