/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
Cantidad de Pisos, Precio de Habitaciones.

El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel)

 */
package entidades;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Hotel extends Alojamiento {

    protected Integer cantHabitaciones, nroCamas, cantPisos;
    protected Double precioHabitacion;

    public Hotel() {
        precioHabitacion();
    }

    public Hotel(Integer cantHabitaciones, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void precioHabitacion() {
        this.precioHabitacion = (double) this.nroCamas + 50;
    }

    public void creaHotel() {
        super.creaAlojamiento();
        System.out.print("HOTEL ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de Camas");
        this.nroCamas = leer.nextInt();
        System.out.println("Cuantas Habitaciones tiene?");
        this.cantHabitaciones = leer.nextInt();
        System.out.println("Cuantos Pisos?");
        this.cantPisos = leer.nextInt();

    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Tipo Hotel con " + cantHabitaciones + " habitaciones y " + nroCamas + " camas, " + cantPisos + " pisos" + "\nPrecio de la Habitacion: $ " + precioHabitacion;
    }

}
