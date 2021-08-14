/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_ej_06.servicios;

import guia07_ej_06.entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosProducto {

    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    HashMap<Integer, Producto> mapaProductos;// y el mapa...

    //Esta es una muy buena practica
    public ServiciosProducto() {
        this.mapaProductos = new HashMap<>(); // Creo el espacio en memoria del MAPA lo INSTANCIO
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    public void cargarProducto() {
        char op;
       

        do {
            
            Integer cod = (int) (Math.random() * 355 - 20 + 20);//el codigo para NO pedirlo lo obtengo con un random
       
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next().toUpperCase();
            System.out.println("Ingrese el precio del producto (para los centavos use ,)");//pongo asi porque sino me olvido y uso punto
            Double precio = leer.nextDouble();
            //De este modo agrego elementos a un mapa. El primer termino se corresponde a la KEY
            mapaProductos.put(cod, new Producto(cod,nombre,precio));
    
            System.out.println("Desea agregar otro producto? S/N");
            op = leer.next().toUpperCase().charAt(0);
            
        } while (op == 'S');
    }

    public void mostrar() {
        // entry.getKey trae la llave y entry.getValue trae los valores del mapa, Es decir todos sus atributos
        for (Map.Entry<Integer, Producto> entry : mapaProductos.entrySet()) {
            System.out.println("Codigo  " + entry.getKey() + "  -  " + entry.getValue());
        }
    }

    public void buscarEliminar() {
        System.out.println("Ingrese el Codigo del Producto");
        Integer buscado = leer.nextInt();

        if (mapaProductos.containsKey(buscado)) {
            mapaProductos.remove(buscado);
        } else {
            System.out.println("No se encontro el producto");
        }
    }

    public void modifica() {

        System.out.println("Ingresa el codigo del producto");
        Integer buscado = leer.nextInt();

        if (mapaProductos.containsKey(buscado)) {

            Producto aux = mapaProductos.get(buscado);

            System.out.println("Ingrese el nuevo precio");
            aux.setPrecio(leer.nextDouble());

            mapaProductos.put(buscado, aux);
        } else {
            System.out.println("No se encontro el producto");
        }
    }

    public void borra() {

        System.out.println("Ingresa el codigo del producto a borrar");
        Integer buscado = leer.nextInt();

        if (mapaProductos.containsKey(buscado)) {
            mapaProductos.remove(buscado);
        } else {
            System.out.println("No se encontro el producto");
        }

    }

}
