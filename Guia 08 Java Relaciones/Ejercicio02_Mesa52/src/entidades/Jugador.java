/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el 
número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por 
ejemplo) y mojado (indica si está mojado o no el jugador). 
El número de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. 
Si no está en este rango, por defecto será 6.
Métodos:

• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.

 */
package entidades;

import java.util.Objects;

/**
 *
 * @author Drok
 */
public class Jugador {

    private int id;
    private boolean muerto;
    private String nombre; //Juan Jugador 1

    public Jugador() {
    }

    public Jugador(int id, boolean muerto, String nombre) {
        this.id = id;
        this.muerto = muerto;
        this.nombre = nombre;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.nombre);
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
        String alma = "VIVO";
        if (muerto) {
            alma = "MUERTO";
        }
        return nombre + " Jugador " + id + " " + alma;
    }

}
