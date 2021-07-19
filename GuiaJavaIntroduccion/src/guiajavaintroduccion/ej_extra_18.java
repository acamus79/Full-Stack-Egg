/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Escriba un programa que averigüe si dos vectores de N enteros son 
    iguales (la comparación deberá detenerse en cuanto se detecte alguna
    diferencia entre los elementos).

 */
package guiajavaintroduccion;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vectorA = { 1, 2, 3, 5, 6 };
        int[] vectorB = { 1, 3, 3, 5, 67 };
        int contador = 0;
        for (int i = 0; i < vectorA.length; i++) {
            if (vectorA[i] != vectorB[i]) {
                System.out.println(vectorA[i] + " != " + vectorB[i]);
                System.out.println("Los vectores no son iguales");
                break;
            } else {
                System.out.println(vectorA[i] + " = " + vectorB[i]);
                contador++;
            }
        }
        if (contador == vectorA.length) {
            System.out.println("Los vectores son iguales");
        }
    }
        
        
}
