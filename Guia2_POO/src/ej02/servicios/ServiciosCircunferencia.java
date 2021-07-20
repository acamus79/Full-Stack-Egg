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
    
    public Circunferencia crearCircunsferencia() {
        System.out.println("Ingresa el radio de la circunsferencia");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
    }

    public double calculaArea(Circunferencia c) {
        double radio = c.getRadio();
        double area;
        area = Math.PI*radio;
        return area;
    }
    
    public double calculaPerimetro(Circunferencia c) {
        double radio = c.getRadio();
        double perimetro;
        perimetro = (2*Math.PI)*radio;
        return perimetro;
    }
    
}
