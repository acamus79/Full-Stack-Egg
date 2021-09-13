/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package examen;

/**
 *
 * @author Adrian E. Camus
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    //aca el main    
        
        
        
    }
    
    
    //Geperinpingoposopo
    
    public static String geringoso(String palabra){
        
        String resultado = palabra.toLowerCase();
        
        resultado = resultado.replaceAll("a", "apa").replaceAll("e", "epe").replaceAll("i", "ipi").replaceAll("o", "opo").replaceAll("u", "upu");
        
        return resultado;
        
    }
    
        
    public static boolean parCieloPiso(int numEnt, double numReal, long numLargo){
        boolean resultado = false;
        
        if (numEnt % 2 == 0 && numLargo >= 0 && Math.round(numReal) == Math.floor(numReal)) {

            resultado = true;
        }

        return resultado;
        
    }
    
    
    //asrevni
    public static String inversa(String palabra){
               
        String invertida = palabra.toLowerCase();
            invertida = new StringBuilder(palabra).reverse().toString();
        return invertida;
    }
    
    
    
    
    
    
}
