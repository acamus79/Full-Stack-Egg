/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

8) Búsqueda de un Autor por nombre.
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título.
11) Búsqueda de un libro/s por nombre de Autor.
12) Búsqueda de un libro/s por nombre de Editorial.

 */
package libreria;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.*;
import libreria.servicios.*;

/**
 *
 * @author Adrian E. Camus
 */
public class Menu {

    private Scanner sc;
    private ServicioAutor servAut;
    private ServicioEditorial servEdit;
    private ServicioLibro servLibro;

    public Menu() {
        sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        servAut = new ServicioAutor();
        servEdit = new ServicioEditorial();
        servLibro = new ServicioLibro();
    }

    public void menu() throws Exception {
        int op = 0;

        do
        {
            try
            {

                System.out.println("*****      BIBLIOTECA     ******");
                System.out.println("** 1. ADMINISTRAR LIBROS      **");
                System.out.println("** 2. ADMINISTRAR AUTORES     **");
                System.out.println("** 3. ADMINISTRAR EDITORIALES **");
                System.out.println("** 4. PARA SALIR              **");
                System.out.println("********************************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op)
                {
                    case 1:
                        menuLibro();
                        break;
                    case 2:
                        menuAutor();
                        break;
                    case 3:

                        break;
                    case 4:

                        System.out.println("\nCHAU!!  \n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e)
            {
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n\n");
                sc.next();
            }

            limpiarPantalla();
        } while (op != 4);
    }

    private void menuLibro() throws Exception {
        int op = 0;

        do
        {
            try
            {
                System.out.println("*****   LIBROS    ******");
                System.out.println("** 1. MOSTRAR LIBROS **");
                System.out.println("** 2. PRESTAMO       **");
                System.out.println("** 3. DEVOLUCION     **");
                System.out.println("** 4. VENTA          **");
                System.out.println("** 5. AGREGAR LIBRO  **");
                System.out.println("** 6. BORRAR LIBRO   **");
                System.out.println("** 7. BUSCAR LIBRO   **");
                System.out.println("** 8. VOLVER         **");
                System.out.println("***********************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op)
                {
                    case 1:
                        muestraLibro(servLibro.buscaTodo());
                        break;
                    case 2:
                        System.out.println("OPCION EN DESARROLLO");
                        break;
                    case 3:
                        System.out.println("OPCION EN DESARROLLO");
                        break;
                    case 4:
                        System.out.println("OPCION EN DESARROLLO");
                        muestraEditorial(servEdit.buscaTodo());
                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:
                        buscaLibro();
                        break;
                    case 8:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e)
            {
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n\n");
                sc.next();
            }
            limpiarPantalla();
        } while (op != 8);
    }

    private void menuAutor() throws Exception {
        int op = 0;

        do
        {
            try
            {
                System.out.println("*****  AUTORES    ******");
                System.out.println("** 1. MOSTRAR AUTORES **");
                System.out.println("** 2. AGREGAR AUTOR   **");
                System.out.println("** 3. BORRAR AUTOR    **");
                System.out.println("** 4. BUSCAR AUTOR    **");
                System.out.println("** 5. VOLVER          **");
                System.out.println("************************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op)
                {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        buscaAutorNombre();
                        break;
                    case 5:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e)
            {
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n\n");
                sc.next();
            }
        } while (op != 5);
    }

    private void buscaLibro() throws Exception {
        int op = 0;
        do
        {
            try
            {
                System.out.println("*****   BUSCAR    *****");
                System.out.println("** 1. POR ISBN       **");
                System.out.println("** 2. POR TITULO     **");
                System.out.println("** 3. POR EDITORIAL  **");
                System.out.println("** 4. POR AUTOR      **");
                System.out.println("** 5. VOLVER         **");
                System.out.println("***********************");
                System.out.println("Ingrese la opcion...\n");
                op = sc.nextInt();

                switch (op)
                {
                    case 1:
                        porISBN();
                        break;
                    case 2:
                        porTitulo();
                        break;
                    case 3:
                        porEditorial();
                        break;
                    case 4:
                        porAutor();
                        break;
                    case 5:
                        System.out.println("\n- VOLVIENDO AL MENU PRINCIPAL -\n");
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }

            } catch (InputMismatchException e)
            {
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n\n");
                sc.next();
            }
            limpiarPantalla();
        } while (op != 5);

    }

    private void porISBN() {
        System.out.println("Ingrese el codigo ISBN");

        try
        {
            Libro l1 = servLibro.buscaISBN(sc.nextLong());

            if (l1 == null)
            {
                System.out.println("No existe registro con ese ISBN");
            } else
            {
                System.out.println("RESULTADO:");
                System.out.println(l1);
            }
            System.out.println("\n\nPresione Enter para continuar...");
            try
            {
                System.in.read();
            } catch (Exception e)
            {
            }
        } catch (Exception e)
        {
            e.getMessage();
        }
    }

    private void porTitulo() {
        System.out.println("Ingrese el titulo a buscar");
        List<Libro> l1 = servLibro.buscaLibro(sc.next());
        muestraLibro(l1);

    }

    private void porAutor() {
        System.out.println("Ingrese el nombre del autor");
        List<Libro> l1 = servLibro.buscaPorAutor(sc.next());
        muestraLibro(l1);
    }
    
    private void porEditorial() {
        System.out.println("Ingrese el nombre de la Editorial");
        List<Libro> l1 = servLibro.buscaPorEditorial(sc.next());
        muestraLibro(l1);
    }

    private void muestraLibro(List<Libro> libros) {

        System.out.printf("%-15s%-35s%-25s%-25s\n", "ISBN", "TITULO", "AUTOR", "EDITORIAL");
        libros.forEach(libro ->
        {
            System.out.println(libro);
        });
        System.out.println("\n\nPresione Enter para continuar...");
        try
        {
            System.in.read();
        } catch (Exception e)
        {
        }
    }

    private void muestraEditorial(List<Editorial> edit) {

        System.out.printf("%-35s%-35s\n", "NOMBRE", "ID" );
        
        for (int i = 0; i < edit.size(); i++)
        {
            System.out.println((i+1)+")"+edit.get(i));
        }
        
        
        
        
        
//        for (Editorial aux : edit)
//        {
//            System.out.println(aux);
//        }
        System.out.println("\n\nPresione Enter para continuar...");
        try
        {
            System.in.read();
        } catch (Exception e)
        {
        }
    }
    
    public void limpiarPantalla() throws AWTException {
        //Dejo esre metodo para ir borrando la consola.. y que no sea un desorden.
        Robot pressbot = new Robot();
        pressbot.setAutoDelay(30); // Tiempo de espera antes de borrar
        pressbot.keyPress(17); // Orden para apretar CTRL key
        pressbot.keyPress(76);// Orden para apretar L key
        pressbot.keyRelease(17); // Orden para soltar CTRL key
        pressbot.keyRelease(76); // Orden para soltar L key

    }

    private void buscaAutorNombre() {

        System.out.println("\nIngrese el nombre del Autor a buscar");
        Autor a1 = servAut.buscaAutor(sc.next());
        System.out.printf("\n%-15s%-35s\n", "NOMBRE", "ID\n");
        System.out.println(a1);

    }

    private void buscaEditorial(){
        
    }
    
    private void nuevoLibro(){
        
        System.out.println("Ingrese el titulo del Libro");
        String titulo = sc.next();
        List<Libro> aux = servLibro.buscaLibro(titulo);
        
        if(aux == null){
            System.out.println("Ingrese el año de Editado");
            Integer anio = sc.nextInt();
            List<Editorial> edit = null;
            
            muestraEditorial(servEdit.buscaTodo());
            
            
            
        }else {
            System.out.println("Ya existe un libro con ese nombre");
            muestraLibro(aux);
        }
        
    }
    
    
    
}
