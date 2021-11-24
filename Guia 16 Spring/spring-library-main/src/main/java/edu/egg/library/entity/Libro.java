package edu.egg.library.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
@SQLDelete(sql = "UPDATE libro SET alta = false WHERE id = ?")
public class Libro {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, unique = true)
    private Long isbn;

    @Column(nullable = false, length = 75)
    private String titulo;

    @Column(nullable = false)
    private Integer anio;

    @Column(nullable = false)
    private Integer ejemplares;

    @Column(nullable = false)
    private Integer prestados;

    @Column(nullable = false)
    private Integer restantes;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime creacion;

    @LastModifiedDate
    private LocalDateTime modificacion;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Autor autor;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Editorial editorial;

    private Boolean alta;

    @Override
    public String toString() {
        return String.format("LIBRO (id: %s, isbn: %s, titulo: %s, anio: %s, ejemplares: %s, prestados: %s, restantes: %s, autor: %s, editorial: %s)",
                id, isbn, titulo, anio, ejemplares, prestados, restantes, autor, editorial);
    }
}
