/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar una clase llamada Matemática que tenga como atributos dos números 
reales con los cuales se realizarán diferentes operaciones matemáticas. La 
clase deber tener un  constructor  vacío,  parametrizado  y  get  y  set. 
En  el  main  se  creará  el  objeto  y  se usará el Math.random para generar 
los dos números y se guardaran en el objeto con su respectivos set.  
Deberá además implementar los siguientes métodos:  
 
• Método  devolverMayor()  para  retornar  cuál  de  los  dos  atributos  
tiene  el  mayor valor  

• Método  calcularPotencia()  para  calcular  la  potencia  del  mayor  valor de
la  clase elevado al menor número. Previamente se deben redondear ambos valores.

• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos 
valores. Antes de calcular la raíz cuadrada se debe obtener el valor 
absoluto del número.

 */

package ej09;

import ej09.entidades.Matematica;
import ej09.servicios.ServiciosMatematica;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        //Constructor Vacio de la clase Matematica
        Matematica m = new Matematica();
        //Utilizo random en dos variables para setear
        //seteos de "m" con n1 y n2
        m.setNumero1(Math.random()*60+1);
        m.setNumero2(Math.random()*60+1);
        System.out.println(m);
        
        //Constructor Vacio de la clase ServiciosMatematica
        ServiciosMatematica sm = new ServiciosMatematica();
        sm.calcularPotencia(m);
        sm.calculaRaiz(m);
                
    }

}
