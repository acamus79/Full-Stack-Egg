/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para 
crear el rectángulo con los datos del Rectángulo dados por el usuario. También
incluirá un método para calcular la superficie del rectángulo y un método para
calcular el perímetro del rectángulo. Por último, tendremos un método que 
dibujará el rectángulo mediante asteriscos usando la base y la altura. Se 
deberán además definir los métodos getters, setters y constructores 
correspondientes.

Formulas: Superficie = base ∗ altura / Perímetro = (base + altura) ∗ 2.

 */

package ej04;

import ej04.entidades.Rectangulo;
import ej04.servicios.ServiciosRectangulo;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        
        ServiciosRectangulo sr = new ServiciosRectangulo();
        Rectangulo r = sr.crearRectangulo();
        sr.dibujar(r);
        
        System.out.println("La Superficie del rectangulo es "+sr.superficie(r));
        System.out.println("El perimetro del rectangulo es "+sr.perimetro(r));
    }

}
