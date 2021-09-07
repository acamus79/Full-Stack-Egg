/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

1. Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null 
y tratar de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el 
código con una cláusula try-catch para probar la nueva excepción que debe ser 
controlada.

 */
package principal;


import entidades.Persona;
import servicios.ServiciosPersona;

/**
 *
 * @author Adrian E. Camus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiciosPersona sp = new ServiciosPersona();
        //String nombre, int edad, String sexo, float peso, float altura
        Persona p1 = new Persona();
        p1.setNombre("Adrian");
        p1.setEdad(42);
        p1.setSexo("H");
        p1.setPeso(98);
        p1.setAltura((1.80));
        //Persona p1 = sp.crearPersona();

        Persona p2 = new Persona("William", 33, "H", 78, (1.86));
        //Persona p2 = sp.crearPersona();

        Persona p3 = new Persona("Alina", 9, "M", 37, (1.52));
        //Persona p3 = sp.crearPersona();

        //Persona p4 = sp.crearPersona();
        
        System.out.println(p1);
        sp.calcularIMC(p1);
        sp.esMayorDeEdad(p1);
        
        System.out.println(p2);
        sp.calcularIMC(p2);
        sp.esMayorDeEdad(p2);
        
        System.out.println(p3);
        sp.calcularIMC(p3);
        sp.esMayorDeEdad(null);
        
        //System.out.println(p4);
        //sp.calcularIMC(p4);
        //sp.esMayorDeEdad(null);
        //sp.estadistica(3);
        
        
        
        
    }
        
      

    
}
