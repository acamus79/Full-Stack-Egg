/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor

 */
package principal;

import entidades.*;
import enumeradores.Consumo;
import java.util.ArrayList;

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

        ArrayList<Electrodomestico> lista = new ArrayList();
        Consumo c = null;
        double acumula = 0, pTele = 0, pLava = 0;
        int cuentaTele = 0, cuentaLava = 0;

        Televisor t1 = new Televisor(52, true, 27000d, "Negro", c.A, 12d);
        lista.add(t1);
        Televisor t2 = new Televisor(32, true, 17000d, "Negro", c.C, 8d);
        lista.add(t2);
        Lavarropa l1 = new Lavarropa(15, 48000d, "Blanco", c.F, 50d);
        lista.add(l1);
        Lavarropa l2 = new Lavarropa(40, 78000d, "Blanco", c.D, 70d);
        lista.add(l2);

        for (Electrodomestico aux : lista) {
            aux.precioFinal(aux.getConEnerg(), aux.getPeso());
            System.out.println(aux);
            acumula += aux.getPrecio();
        }

        for (Electrodomestico aux : lista) {
            if (aux instanceof Lavarropa) {
                cuentaLava++;
                pLava += aux.getPrecio();
            }
        }

        for (Electrodomestico aux : lista) {
            if (aux instanceof Televisor) {
                cuentaTele++;
                pTele += aux.getPrecio();
            }
        }

        System.out.println("Hay "+cuentaLava+" Lavarropas, con un valor total de $ "+pLava);
        System.out.println("Hay "+cuentaTele+" Televisores, con un valor total de $ "+pTele);
        System.out.println("\nEl costo total de los electrodomesticos es: $ " + acumula);
        
    }

}
