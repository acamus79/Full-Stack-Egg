/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Clase Jugador: esta clase posee los siguientes atributos: id (representa el
número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” 
por ejemplo) y muerto (indica si está muerto o no el jugador). El número 
de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no 
está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los 
métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta, 
aprieta el gatillo y si el revolver tira el agua, el jugador se moja. 
El atributo muerto pasa a false y el método devuelve true, sino false.

 */

package ej_02.entidades;

import java.util.Objects;

/**
 * 
 * @author Adrian E. Camus
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean muerto;

    public Jugador() {
        this.nombre = "Jugador"+this.id;
        this.muerto = true;
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.muerto = mojado;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Jugador other = (Jugador) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    
    
    @Override
    public String toString() {
        String vida;
        if(this.muerto){
            vida = "MUERTO";
        }else{
            vida = "VIVO";
        }
        
        return nombre + id + " " + vida;
    }
    
    
    

}
