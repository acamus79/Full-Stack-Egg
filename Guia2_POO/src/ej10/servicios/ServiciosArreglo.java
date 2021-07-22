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
        System.out.println("\n");
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
    
    public void copiaContenido(Arreglo a, Arreglo b){
        
        System.out.println("Ingrese hasta que indice desea copiar del Arreglo A al Arreglo B");
        int n = leer.nextInt();
        //declaro un vector que lo voy a usar para setear el Arreglo
        float v[] = new float[b.getN()];
        //Lleno el vector 2 con 0.5
        Arrays.fill(v, 0.5F);
        //copio los n primeros numeros del Arreglo A al vector
        System.arraycopy(a.getArreglo(), 0, v, 0, n);
        //seteo el contenido del vector en el Arreglo B
        b.setArreglo(v);
                
    }
    
}
