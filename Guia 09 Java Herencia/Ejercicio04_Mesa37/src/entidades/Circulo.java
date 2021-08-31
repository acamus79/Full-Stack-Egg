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
public class Circulo implements CalculosFormas{
    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calculaArea() {
   
        return CalculosFormas.myPi*(this.radio*this.radio);
    }

    @Override
    public double calculaPerimetro() {
    
        return CalculosFormas.myPi*(this.radio*2);
            
    }
    
    
    
    
    
}
