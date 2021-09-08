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

    public Persona(String Nombre, String apellido, long dni, EstadoCivil estado) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
    }
   
   public abstract void cambioEstado();
}
