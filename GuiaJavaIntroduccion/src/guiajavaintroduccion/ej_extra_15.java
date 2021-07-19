/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Diseñe una función que pida el nombre y la edad de N personas e imprima 
    los datos de las personas ingresadas por teclado e indique si son mayores 
    o menores de edad. Después de cada persona, el programa debe preguntarle 
    al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
    ingrese la palabra “No”.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_15 {
    //funcion mostrar        
    public static void persona(int n){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] edad = new int[n];
        String[] nombres = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la persona");
            nombres[i] = leer.next();
            System.out.println("Ingrese la edad");
            edad[i] =leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Su nombre: " + nombres[i]);
            System.out.println("Su edad: " + edad[i]);
            if (i < (int) (n - 1)) {
                System.out.println("Desea seguir mostrando personas? (Si/No)");
                String confirma = leer.next();
                if ("s".equals(confirma.substring(0, 1).toLowerCase())) {
                    continue;
                }
                if ("n".equals(confirma.substring(0, 1).toLowerCase())) {
                    break;
                }
            }
        }
        leer.close();
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        persona(n);
        leer.close();
        
    }
    
}
