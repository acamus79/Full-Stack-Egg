/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Perro, que tendrá como atributos: nombre, raza, edad y tamaño

 */
package ej_01.entidades;

import ej_01.enumeraciones.Raza;
import ej_01.enumeraciones.Tamanio;
import java.util.Objects;

/**
 *
 * @author Adrian E. Camus
 */
public class Perro {
    private String nombre;
    private int edad;
    private Raza raza;
    private Tamanio tam;

    public Perro() {
    }

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Tamanio getTam() {
        return tam;
    }

    public void setTam(Tamanio tam) {
        this.tam = tam;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + this.edad;
        hash = 83 * hash + Objects.hashCode(this.raza);
        hash = 83 * hash + Objects.hashCode(this.tam);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perro other = (Perro) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.raza != other.raza) {
            return false;
        }
        if (this.tam != other.tam) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "\nPerro: " + nombre + " edad:" + edad + "\nRaza: " + raza + " Tamaño: " + tam ;
    }
    
    
    
}
