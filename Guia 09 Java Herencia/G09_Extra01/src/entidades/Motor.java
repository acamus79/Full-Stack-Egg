/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Motor extends Barco{

    private int cv;

    public Motor() {
    }

    public Motor(int cv, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public double valorModulo() {
        return super.valorModulo()+this.cv;
    }
    
    
}
