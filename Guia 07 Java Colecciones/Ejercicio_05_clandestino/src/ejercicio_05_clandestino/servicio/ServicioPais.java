/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ejercicio_05_clandestino.servicio;

import ejercicio_05_clandestino.entidad.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServicioPais {

    Scanner leer;
    HashSet<Pais> mundo;

    public ServicioPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mundo = new HashSet();
    }

    /**
     * Metodo que crea objetos de la entidad Pais
     *
     * @return Pais
     */
    public Pais creaPais() {
        Pais p = new Pais();
        System.out.println("Ingrese el nombre del Pais");
        p.setNombre(leer.next().toUpperCase());
        return p;
    }

    /**
     * Metodo que agrega paises al conjunto HashSet mundo.
     */
    public void llenaMundo() {
        char opcion;
        do {
            mundo.add(creaPais());
            System.out.println("Desea agregar otro pais? S/N");
            opcion = leer.next().toUpperCase().charAt(0);
        } while (opcion != 'N');
    }

    public void muestraMundo() {
        for (Pais aux : mundo) {
            System.out.println(aux);
        }
    }

    public void searchAndDestroy() {
        boolean bandera = false;
        Iterator<Pais> it = mundo.iterator();
        System.out.println("Ingrese el Pais a destruir");
        String buscado = leer.next().toUpperCase();

        //mientras exista un proximo elemento hacer
        while (it.hasNext()) {
//si el proximo elemento de la iteracion es igual al pais buscado
            if (it.next().getNombre().equalsIgnoreCase(buscado)) {
                it.remove();
                bandera = true;
            } else {
                bandera = false;
            }
        }
        if (bandera) {
            System.out.println("Se destruyo el pais " + buscado);
        } else {
            System.out.println("No existe el pais");
        }
    }

}
