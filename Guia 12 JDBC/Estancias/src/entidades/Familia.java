/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

“Familia.java” con los siguientes atributos:
• private int id;
• private String nombre;
• private int edad_minima;
• private int edad_maxima;
• private int num_hijos;
• private String email;

 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Familia {

    private int id;
    private String nombre;
    private int edad_minima;
    private int edad_maxima;
    private int num_hijos;
    private String email;
    private Casa casa;
    private int id_casa_familia;
    

    public Familia() {
        this.casa = new Casa();
        this.id_casa_familia = casa.getId_casa();
    }

    public Familia(int id, String nombre, int edad_minima, int edad_maxima, int num_hijos, String email, Casa casa) {
        this.id = id;
        this.nombre = nombre;
        this.edad_minima = edad_minima;
        this.edad_maxima = edad_maxima;
        this.num_hijos = num_hijos;
        this.email = email;
        this.casa = casa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public int getEdad_maxima() {
        return edad_maxima;
    }

    public void setEdad_maxima(int edad_maxima) {
        this.edad_maxima = edad_maxima;
    }

    public int getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijos(int num_hijos) {
        this.num_hijos = num_hijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getId_casa_familia() {
        return id_casa_familia;
    }

    public void setId_casa_familia(int id_casa_familia) {
        this.id_casa_familia = id_casa_familia;
    }
    
    
    
    

}
