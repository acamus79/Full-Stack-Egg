/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package servicios;

import entidades.*;
import java.util.*;

/**
 *
 * @author Adrian E. Camus
 */
public class ServicioPuerto {

    Scanner leer;

    public ServicioPuerto() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Puerto creaPuerto() {
        int op = 0;
        ArrayList<Barco> lista = new ArrayList();
        do
        {
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

        switch (op)
        {
            case 1:
                Barco b = creaBarco();
                System.out.println("EL costo del dia de amarre es: " + b.valorModulo());
                lista.add(b);
                break;
            case 2:
                Velero v = creaVelero();
                System.out.println("EL costo del dia de amarre es: " + v.valorModulo());
                lista.add(v);
                break;
            case 3:
                break;
            case 4:
                break;
            default:

        }

        return null;
    }
//String matricula, Integer eslora, Integer anioFabricacion, Persona duenio)

    private Barco creaBarco() {
        Barco b = new Barco();
        System.out.println("Cual es la Matricula del Barco?");
        b.setMatricula(leer.next().toUpperCase());
        System.out.println("Cuantos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricacion AAAA");
        b.setAnioFabricacion(leer.nextInt());
        System.out.println("Nombre del Propietario");
        String duenio = leer.next().toUpperCase();
        System.out.println("DNI del Propietario");
        long dni = leer.nextLong();
        b.setPropietario(new Persona(duenio, dni));

        return b;
    }

    private Motor creaMotor() {
        Motor b = new Motor();
        System.out.println("Nombre del Propietario");
        String duenio = leer.next().toUpperCase();
        System.out.println("DNI del Propietario");
        long dni = leer.nextLong();
        b.setPropietario(new Persona(duenio, dni));
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
        System.out.println("Nombre del Propietario");
        String duenio = leer.next().toUpperCase();
        System.out.println("DNI del Propietario");
        long dni = leer.nextLong();
        b.setPropietario(new Persona(duenio, dni));
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
    
    
}
