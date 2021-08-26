/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa
va a tener que contar con muchas personas y muchos perros. El programa deberá
preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas
no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
se le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package servicio;

import entidades.*;
import enumeradores.*;
import java.util.*;

/**
 *
 * @author Drok
 */
public class ServicioAdopcion {

    Scanner leer;
    ArrayList<Perro> listaPerro;
    ArrayList<Persona> listaPersona;        
    
    public ServicioAdopcion() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPersona = new ArrayList();
        this.listaPerro = new ArrayList();
        
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
        
        listaPerro.add(new Perro("Khalifa",2));
        listaPerro.add(new Perro("Pulgas",3));
        listaPerro.add(new Perro("Cual",1));
        listaPerro.add(new Perro("Mortadela",4));
        listaPerro.add(new Perro("Chufli",2));
        listaPerro.add(new Perro("Moncho",3));
        listaPerro.add(new Perro("Negro",1));
        listaPerro.add(new Perro("Narigon",2));
        listaPerro.add(new Perro("Chicholina",2));
        listaPerro.add(new Perro("Xuxa",1));
        
        Collections.shuffle(listaPersona);
        Collections.shuffle(listaPerro);

    }

    
    public void adoptaPerro() {
        System.out.println("** LISTA DE NOMBRES DISPONIBLES **");
        Iterator<Perro> it = listaPerro.iterator();
        
        listaPerro.forEach(perro -> {
            System.out.print(perro.getNombre().toUpperCase()+", ");
        });
        
        System.out.println("\nElije uno...");
        String sele = leer.next();
        
        while(it.hasNext()){
            if(sele.equalsIgnoreCase(it.next().getNombre())){
                listaPerro.
            }
        }
        
    }
    
    
    public void razaTamanio(Perro choco) {
        System.out.println("*******RAZAS******");
        //recorre desde los valores del enum Raza y por cada vuelta del for
        // le asigna un valor del enum a la variable aux.
        for (Raza aux : Raza.values()) {
            System.out.println(aux);
        }
        System.out.println("*******TAMAÑOS******");
        for (Tamanio aux : Tamanio.values()) {
            System.out.println(aux);
        }

        System.out.println("\nElija la raza y el tamaño");
        String eleRaza = leer.next();
        String eleTam = leer.next();

        for (Raza aux : Raza.values()) {
//si lo que escribio el usuario es igual a el objeto auxiliar del enum convertido a String
            if (eleRaza.equalsIgnoreCase(aux.toString())) {
                choco.setRaza(aux);
            }
        }

        for (Tamanio aux : Tamanio.values()) {
            if (eleTam.equalsIgnoreCase(aux.toString())) {
                choco.setTamanio(aux);
            }

        }

    }

    
    
}
