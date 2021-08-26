/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Luego, de las
películas nos interesa saber el título, duración, edad mínima y director.

 */

package entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private Integer minutos;
    private Integer edadMinima;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer minutos, Integer edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.minutos = minutos;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", minutos=" + minutos + ", edadMinima=" + edadMinima + '}';
    }
    
    

}
