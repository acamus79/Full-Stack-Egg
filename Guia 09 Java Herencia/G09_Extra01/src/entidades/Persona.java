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
public abstract class Persona {
    
    private String nombre;
    private long dni;
    private Barco nave;

    public Persona() {
    }

    public Persona(String nombre, long dni, Barco nave) {
        this.nombre = nombre;
        this.dni = dni;
        this.nave = nave;
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
    
     public Barco getNave() {
        return nave;
    }

    public void setNave(Barco nave) {
        this.nave = nave;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

    
}
