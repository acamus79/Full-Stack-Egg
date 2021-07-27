/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:

http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

***Nota Personal: ** no deberia ser una clase puntos sino PUNTO en singular con
dos coordenadas, y para hacer lo mismo se deberian crear dos objetos Punto y 
ahi comparar las coordenadas y calcular la distancia.

 */

package ej02;

import ej02.entidades.Puntos;
import ej02.servicios.ServiciosPuntos;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        ServiciosPuntos sp = new ServiciosPuntos();
        Puntos p1 = sp.crearPuntos();
        
        sp.calculaDistancia(p1);
        
    }

}
