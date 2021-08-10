/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Crea una aplicación que nos pida un número por teclado y con una función 
    se lo pasamos por parámetro para que nos indique si es o no un número 
    primo, debe devolver true si es primo, sino false. Un número primo es aquel 
    solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, 
    ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_16 {

    public static boolean esPrimo(int n) {
        //inicio contador en 2 para no pasar por el 0 y el 1 ya que se que esos
        //numeros no son primos, y a primo lo inicio como verdadero
        int contador = 2;
        boolean primo = true;
        //verifico que el numero ingresado no sea 0,1 o un numero par
        if ((n == 0) || (n == 1) || (n % 2 == 0)) {
            primo = false;
        }
        //mientras primo sea verdadero y contador sea distinto de n
        while ((primo) && (contador != n)) {
            if (n % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa un numero");
        int numero = leer.nextInt();
        if (esPrimo(numero) == false) {
            System.out.println(numero + " NO es un numero Primo");
        } else {
            System.out.println(numero + " SI es un numero Primo");
        }

    }
}
