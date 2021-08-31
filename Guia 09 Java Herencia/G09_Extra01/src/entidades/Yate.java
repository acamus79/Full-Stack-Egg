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
public class Yate extends Barco {

    private int cv;
    private int cantCamarotes;

    public Yate() {
    }

    public Yate(int cv, int cantCamarotes, String matricula, Integer eslora, Integer anioFabricacion, Persona duenio) {
        super(matricula, eslora, anioFabricacion, duenio);
        this.cv = cv;
        this.cantCamarotes = cantCamarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public double valorModulo() {
        return super.valorModulo() + this.cv + this.cantCamarotes;
    }

}