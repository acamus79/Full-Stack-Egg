/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej03.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Raiz {
    private int a;
    private int b;
    private int c;

    public Raiz() {
    }

    public Raiz(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

/*
Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c     
*/    
  
    public int getDiscriminante(){
        return (b*b)-(4*a*c);
    }
    
}
