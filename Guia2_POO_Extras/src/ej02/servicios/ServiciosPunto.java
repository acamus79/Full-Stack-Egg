/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej02.servicios;

import ej02.entidades.Punto;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosPunto {

    public Punto crearPuntos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese coordenada X");
        int x = leer.nextInt();
        System.out.println("Ingrese coordenada Y");
        int y = leer.nextInt();
        leer.close();
        return new Punto(x, y);
    }

    public void calculaDistancia(Punto p1, Punto p2) {
        /*
La distancia es igual a la Raiz cuadrada de la suma de la
potencia cuadrada de la resta de x2 - x1, mas la
potencia cuadrada de la resta de y2-y1
        d = √(x2-x1)^2+(y2-y1)^2
         */
        float f1 = (float) Math.pow((p2.getX() - p1.getX()), 2);
        float f2 = (float) Math.pow((p2.getY() - p1.getY()), 2);
        float dis = (float) Math.sqrt(f1 + f2);

        System.out.println("La distancia entre los puntos es: " + dis);
    }
}
