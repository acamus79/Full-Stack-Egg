/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Clase Persona: con atributos: nombre, apellido, edad, documento y Perro.
 */
package entidades;

/**
 *
 * @author mesa 71
 */
public class Person {

    private String nombre, apellido;
    private Integer edad;
    private long dni;
    private Perro mascota;

    public Person() {
    }

    public Person(String nombre, String apellido, Integer edad, long dni, Perro mascota) {
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
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
        return "\nPersona: " + nombre + " " + apellido + "\nEdad: " + edad + " DNI Nro.: " + dni + "\nPerro: " + mascota.toString();
    }

}
