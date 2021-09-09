/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package enumeradores;

/**
 *
 * @author Adrian E. Camus
 */
public enum Departamento {
    
    LENGUAJES ("Lenguajes"), LOGICA ("Logica"), MATEMATICA ("Matematica"), ARQUITECTURA ("Arquitectura"), DERECHO ("Derecho"), ARTE ("Arte");
    
    private String dpto;

    private Departamento(String dpto) {
        this.dpto = dpto;
    }

    public String getDpto() {
        return dpto;
    }
    
    
}
