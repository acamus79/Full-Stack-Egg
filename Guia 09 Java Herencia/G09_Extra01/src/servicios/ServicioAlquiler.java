/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package servicios;

import entidades.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

/**
 *
 * @author Adrian E. Camus
 */
public class ServicioAlquiler {

    Scanner leer;

    public ServicioAlquiler() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Alquiler creaPuerto() {
        int op = 0;
        do {
            System.out.println("******* ALQUILER DE PUERTO *****");
            System.out.println("* 1. Alquiler de Barco s/Motor *");
            System.out.println("* 2. Alquiler de Velero        *");
            System.out.println("* 3. Alquiler de Yate de Lujo  *");
            System.out.println("* 4. Alquiler de Barco c/Motor *");
            System.out.println("* 5. Salir                     *");
            System.out.println("********************************");
            System.out.println("\nSelecciona una opcion");
            op = leer.nextInt();
        } while (op == 5);

        switch (op) {
            case 1:
                Barco b = creaBarco();
                System.out.println("El costo del dia de amarre es: " + b.valorModulo());
                alquila(b);
                break;
            case 2:
                Velero v = creaVelero();
                System.out.println("El costo del dia de amarre es: " + v.valorModulo());
                alquila(v);
                break;
            case 3:
                break;
            case 4:
                Motor m = creaMotor();
                System.out.println("El costo del dia de amarre es: " + m.valorModulo());
                alquila(m);
                break;
            default:

        }

        return null;
    }
    private Barco creaBarco() {
        Barco b = new Barco();
        System.out.println("Cual es la Matricula del Barco?");
        b.setMatricula(leer.next().toUpperCase());
        System.out.println("Cuantos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricacion AAAA");
        b.setAnioFabricacion(leer.nextInt());
        return b;
    }

    private Motor creaMotor() {
        Motor b = new Motor();
        System.out.println("Cual es la Matricula del Barco?");
        b.setMatricula(leer.next().toUpperCase());
        System.out.println("Cuantos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricacion AAAA");
        b.setAnioFabricacion(leer.nextInt());
        System.out.println("Cuantos CV tiene el Motor?");
        b.setCv(leer.nextInt());

        return b;
    }

    private Velero creaVelero() {
        Velero b = new Velero();
        System.out.println("Cual es la Matricula del Barco?");
        b.setMatricula(leer.next().toUpperCase());
        System.out.println("Cuantos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricacion AAAA");
        b.setAnioFabricacion(leer.nextInt());
        System.out.println("Cuantos Mastiles tiene?");
        b.setMastiles(leer.nextInt());

        return b;
    }

    private void alquila(Barco b) {
        Character op;
        String cadenaFecha;
        Alquiler a = new Alquiler();
        System.out.println("Amarrar barco al puerto? S/N");
        op = leer.next().toUpperCase().charAt(0);
        switch (op) {
            case 'S':
                System.out.println("Excelente!, cual es nombre del Capitan");
                a.getCapitan().setNombre(leer.next().toUpperCase());
                System.out.println("Numero de documento");
                a.getCapitan().setDni(leer.nextLong());
                a.getCapitan().setNave(b);
                a.setFechaAlquiler(LocalDate.now());
                System.out.println("Ingrese la fecha de devolucion (dd/MM/aaaa)");
                cadenaFecha = leer.next();
                while (validaCadenaFecha(cadenaFecha) == null) {
                    cadenaFecha = leer.next();
                }
                a.setFechaDevolucion(validaCadenaFecha(cadenaFecha));
                System.out.println("El costo total del Alquiler es:" +a.calculaAlquiler());
                break;
            case 'N':
                System.out.println("Gracias, vuelva otro dia");
                break;
            default:
                System.out.println("Ingreso una opcion no valida, vuelva otro dia");
        }

    }

    public static LocalDate validaCadenaFecha(String date) {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha;
        try {
            fecha = LocalDate.parse(date, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            return null;
        }
        return fecha;
    }

}
