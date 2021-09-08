/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package entidades;

import enumeradores.EstadoCivil;

/**
 *
 * @author Adrian E. Camus
 */
public class Profesor extends Empleado{
    
    
    public Profesor(Integer anioIncorpora, Integer despacho, String Nombre, String apellido, long dni, EstadoCivil estado) {
        super(anioIncorpora, despacho, Nombre, apellido, dni, estado);
    }
    
    
    
    
    @Override
    public void cambioEstado(){
        super.cambioEstado();
    }
}
