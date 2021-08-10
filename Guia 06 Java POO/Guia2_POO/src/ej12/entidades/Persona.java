/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, 
get y set. Y los siguientes métodos: 

 */

package ej12.entidades;

//import java.util.Date;

import java.time.LocalDate;


/**
 * 
 * @author Adrian E. Camus
 */
public class Persona {

    private String nombre;
//    private Date fechaNac;
    private LocalDate fechaNac;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
}
