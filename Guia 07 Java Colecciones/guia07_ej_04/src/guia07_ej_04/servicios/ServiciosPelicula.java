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
import guia07_ej_04.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
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
    private Pelicula creaPeli() {
        System.out.println("Cual es el titulo de la Pelicula?");
        String titis = leer.next();
        System.out.println("Quien fue el Director?");
        String mandamas = leer.next();
        System.out.println("Cuanto dura la Peli en minutos?");
        Integer hs = leer.nextInt();
        //Agrego la pelicula creada a la coleccion de peliculas
        return new Pelicula(titis, mandamas, hs);
    }
/**
 * Metodo que agrega Peliculas al ArrayList de Peliculas, mediante la 
 * invocacion del metodo privado creaPeli.
 */
    public void misPelis() {
        char op;
        do {
            misPelis.add(creaPeli());
            System.out.println("Desea agregar otra pelicula? S/N");
            op = leer.next().toUpperCase().charAt(0);
        } while (op != 'N');

    }
    
/**
 * Mostrar en pantalla todas las películas a traves de un for each, utilizando 
 * en cada ciclo el metodo toString sobreestrico de la clase Pelicula
 */
    public void mostrarPeliculas() {
        System.out.println("** Mostrar en pantalla todas las películas **");
        misPelis.forEach(aux -> {
            System.out.println(aux);
        });
    }
/**
 * Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 */
    public void mostrarPeliculasde1Hs() {
        System.out.println("** Mostrar en pantalla todas las películas con una duración mayor a 1 hora **");
        misPelis.stream().filter(peli -> (peli.getDuracionHs() > 60)).forEachOrdered(peli -> {
            System.out.println(peli);
        });
        System.out.println("");
    }
/**
 * Ordenar las películas de acuerdo a su duración (de mayor a menor) y 
 * mostrarlo en pantalla.
 */
     public void ordenarPeliPorDuracionMayor() {
        System.out.println("** Mostrar películas de acuerdo a su duración de mayor a menor **");
        Collections.sort(misPelis, Comparadores.porDuracionMayor);//Ordena la Coleccion misPelis con el Comparador porDuracionMayor

        misPelis.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
        System.out.println("");
    }

/**
 * Ordenar las películas de acuerdo a su duración (de menor a mayor) y 
 * mostrarlo en pantalla. Utilizando los comparadores de la clase Utilidad
 */
    public void ordenarPeliPorDuracionMenor() {
        System.out.println("** Mostrar películas de acuerdo a su duración de menor a mayor **");
        Collections.sort(misPelis, Comparadores.porDuracionMenor);//ordena con el Comparator porDuracionMenor

        misPelis.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
        System.out.println("");
    }

/**
 * Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
 * utilizando los comparadores de la clase utilidad
 */
    public void ordenarPeliPorTitulo() {
        System.out.println("** Mostrar las peliculas ordenadas por el Titulo alfabeticamente **");
        Collections.sort(misPelis, Comparadores.porTitulo);//ordena con el Comparator porTitulo

        misPelis.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
        System.out.println("");
    }

/**
 * Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 * utilizando los comparadores de la clase utilidad
 */
    public void ordenarPeliPorDirector() {
        System.out.println("** Mostrar las Peliculas ordenadas por el Director alfabeticamente");
        Collections.sort(misPelis, Comparadores.porDirector);//ordena con el Comparator porDirector

        misPelis.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
        System.out.println("");
    }

}
