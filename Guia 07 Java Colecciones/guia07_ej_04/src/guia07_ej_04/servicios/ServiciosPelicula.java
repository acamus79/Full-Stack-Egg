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
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosPelicula {

    private static Scanner leer;
    //aca creo mi Coleccion de Objetos Pelicula
    private static ArrayList<Pelicula> misPelis;

    //constructor vacio pero con instanciacion del scanner y la lista
    public ServiciosPelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.misPelis = new ArrayList();
    }

//String titulo, String director, Integer duracionHs
    private static void creaPeli() {
        Pelicula p = new Pelicula();
        System.out.println("Cual es el titulo de la Pelicula?");
        p.setTitulo(leer.next());
        System.out.println("Quien fue el Director?");
        p.setDirector(leer.next());
        System.out.println("Cuanto dura la Peli en minutos?");
        p.setDuracionHs(leer.nextInt());
        //Agrego la pelicula creada a la coleccion de peliculas
        misPelis.add(p);
    }

    public void misPelis() {
        char op;
        do {
            creaPeli();
            System.out.println("Desea agregar otra pelicula? S/N");
            op = leer.next().toUpperCase().charAt(0);
        } while (op != 'N');

    }
//Mostrar en pantalla todas las películas.    

    public void mostrarPeliculas() {
        misPelis.forEach(peli -> {
            System.out.println(peli);
        });
    }

//Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPeliculasde1Hs() {
        misPelis.stream().filter(peli -> (peli.getDuracionHs() > 60)).forEachOrdered(peli -> {
            System.out.println(peli);
        });
    }
//Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.        

    public void ordenarPeliPorDuracionMayor() {
        Comparator<Pelicula> compararDuracion = (Pelicula p1, Pelicula p2) -> p1.getDuracionHs().compareTo(p2.getDuracionHs());
        Collections.sort(misPelis, compararDuracion);
        misPelis.forEach(peli -> {
            System.out.println(peli);
        });
    }

//Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public void ordenarPeliPorDuracionMenor() {
        Comparator<Pelicula> compararDuracion = (Pelicula p1, Pelicula p2) -> p2.getDuracionHs().compareTo(p1.getDuracionHs());
        
        Collections.sort(misPelis, compararDuracion);//ordena con el Comparator compararDuracion
        
        misPelis.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
    }

//Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.    
    public void ordenarPeliPorTitulo() {
        Comparator<Pelicula> comparaTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());
        
        Collections.sort(misPelis, comparaTitulo);//ordena con el Comparator comparaTitulo
        
        misPelis.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
    }
    
//Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.    
    public void ordenarPeliPorDirector() {
        Comparator<Pelicula> comparaDirector = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());
        
        Collections.sort(misPelis, comparaDirector);//ordena con el Comparator comparaDirector
        
        misPelis.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
    }
    
    
}
