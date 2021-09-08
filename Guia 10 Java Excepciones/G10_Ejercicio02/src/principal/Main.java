/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango)

 */
package principal;


/**
 *
 * @author Adrian E. Camus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[] miVector = new int[10];
        
        try{
        for (int i = 0; i < 11; i++) {
            miVector[i] = (int) Math.random()*50+1;
            System.out.println("["+i+"] ");
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        
        System.out.println("Aca termina");
        
       }
}
