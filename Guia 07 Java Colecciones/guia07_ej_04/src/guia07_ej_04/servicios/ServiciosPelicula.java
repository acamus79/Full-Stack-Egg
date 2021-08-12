/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al
usuario si quiere crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
Nota: recordar el uso del Comparator para ordenar colecciones con objetos.

 */
package guia07_ej_04.servicios;

import guia07_ej_04.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosPelicula {

    private Scanner leer;
    //aca creo mi Coleccion de Objetos Pelicula
    private ArrayList<Pelicula> misPelis;

    //constructor vacio pero con instanciacion del scanner y la lista
    public ServiciosPelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.misPelis = new ArrayList();
    }

//String titulo, String director, double duracionHs
    private void creaPeli() {
        System.out.println("Cual es el titulo de la Pelicula?");
        String titulo = leer.next();
        System.out.println("Quien fue el Director?");
        String director = leer.next();
        System.out.println("Cuanto dura la Peli?");
        Integer duracion = leer.nextInt();
        
        Pelicula p = new Pelicula(titulo,director,duracion);
        misPelis.add(p);
    }
    
    public void misPelis(){
        char op;
        
        do{
            creaPeli();
            System.out.println("Desea agregar otra pelicula? S/N");
            op = leer.next().toUpperCase().charAt(0);
        }while(op!='N');
        
    }
    
    
    
}
