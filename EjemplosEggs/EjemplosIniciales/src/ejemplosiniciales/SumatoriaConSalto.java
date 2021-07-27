/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosiniciales;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class SumatoriaConSalto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea una un objeto de la clase scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        
        do {
            System.out.println("Ingrese un numero entero positivo");
            num = leer.nextInt();
            if (num > 1000){
                System.out.println("Estre programa podria tardar, ¿Esta Seguro? s/n");
                String confirma = leer.next();
                if (confirma.equals("s")){
                    break;//detiene el bucle lo abandona y sigue con el proximo bloque
                }
            }
        
    } while (num <= 0 || num > 1000);
     
        /*
        for (<inicializacion>; <expresion_terminacion>; <paso/incremento/decremento>){
            <sentencias>
        }
        */
        int j, suma;
        
        for (int i=1; i<=num; i++ ){
        //si el resto (modulo) de dividir i/2 es distinto de cero, esto verifica impares
            if (i%2!=0) 
                continue; 
        /* <continue:> detiene la iteracion actual y salta a la siguiente, 
         a diferencia del break no detiene al bucle sino solo a la vuelta 
         del bucle actual, llamada iteracion actual. En este caso como 
         verificamos si un numero es impar entonces salta la iteracion*/

            suma = 0;
            j=1;
            while(j<=i){
                suma +=j;
                j++;
            }
            System.out.println("La suma de los "+i+" numeros naturales es: "+suma);
        }
        
}
}
