/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar una clase llamada Matemática que tenga como atributos dos números 
reales con los cuales se realizarán diferentes operaciones matemáticas. La 
clase deber tener un  constructor  vacío,  parametrizado  y  get  y  set.

 */
package ej09.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Matematica {
    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Numeros:\n" 
                + "Primer numero: " + numero1 
                + "\nSegundo numero: " + numero2;
    }
    
    
}
