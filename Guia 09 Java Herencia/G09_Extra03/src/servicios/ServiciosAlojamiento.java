/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar un sistema de consulta que le permite al usuario consultar
por diferentes criterios: • todos los alojamientos. • todos los
hoteles de más caro a más barato. • todos los campings con
restaurante • todos las residencias que tienen descuento.

 */
package servicios;

import comparadores.ComparaHotel;
import entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosAlojamiento {

    Scanner leer;

    public ServiciosAlojamiento() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void menu(ArrayList<Alojamiento> alojamientos) {
        int op = 0;
        do {
            System.out.println("\n\n\n");
            System.out.println("******   ALOJAMIENTOS   ******");
            System.out.println("* 1. Todos los Alojamientos  *");
            System.out.println("* 2. Hoteles por precio      *");
            System.out.println("* 3. Campings c/restorant    *");
            System.out.println("* 4. Residencias c/descuento *");
            System.out.println("* 5. Salir                   *");
            System.out.println("******************************");
            System.out.println("\nSelecciona una opcion");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    muestraTodo(alojamientos);
                    break;
                case 2:
                    hotelesPorPrecio(alojamientos);
                    break;
                case 3:
                    campingResto(alojamientos);
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("CHAU!!!");
                default:
                    System.out.println("Ingreso una opcion no valida");
            }

        } while (op != 5);
    }

    private void muestraTodo(ArrayList<Alojamiento> lista) {

        lista.forEach(aux -> {
            System.out.println(aux);
        });

    }

    private void hotelesPorPrecio(ArrayList<Alojamiento> lista) {

        ArrayList<Alojamiento> auxiliar = new ArrayList();

        lista.stream().filter(aux -> (aux instanceof Hotel)).forEachOrdered(aux -> {
            auxiliar.add(aux);
        }
        );

        ArrayList<Hotel> hoteles = new ArrayList(auxiliar);
        Collections.sort(hoteles, porPrecio);

        hoteles.forEach(aux -> {
            System.out.println(aux);
        });

    }

    private void campingResto(ArrayList<Alojamiento> lista) {

        for (Alojamiento aux : lista) {
            if (aux instanceof Camping) {
                if (((Camping) aux).isRestorant()) {
                    System.out.println(aux);
                }
            }
        }
    }

    public static Comparator<Hotel> porPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {
            return h2.getPrecioHabitacion().compareTo(h1.getPrecioHabitacion());
        }
    };
    
    
}
