/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad 
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se 
sirve lo que quede. El método le informará al usuario si se llenó o no la taza,
y de no haberse llenado en cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el 
método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */

package ej06.servicios;

import ej06.entidades.Cafetera;
import java.util.Scanner;

/**
 * 
 * @author Adrian E. Camus
 */
public class ServiciosCafetera {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera(){
        System.out.println("Ingrese la cantidad Maxima de la cafetera en cm3");
        int cantMax = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de la cafetera");
        int cantAct = leer.nextInt();
        return new Cafetera(cantMax,cantAct);
    }
    
    public void llenarCafetera(Cafetera c){
        int llenar = c.getCapacidadMaxima();
        c.setCantidadActual(llenar);
    }
    
    public void vaciarCafetera(Cafetera c){
        c.setCantidadActual(0);
    }

    public void servirTaza(Cafetera c){
        System.out.println("Tamaño de taza en cm3");
        int taza = leer.nextInt();
        
        if(c.getCantidadActual()>taza){
            int cantidad = c.getCantidadActual();
            cantidad -= taza;
            c.setCantidadActual(cantidad);
        }else{
            int resto = taza - c.getCantidadActual();
            c.setCantidadActual(0);
            System.out.println("Se sirvio la taza con "+resto+" cm3 y la cafetera quedo vacia");
        }
    }
    
    public void agregarCafe(Cafetera c, int cantCafe){
        if (c.getCapacidadMaxima()<=6 && cantCafe>25){
            System.out.println("para un cafetera de 6 o menos tazas se recomienda 20 gr de cafe");
        }else if(c.getCapacidadMaxima()<=12 && cantCafe>45){
            System.out.println("para un cafetera de entre 6 y 12 tazas se recomienda 40 gr de cafe");
        }else{
            c.setCantidadCafe(cantCafe);
        }
            
    }
}
