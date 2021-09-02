/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los alojamientos se identifican por un nombre, una dirección, una localidad 
y un gerente encargado del lugar. La compañía trabaja con 
dos tipos de alojamientos:

 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public abstract class Alojamiento {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected Persona gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, Persona gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }
    
    
    
}
