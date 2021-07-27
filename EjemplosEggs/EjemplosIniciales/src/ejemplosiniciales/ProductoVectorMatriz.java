/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosiniciales;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ProductoVectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       //Declaracion y creacion de un vector
       //tipo[] nombreVector = new tipo[tamaño]
       
       int[] vector; //"Declara" el vector de tipo entero 
       vector = new int[2]; //"Crea" o dimensiona el vector en memoria con cero
       
       //de esta manera se hace todo en una sola linea
       int[] producto = new int[3]; //declara y crea en una sola linea
        
       //Declaracion de una Matriz
       //tipo[][] nombreMatriz = new tipo[filas][columnas]
        
       //Declaracion e inicializacion con valores predeterminados
       int [][] matriz = {{4,8,6},{2,1,7}};
       
       //Declaracion y creacion de arreglos genericos
       //tipo[] [] ...[] nombreArreglo = new tipo [cardinalidad1] [cardinalidad2]...[cardinalidadN]
       
        System.out.println("Ingrese los valores del vector de tamaño "+vector.length+":");
        
        //recorre con un para el vector y va pidiendo los numeros por cada indice
        for (int i=0; i<vector.length; i++){
            System.out.println("v["+i+"]=");
            vector[i] = leer.nextInt();
        }
        
        //Multiplica vector por matriz
        int suma;
        //...por cada columna de la matriz
        for (int j=0; j<matriz[0].length; j++){
            suma = 0;
            //recorro el vector y multiplico
            for (int i=0; i<vector.length; i++){
            
                suma += vector[i] * matriz [i][j];
            
            }
            
        }
            
       
    }
    
}
