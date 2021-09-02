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
public class Circulo implements CalculosFormas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calculaArea() {
        System.out.printf("\nEl Area del Circulo es %.2f", CalculosFormas.pi * (this.radio * this.radio));
    }

    @Override
    public void calculaPerimetro() {
        System.out.printf("\nEl Perimetro del Circulo es %.2f", CalculosFormas.pi * (2 * this.radio));
    }

}
