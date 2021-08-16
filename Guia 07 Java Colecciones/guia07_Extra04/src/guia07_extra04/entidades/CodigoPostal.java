/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_extra04.entidades;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.ciudad);
        hash = 67 * hash + Objects.hashCode(this.cp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CodigoPostal other = (CodigoPostal) obj;
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        if (!Objects.equals(this.cp, other.cp)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Departamento: " + ciudad + "  Codigo Postal: " + cp + "\n";
    }
    
    
}
