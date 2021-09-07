/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número
de identificación y su estado civil.

 */
package entidades;

import enumeradores.EstadoCivil;

/**
 *
 * @author Adrian E. Camus
 */
public abstract class Persona {
    
   protected String Nombre;
   protected String apellido;
   protected long dni;
   protected EstadoCivil estado;
            
   public abstract void cambioEstado();
}
