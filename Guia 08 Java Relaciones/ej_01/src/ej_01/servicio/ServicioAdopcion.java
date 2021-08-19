/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej_01.servicio;

import ej_01.entidades.Perro;
import ej_01.entidades.Persona;
import ej_01.enumeraciones.Raza;
import ej_01.enumeraciones.Tamanio;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServicioAdopcion {

    Scanner leer;
    Persona p1;
    Persona p2;


    public ServicioAdopcion() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.p1 = new Persona("Pepe", "Pompin", 40, (long) 242444545);
        this.p2 = new Persona("Pelado", "DeEGG", 35, (long) 455454545);

    }
        
//String nombre, String apellido, int edad, long dni, Perro pet
    public void llenaPerro(Perro p) {
               
        for (Raza object : Raza.values()) {
            System.out.println(object.name());
        }
        System.out.println("Escriba la raza para adoptar de las disponibles");
        String razaVar = leer.next();
        for (Raza aux : Raza.values()) {

            if (aux.toString().equalsIgnoreCase(razaVar)) {
                p.setRaza(aux);
            }
        }

        for (Tamanio object : Tamanio.values()) {
            System.out.println(object.name());
        }
        System.out.println("Escriba el tamaño del perro");
        String tamaVar = leer.next();
        
        for (Tamanio aux : Tamanio.values()) {

            if (aux.toString().equalsIgnoreCase(tamaVar)) {
                p.setTam(aux);
            }
        }
        System.out.println(p);
    }
    
    
    
    
}
