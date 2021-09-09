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
public enum Seccion {
    BIBLIOTECA("Biblioteca"), DECANATO("Decanato"), SECRETARIA("Secretaria"), RRHH("Recursos Humanos"), MANTENIMIENTO("Mantenimiento");

    private String seccion;

    private Seccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

}
