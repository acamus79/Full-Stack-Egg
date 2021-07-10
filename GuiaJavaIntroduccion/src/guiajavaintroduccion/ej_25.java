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


//Funcion llena y muestra con aleatorios una Matriz de indice N 
    
/*
    fuerzo que los generados sean enteros con (int) y luego limito que sean
    desde 0 a 99 los aleatorios pero al final le sumo +1 para que nunca
    me toque el 0 como aleatorio
*/
    
  public class ej_25 {

    /**
     * @param args the command line arguments
     */
    
    static void llenaMatriz(int matrix[][],int n){
        matrix= new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = (int)(Math.random()*99+1); 
                }
            }
    }
    
    static void muestraMatriz (int matrix[][],int n){
         matrix= new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    System.out.print("[" + matrix[i][j] + "]"); 
                }
                System.out.println(" ");
            }
    }
    
    public static void main(String[] args) {
        
        
        
        
    }
    
}


