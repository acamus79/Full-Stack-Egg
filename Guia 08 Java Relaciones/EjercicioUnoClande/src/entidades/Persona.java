/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Persona con atributos: nombre, apellido, edad, documento y Perro.

 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Persona {
    
    private String nombre, apellido;
    private int edad;
    private long dni;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long dni, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", " + apellido + "\nEdad:" + edad + ", DNI Nro: " + dni + "\nMascota " + mascota.toString();
    }
    
      
    
    
}
