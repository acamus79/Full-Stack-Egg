/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    27. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
    1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son 
    idénticas. Crear un programa que permita introducir un cuadrado por 
    teclado y determine si este cuadrado es mágico o no. El programa deberá 
    comprobar que los números introducidos son correctos, es decir, están 
    entre el 1 y el 9.

    2 7 6 
    9 5 1 
    4 3 8


 */
package guiajavaintroduccion;

import java.util.Scanner;


/**
 *
 * @author Adrian E. Camus
 */
public class ej_27 {
    
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
        
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int contador =0;
	int suma = 0;
	int sumadiagonal = 0;
        int filas = 3;
        int[] sumafilas = new int[filas];
	int[] sumacolumnas = new int[filas];
        
//        System.out.println("Ingrese el numero de columnas");
//        int columnas  = leer.nextInt();
//        System.out.println("Ingrese el numero de filas");
//        int filas = leer.nextInt();
        int columnas = filas;

        // se crea una variable local dl metodo para depues guardarla en la matriz local de la clase
        int matrix[][] = new  int[filas][columnas];
       
        // se piden los elemetos de la matriz
        for(int i=0; i < columnas; i++){
        
            for(int j =0; j<filas; j++ ){
                System.out.println("ingrese el valor en la posicion ["+ (i+1) +"] "+"["+ (j+1)+"]"+ " de la matriz");
                matrix[i][j] = leer.nextInt();
            }
        
        }    
        System.out.println("La matriz generada es");
        muestraMatriz(matrix,filas);
        System.out.println("");
        System.out.println("Su transpuesta es:");
        muestraMT(matrix,filas);        
        System.out.println("");
        
        //recorro la matriz para sumar las filas
        for (int i=0;i<filas;i++) {
			suma = 0;
			for (int j=0;j<filas;j++) {
				suma = suma+matrix[i][j];
			}
			sumafilas[i] = suma;
		}
		System.out.println("La suma de las filas es: ");
		for (int i=0;i<filas;i++) {
			System.out.print(sumafilas[i]+" ");
		}
		System.out.println("");
         //recorro la matriz para sumar las columnas
        for (int i=0;i<columnas;i++) {
			suma = 0;
			for (int j=0;j<columnas;j++) {
				suma = suma+matrix[j][i];
			}
			sumacolumnas[i] = suma;
		}
		System.out.println("La suma de las columnas es: ");
		for (int i=0;i<columnas;i++) {
			System.out.print(sumacolumnas[i]+" ");
		}
		System.out.println("");
        //recorro con un for la matriz para sumar la diagonal        
        for (int i=0;i<filas;i++) {
			suma = 0;
			for (int j=0;j<filas;j++) {
				if (i==j) {
					suma = suma+matrix[i][j];
				}
			}
			sumadiagonal = sumadiagonal+suma;
		}
		System.out.println("La suma de la diagonal es "+sumadiagonal);
		System.out.println("La matriz:");   
                
                //recorro comparando las sumas para saber si es magica
                for (int i=0;i<filas;i++) {
			if (sumacolumnas[i]==sumadiagonal && sumafilas[i]==sumadiagonal) {
				contador++;
			}
		}
		if (contador==filas) {
			System.out.println("Es una matriz magica");
		} else {
			System.out.println("No es una matriz magica");
		}
    }
    
}
