/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package ej10.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Arreglo {
    private int n;
    private float arreglo[]= new float[n];
    

    public Arreglo() {
    }

      
    public Arreglo(float a[]) {
        this.arreglo = a;
        
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public float[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(float[] arreglo) {
        this.arreglo = arreglo;
    }

    

}
