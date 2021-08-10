/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Escriba un programa que lea números enteros. Si el número es múltiplo de 
    cinco debe detener la lectura y mostrar la cantidad de números leídos, 
    la cantidad de números pares y la cantidad de números impares. Al igual 
    que en el ejercicio anterior los números negativos no deben sumarse. 
    Nota: recordar el uso de la sentencia break.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_08 {

    public static boolean esMultiplo(int n1, int n2) {
        return n1 % n2 == 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0, suma = 0, num = 0, par = 0, impar = 0;

        do {
            contador++;
            System.out.println("Ingresa el numero " + contador + " de la muestra");
            num = leer.nextInt();
            suma += num;
            //System.out.println(esMultiplo(num,5));
            if (num%2==0){
                par++;
            }else{
                impar++;
            }
            
        } while ((esMultiplo(num, 5)) != true);

        System.out.println("Se analizaron " + contador + " numeros");
        System.out.println(num + " es multiplo de 5");
        System.out.println(par+" numeros fueron pares");
        System.out.println(impar+" numeros fueron impares");
        System.out.println("La suma de todos los numeros es " + suma);
        //System.out.println("El promedio de los numeros es " + promedio);
    }

}
