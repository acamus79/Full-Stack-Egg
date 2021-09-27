/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package menu;

import excepcion.MiExcepcion;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicio.*;

/**
 *
 * @author Adrian E. Camus
 */
public class Menu {

    private int op;
    private Scanner leer;
    private ServicioFabricante servFab;
    private ServicioProducto servProd;

    public Menu() {
        // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        //usuarioServicio = new UsuarioServicio();
        op = 0;
        servFab = new ServicioFabricante();
        servProd = new ServicioProducto();
    }

    public void menuPrincipal() {
        System.out.println("****** MENU ******");
        System.out.println("* 1.- Mostrar Fabricantes");
        System.out.println("* 2.- Administracion de Fabricantes");
        System.out.println("* 3.- Mostrar Productos");
        System.out.println("* 4.- Administracion de Productos");
        System.out.println("* 5.- Salir");

        op = leer.nextInt();

        do
        {

            switch (op)
            {
                case 1:
                {
                    try
                    {
                        servFab.muestraFabricantes();
                    } catch (MiExcepcion ex)
                    {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case 2:
                    menuFabricante();
                    break;
                case 3:
                {
                    try
                    {
                        servProd.muestraProducto();
                    } catch (MiExcepcion ex)
                    {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;

                case 4:
                    menuProducto();
                    break;
                case 5:
                    System.out.println("CHAU!!!");
            }
        } while (op != 5);

    }

    public void menuFabricante() {
        System.out.println("* 2.- Nuevo Fabricante");
        System.out.println("* 3.- Modificar Fabricante");
        System.out.println("* 4.- Borrar Fabricante");
        op = leer.nextInt();
    }

    public void menuProducto() {
        System.out.println("* 6.- Nuevo Producto");
        System.out.println("* 7.- Modificar Producto");
        System.out.println("* 8.- Borrar un Producto");
        op = leer.nextInt();
    }

    // CRUD FABRICANTE
    public void crearFabricante() {
        try
        {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            servFab.crearFabricante(codigo, nombre);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void modificarFabricante() {
        try
        {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            servFab.modificarFabricante(codigo, nombre);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarFabricante() {
        try
        {
            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int codigo = leer.nextInt();

            servFab.eliminarFabricante(codigo);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
        }
    }

    // CRUD PRODUCTO
    public void crearProducto() { //Integer codigo, String nombre, Double precio, Integer cod_fab
        try
        {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            System.out.println("INGRESE PRECIO: ");
            double precio = leer.nextDouble();

            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int cod_fab = leer.nextInt();

            servProd.crearProducto(codigo, nombre, precio, cod_fab);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void modificarProducto() {
        try
        {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            System.out.println("INGRESE PRECIO: ");
            double precio = leer.nextDouble();

            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int cod_fab = leer.nextInt();

            servProd.modificarProducto(codigo, nombre, precio, cod_fab);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarProducto() {
        try
        {
            System.out.println("INGRESE CODIGO DE PRODUCTO: ");
            int codigo = leer.nextInt();

            servProd.eliminarProducto(codigo);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
        }
    }

}
