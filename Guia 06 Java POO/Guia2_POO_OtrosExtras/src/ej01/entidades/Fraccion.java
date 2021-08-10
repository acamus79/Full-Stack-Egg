/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package ej01.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Fraccion {
private int denominador;
private int numerador;

    public Fraccion(int numerador, int denominador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return numerador + "\n-----\n"+denominador+"\n";
    }


}
