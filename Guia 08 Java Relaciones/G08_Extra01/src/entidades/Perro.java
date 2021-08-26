/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Clase Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 


 */
package entidades;

import enumeradores.*;

/**
 *
 * @author Mesa 71
 */
public class Perro {

    private String nombre;
    private Integer edad=0;
    private Raza raza;
    private Tamanio tamanio;

    public Perro() {
    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public Perro(String nombre, Integer edad, Raza raza, Tamanio tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return nombre + " Edad:" + edad + " Raza: " + raza + " Tamaño: " + tamanio;
    }

}
