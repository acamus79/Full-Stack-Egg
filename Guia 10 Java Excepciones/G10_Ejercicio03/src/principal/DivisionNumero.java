/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Defina una clase llamada DivisionNumero. En el método main utilice un Scanner 
para leer dos números en forma de cadena. A continuación, utilice el método 
parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en 
dos variables de tipo int. Por ultimo realizar una división con los dos numeros y 
mostrar el resultado. 

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

        String num1 = "", num2 = "";
        Integer numero1 = 0, numero2 = 0;
        float division;

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        try {
            System.out.println("Ingrese el primer numero");
            num1 = leer.next();
            System.out.println("Ingrese el segundo numero");
            num2 = leer.next();
        } catch (InputMismatchException e) {
            System.out.println("1er Error Excepcion de Tipo de Ingreso");
        }

        try {

            numero1 = Integer.parseInt(num1);
            numero2 = Integer.parseInt(num2);

        } catch (NumberFormatException e) {
            System.out.println("2do Error parseInt");
        }

        try {

            division = numero1 / numero2;
            System.out.println("La division de los dos numeros es "+division);

        } catch (ArithmeticException e) {
            System.out.println("Ultimo Error Excepcion Aritmetica");
        }

                     
    }

    
    
}
