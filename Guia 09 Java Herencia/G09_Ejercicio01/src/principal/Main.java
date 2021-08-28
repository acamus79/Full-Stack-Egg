/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta



 */
package principal;

import entidades.*;

/**
 *
 * @author Adrian E. Camus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String nombre, String come, Integer edad, String raza
        Animal perro = new Perro("Stich", "Carne", 5, "Doberman");
        perro.seAlimenta();

        Animal perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.seAlimenta();

        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.seAlimenta();
        
        Caballo caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.seAlimenta();
        //accedo al toString de Animal
        System.out.println(caballo); 

    }

}
