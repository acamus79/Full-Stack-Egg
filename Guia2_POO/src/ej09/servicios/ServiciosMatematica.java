/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej09.servicios;

import ej09.entidades.Matematica;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosMatematica {

    /*
    Método  devolverMayor()  para  retornar  cuál  de  los  dos  atributos  
    tiene  el  mayor valor  
     */

    public static double devolverMayor(Matematica m) {
        double num1 = m.getNumero1();
        double num2 = m.getNumero2();
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    /*
Método  calcularPotencia()  para  calcular  la  potencia  del  mayor  valor de
la  clase elevado al menor número. Previamente se deben redondear ambos valores.
    */
    public void calcularPotencia(Matematica m){
        double num1 = m.getNumero1();
        double num2 = m.getNumero2();
        double may = ServiciosMatematica.devolverMayor(m);
        num1 = Math.round(num1);
        num2 = Math.round(num2);
                
        if (may>num1){
            System.out.println("La potencia del mayor valor de la clase "
                    + "elevado al menor numero es: "+ Math.pow(num2, num1));
        }else{
            System.out.println("La potencia del mayor valor de la clase "
                    + "elevado al menor numero es: "+ Math.pow(num1, num2));
        }
    }
    
    /*
Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos 
valores. Antes de calcular la raíz cuadrada se debe obtener el valor 
absoluto del número. 
    */
    public void calculaRaiz(Matematica m){
        double num1 = m.getNumero1();
        double num2 = m.getNumero2();
        double may = ServiciosMatematica.devolverMayor(m);
        num1 = Math.round(num1);
        num2 = Math.round(num2);
                
        if (may>num1){
            System.out.println("La raiz cuadrada del menor valor es: "
                    + Math.sqrt(num1));
        }else{
            System.out.println("La raiz cuadrada del menor valor es: "
                    + Math.sqrt(num2));
        }
    }
}
