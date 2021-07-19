/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej02.servicios;

import ej02.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosCircunferencia {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double radio;
    public Circunferencia crearCircunsferencia() {
        System.out.println("Ingresa el radio de la circunsferencia");
        radio = leer.nextDouble();
        Circunferencia c = new Circunferencia(radio);
        return c;
    }

    public double calculaArea() {
        double area;
        area = Math.PI*radio;
        return area;
    }
    
    public double calculaPerimetro() {
        double perimetro;
        perimetro = (2*Math.PI)*radio;
        return perimetro;
    }
    
}
