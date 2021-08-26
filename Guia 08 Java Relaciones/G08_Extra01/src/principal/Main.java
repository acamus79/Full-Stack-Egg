/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa
va a tener que contar con muchas personas y muchos perros. El programa deberá
preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas
no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
se le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.


 */
package principal;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Collections;
import servicio.ServicioAdopcion;

/**
 *
 * @author Adrian E. Camus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Perro> listaPerro = new ArrayList();
        ArrayList<Persona> listaPersona = new ArrayList();

        listaPersona.add(new Persona("Elba", "Gallo", 37, 32422257));
        listaPersona.add(new Persona("Elena", "Nito", 27, 34527351));
        listaPersona.add(new Persona("Elber", "Galarga", 39, 29421880));
        listaPersona.add(new Persona("Debora", "Meltrozo", 25, 37421257));
        listaPersona.add(new Persona("Sevelinda", "Parada", 49, 24412157));
        listaPersona.add(new Persona("Jorge", "Nitales", 31, 35527897));
        listaPersona.add(new Persona("Mary", "Conazo", 29, 38429256));
        listaPersona.add(new Persona("Lucila", "Tanga", 37, 32998754));
        listaPersona.add(new Persona("Dolores", "Delano", 42, 27958154));
        listaPersona.add(new Persona("Igor", "Dito", 21, 42938154));

        

        Collections.shuffle(listaPersona);
        

        ServicioAdopcion sa = new ServicioAdopcion();
        sa.personaAdopta(listaPersona);

    }

}
