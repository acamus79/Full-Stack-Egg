/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

 


• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible. 

• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
caso de no existir solución, se mostrará un mensaje. 

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo 
delante de -b


 */
package ej03.servicios;

import ej03.entidades.Raiz;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosRaiz {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raiz crearRaiz() {
        System.out.println("Ingresa valor de a");
        double a = leer.nextInt();
        System.out.println("Ingresa valor de b");
        double b = leer.nextInt();
        System.out.println("Ingresa valor de c");
        double c = leer.nextInt();
        return new Raiz(a, b, c);

    }
    /*
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    */
    private static boolean tieneRaices(Raiz r){
//        if(r.getDiscriminante()>=0){
//            return true;
//        }else{
//            return false;
//        }
        return r.getDiscriminante()>0;
    }
    
/*
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.     
*/            
    private static boolean tieneRaiz(Raiz r){
        return r.getDiscriminante()==0;
//        if(r.getDiscriminante()==0){
//            return true;
//        }else {
//            return false;
//        }
        
    }
    
/*
Método obtenerRaices(): llama a tieneRaices() y si devolvió true, imprime las 2 
posibles soluciones. 
*/    
  
    private static void obtenerRaices(Raiz r){
        //(-b±√((b^2)-(4*a*c)))/(2*a)
        if (tieneRaices(r)==true){
            System.out.println("La ecuacion tiene dos soluciones");
            double res1 = (-r.getB())+(Math.sqrt(r.getDiscriminante()))/2*r.getA();
            double res2 = (-r.getB())-(Math.sqrt(r.getDiscriminante()))/2*r.getA();
            System.out.println("Primera solucion: "+res1);
            System.out.println("Segunda solucion: "+res2);
        }
        
    }
    
    
}
