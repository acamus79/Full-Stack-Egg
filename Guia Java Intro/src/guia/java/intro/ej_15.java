/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    15.Realizar un programa que pida dos números enteros positivos por teclado
    y muestre por pantalla el siguiente menú: 
    
    MENU 
    1. Sumar 
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir
    Elija opción:
    
    El usuario deberá elegir una opción y el programa deberá mostrar el 
    resultado por pantalla y luego volver al menú. El programa deberá 
    ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el 
    usuario selecciona la opción 5, en vez de salir del programa 
    directamente, se debe mostrar el siguiente mensaje de confirmación: 
    ¿Está seguro que desea salir del programa (S/N)? 
    Si el usuario selecciona el carácter ‘S’ se sale del programa, 
    caso contrario se vuelve a mostrar el menú

 */
package guia.java.intro;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
		do {
			System.out.println("\n\n\n\n\n");
                        System.out.println("*********************");
                        System.out.println("***      MENU     ***");
			System.out.println("*********************");
                        System.out.println("** 1 SUMAR         **");
			System.out.println("** 2 RESTAR        **");
			System.out.println("** 3 MULTIPLICAR   **");
			System.out.println("** 4 DIVIDIR       **");
                        System.out.println("** 5 para SALIR    **");
			System.out.println("*********************");
			System.out.println("Elija Opcion:");
                opcion = leer.nextInt();
                
		switch (opcion){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                       System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                       String confirma = leer.next();
                       
                       if ("s".equals(confirma.substring(0,1).toLowerCase())){
                           opcion = 0;
                           break;
                       }
                        
                    default:
                            System.out.println("Ingresaste una opción errónea");
                            System.out.println("Presione ENTER para continuar");
                            System.in.read();// a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
                
                }
    
		} while (opcion!=0);// Fin Menu por opcion 5
		leer.close();
                System.out.println("\n\n\n\n\n\n");
                System.out.println("\n\n\n\n\n\n");
                System.out.println("*** CHAU!!! ***");
        
        
        
    }
    
}
