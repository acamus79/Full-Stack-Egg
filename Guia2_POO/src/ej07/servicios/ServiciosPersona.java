/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• Metodo crearPersona(): el método crear persona, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Persona. Además, comprueba que el sexo introducido sea 
correcto, es decir, H, M ú O. Si no es correcto se deberá mostrar un mensaje

• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 
25 (incluidos), significa que el peso está por debajo de su peso ideal y la 
función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor 
mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve 
un 1. Se recomienda hacer uso de constantes para devolver estos valores.

• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

 */
package ej07.servicios;

import ej07.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //(String nombre, int edad, String sexo, float peso, float altura)
    public Persona crearPersona() {
        boolean bandera = true;
        System.out.println("Ingrese el Nombre de la Persona");
        String nom = leer.next();
        System.out.println("Ingrese la Edad de la Persona");
        int edad = leer.nextInt();

        do {
            System.out.println("Ingrese el sexo de persona ´H´ para Hombre, ´M´ para Mujer ú ´O´ para Otro");
            String sexo = leer.next();
            sexo = sexo.toUpperCase();
            if (sexo.length() > 1) {
                System.out.println("ERROR Ingresó un sexo mas de una letra");
                bandera = false;
            } else if (sexo.charAt(0) != 'H' || sexo.charAt(0) != 'M' || sexo.charAt(0) != 'O') {
                System.out.println("ERROR Ingresó un sexo no valido");
                bandera = false;
            }

        } while (!bandera);

        System.out.println("Ingrese el peso de la Persona");
        float p = leer.nextFloat();
        System.out.println("Ingrese la altura de la Persona");
        float al = leer.nextFloat();
        return new Persona();
    }

    public int calcularIMC(Persona p) {
        int imc = 0;

        if ((p.getPeso()) / (p.getAltura() * p.getAltura()) > 25) {
            imc = 1;
        } else if ((p.getPeso()) / (p.getAltura() * p.getAltura()) >= 20) {
            imc = 0;
        } else {
            imc = -1;
        }

        return imc;
    }

    public boolean esMayorDeEdad(Persona p) {
        boolean mayor = false;
        if (p.getEdad() > 18) {
            mayor = true;
        }

        return mayor;

    }

}
