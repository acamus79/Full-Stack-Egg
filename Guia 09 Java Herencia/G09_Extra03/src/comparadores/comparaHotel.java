/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package comparadores;

import entidades.Hotel;
import java.util.Comparator;

/**
 *
 * @author Adrian E. Camus
 */
public class ComparaHotel {

    public static Comparator<Hotel> porPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel h1, Hotel h2) {
            return h2.getPrecioHabitacion().compareTo(h1.getPrecioHabitacion());
        }
    };

}
