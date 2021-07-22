/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0. 
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 
posibles soluciones. 
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible. 
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
caso de no existir solución, se mostrará un mensaje. 

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo 
delante de -b


 */
package ej03.servicios;

import ej03.entidades.Raiz;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosRaiz {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raiz crearRaiz() {
        System.out.println("Ingresa valor de a");
        int a = leer.nextInt();
        System.out.println("Ingresa valor de b");
        int b = leer.nextInt();
        System.out.println("Ingresa valor de c");
        int c = leer.nextInt();
        return new Raiz(a, b, c);

    }
    
    

    
    
    
    
}
