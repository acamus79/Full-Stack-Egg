/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Declarar una clase llamada Circunferencia que tenga como atributo privado 
    el radio de tipo real. A continuación, se deben crear los siguientes métodos: 
    
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en 
    el atributo del objeto. 
    d) Método area(): para calcular el área de la circunferencia (Area=π∗radio!).
    e) Método perimetro(): para calcular el perímetro (Perimetro=2∗π∗radio)

 */

package ej02;

import ej02.entidades.Circunferencia;
import ej02.servicios.ServiciosCircunferencia;

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
        
        ServiciosCircunferencia sc = new ServiciosCircunferencia();
        Circunferencia c = sc.crearCircunsferencia();
        System.out.println("El Area de la circunsferencia es "+sc.calculaArea());
        System.out.println("El Perimetro de la circunferencia es "+sc.calculaPerimetro());
    }

}
