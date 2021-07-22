/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package ej03;

import ej03.entidades.Operacion;
import ej03.servicios.ServiciosOperacion;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        
        ServiciosOperacion so = new ServiciosOperacion();
        Operacion op = so.crearOperacion();
        System.out.println("la suma de los numeros es "+so.sumar(op));
        System.out.println("la resta de los numeros es "+so.restar(op));
        System.out.println("el producto es "+so.multiplicar(op));
        System.out.println("la division es "+so.dividir(op));
    }

}
