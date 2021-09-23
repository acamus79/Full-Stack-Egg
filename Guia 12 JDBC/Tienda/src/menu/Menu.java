/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Menu {

    private int op;
    private Scanner leer;

    public Menu() {
        // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        //usuarioServicio = new UsuarioServicio();
        op = 0;
    }

    public void menuPrincipal() {
        System.out.println("****** MENU ******");
        System.out.println("* 1.- Mostrar Fabricantes");
        System.out.println("* 2.- Administracion de Fabricantes");
        System.out.println("* 3.- Mostrar Productos");
        System.out.println("* 4.- Administracion de Productos");
        System.out.println("* 5.- Salir");
        
        op= leer.nextInt();
        
        do {
        
        switch (op){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("CHAU!!!");
        }
        }while(op!=5);
        
    }

    public void menuFabricante() {
        System.out.println("* 2.- Nuevo Fabricante");
        System.out.println("* 3.- Modificar Fabricante");
        System.out.println("* 4.- Borrar Fabricante");

        System.out.println("* 6.- Nuevo Producto");
        System.out.println("* 7.- Modificar Producto");
        System.out.println("* 8.- Borrar un Producto");
    }

}
