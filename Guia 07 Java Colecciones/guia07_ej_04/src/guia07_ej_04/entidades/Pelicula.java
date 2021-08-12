/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

clase Pelicula con el titulo, director y duración de 
la película (en horas)

 */
package guia07_ej_04.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Pelicula {

    private String titulo;
    private String director;
    private Integer duracionHs;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracionHs) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHs = duracionHs;
    }

    public Integer getDuracionHs() {
        return duracionHs;
    }

    public void setDuracionHs(Integer duracionHs) {
        this.duracionHs = duracionHs;
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
    
    @Override
    public String toString() {
        return "Pelicula de titulo: " + titulo + "\nDirector: " + director + "\nDuracion: " + duracionHs+" minutos";
    }
}
