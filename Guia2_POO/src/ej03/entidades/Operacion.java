/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

 a) Método constructor con todos los atributos pasados por parámetro.
 b) Metodo constructor sin los atributos pasados por parámetro.
 c) Métodos get y set.    

 */
package ej03.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    
}
