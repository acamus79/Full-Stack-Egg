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

    public void creaPuerto() {
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
            
            switch (op) {
            case 1:
                Barco b = creaBarco();
                System.out.println("El costo del dia de amarre es: $" + b.valorModulo());
                alquila(b);
                break;
            case 2:
                Velero v = creaVelero();
                System.out.println("El costo del dia de amarre es: $" + v.valorModulo());
                alquila(v);
                break;
            case 3:
                Yate y = creaYate();
                System.out.println("El costo del dia de amarre es: $" + y.valorModulo());
                alquila(y);
                break;
            case 4:
                Motor m = creaMotor();
                System.out.println("El costo del dia de amarre es: $" + m.valorModulo());
                alquila(m);
                break;
            case 5:
                System.out.println("CHAU!!!");
            default:
                System.out.println("Ingreso una opcion no valida");
        }
            
            
        } while (op != 5);

        

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

    private Yate creaYate() {
        Yate b = new Yate();
        System.out.println("Cual es la Matricula del Barco?");
        b.setMatricula(leer.next().toUpperCase());
        System.out.println("Cuantos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricacion AAAA");
        b.setAnioFabricacion(leer.nextInt());
        System.out.println("Cuantos Camarotes tiene?");
        b.setCantCamarotes(leer.nextInt());
        System.out.println("Cual es la potencia del motor en CV");
        b.setCv(leer.nextInt());
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
                a.getCapitan().setNave(b);
                System.out.println("Excelente!, cual es nombre del Capitan");
                a.getCapitan().setNombre(leer.next().toUpperCase());
                System.out.println("Numero de documento");
                a.getCapitan().setDni(leer.nextLong());
//                System.out.println("Fecha de Ingreso (dd/MM/aaaa)");
//                cadenaFecha = leer.next();
//                while (validaCadenaFecha(cadenaFecha) == null) {
//                    cadenaFecha = leer.next();
//                }
//                a.setFechaAlquiler(validaCadenaFecha(cadenaFecha));
                a.setFechaAlquiler(LocalDate.now());//hoy tiene mas logica
                System.out.println("Ingrese la fecha de Salida (dd/MM/aaaa)");
                cadenaFecha = leer.next();
                while (validaCadenaFecha(cadenaFecha) == null) {
                    cadenaFecha = leer.next();
                }
                a.setFechaDevolucion(validaCadenaFecha(cadenaFecha));
                a.calculaAlquiler();
                break;
            case 'N':
                System.out.println("Gracias, vuelva otro dia");
                break;
            default:
                System.out.println("Ingreso una opcion no valida, vuelva otro dia");
        }

    }

    public static LocalDate validaCadenaFecha(String date) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha;
        try {
            fecha = LocalDate.parse(date, dtf);
        } catch (DateTimeParseException e) {
            return null;
        }
        return fecha;
    }

}
