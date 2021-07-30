/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo 
por pantalla.

Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. 

Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el 
combinado de 20.

 */
package ejercicio10meet.servicios;

import ejercicio10meet.entidades.Arreglo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */


public class ServiciosArreglo {
    
    
    public Arreglo crearArreglo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del arreglo");
        int indice = leer.nextInt();
        
        return new Arreglo(indice);
        
    }
    
    public void llenarArreglo(Arreglo a){
        float vector[] = new float[a.getN()];
        float num;
        for (int i = 0; i < a.getN(); i++) {
            num=(float) (Math.random())*10+1;
            vector[i]=num;
        }
        a.setArreglo(vector);
        //llamo a mi metodo estatico de esta clase y le paso el vector auxiliar para que lo muestre
        mostrarArreglo(vector);
    }
    
    public void ordenarArreglo(Arreglo a){
        float aux[] = a.getArreglo();
        Arrays.sort(aux);
        a.setArreglo(aux);
         //llamo a mi metodo estatico de esta clase y le paso el auxiliar para que lo muestre
        mostrarArreglo(aux);
    }
    
    private static void mostrarArreglo(float[]a){
           for (int i = 0; i < a.length; i++) {
            System.out.print("["+a[i]+"] ");
        }
        System.out.println("");
    }
    
    public void segundoArreglo(Arreglo a){
    
        float b[] = new float[20];
        for (int i = 0; i < b.length; i++) {
            b[i]=(float) 0.5;
        }
      
        System.arraycopy(a.getArreglo(), 0, b, 0, 10);
        //llamo a mi metodo estatico de esta clase y le paso el auxiliar para que lo muestre
        mostrarArreglo(b);
    }
            
    
}
