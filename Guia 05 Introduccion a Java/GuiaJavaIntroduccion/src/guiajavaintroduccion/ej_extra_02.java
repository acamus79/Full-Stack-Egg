/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Declarar cuatro variables de tipo entero A, B, C y D: asignarle un valor 
    diferente a cada una. A continuación, realizar las instrucciones 
    necesarias para que: 
    B tome el valor de C, 
    C tome el valor de A,
    A tome el valor de D y 
    D tome el valor de B. 

    Mostrar los valores iniciales y los valores finales de cada variable. 
    Utilizar sólo una variable auxiliar.
    
 */

package guiajavaintroduccion;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        int a=5,b=8,c=6,d=4,aux=0;
        System.out.println("  A = "+a);
        System.out.println("  B = "+b);
        System.out.println("  C = "+c);
        System.out.println("  D = "+d);
        System.out.println("*********");
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("  A = "+a);
        System.out.println("  B = "+b);
        System.out.println("  C = "+c);
        System.out.println("  D = "+d);
        
    }

}
