/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package entidad;

/**
 *
 * @author Adrian E. Camus
 */
public class Motor extends Barco{
   private int potencia;

    public Motor() {
    }

    public Motor(int potencia, String matricula, int eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public double calculoModulo() {
        return super.calculoModulo()+this.potencia; 
    }
   
}
