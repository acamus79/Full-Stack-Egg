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
        
        double num;
        
        for (int i = 0; i < v.length; i++) {
            num = (float) (Math.random() * 10 + 1);
            v[i] = (float) (Math.rint(num*100)/100);
//        v[i]= (float)(Math.random()*10+1);
                
        }
        a.setArreglo(v);
    }

    public void ordenaArreglo(Arreglo a) {
        //Creo un vector auxiliar
        float v[] = new float[a.getN()];
        //Lleno mi vector auxiliar con el contenido de mi Objeto Arreglo
        v = a.getArreglo();
        //Utilizo el metrodo SORT de la clase Arrays para ordenar mi vector auxiliar
        Arrays.sort(v);
        //COn el verctor ya ordenado seteo a mi objeto de la clase Arreglo
        a.setArreglo(v);
    }

    public void copiaContenido(Arreglo a, Arreglo b) {

//        System.out.println("Ingrese hasta que indice desea copiar del Arreglo A al Arreglo B");
        int n = 10;//leer.nextInt();

        //declaro un vector que lo voy a usar para setear el Arreglo
        float v[] = new float[b.getN()];
        //Lleno el vector 2 con 0.5 utilizando el metodo fill de la clase Arrays
        Arrays.fill(v, 0.5F);
        //copio los n primeros numeros del Arreglo A al vector
        System.arraycopy(a.getArreglo(), 0, v, 0, n);
        //seteo el contenido del vector en el Arreglo B
        b.setArreglo(v);

    }

}
