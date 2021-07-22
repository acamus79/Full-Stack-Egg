/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej10.servicios;

import ej10.entidades.Arreglo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosArreglo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Arreglo crearArreglo() {
        System.out.println("Ingrese el Tamaño del Arreglo");
        int n = leer.nextInt();
        return new Arreglo(n);
    }

    public void mostrarArreglo(Arreglo a) {
        for (int i = 0; i < a.getN(); i++) {
            System.out.print("[" + a.getArreglo()[i] + "] ");
        }
        System.out.println("");
    }

    public void llenaArregloRandom(Arreglo a) {
        float v[] = new float[a.getN()];
        float num;
        for (int i = 0; i < v.length; i++) {
            num = (float) (Math.random()*60+1);    
            v[i] = num;
        }
        a.setArreglo(v);
    }

    public void ordenaArreglo(Arreglo a){
        float v[] = new float[a.getN()];
        v = a.getArreglo();
        Arrays.sort(v);
        a.setArreglo(v);
     }
    
    public void copiaContenido(Arreglo a, Arreglo b, int n){
        float v1[] = new float[n];
        float v2[] = new float[b.getN()];
        
        for (int i = 0; i < v1.length; i++) {
             v1[i] = a.getArreglo()[i];
        }
        
    }
    
}
