/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
de String) y su longitud. En el main se creará el objeto y se le pedirá al 
usuario que ingrese una frase que puede ser una palabra o varias palabras 
separadas por un espacio en blanco  y  a  través  de  los  métodos  set,  se  
guardará  la  frase  y  la  longitud  de  manera automática según la longitud 
de la frase ingresada. Deberá además implementar los siguientes métodos:  
 
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
tiene la frase ingresada.

• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la 
frase invertida por pantalla. Por ejemplo: Entrada: "casa blanca", 
Salida: "acnalb asac". 

• Método  vecesRepetido(String  letra),  deberá  recibir  por  parámetro  un  
carácter ingresado  por  el  usuario  y  contabilizar  cuántas  veces  se  
repite  el  carácter  en  la frase, por ejemplo:  
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

• Método compararLongitud(String frase), deberá comparar la longitud de la
frase que compone la clase con otra nueva frase ingresada por el usuario. 

• Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con  una nueva frase ingresada por el usuario y mostrar la frase 
resultante. 

• Método  reemplazar(String  letra),  deberá  reemplazar  todas  las  letras  
“a”  que  se encuentren  en  la  frase,  por  algún  otro  carácter  
seleccionado  por  el  usuario  y mostrar la frase resultante. 

• Método contiene(String letra), deberá comprobar si la frase contiene una 
letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no. 

 */
package ej08;

import ej08.entidades.Cadena;
import ej08.servicios.ServiciosCadena;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa la palabra o frase");
        Cadena cad = new Cadena(leer.next());
        ServiciosCadena sc = new ServiciosCadena();
        
        sc.mostrarVocales(cad);
        
        sc.invertirFrase(cad);
        
        System.out.println("Ingrese la letra a buscar");
        String let = leer.next().toLowerCase();
        char letra = let.charAt(0);
        sc.vecesRepetido(cad, letra);
        
        System.out.println("Ingrese frase a comparar la longitud");
        sc.compararLongitud(cad, leer.next());
        
        System.out.println("Ingrese la frase para unir");
        sc.unirFrases(cad, leer.next());
        
        System.out.println("Ingrese la letra para remplazar");
        let = leer.next().toLowerCase();
        letra = let.charAt(0);
        sc.reemplazar(cad, letra);
        
        System.out.println("Ingrese la letra a buscar");
        if (sc.contiene(cad, leer.next())) {
            System.out.println("La frase Si contiene la letra");
        } else {
            System.out.println("La frase No contiene la letra");
        }
    }

}
