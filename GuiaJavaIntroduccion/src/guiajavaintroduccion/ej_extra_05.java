/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    5.Una obra social tiene tres clases de socios: 

    * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
    descuento en todos los tipos de tratamientos. 
    * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
    descuento para los mismos tratamientos que los socios del tipo A. 
    * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
    sobre dichos tratamientos. 

    Solicite una letra (carácter) que representa la clase de un socio, y 
    luego un valor real que represente el costo del tratamiento 
    (previo al descuento) y determine el importe en efectivo a pagar 
    por dicho socio.

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        
        double descuento = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tipo de socio A - B - C ");
        String socio = leer.next();
        socio = socio.toUpperCase();//paso a mayusculas
        socio = socio.substring(0, 1);//extraigo el primer caracter
        System.out.println("Ingrese el monto del tratamiento");
        double tratamiento = leer.nextInt();

        switch (socio) {
            case "A":
                descuento = (tratamiento * 0.50);
                System.out.println("Total a pagar $ " + (tratamiento - descuento));
                break;
            case "B":
                descuento = (tratamiento * 0.35);
                System.out.println("Total a pagar $ " + (tratamiento - descuento));
                break;
            case "C":
                descuento = 0;
                System.out.println("Total a pagar $ " + (tratamiento - descuento));
                break;
            default:
                System.out.println("No existe el tipo de socio");
        }
    }
}
    
