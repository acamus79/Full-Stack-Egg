/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package libreria;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;

/**
 * 
 * @author Adrian E. Camus
 */
public class Menu {

    private final Scanner sc;
    private 

    public Menu() {
        sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    }
    
        
    
    public void menuPrincipal() throws Exception {
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
            op = sc.nextInt();

            switch (op) {
                case 1:
                    //muestra();
                    break;
                case 2:
                    //prestamo();
                    break;
                case 3:
                    //devuelve();
                    break;
                case 4:
                    //venta();
                    break;
                case 5:
                    //agregaLibro();
                    break;
                case 6:
                    //borra();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("\nCHAU!!  \n");
                    break;
                default:
                    System.out.println("Ingresó una opcion no validad");
                    op = 0;
            }
        limpiarPantalla();
        } while (op != 7);
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
    
    
    
    
    
}
