/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Recorrer un vector de N enteros contabilizando cuántos números 
    son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_24 {

    /**
     * @param args the command line arguments
     */
   
//Funcion llena y muestra con aleatorios un vector de indice N 
    /*
    fuerzo que los generados sean enteros con (int) y luego limito que sean
    desde 0 a 99 los aleatorios pero al final le sumo +1 para que nunca
    me toque el 0 como aleatorio
    */
    
    static int[] vectores(int n){
    int[] V= new int[n];
        for (int pos = 0; pos < n; pos++){
            V[pos] = (int)(Math.random()*9999+1);
        
            System.out.print("["+V[pos]+"]");
        }
        System.out.println("");
        return V;
    }


       
    
    //main
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int n, cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        int[] miVector;
        
        System.out.println("Ingresa el tamaño del arreglo");
        n=leer.nextInt();
        
        miVector = vectores(n);
        //asigno y lo que me devuelve la funcion vectores a mi vector
        System.out.println("");
        System.out.println("Analisis de digitos");
        System.out.println("");
        for (int i=0;i<miVector.length;i++){
                System.out.println("[" + miVector[i] + "] tiene    "+ Integer.toString(miVector[i]).length() + " dígitos");
                
                switch (Integer.toString(miVector[i]).length()){
                    case 1: cont1++;
                    case 2: cont2++;
                    case 3: cont3++;
                    case 4: cont4++;
                    case 5: cont5++;
                }
                }
                System.out.println("");
        
        System.out.println(cont1+"   Numeros tienen 1 digito");
        System.out.println(cont2+"   Numeros tienen 2 digitos");
        System.out.println(cont3+"   Numeros tienen 3 digitos");
        System.out.println(cont4+"  Numeros tienen 4 digitos");
        System.out.println(cont5+"  Numeros tienen 5 digitos");        
    }
    
}
