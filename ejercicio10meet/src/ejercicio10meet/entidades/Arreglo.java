/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales.
 */
package ejercicio10meet.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Arreglo {
    
    private int n;
    private float[] arreglo = new float[n];

    public Arreglo() {
    }

    public Arreglo(int n) {
        this.n = n;
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
