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
public class Perro {

    private String nombre, raza, tamaño;
    private byte edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamaño, byte edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nPerro de nombre: " + nombre + "\nRaza: " + raza + "\nTama\u00f1o: " + tamaño + "\nEdad: " + edad;
    }

}
