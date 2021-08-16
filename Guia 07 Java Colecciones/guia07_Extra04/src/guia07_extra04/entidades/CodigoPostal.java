/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_extra04.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class CodigoPostal {
    private String ciudad;
    private Integer cp;

    public CodigoPostal() {
    }

    public CodigoPostal(String ciudad, Integer cp) {
        this.ciudad = ciudad;
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }
    
    
}
