/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_ej_05.servicios;

import guia07_ej_05.entidades.Pais;
import java.util.*;

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
        //para que se ordene solo implemento el conjunto como TreeSet
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

        muestraMundo();
    }

    private void muestraMundo() {
        alMundo.forEach(System.out::println);
    }

    public void searchAndDestroy() {
        boolean bandera = true;
        Iterator<Pais> it = alMundo.iterator(); //Iterador de Pais(es) del cunjunto alMundo
        System.out.println("Ingrese el pais a buscar y destruir");
        String buscado = leer.next().toUpperCase();

        /* con it.next() obtengo el Objeto de la clase Pais de las iteraciones  
        entonces con un condicional puedo preguntar si el el nombre del objeto
        que me da el Iterator es igual al nombre buscado del pais    
        si el condicional es verdadero con it.remove(); elimino el objeto
         */
        while (it.hasNext()) {

            if (it.next().getNombre().equals(buscado)) {
                it.remove();
                bandera = true;
                break;
            } else {
                bandera = false;
            }
        }

        if (bandera) {
            System.out.println("Encontre el Pais " + buscado + " y lo elimine del Mundo");
        } else {
            System.out.println("No existe en este mundo el pais " + buscado);
        }
        
        muestraMundo();
    }

}
