/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej02.servicios;

import ej02.entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosPuntos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Puntos crearPuntos(){
        System.out.println("Ingrese x1");
        int x1 = leer.nextInt();
        System.out.println("Ingrese y1");
        int y1 = leer.nextInt();
        System.out.println("Ingrese x2");
        int x2 = leer.nextInt();
        System.out.println("Ingrese y2");
        int y2 = leer.nextInt();
        
        return new Puntos(x1,y1,x2,y2);
    }
    
    public void calculaDistancia(Puntos p){
/*
La distancia es igual a la Raiz cuadrada de la suma de la
potencia cuadrada de la resta de x2 - x1, mas la
potencia cuadrada de la resta de y2-y1
        d = √(x2-x1)^2+(y2-y1)^2
*/
        float f1 = (float)Math.pow ((p.getX2()-p.getX1()),2);
        float f2 = (float)Math.pow ((p.getY2()-p.getY1()),2);
        float dis =(float)Math.sqrt(f1+f2);
        
        System.out.println("La distancia entre los puntos es: "+dis);
    }
}
