/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package entidad;

/**
 *
 * @author Adrian E. Camus
 */
public class Capitan {
    private String nombre;
    private long dni;
    private Barco ship;

    public Capitan() {
    }

    public Capitan(String nombre, long dni, Barco ship) {
        this.nombre = nombre;
        this.dni = dni;
        this.ship = ship;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Barco getShip() {
        return ship;
    }

    public void setShip(Barco ship) {
        this.ship = ship;
    }
    
    
}
