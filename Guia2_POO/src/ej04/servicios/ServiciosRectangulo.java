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
    

    public Rectangulo crearRectangulo() {
        System.out.println("Ingresa la base del rectangulo");
        int base = leer.nextInt();
        System.out.println("Ingresa la altura del rectangulo");
        int altura = leer.nextInt();
        return new Rectangulo(base, altura);
    }

    public int superficie(Rectangulo r) {
        int base = r.getBase();
        int altura = r.getAltura();
        return base * altura;
    }

    public int perimetro(Rectangulo r) {
        int base = r.getBase();
        int altura = r.getAltura();
        return (base + altura) * 2;
    }

    public void dibujar(Rectangulo r){
        int base = r.getBase();
        int altura = r.getAltura();
        int i=0,j=0;
        while(i<altura) {
            while(j<base) {
             System.out.print("*");
                j++;
            }
        System.out.println();
        j=0;
        i++;
        }

 }

}
