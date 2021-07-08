/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Realizar un algoritmo que rellene un vector con los 100 primeros números 
    enteros y los muestre por pantalla en orden descendente. 

 */
package guiajavaintroduccion;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vectorN = new int[100]; 
        //lleno
        for (int i=0;i<100;i++){
        vectorN[i]=i+1;
        //muestro
        System.out.print("[" + vectorN[i] + "]");//Es "print" sin "ln" o sea sin saltar de linea
        }
                        
        System.out.println(" ");//este solo lo uso para el salto de linea final
    }
    
}
