/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_ej_05.servicios;

import guia07_ej_05.entidades.Pais;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosPais {

    private static Scanner leer;
    //aca creo mi Coleccion de Objetos Pais
    private static HashSet<Pais> alMundo;

    public ServiciosPais() {
        ServiciosPais.leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosPais.alMundo = new HashSet();
    }

    private Pais creaPais() {
        Pais p = new Pais();
        System.out.println("Ingresa el Nombre del Pais");
        p.setNombre(leer.next());
        return p;
    }

    public void creaMundo() {
        char op;
        do {
            alMundo.add(creaPais());
            System.out.println("Desea agregar otro Pais?");
            op = leer.next().toUpperCase().charAt(0);
        } while (op != 'N');
    }

    
    
    
    
}
