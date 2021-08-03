/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej07_y_ej12_meet.servicios;

import ej07_y_ej12_meet.entidades.Persona;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //String nombre, char sexo, double peso, double altura, LocalDate fechaNac
    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la Persona");
        String nomb = leer.next();
        System.out.println("Cual es esl Sexo de la persona, H para Hombre - M para Mujer ú O para Otros");
        char sexo = leer.next().charAt(0);
        System.out.println("Cuanto pesa la persona?");
        double peso = leer.nextDouble();
        System.out.println("Que altura tiene?");
        double altura = leer.nextDouble();
        System.out.println("Ingresa el año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Que dia nacio la persona?");
        int dia = leer.nextInt();
        LocalDate fechaNac = LocalDate.of(anio, mes, dia);

        return new Persona(nomb, sexo, peso, altura, fechaNac);

    }

}
