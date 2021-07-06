/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    16.Escriba un programa que lea 20 números. Si el número leído es igual 
    a cero se debe salir del bucle y mostrar el mensaje 
    "Se capturó el numero cero".  
    
    El programa deberá calcular y mostrar el resultado de la suma de los 
    números leídos, pero si el número es negativo no debe sumarse. 
    Nota: recordar el uso de la sentencia break.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma = 0;
        int n1;
        
        do {//hacer
            System.out.println("Ingrese un numero");
                n1 = leer.nextInt();
                //si n1 es mayor que cero entonces hace una sumatoria tipo acumulacion
                //si es menor que cero quiere decir que es negativo entonces no hace nada
                if (n1>0){
                    suma = suma + n1;
                }
                                
        }while (n1!=0);//mientras n1 sea distinto de cero
        leer.close();//cierro el scanner porque ya no lo voy a usar mas
        System.out.println("Se capturó el numero cero");
        System.out.println("La suma de los numeros capturados es "+suma);
    }
        
        
}
