/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes
famosos y tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres 
de cada cantante y su disco con más ventas por pantalla. 
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al 
usuario de agregar un cantante más, mostrar todos los cantantes, eliminar un 
cantante que el usuario elija o de salir del programa. Al final se deberá 
mostrar la lista con todos los cambios. 

 */
package guia07_extra_ej_02;

import guia07_extra_ej_02.servicios.Servicios;

/**
 *
 * @author Adrian E. Camus
 */
public class MainExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Servicios s = new Servicios();
        s.menu();
    }
    
}
