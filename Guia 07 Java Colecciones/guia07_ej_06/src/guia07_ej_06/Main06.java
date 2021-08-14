/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.


 */
package guia07_ej_06;

import guia07_ej_06.servicios.Menu;

/**
 *
 * @author Adrian E. Camus
 */
public class Main06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu m = new Menu();
        m.menu();
    }
    
}
