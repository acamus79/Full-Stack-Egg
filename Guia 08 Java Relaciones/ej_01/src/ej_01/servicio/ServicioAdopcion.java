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
  
    public ServicioAdopcion() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
      
    }

//String nombre, String apellido, int edad, long dni, Perro pet
    public void llenaPerro(Perro p) {
        // Muestro la raza y le pido al usuario que elija una
        System.out.println("Escriba la raza para adoptar de las disponibles");
        for (Raza object : Raza.values()) {
            System.out.println(object.name());
        }
        System.out.println("");//solo para un salto de linea
        String razaVar = leer.next();
        //recorre otra vez el enum raza y compara con lo ingresado por el usuario
        for (Raza aux : Raza.values()) {
            if (aux.toString().equalsIgnoreCase(razaVar)) {
                p.setRaza(aux);
            }
        }
        //Muestro el enum Tamanio y le pido al usuario que elija
        System.out.println("Escriba el tamaño del perro");
        for (Tamanio object : Tamanio.values()) {
            System.out.println(object.name());
        }
        System.out.println("");
        String tamaVar = leer.next();

        for (Tamanio aux : Tamanio.values()) {
            if (aux.toString().equalsIgnoreCase(tamaVar)) {
                p.setTam(aux);
            }
        }
    }

}
