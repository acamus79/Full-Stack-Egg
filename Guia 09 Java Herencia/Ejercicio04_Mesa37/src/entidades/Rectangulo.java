/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package entidades;

import interfaces.CalculosFormas;

/**
 *
 * @author Adrian E. Camus
 */
public class Rectangulo implements CalculosFormas {

    private int base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return this.base * this.altura;
    }

    @Override
    public double calculaPerimetro() {
        return (this.base + this.altura) * 2;
    }

}
