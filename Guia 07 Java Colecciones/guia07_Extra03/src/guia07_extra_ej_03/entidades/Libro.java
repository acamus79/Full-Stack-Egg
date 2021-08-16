/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

La clase Libro debe guardar el título del libro, autor, número de 
ejemplares y número de ejemplares prestados.

 */
package guia07_extra_ej_03.entidades;

import java.util.Objects;

/**
 *
 * @author Adrian E. Camus
 */
public class Libro {

    private String titulo;
    private String autor;
    private int nroEjemplares;
    private int ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int nroEjemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroEjemplares = nroEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
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

    public void setNroEjemplares(int nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public boolean prestamo() {
        if (nroEjemplares > 0) {
            nroEjemplares--;
            ejemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            nroEjemplares++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.titulo);
        hash = 47 * hash + Objects.hashCode(this.autor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + "\nAutor: " + autor + "\nTotal de Ejemplares: " + (nroEjemplares + ejemplaresPrestados) + "\nDisponibles: " + nroEjemplares + " Prestados: " + ejemplaresPrestados + "\n";
    }

}
