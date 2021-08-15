/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

HashSet de tipo Libro que guardará todos los 
libros creados.

 */
package guia07_extra_ej_03.servicios;

import guia07_extra_ej_03.entidades.Libro;
import java.util.*;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosLibro {

    Scanner leer;
    HashSet<Libro> biblioteca;
    Iterator<Libro> it;
    
    public ServiciosLibro() {
        this.biblioteca = new HashSet<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.it = biblioteca.iterator();
    }
//String titulo, String autor, Integer nroEjemplares, Integer ejemplaresPrestados    

    private Libro creaLibro() {
        Libro p = new Libro();
        System.out.println("Ingrese el Titulo del Libro");
        p.setTitulo(leer.next());
        System.out.println("Ingrese el Autor");
        p.setAutor(leer.next());
        System.out.println("Cuantos Ejemplares tiene la Biblioteca?");
        p.setNroEjemplares(leer.nextInt());
        p.setEjemplaresPrestados(0);// a los prestados le pongo cero por logica
        return p;
    }

    private void agregaLibro() {
        char op;
        do {
            biblioteca.add(creaLibro());
            System.out.println("Desea agregar otro cantante? S/N");
            op = leer.next().toUpperCase().charAt(0);
        } while (op != 'N');
    }

    private void muestra() {
        biblioteca.forEach(aux -> {
            System.out.println(aux);
        });
    }

    private void borra() {
        boolean bandera = false;
        System.out.println("Ingrese el libro borrar");
        String buscado = leer.next().toUpperCase();
        while (it.hasNext()) {

            if (it.next().getTitulo().equals(buscado)) {
                it.remove();
                bandera = true;
                break;
            } else {
                bandera = false;
            }
            if (bandera) {
                System.out.println("No se encontro el cantante " + buscado);
            } else {
                System.out.println("Se borro de la lista a " + buscado);
            }
        }
    }
    
    

    public void menu() {
        int op = 0;

        do {
            System.out.println("***** BIBLIOTECA ******");
            System.out.println("** 1. MOSTRAR LIBROS **");
            System.out.println("** 2. PRESTAMO       **");
            System.out.println("** 3. DEVOLUCION     **");
            System.out.println("** 4. VENTA          **");
            System.out.println("** 5. AGREGAR LIBRO  **");
            System.out.println("** 6. BORRAR LIBRO   **");
            System.out.println("** 7. PARA SALIR     **");
            System.out.println("***********************");
            System.out.println("Ingrese la opcion...\n");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    muestra();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    agregaLibro();
                    break;
                case 6:
                    borra();
                    break;
                case 7:
                    System.out.println("\nCHAU!!  \n");
                    break;
                default:
                    System.out.println("Ingresó una opcion no validad");
                    op = 0;
            }

        } while (op != 7);
    }
    



    
}
