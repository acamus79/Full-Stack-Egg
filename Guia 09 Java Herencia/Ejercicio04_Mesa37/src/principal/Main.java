/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Se plantea desarrollar un programa que nos permita calcular el área 
y el perímetro de formas geométricas, en este caso un circulo y un rectángulo.

Ya que este calculo se va a repetir en las dos formas geométricas, vamos 
a crear una Interfaz,llamada calculosFormas que tendrá, los dos métodos para 
calcular el área, el perímetro y el valor de PI como constante.

Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se 
crearán las formas y se mostrará el resultado final.

Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.



 */
package principal;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author Adrian E. Camus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(3);
        Rectangulo r1 = new Rectangulo(3,5);
        System.out.println("AREA CIRCULO "+c1.calculaArea());
        System.out.println("PERIMETRO CIRCULO "+c1.calculaPerimetro());
        
        System.out.println("AREA RECTANGULO "+r1.calculaArea());
        System.out.println("PERIMETRO RECTANGULO "+r1.calculaPerimetro());
    }
    
}
