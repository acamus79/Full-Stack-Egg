/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar una clase llamada Persona que tenga los siguientes atributos: nombre,
edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea
añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:

• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.

• Metodo crearPersona(): el método crear persona, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Persona. Además, comprueba que el sexo introducido sea 
correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje

• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg /(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 
25 (incluidos), significa que el peso está por debajo de su peso ideal y la 
función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor 
mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve 
un 1. Se recomienda hacer uso de constantes para devolver estos valores.

• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e 
indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y 
esMayorDeEdad en distintas variables, para después en el main, calcular un 
porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en 
su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de 
cuantos son mayores de edad y cuantos menores.


Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, 
get y set. Y los siguientes métodos: 

Ejemplo Date como atributo: DateAtributo

• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.

• Agregar a la clase el método menorQue(int edad) que recibe como parámetro 
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.

• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.

 */
package ej07_y_ej12_meet;

import ej07_y_ej12_meet.entidades.Persona;
import ej07_y_ej12_meet.servicios.ServiciosPersona;
import java.time.LocalDate;

/**
 *
 * @author Adrian E. Camus
 */
public class Ej07_y_ej12_meet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!

        ServiciosPersona sp = new ServiciosPersona();
        Persona p1 = sp.crearPersona();
        //Persona p2 = sp.crearPersona();
        //String nombre, char sexo, double peso, double altura, LocalDate fechaNac
        Persona p3 = new Persona("Juan", 'H', 75.0, 1.85, LocalDate.of(2006, 3, 25));
        Persona p4 = new Persona("Margarita", 'M', 48.0, 1.62, LocalDate.of(1991, 5, 17));
        Persona p2 = new Persona("Jose", 'O', 99.0, 1.82, LocalDate.of(1999, 8, 10));
        //System.out.println(p1.toString());

        sp.mostrarPersona(p1);
        sp.mostrarPersona(p2);
        sp.esMenorQue(p1, p2);
        sp.mostrarPersona(p3);
        sp.mostrarPersona(p4);
        sp.esMenorQue(p3, p4);
        sp.calculos(4);

    }

}
