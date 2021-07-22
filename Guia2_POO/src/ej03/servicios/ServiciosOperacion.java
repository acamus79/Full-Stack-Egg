/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.

e) Método sumar(): 
calcular la suma de los números y devolver el resultado al main.

f) Método restar(): 
calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): 
primero valida que no se haga una multiplicación por cero, si fuera a 
multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main

h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le informa
al usuario el error se le informa al usuario. Si no, se hace la división y se 
devuelve el resultado al main.

 */
package ej03.servicios;

import ej03.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosOperacion {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion(){
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
    return new Operacion(num1,num2);
    }
    
    public int sumar(Operacion c){
        return c.getNumero1()+c.getNumero2();
    }
    
    public int restar(Operacion c){
        return c.getNumero1()-c.getNumero2();
        
    }
    
    public int multiplicar(Operacion c){
        
        if (c.getNumero1()==0 || c.getNumero2()==0){
            System.out.println("Uno de los factores es 0");   
        return 0;
        }else {
            return c.getNumero1()*c.getNumero2();
        }
    }
    
    public float dividir(Operacion c){
        if (c.getNumero1()==0 || c.getNumero2()==0){
            System.out.println("Dividendo o Divisor es 0");   
        return 0;
        }else {
            return c.getNumero1()/c.getNumero2();
        }
    }
    
}
