/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej04.servicios;

import ej04.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosRectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int base, altura;

    public Rectangulo crearRectangulo() {
        System.out.println("Ingresa la base del rectangulo");
        base = leer.nextInt();
        System.out.println("Ingresa la altura del rectangulo");
        altura = leer.nextInt();
        return new Rectangulo(base,altura);
    }

}
