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

    int cSobrepeso = 0;
    int cPesoIdeal = 0;
    int cBajoPeso = 0;
    int cMayorEdad = 0;
    int cMenorEdad = 0;

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

    private static int calcularIMC(Persona p) {
        double imc = p.getPeso() / (p.getAltura() * p.getAltura());
        int retorno;
        if (imc > 25) {
            retorno = 1;

        } else if (imc > 20) {
            retorno = 0;
        } else {
            retorno = -1;
        }

        return retorno;

    }

    private static boolean esMayorDeEdad(Persona p) {
        return p.getEdad() > 18;

    }

    public void mostrarPersona(Persona p) {

        switch (calcularIMC(p)) {
            case 0:
                cPesoIdeal++;
                break;
            case 1:
                cSobrepeso++;
                break;
            case -1:
                cBajoPeso++;
                break;
        }

        System.out.println("Persona de Nombre " + p.getNombre());
        System.out.println("\nDe sexo " + p.getSexo());
        if (esMayorDeEdad(p)) {
            System.out.println("Mayor de Edad \n");
            cMayorEdad++;
        } else {
            System.out.println("Menor de Edad\n");
            cMenorEdad++;
        }
        System.out.println("\nEdad: " + p.getEdad());

    }

    public void calculos(int cant) {

        System.out.println("Bajo Peso " + cBajoPeso * 100 / cant + " %");

        System.out.println("Peso Ideal " + cPesoIdeal * 100 / cant + " %");

        System.out.println("Sobrepeso " + cSobrepeso * 100 / cant + " %");

        System.out.println("Mayores de Edad " + cMayorEdad * 100 / cant + " %");

        System.out.println("Menores de Edad " + cMenorEdad * 100 / cant + " %");

    }

    public void esMenorQue(Persona m, Persona p) {
        if (m.getEdad() > p.getEdad()) {
            System.out.println(m.getNombre() + " es mayor que " + p.getNombre());
        } else {
            System.out.println(p.getNombre() + " es mayor que " + m.getNombre());
        }

    }
}
