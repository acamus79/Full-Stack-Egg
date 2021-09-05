/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los alojamientos se identifican por un nombre, una dirección, una localidad 
y un gerente encargado del lugar. La compañía trabaja con 
dos tipos de alojamientos:

 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public abstract class Alojamiento {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public void creaAlojamiento() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Nombre del Alojamiento");
        this.nombre = leer.next().toUpperCase();
        System.out.println("Ingrese la Direccion");
        this.direccion = leer.next().toUpperCase();
        System.out.println("Ingrese la Localidad");
        this.localidad = leer.next().toUpperCase();
        System.out.println("Como se llama el Gerente");
        this.gerente = leer.next().toUpperCase();
    }

}
