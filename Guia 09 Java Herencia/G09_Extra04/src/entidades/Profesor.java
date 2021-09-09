/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package entidades;

import enumeradores.Departamento;
import enumeradores.EstadoCivil;

/**
 *
 * @author Adrian E. Camus
 */
public class Profesor extends Empleado{
    
    private Departamento dpto;
    
    public Profesor(Departamento departamento, Integer anioIncorpora, Integer despacho, String Nombre, String apellido, long dni, EstadoCivil estado) {
        super(anioIncorpora, despacho, Nombre, apellido, dni, estado);
        this.dpto = departamento;
    }

    public Departamento getDpto() {
        return dpto;
    }

    public void setDpto(Departamento dpto) {
        this.dpto = dpto;
    }
    
        
    @Override
    public void cambioEstado(){
        super.cambioEstado();
    }
}
