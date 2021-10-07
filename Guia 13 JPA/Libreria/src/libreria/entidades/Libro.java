/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package libreria.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * 
 * @author Adrian E. Camus
 */
@Entity
public class Libro {

    @Id
    @GeneratedValue
    private String id;

    @Column(unique = true, nullable = false)
    private Long isbn;
    
    @Column(unique = true, nullable = false)
    private String titulo;
    
    private Integer anio;
    private Integer nroEjemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    
    @Column(nullable = false)
    private Boolean alta;
    
    @ManyToOne
    private Autor autor;
    
    @OneToOne
    private Editorial editorial;

    public Libro() {
        
    }

    public Libro(String id, Long isbn, String titulo, Integer anio, Integer nroEjemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.nroEjemplares = nroEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplaresRestantes = ejemplaresRestantes;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getNroEjemplares() {
        return nroEjemplares;
    }

    public void setNroEjemplares(Integer nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-35s%-25s%-25s", isbn, titulo,autor.getNombre(),editorial.getNombre());

    }

    
}
