/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Leer la altura de N personas y determinar el promedio de estaturas que se
    encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

 */

package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador=0,cont60=0;
        double acumula = 0, promedio=0, acumula60=0,prom60=0;
        System.out.println("Ingresa el total de personas");
        int muestra = leer.nextInt();
        while (contador!=muestra){
            contador++;
            System.out.println("Ingresa la altura de la persona "+contador);
            double altura = leer.nextDouble();
            acumula = acumula+altura;
            promedio=acumula/contador;
            
            if (altura<1.60){
                acumula60 = acumula60+altura;
                cont60++;
                prom60=acumula60/cont60;
            }
                                    
        }
		leer.close();
                System.out.println("El promedio de altura de las "
                        +contador+" personas ingresadoas es "+promedio);
                System.out.println(cont60+" personas miden menos de 1.60 "
                        +"con un promedio de altura de "+prom60);
                System.out.println("*** CHAU!!! ***");
        
    }

}
