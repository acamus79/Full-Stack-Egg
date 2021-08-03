/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha 
usando la clase Date, para esto vamos a tener que crear 3 variables, dia, mes 
y anio que se le pedirán al usuario para poner el constructor del objeto Date. 
Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos 
años hay entre esa fecha y la fecha actual, que se puede conseguir instanciando
un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Ejemplo fecha actual: Date fechaActual = new Date();

 */
package ej11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class LocalDate_ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//para formatear la fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MMM yyyy");

        System.out.println("Ingrese el dia de su cumpleaños");
        int dia = leer.nextInt();
        System.out.println("Ingresa el mes en que naciste");
        int mes = leer.nextInt();
        System.out.println("Ingresa en año en que naciste");
        int anio = leer.nextInt();

        LocalDate fechaNac = LocalDate.of(anio, mes, dia);
//utilizo el objeto formato de la clase DateTimeFormatter para mostrar el objeto fechaNac
        System.out.println("La fecha ingresada es " + formato.format(fechaNac));

        LocalDate fechaHoy = LocalDate.now();
//Muestro la fecha actual de igual manera con el formato        
        System.out.println("La fecha actual es: " + formato.format(fechaHoy));

//utilizando otros metodos y clases sin tener que usar un formateador
        System.out.println("Hoy es: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(LocalDate.now()) + "\n");

        Period periodo = Period.between(fechaNac, fechaHoy);

        System.out.println("\n Tiempo trasncurrido desde su fecha ingresada a HOY:" + periodo.getDays()+" dias "+periodo.getMonths()+" meses "+periodo.getYears()+" años"
                + "\n Años transcurridos(EDAD EJ:):" + periodo.getYears()); //USO SI QUIERO SABER EDAD D ALGUIEN POR EJ.

    }
}
