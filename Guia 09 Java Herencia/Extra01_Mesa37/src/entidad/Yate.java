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
public class Yate extends Barco{
    private int potencia;
    private int nroCamarotes;

    public Yate() {
    }

    public Yate(int potencia, int nroCamarotes, String matricula, int eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.potencia = potencia;
        this.nroCamarotes = nroCamarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public double calculoModulo() {
        return super.calculoModulo()+this.potencia+this.nroCamarotes; 
    }
    
    
    
}
