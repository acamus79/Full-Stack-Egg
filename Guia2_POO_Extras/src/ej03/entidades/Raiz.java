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
    private double a;
    private double b;
    private double c;

    public Raiz() {
    }

    public Raiz(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

/*
Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c     
*/    
  
    public double getDiscriminante(){
        return (b*b)-(4*a*c);
    }
    
}
