/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Perro, que tendrá como atributos: nombre, raza, edad y tamaño;

 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Perro {
    private String nombre, raza;
    private int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return " Perro: " +nombre+" de Raza: "+ raza +" Edad: "+ edad;
    }
    
    
}
