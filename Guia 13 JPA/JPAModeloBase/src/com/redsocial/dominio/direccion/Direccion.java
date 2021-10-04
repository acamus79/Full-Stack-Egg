
package com.redsocial.dominio.direccion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // Esta anotacion, avisa que esta clase se convertira en TABLA
public class Direccion {
    //CADA ATRIBUTO DEFINIDO EN UNA CLASE DEL TIPO ENTIDAD, SE CONVIERTE EN  UNA COLUMNA EN MI TABLA
    @Id
    @GeneratedValue
    private String id;

    private String pais;
    private String provincia;

    public Direccion(String pais, String provincia) {    
        this.pais = pais;
        this.provincia = provincia;
    }

    public Direccion() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", pais=" + pais + ", provincia=" + provincia + '}';
    }

}


