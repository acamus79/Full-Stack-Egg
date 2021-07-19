/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package guia2_POO.ej01.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Libro {

    /*
    Crear una clase llamada Libro que contenga los siguientes atributos:
    ISBN, Título, Autor, Número de páginas,y un constructor con todos los 
    atributos pasados por parámetro y un constructor vacío.
    */
    private String isbn;
    private String titulo;
    private String autor;
    private int nroPaginas;

    //constructor vacio
    public Libro() {
    }
    //constructor con atributos
    public Libro(String isbn, String titulo, String autor, int nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }
    //getters & setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    @Override
    public String toString() {
        return "Libro: \n" 
                + "ISBN = " + isbn 
                + "\nTitulo = " + titulo 
                + "\nAutor = " + autor 
                + "\nPaginas = " + nroPaginas;
    }
    
    
    
}
