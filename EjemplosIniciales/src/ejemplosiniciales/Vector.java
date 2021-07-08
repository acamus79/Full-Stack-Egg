/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ejemplosiniciales;

/**
 *
 * @author Adrian E. Camus
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vector[] = new int[5]; // Le ponemos la dimension al vector
        
        for (int i = 0; i < 5; i++) {
         
            vector[i] = 6; // Le asignamos a cada posicion del vector el numero 6 
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            // Usamos la i para pasar por todos los elementos y mostrarlos
            System.out.print("[" + vector[i] + "]");
            
        }
        
        System.out.println(" ");
        
        
    }
    
}
