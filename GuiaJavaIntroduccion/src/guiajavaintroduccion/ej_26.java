/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Realice un programa que compruebe si una matriz dada es anti simétrica. 
    Se dice que una matriz A es anti simétrica cuando ésta es igual a su 
    propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica 
    si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
    obtiene cambiando sus filas por columnas (o viceversa). 
    
    Matriz          Matriz Traspuesta
    0   -2  4       0   2   -4
    2   0   2       -2  0   -2
    -4  -2  0       4   2   0

    Ejemplo: En este caso la matriz es anti simétrica. 

 */
package guiajavaintroduccion;

import static guiajavaintroduccion.ej_25.llenaMatriz;
import static guiajavaintroduccion.ej_25.muestraMatriz;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_26 {

    //Funcion llena con aleatorios una Matriz cuadrada de indice N 
    public static int[][] llenaMatriz(int matrix[][],int n){
       matrix= new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = (int)(Math.random()*10+1); 
                }
            }
        return matrix;
   }
      
     //Funcion para Mostrar una matriz cuadrada de indice N
    public static void muestraMatriz (int matrix[][],int n){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    System.out.print("[" + matrix[i][j] + "]"); 
                }
                System.out.println(" ");
            }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 3;
        int[][] matriz = new int[n][n];

        matriz = llenaMatriz(matriz,n);
        System.out.println("la matriz generada es:");
        muestraMatriz(matriz,n);
        
        
        
    }
    
}
