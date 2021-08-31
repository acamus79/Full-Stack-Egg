/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Persona {
    
    private String nombre;
    private long dni;

    public Persona() {
    }

    public Persona(String nombre, long dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
}
