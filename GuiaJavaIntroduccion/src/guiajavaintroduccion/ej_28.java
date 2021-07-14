/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    28.Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y
    la matriz P de 3x3, se solicita escribir un programa en el cual se 
    compruebe si la matriz P está contenida dentro de la matriz M. Para ello 
    se debe verificar si entre todas las submatrices de 3x3 que se pueden 
    formar en la matriz M, desplazándose por filas o columnas, existe al menos 
    una que coincida con la matriz P. En ese caso, el programa debe indicar la 
    fila y la columna de la matriz M en la cual empieza el primer elemento de 
    la submatriz P.

    Ejemplo:

    {1 , 26, 36, 47,  5 , 6 , 72,  81, 95, 10}
    {11, 12, 13, 21,  41, 22, 67,  20, 10, 61}
    {56, 78, 87, 90,  9 , 90, 17,  12, 87, 67}
    {41, 87, 24, 56,  97, 74, 87,  42, 64, 35}
    {32, 76, 79, 1 , *36, 5 , 67*, 96, 12, 11}
    {99, 13, 54, 88, *89, 90, 75*, 12, 41, 76}
    {67, 78, 87, 45, *14, 22, 26*, 42, 56, 78}
    {98, 45, 34, 23,  32, 56, 74,  16, 19, 18}
    {24, 67, 97, 46,  87, 13, 67,  89, 93, 24}
    {21, 68, 78, 98,  90, 67, 12,  41, 65, 12}
    
    {36, 5 , 67} 
    {89, 90, 75}
    {14, 22, 26}

 */
package guiajavaintroduccion;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_28 {

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
        int cont =0;
        int[][] matriz10 = {
            {01, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        
        int[][] matriz3 = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        System.out.println("Matriz 10 x 10");
        muestraMatriz(matriz10,10);
        System.out.println("\n");
        System.out.println("Matriz 3 x 3");
        muestraMatriz(matriz3,3);
        System.out.println("\n");
        //cuento las veces que el primer numero de la matriz chica se encuentra 
        //en la matriz grande       
        for (int i=0; i<10;i++){
            for (int j=0; j<10;j++){
                if (matriz3[0][0] == matriz10[i][j]){
                   cont +=1; 
                }
            }
        }
        //declaro dos vectores del tamaño del contador para buscar por cada
        //posible inicio de la matriz chica
        
        int[] col = new int[cont];
        int[] fil = new int[cont];
        
        //relleno los vectores
        cont = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz10[i][j] == matriz3[0][0]) {
                    System.out.println("Coordenada " + cont);
                    System.out.println(i + "," + j);
                    col[cont] = i;
                    fil[cont] = j;
                    cont += 1;
                }
            }
        }
        
        // Uso x e y para recorrer la matriz chica mientras que j y k recorren la matriz
        // grande; i es para iterar las distintas coordenadas validas para las cuales
        // el primer valor de la matriz chica coincide dentro de la grande
        int iguales;
        int x = 0;
        int y = 0;
        for (int i = 0; i < cont; i++) {
            iguales = 0;
            System.out.println("Para la coordenada: " + i);
            x = 0;
            // Posicion desde la coordenada hasta la misma coordenada corrida 3 lugares (3 x
            // 3) para verificar la matriz chica dentro de la grande
            for (int j = fil[i]; j < fil[i] + 3; j++) {
                y = 0;
                for (int k = col[i]; k < col[i] + 3; k++) {
                    
                    // Cada vez que los valores sean iguales se suma al contador
                    
                    if (matriz10[j][k] == matriz3[x][y]) {
                        iguales += 1;
                        System.out.println("Son iguales en: " + x + ", " + y);
                    }
                    y += 1;
                }
                x += 1;
                // System.out.println("Iguales: " + iguales);
            }
            // Se verifica que la cantidad de valores iguales sea igual que la
            //maxima cantidad de numeros de la matriz chica 3 x 3 = [9]
            if (iguales == 9) {
                System.out.println("La Matriz 3x3 comienza las coordenadas: "
                                   + col[i] + " - " + fil[i]+""
                                   + " de la matriz 10x10");
                
            } else {
                System.out.println("No existe una matriz P dentro de la matriz M");
            }
        }
    }
}
    
    
