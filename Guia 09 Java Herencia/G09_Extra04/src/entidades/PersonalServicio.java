/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package entidades;

import enumeradores.EstadoCivil;
import enumeradores.Seccion;

/**
 * 
 * @author Adrian E. Camus
 */
public class PersonalServicio extends Empleado {

    private Seccion seccion;

    public PersonalServicio(Seccion seccion, Integer anioIncorpora, Integer despacho, String Nombre, String apellido, long dni, EstadoCivil estado) {
        super(anioIncorpora, despacho, Nombre, apellido, dni, estado);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
    
    
    
}
