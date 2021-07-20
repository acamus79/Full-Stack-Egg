/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Método  vecesRepetido(String  letra),  deberá  recibir  por  parámetro  un  
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
letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no

 */
package ej08.servicios;

import ej08.entidades.Cadena;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosCadena {
    
/*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
tiene la frase ingresada.*/
    public void mostrarVocales(Cadena f){
        String frase = f.getFrase().toLowerCase();
        int contador=0;
        for (int i = 0; i < f.getLongFrase(); i++) {
            switch (frase.substring(i, i+1)){
                case "a": contador++;
                    break;
                case "e": contador++;
                    break;
                case "i": contador++;
                    break;
                case "o": contador++;
                    break;
                case "u": contador++;   
            }
        }
        System.out.println(frase+" tiene "+contador+" vocales");    
    }
            
/* Método invertirFrase(), deberá invertir la frase ingresada y mostrar la 
frase invertida por pantalla. Por ejemplo: Entrada: "casa blanca", 
Salida: "acnalb asac".*/ 
    public void invertirFrase(Cadena f){
        String frase = f.getFrase().toLowerCase();    
        
        char[] cambio = frase.toCharArray();//metodo toCharArray
	int inicio = 0;
	int fin = cambio.length-1;
	char aux;
        //mientras el fin del vector sea mayor al inicio, hacer
	    while(fin>inicio){
	        aux = cambio[inicio];//guardo en auxiliar la primer letra
	        cambio[inicio] = cambio[fin];//invierto la ultima con la primera
	        cambio[fin] = aux;//pongo al final lo que tiene auxiliar
	        fin--;//resto 1 al fin
	        inicio++;//sumo 1 al inicio
	    }
	frase = new String(cambio);//le asigno a frase lo que tiene el vector
	System.out.println(frase);
    }
    
}
