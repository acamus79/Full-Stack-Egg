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
    private String departamento;
    private Integer cp;

    public CodigoPostal() {
    }

    public CodigoPostal(String ciudad, Integer cp) {
        this.departamento = ciudad;
        this.cp = cp;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
        hash = 67 * hash + Objects.hashCode(this.departamento);
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
        if (!Objects.equals(this.departamento, other.departamento)) {
            return false;
        }
        if (!Objects.equals(this.cp, other.cp)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Departamento: " + departamento + "  Codigo Postal: " + cp + "\n";
    }
    
    
}
