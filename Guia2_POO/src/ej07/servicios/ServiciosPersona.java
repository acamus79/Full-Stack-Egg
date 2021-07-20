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
    int pi=0,bp=0,sp=0,contMayor=0, contMenor=0;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //(String nombre, int edad, String sexo, float peso, float altura)
    public Persona crearPersona() {
        boolean bandera = true;
        String sexo;
        System.out.println("Ingrese el Nombre de la Persona");
        String nom = leer.next();
        System.out.println("Ingrese la Edad de la Persona");
        int edad = leer.nextInt();

        do {
            System.out.println("Ingrese el sexo de persona ´H´ para Hombre, ´M´ para Mujer ú ´O´ para Otro");
            sexo = leer.next();
            sexo = sexo.toUpperCase();
            if (sexo.length() > 1) {
                System.out.println("ERROR Ingresó mas de una letra");
                bandera = false;
            } 
            
            if (sexo.startsWith("H") || sexo.startsWith("M") || sexo.startsWith("O")) {
                bandera = true;
            }else{
                System.out.println("ERROR Ingresó un sexo no valido");
                bandera = false;
            }

        } while (!bandera);

        System.out.println("Ingrese el peso de la Persona");
        float p = leer.nextFloat();
        System.out.println("Ingrese la altura de la Persona");
        double al = leer.nextDouble();
        return new Persona(nom,edad,sexo,p,al);
    }

    public int calcularIMC(Persona p) {
        int imc = 0;

        if ((p.getPeso()) / (p.getAltura() * p.getAltura()) > 25) {
            imc = 1;
            
            System.out.println("Sobrepeso");            
        } else if ((p.getPeso()) / (p.getAltura() * p.getAltura()) >= 20) {
            imc = 0;
            pi++;
            System.out.println("Peso Ideal");
        } else {
            imc = -1;
            bp++;
            System.out.println("Bajo Peso");
        }

        return imc;
    }

    public boolean esMayorDeEdad(Persona p) {
        boolean mayor = false;
        if (p.getEdad() > 18) {
            mayor = true;
            contMayor++;
        }else{
            contMenor++;
        }
        return mayor;

    }

    public void estadistica(int cantPersonas){
        System.out.println("***********************************");
        System.out.println("**           NUMERICO            **");
        System.out.println("***********************************");
        System.out.println(contMayor+" Personas son mayores de edad");
        System.out.println(contMenor+" Personas son menores de edad");
        System.out.println(pi+" Personas tienen el peso ideal");
        System.out.println(bp+" Personas tienen bajo peso");
        System.out.println(sp+" Personas tienen sobrepeso");
        System.out.println("***********************************");
        System.out.println("**           PORCENTAJES         **");
        System.out.println("***********************************");
        System.out.println("El % de personas Mayores es "+(contMayor*100)/cantPersonas+"%");
        System.out.println("El % de personas Menores es "+(contMenor*100)/cantPersonas+"%");
        System.out.println("El % de personas con peso ideal es "+(pi*100)/cantPersonas+"%");
        System.out.println("El % de personas con sobrepeso es "+(sp*100)/cantPersonas+"%");
        System.out.println("El % de personas con bajo peso es "+(bp*100)/cantPersonas+"%");
    }
      
    
}
