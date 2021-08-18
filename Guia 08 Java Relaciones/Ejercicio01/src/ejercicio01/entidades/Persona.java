/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ejercicio01.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Persona {

    private String nombre, apellido, documento;
    private int edad;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String documento, int edad, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellido + "\nDNI: " + documento + " edad: " + edad + "\nMascota:" + mascota.toString();
    }

}
