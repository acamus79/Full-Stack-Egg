package com.redsocial.dominio.usuario;

import com.redsocial.dominio.direccion.Direccion;
import com.redsocial.dominio.mascota.Mascota;
import com.redsocial.enumeraciones.Rol;
import com.sun.istack.internal.NotNull;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity// Esta anotacion, avisa que esta clase se convertira en TABLA
public class Usuario {
//CADA ATRIBUTO DEFINIDO EN UNA CLASE DEL TIPO ENTIDAD, SE CONVIERTE EN  UNA COLUMNA EN MI TABLA
    @Id
    @GeneratedValue    
    private String id;
   
    @Column(unique = true)
    private String correoElectronico;
     
    private String clave;

    @NotNull // Que no sea nulo
    @Column(unique = true)// Para que no permite duplicar este campo en otros rregistros.
    private String dni;

   //Relacion de uno a uno
    @OneToOne(cascade = CascadeType.REMOVE)//Haciendo referencia a que Si se elimina un "usuario" se elimine en cascada 
    private Mascota mascota;

    @OneToOne(cascade = CascadeType.REMOVE)//Esto indicado para que si elimino al PADRE,elimino el vinculado
    private Direccion direccion;

    //Siempre que manejo fechas, debo utilizar esta anotacion
    @Temporal(TemporalType.DATE)
    private Date nacimiento;

    //Siempre que manejo enumeraciones, debo utilizar esta anotacion
    @Enumerated(EnumType.STRING)
    private Rol rol;

    
    //Dejo mis constructores
    public Usuario() {
    }

    public Usuario(String correoElectronico, String clave, String dni, Direccion direccion, Date nacimiento, Rol rol) {
        this.correoElectronico = correoElectronico;
        this.clave = clave;
        this.dni = dni;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.rol = rol;
    }

    //Dejo mis GET y SET
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", correoElectronico=" + correoElectronico + ", clave=" + clave + ", dni=" + dni + ", mascota=" + mascota + ", direccion=" + direccion + ", nacimiento=" + nacimiento + ", rol=" + rol + '}';
    }

}
