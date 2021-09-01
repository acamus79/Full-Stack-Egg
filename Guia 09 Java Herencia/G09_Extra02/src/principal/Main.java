/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.





Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuantos
polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
deberemos llamar al método cantPersonas() y mostrar los resultados de cada
edificio de oficinas

 */
package principal;

import entidades.*;
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
        int cuentaPoli=0, cuentaOfi=0;
        ArrayList<Edificio> lista = new ArrayList();

        Polideportivo p1 = new Polideportivo("Torito", true, 80d, 20d, 170d);
        lista.add(p1);
        Polideportivo p2 = new Polideportivo("Poli Nro 1", false, 76d, 18d, 140d);
        lista.add(p2);

        EdificioDeOficinas o1 = new EdificioDeOficinas(2, 12, 12, 24d, 35d, 28d);
        lista.add(o1);
        EdificioDeOficinas o2 = new EdificioDeOficinas(1, 8, 20, 18d, 50d, 20d);
        lista.add(o2);

        for (Edificio aux : lista)
        {
            if (aux instanceof Polideportivo)
            {
                System.out.println(aux);
                System.out.println("Superficie " + aux.calcularSuperficie()+" mts2");
                System.out.println("Volumen " + aux.calcularVolumen()+" mts3");
                cuentaPoli++;
            } else if (aux instanceof EdificioDeOficinas)
            {
                System.out.println(aux);
                System.out.println("Superficie " + aux.calcularSuperficie()+" mts2");
                System.out.println("Volumen " + aux.calcularVolumen()+" mts3");
                cuentaOfi++;
                ((EdificioDeOficinas) aux).cantPersonas();
            }
        }
        System.out.println("Cantidad de Polideportivos "+cuentaPoli);
        System.out.println("Cantidad de Edificios de Oficina "+cuentaOfi);
    }
}
