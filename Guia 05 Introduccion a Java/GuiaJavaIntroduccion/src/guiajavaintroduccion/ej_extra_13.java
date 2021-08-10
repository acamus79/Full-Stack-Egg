/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Se dispone de un conjunto de N familias, cada una de las cuales tiene 
    una M cantidad de hijos. Escriba un programa que pida la cantidad de 
    familias y para cada familia la cantidad de hijos para averiguar la 
    media de edad de los hijos de todas las familias.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int familias, hijos, hijosTotal;
        double edad;
        double edadMedia = 0;

        edad = 0;
        hijosTotal = 0;
        System.out.println("Ingrese la cantidad de familias");
        familias = leer.nextInt();
        for (int i = 0; i < familias; i++) {
            
            System.out.println("Ingrese la cantidad de hijos que tiene");
            hijos = leer.nextInt();
            
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad de su hijo " + (int) (j + 1));
                edad += leer.nextInt();
                hijosTotal += 1;
            }
        }
        edadMedia = Math.round(edad / hijosTotal);
        System.out.println("La edad media de todos los hijos es de " + (int) edadMedia);
        leer.close();//cierro el teclado
    }

}
