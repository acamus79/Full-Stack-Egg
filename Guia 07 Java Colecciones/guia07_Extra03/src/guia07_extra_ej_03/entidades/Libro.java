/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

La clase Libro debe guardar el título del libro, autor, número de 
ejemplares y número de ejemplares prestados.

 */
package guia07_extra_ej_03.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Libro {

    private String titulo;
    private String autor;
    private Integer nroEjemplares;
    private Integer ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer nroEjemplares, Integer ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroEjemplares = nroEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
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

    public Integer getNroEjemplares() {
        return nroEjemplares;
    }

    public void setNroEjemplares(Integer nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public boolean prestamo() {
        if (this.nroEjemplares > 0) {
            this.nroEjemplares--;
            this.ejemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (this.ejemplaresPrestados > 0) {
            this.ejemplaresPrestados--;
            this.nroEjemplares++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nLibro " + titulo + "\nAutor: " + autor + "\n Cantidad de Ejemplares: " + nroEjemplares + "Ejemplares Prestados: " + ejemplaresPrestados;
    }

}
