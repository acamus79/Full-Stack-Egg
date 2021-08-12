/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
Para esto, tendremos una clase Pelicula con el titulo, director y duración de 
la película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:

En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
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

package guia07_ej_04;

import guia07_ej_04.servicios.ServiciosPelicula;

/**
 *
 * @author Adrian E. Camus
 */
public class Principal04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        ServiciosPelicula sp = new ServiciosPelicula();
        sp.misPelis();
        sp.mostrarPeliculas();
        sp.mostrarPeliculasde1Hs();
        sp.ordenarPeliPorDuracionMayor();
        sp.ordenarPeliPorDuracionMenor();
        sp.ordenarPeliPorTitulo();
        sp.ordenarPeliPorDirector();
        
    }

}
