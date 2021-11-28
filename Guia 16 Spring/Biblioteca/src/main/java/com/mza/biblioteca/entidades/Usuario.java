/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.entidades;

import com.mza.biblioteca.enumeradores.Rol;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Adrian E. Camus
 */
@Entity
public class Usuario {

    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2") @Column(length = 36)
    private String id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date alta;
    @Temporal(TemporalType.TIMESTAMP)
    private Date baja;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    private String nombre;
    private String apellido;
    private String clave;
    private Integer cantidadPrestamos;
    
    //hago que los email sean una columna con valores unicos en la base 
    //ya que se va a usar como variable de logeo, y para que no haya conflictos
    //de roles debe ser unica
    @Column(unique = true)
    private String mail;
    
    @OneToMany(mappedBy = "usuario")
    private List<Prestamo> prestamos;
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the alta
     */
    public Date getAlta() {
        return alta;
    }

    /**
     * @param alta the alta to set
     */
    public void setAlta(Date alta) {
        this.alta = alta;
    }

    /**
     * @return the baja
     */
    public Date getBaja() {
        return baja;
    }

    /**
     * @param baja the baja to set
     */
    public void setBaja(Date baja) {
        this.baja = baja;
    }

    /**
     * @return the rol
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    /**
     * @return the prestamos
     */
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * @param prestamos the prestamos to set
     */
    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    /**
     * @return the cantidadPrestamos
     */
    public Integer getCantidadPrestamos() {
        return cantidadPrestamos;
    }

    /**
     * @param cantidadPrestamos the cantidadPrestamos to set
     */
    public void setCantidadPrestamos(Integer cantidadPrestamos) {
        this.cantidadPrestamos = cantidadPrestamos;
    }

    

}
