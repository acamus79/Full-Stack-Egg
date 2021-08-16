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

    static boolean bandera;
    Scanner leer;
    HashSet<Libro> biblioteca;

    public ServiciosLibro() {
        this.biblioteca = new HashSet<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosLibro.bandera = false;
        //le meto 10 libros al conjunto como para jugar
        biblioteca.add(new Libro("RAYUELA", "JULIO CORTAZAR",4,11));
        biblioteca.add(new Libro("EL PRINCIPITO", "ANTOINE DE SAINT-EXUPERY", 10, 10));
        biblioteca.add(new Libro("DUNA", "FRANK HERBERT", 6, 4));
        biblioteca.add(new Libro("LOS HERMANOS KARAMAZOV", "FIODOR DOSTOYEVSKI", 3, 2));
        biblioteca.add(new Libro("LA CARRETERA", "CORMAC MACCARTHY", 5, 0));
        biblioteca.add(new Libro("UNA BREVE HISTORIA DE CASI TODO", "BILL BRYSON", 0, 5));
        biblioteca.add(new Libro("EL CONDE DE MONTECRISTO", "ALEJANDRO DUMAS", 2, 3));
        biblioteca.add(new Libro("FAUSTO", "ESTANISLAO DEL CAMPO", 3, 2));
        biblioteca.add(new Libro("COMETAS EN EL CIELO", "KHALED HOSSEINI", 5, 5));
        biblioteca.add(new Libro("DIVINA COMEDIA", "DANTE ALIGHIERI", 5, 0));
    }

//String titulo, String autor, Integer nroEjemplares, Integer ejemplaresPrestados    
    private Libro creaLibro() {
        Libro p = new Libro();
        System.out.println("Ingrese el Titulo del Libro");
        p.setTitulo(leer.next().toUpperCase());
        System.out.println("Ingrese el Autor");
        p.setAutor(leer.next().toUpperCase());
        System.out.println("Cuantos Ejemplares tiene la Biblioteca?");
        p.setNroEjemplares(leer.nextInt());
        p.setEjemplaresPrestados(0);// a los prestados le pongo cero por logica
        return p;
    }

    private void agregaLibro() {
        char op;
        do {
            biblioteca.add(creaLibro());
            System.out.println("Desea agregar otro Libro? S/N");
            op = leer.next().toUpperCase().charAt(0);
        } while (op != 'N');
    }

    private void muestra() {
        biblioteca.forEach(aux -> {
            System.out.println(aux);
        });
    }

    private void borra() {

        System.out.println("Ingrese el libro borrar");
        String buscado = leer.next().toUpperCase();
        
        Iterator<Libro> it = biblioteca.iterator();
        while (it.hasNext()) {

            if (it.next().getTitulo().equalsIgnoreCase(buscado)) {
                it.remove();
                bandera = true;
                break;
            } else {
                bandera = false;
            }
        }
        if (bandera) {
            System.out.println("Se borro de la lista el libro " + buscado);
        } else {
            System.out.println("No se encontro el Libro " + buscado);
        }
    }

    private void prestamo() {
        System.out.println("Ingrese el libro a prestar");
        String buscado = leer.next().toUpperCase();
        Iterator<Libro> it = biblioteca.iterator();

        while (it.hasNext()) {
            Libro aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(buscado)) {
                bandera = aux.prestamo();
                break;
            } else {
               bandera = false;
            }
        }

        if (bandera) {
            System.out.println("Se Presto el Libro " + buscado);
        } else {
            System.out.println("No se Presto el Libro " + buscado);
        }
    }

    private void devuelve() {
        System.out.println("Ingrese el libro a devolver");
        String buscado = leer.next().toUpperCase();

        Iterator<Libro> it = biblioteca.iterator();

        while (it.hasNext()) {
            Libro aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(buscado)) {
                bandera = aux.devolucion();
                biblioteca.add(aux);
                break;
            } else {
                bandera = false;
            }
        }

        if (bandera) {
            System.out.println("Se Devolvio el Libro " + buscado);
        } else {
            System.out.println("No se Devolvio el Libro " + buscado);
        }
    }

//de yapa como no era largo el ejercicio le meti la venta
    private void venta() {
        System.out.println("Ingrese el libro a devolver");
        String buscado = leer.next().toUpperCase();
        Iterator<Libro> it = biblioteca.iterator();
        while (it.hasNext()) {
            Libro aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(buscado)) {
                bandera = true;
                aux.setNroEjemplares(aux.getNroEjemplares() - 1);
                biblioteca.add(aux);
                break;
            } else {
                bandera = false;
            }
        }

        if (bandera) {
            System.out.println("Se vendio el Libro " + buscado);
        } else {
            System.out.println("No existe el Libro " + buscado + " para vender");
        }
    }

    public void menu() {
        int op = 0;

        do {
            System.out.println("***** BIBLIOTECA ******");
            System.out.println("** 1. MOSTRAR LIBROS **");
            System.out.println("** 2. PRESTAMO       **");
            System.out.println("** 3. DEVOLUCION     **");
            System.out.println("** 4. VENTA          **");//este va de yapa
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
                    prestamo();
                    break;
                case 3:
                    devuelve();
                    break;
                case 4:
                    venta();
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
