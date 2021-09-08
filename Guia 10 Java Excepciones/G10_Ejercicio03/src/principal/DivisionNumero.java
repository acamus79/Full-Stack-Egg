/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Defina una clase llamada DivisionNumero. En el método main utilice un Scanner 
para leer dos números en forma de cadena. A continuación, utilice el método 
parseInt() de la clase Integer, para convertir las cadenas al tipo int y 
guardarlas en dos variables de tipo int. Por ultimo realizar una división con 
los dos numeros y mostrar el resultado. 

Todas estas operaciones puede tirar excepciones a manejar, el ingreso por 
teclado puede causar una excepción de tipo InputMismatchException, el método 
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una 
NumberFormatException y además, al dividir un número por cero surge una 
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques 
try/catch para las distintas excepciones

 */
package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class DivisionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer n1 = 0, n2 = 0;
        Integer n3 = 0;
        System.out.println("Ingrese dos numeros");
        String numero1 = leer.next();
        String numero2 = leer.next();

        try {
            n1 = Integer.parseInt(numero1);
            n2 = Integer.parseInt(numero2);
            System.out.println("La division entre los dos numeros es: " + n1 / n2);
            System.out.println("Ingrese el tercer numero");
            n3 = leer.nextInt();
            System.out.println("el producto del tercer numero y la division es: "+n3*(n1/n2));
            
        } catch (NumberFormatException e) {
            System.out.println("Excepcion de parseInt");
            System.out.println(e.toString());
        } catch (ArithmeticException e) {
            System.out.println("Excepcion division por CERO");
            System.out.println(e.toString());
        } catch (InputMismatchException e) {
            System.out.println("Excepcion de Ingreso");
            System.out.println(e.toString());
        } finally {

            System.out.println("TERMINO");
     }

    }
}
