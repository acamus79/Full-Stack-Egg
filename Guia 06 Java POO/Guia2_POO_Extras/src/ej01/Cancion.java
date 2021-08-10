/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej01;

/**
 *
 * @author Adrian E. Camus
 */
public class Cancion {
    
    /*
Desarrollar  una  clase  Cancion  con  los  siguientes  atributos:  titulo  
y  autor.  Se  deberá definir además dos constructores: uno vacío que 
inicializa el titulo y el autor a cadenas vacías y otro que reciba como 
parámetros el titulo y el autor de la canción. Se deberán además definir 
los métodos getters y setters correspondientes. 
    */
    
    private String titulo;
    private String autor;

    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
