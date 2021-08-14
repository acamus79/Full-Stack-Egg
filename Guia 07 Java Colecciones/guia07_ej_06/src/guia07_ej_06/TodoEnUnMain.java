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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class TodoEnUnMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO en el main es que no hay manera sino serian mapas de objetos

        int op;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Double> kwikEMart = new HashMap();

//        kwikEMart.put("Leche El Lechero x 1lt", 89.90);
//        kwikEMart.put("Arroz Oryza x 500gr", 75.89);
//        kwikEMart.put("Fideos Metiraste x 500gr", 45.90);
//        kwikEMart.put("Aceite El Negro x 900cm3", 150.75);
//        kwikEMart.put("Pure de Tomate Tu Hermana 250cm3", 48.90);
//        kwikEMart.put("Mayonesa La Gauchita x 500gr", 98.50);
//        kwikEMart.put("Harina 0000 Blanquita x 1kg", 40.90);
        kwikEMart.put("Leche", 80.9);
        kwikEMart.put("Arroz", 75.9);
        kwikEMart.put("Fideos", 45.90);
        kwikEMart.put("Aceite", 150.75);
        kwikEMart.put("Pure", 48.90);
        kwikEMart.put("Mayonesa", 98.50);
        kwikEMart.put("Harina", 40.90);

        do {
            System.out.println("************** MENU *****************");
            System.out.println("** 1.- Mostrar todos los Productos **");
            System.out.println("** 2.- Introducir un Producto      **");
            System.out.println("** 3.- Modificar Precio            **");
            System.out.println("** 4.- Borrar un Producto          **");
            System.out.println("** 5.- Salir                       **");
            System.out.println("*************************************");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    muestraProducto(kwikEMart);
                    break;
                case 2:
                    kwikEMart = agrega(kwikEMart);
                    break;
                case 3:
                    kwikEMart = modifica(kwikEMart);
                    break;
                case 4:
                    kwikEMart = borra(kwikEMart);
                    break;

            }

        } while (op != 5);

    }

    private static void muestraProducto(HashMap<String, Double> tienda) {
        for (Map.Entry<String, Double> entry : tienda.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + "   - $" + val);
        }

    }

    private static HashMap agrega(HashMap<String, Double> tienda) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el nombre del Producto");
        String nom = leer.next();
        System.out.println("Ingrese el precio");
        Double pre = leer.nextDouble();
        
        tienda.put(nom, pre);
        
        return tienda;

    }

    private static HashMap modifica(HashMap<String, Double> tienda) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el nombre del producto a modificar");
        String buscado = leer.next();
        
        if (tienda.containsKey(buscado)) {
                System.out.println("Ingrese el nuevo precio");
                tienda.put(buscado, leer.nextDouble());
            } else {
                System.out.println("No se encontro el producto");
            }
        
        return tienda;
    }

    private static HashMap borra(HashMap<String, Double> tienda) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el nombre del producto a borrar");
        String buscado = leer.next();
        
        if (tienda.containsKey(buscado)) {
                tienda.remove(buscado);
            } else {
                System.out.println("No se encontro el producto");
            }
       
        return tienda;
    }

}
