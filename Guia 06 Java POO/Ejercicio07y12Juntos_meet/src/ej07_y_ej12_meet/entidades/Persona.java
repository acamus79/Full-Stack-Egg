/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej07_y_ej12_meet.entidades;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Adrian E. Camus
 */
public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private LocalDate fechaNac;

    public Persona() {
    }

    public Persona(String nombre, char sexo, double peso, double altura, LocalDate fechaNac) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.fechaNac = fechaNac;
        LocalDate fechaActual = LocalDate.now();
        Period diferencia = Period.between(fechaNac, fechaActual);
        this.edad = diferencia.getYears();
    }

    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", fechaNac=" + fechaNac + '}';
    }

    
    
}
