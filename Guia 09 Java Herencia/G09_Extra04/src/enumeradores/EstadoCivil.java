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
public enum EstadoCivil {

    SOLTERO ("Soltero/a"),CASADO("Casado/a"),DIVORCIADO("Divorciado/a"),UNIDO("Unido/a de Hecho"),VIUDO("Viudo/a");
    
    private String estadoCivil;

    private EstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    
    
}
