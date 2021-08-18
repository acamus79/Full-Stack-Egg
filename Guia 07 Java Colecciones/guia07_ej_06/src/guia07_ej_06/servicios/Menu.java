/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_ej_06.servicios;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Menu {

    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase
    static int op = 0;//creo la variable para elegir las opciones del menu
    ServiciosProducto sp; //Creo mi objeto de Servicios para llamar a los metodos

    public Menu() {//instancio el scanner y el objeto de la clase servicio
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.sp = new ServiciosProducto();
    }

    public void menu() {
        do {
            System.out.println("************** MENU *****************");
            System.out.println("** 1.- Introducir un Producto      **");
            System.out.println("** 2.- Modificar Precio            **");
            System.out.println("** 3.- Borrar un Producto          **");
            System.out.println("** 4.- Mostrar todos los Productos **");
            System.out.println("** 5.- Salir                       **");
            System.out.println("*************************************");
            op = leer.nextInt();

            switch (op) {
                case 1:
//                    System.out.println("Cuantos productos desea agregar?");
//                    int aux = leer.nextInt();
//                    for (int i = 0; i < aux; i++) {
                        sp.cargarProducto();
                    //}
                    break;
                case 2:
                    sp.modifica();
                    break;
                case 3:
                    sp.buscarEliminar();
                    break;
                case 4:
                    sp.mostrar();
                    break;
                case 5:
                    System.out.println("\nCHAU!!\n\n");
                    break;
            }

        } while (op != 5);

    }

}
