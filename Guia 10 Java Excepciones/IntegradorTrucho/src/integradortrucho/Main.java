/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Función numeroCapicua(): 
La función recibirá un numero x y deberá determinar si es capicúa o no. 
Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
Además deberemos contemplar los siguientes escenarios: 
• Contemplar que el numero que llega puede ser negativo. 
• Contemplar que el numero que llega puede ser de un digito, si es así debe 
devolver true. 
• Contemplar que el numero que llega puede ser null, si es así debe devolver 
false.

Resultados esperados:
Si se ingresa el numero 123454321 deberá devolver true.
Si se ingresa el numero -123454321 deberá devolver true.
Si se ingresa el numero 2 deberá devolver true.
Si se ingresa el numero 0 deberá devolver true.
Si se ingresa null deberá devolver false.
Si se ingresa el numero 231 deberá devolver false.
Si se ingresa el numero 123 deberá devolver true.
******************************************************************************
Función prisioneroDulce():
Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una vez 
al mes, se sienta una n cantidad de presos en ronda, contemplando al preso que
inicia la ronda, como el preso 0.
A los presos se les da una m cantidad de caramelos, estos caramelos se 
repartirán de uno en uno a cada preso, contemplando que se comenzaran a 
repartir los caramelos desde el primer preso (inicio). Se repartirán los 
caramelos hasta que no queden más y el ultimo
caramelo en repartirse estará podrido, determinar a que preso, según su 
posición en la ronda le tocara el caramelo podrido.
Esta función recibe tres variables:
• inicio: está variable será el numero del preso que inicia la ronda.
• cantidadCaramelos: está variable será el numero de caramelos que se les da a los
presos.
• cantidadPresos: está variable será el numero de presos que componen a la ronda.

Resultados esperados:
• Sí se inicia con el preso 0, con 10 caramelos y 6 presos el resultado esperado es 3.
• Sí se inicia con el preso 7, con 4 caramelos y 8 presos el resultado esperado es 2.
• Sí se inicia con el preso 1, con 5 caramelos y 2 presos el resultado esperado es 1.
• Sí se inicia con el preso 0, con 10 caramelos y 1 preso el resultado esperado es 0.
• Sí se inicia con el preso 455, con 1585 caramelos y 500 presos el resultado esperado es 39
***************************************************************

Función mediasAmigas():
En un universo paralelo, donde los habitantes son medias, existe un crucero de medias
donde se sube una lista de medias. Esta lista de tripulantes del crucero es una Collection
de letras.
Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y retornar una
lista que contenga los grupos de medias que si tenían pares. Esta lista final de medias
pares se mostraran ordenadas de menor a mayor.
A continuación un ejemplo:
List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no.
Entonces la List que se debería retornar sería: A,B,C.

5
Resultados esperados:
• Si se ingresa la lista "A", "B", "C", "D", "A", "C", "D", "A". El resultado sería "A", "C", "D".
• Si se ingresa la lista "R", "R", "A", "A", "S", "S", "G", "H". El resultado sería "A", "R", "S"
• Si se ingresa la lista "R", "E", "T", "A", "P", "S", "G", "H". El resultado sería vacío porque no
hay pares.

 */
package integradortrucho;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Adrian E. Camus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Practica practica = new Practica();

        System.out.println("***FUNCION CAPICUA***");
        System.out.println(practica.numeroCapicua(123454321));
        System.out.println(practica.numeroCapicua(-123454321));
        System.out.println(practica.numeroCapicua(2));
        System.out.println(practica.numeroCapicua(0));
        System.out.println(practica.numeroCapicua(null));
        System.out.println(practica.numeroCapicua(123));
        System.out.println("***FUNCION PRISIONERO DULCE***");
        System.out.println(practica.prisioneroDulce(0, 10, 6));
        System.out.println(practica.prisioneroDulce(7, 4, 8));
        System.out.println(practica.prisioneroDulce(1, 5, 2));
        System.out.println(practica.prisioneroDulce(0, 10, 1));
        System.out.println(practica.prisioneroDulce(455, 1585, 500));
        System.out.println("***FUNCION MEDIAS AMIGAS***");
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D", "A", "C", "D", "A"}));
        System.out.println(practica.mediasAmigas(medias));//El resultado sería "A", "C", "D".
        ArrayList<String> medias2 = new ArrayList(Arrays.asList(new String[]{"R", "R", "A", "A", "S", "S", "G", "H"}));
        System.out.println(practica.mediasAmigas(medias2));//El resultado sería "A", "R", "S"
        ArrayList<String> medias3 = new ArrayList(Arrays.asList(new String[]{"R", "E", "T", "A", "P", "S", "G", "H"}));
        System.out.println(practica.mediasAmigas(medias3));//El resultado sería vacío porque no hay pares.

    }
}
