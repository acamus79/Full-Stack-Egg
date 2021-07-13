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
/**
 *
 * @author Adrian E. Camus
 */
public class ej_26 {

    
    //Funcion llena con aleatorios una Matriz cuadrada de indice N 
    public static int[][] llenaMatrizA(int matrix[][],int n){
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
    
    //Funcion mostrar matriz transpuesta
    public static void muestraMT (int matrix[][],int n){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    System.out.print("[" + matrix[j][i] + "]"); 
                }
                System.out.println(" ");
                 }
     }
    
    public static int[][] matrizT(int matriz[][],int n){
       int [][] matrix= new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = matriz[i][j]; 
                }
            }
        return matrix;
   }
    
    
    
    //Main
     /**
     *
     * @param args
     */

    public static void main(String[] args) {
        
        int n = 3;
        int[][] matriz = new int[n][n];
        int[][] matrizT = new int[n][n];
        boolean bandera= true;
        
        //lleno con estos datos para comprobar la antisimetrica
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;
        
        //matriz = llenaMatrizA(matriz,n);
        System.out.println("la matriz generada es:");
        muestraMatriz(matriz,n);
        System.out.println("la matriz Transpuesta es:");
        matrizT = matrizT(matriz,n);
        muestraMatriz(matrizT,n);
        //muestraMT(matriz,n);
        
        //Recorro la matriz comparando con la transpuesta negativa
        //con una bandera logica que inicio en **verdadero**
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { 
                if (i!=j){
                    if (matriz [i][j] != -matriz[j][i]){
                        bandera = bandera && false;
                    }
                } else {
                    if (matriz [i][j] != matrizT[i][j]){
                        bandera = bandera && false;
                    }
                } 
            }   
        }
        if (bandera==true){
            System.out.println("\n"+"**SI**"+"\nEs una Matriz Antisimetrica!");
        } else {
            System.out.println("\n"+"**NO**"+"\nEs una Matriz Antisimetrica");
        }
        
        System.out.println("\n"); 
    }
    
}
