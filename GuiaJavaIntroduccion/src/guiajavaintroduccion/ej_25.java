/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

  //Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
  //muestre traspuesta. 

 */
package guiajavaintroduccion;

/**
 *
 * @author Adrian E. Camus
 * 
 */
    
  public class ej_25 {

    /**
     * @param args the command line arguments
     */
      
      
      
      
    //Funcion llena con aleatorios una Matriz cuadrada de indice N 
    public static int[][] llenaMatriz(int matrix[][],int n){
       matrix= new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = (int)(Math.random()*99+1); 
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
    
    public static void main(String[] args) {
        
        int n = 4;
        int[][] matriz = new int[n][n];

        matriz = llenaMatriz(matriz,n);
        System.out.println("la matriz generada es:");
        muestraMatriz(matriz,n);
        System.out.println("Su transpuesta es:");
        for (int i = 0; i < n; i++){
               for (int j = 0; j < n; j++) {
                    System.out.print("[" + matriz[j][i] + "]"); 
                }
                System.out.println(" ");
            }
    }
    
}


