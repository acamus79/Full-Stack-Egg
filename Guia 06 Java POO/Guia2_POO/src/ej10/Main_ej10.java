/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar un programa en Java donde se creen dos arreglos: el primero 
será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 
números, también reales. El programa  deberá  inicializar  el  arreglo  A  
con  números  aleatorios  y  mostrarlo  por pantalla. Luego, el arreglo A 
se debe ordenar de menor a mayor y copiar los primeros 10  números  ordenados 
al  arreglo  B  de  20  elementos,  y  rellenar  los  10  últimos elementos  
con  el  valor  0.5.  Mostrar  los  dos  arreglos  resultantes:  el  ordenado 
de  50 elementos y el combinado de 20. 

 */
package ej10;

import ej10.entidades.Arreglo;
import ej10.servicios.ServiciosArreglo;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!

        ServiciosArreglo sa = new ServiciosArreglo();
        Arreglo arregloA = sa.crearArreglo();

        sa.llenaArregloRandom(arregloA);
        
        System.out.println("Arreglo A");
        sa.mostrarArreglo(arregloA);
        
        System.out.println("Arreglo A Ordenado");
        sa.ordenaArreglo(arregloA);
        sa.mostrarArreglo(arregloA);

        Arreglo arregloB = sa.crearArreglo();
        sa.copiaContenido(arregloA, arregloB);
        System.out.println("Arreglo B");
        sa.mostrarArreglo(arregloB);

    }

}
