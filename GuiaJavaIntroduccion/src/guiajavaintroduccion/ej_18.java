/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre 
los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que 
aparezca un 3 lo sustituya por una E.

Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E

Nota: investigar función equals() y como convertir números a String.

 */
package guiajavaintroduccion;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_18 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        int a = 0;        
        do{ 
                        
              for (int i=0;i<=9;i++){
                  a++;
                  String convI = String.valueOf(i); //convierto i a cadena
                    if (i==3){//si i toma el valor de 3 su equivalente convertido le asigno la letra E
                    convI="E";
                    }
                  for (int j=0;j<=9;j++){
                     String convJ = String.valueOf(j);//convierto j a cadena
                      if (j==3){//si j toma el valor de 3 su equivalente convertido le asigno la letra E
                        convJ = "E";
                      }   
                      for (int k=0;k<=9;k++){
                          String convK = String.valueOf(k);//convierto k a cadena
                          TimeUnit.SECONDS.sleep(1);//mando a dormir un segundo para que parezca un reloj
                          if (k==3){
                              convK = "E";//si k toma el valor de 3 su equivalente convertido le asigno la letra E
                          }
                      System.out.println("CONTADOR: "+ convI+" - "+convJ+" - "+convK); 
                      }
                  }
                  
              }
        
        }while (a<=9);
        
        
    }
    
}
