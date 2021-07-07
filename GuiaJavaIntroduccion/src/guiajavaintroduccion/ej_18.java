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
                  TimeUnit.SECONDS.sleep(1);
                  if (i==3){
                      
                  }
                  for (int j=0;j<=9;j++){
                      TimeUnit.SECONDS.sleep(1);
                      if (j==3){
                          
                      }   
                      for (int k=0;k<=9;k++){
                          //TimeUnit.SECONDS.sleep(1);
                          if (k==3){
                              
                          }
                      System.out.println("CONTADOR: "+ i+" - "+j+" - "+k); 
                      }
                  }
                  
              }
        
        }while (a<=9);
        
        
    }
    
}
