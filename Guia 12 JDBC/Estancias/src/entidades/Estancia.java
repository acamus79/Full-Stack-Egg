/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    id_estancia  INT UNSIGNED AUTO_INCREMENT NOT NULL,
    id_cliente INT UNSIGNED NOT NULL,
    id_casa INT UNSIGNED NOT NULL,
    nombre_huesped VARCHAR(70) NOT NULL,
    fecha_desde date NOT NULL,
    fecha_hasta date NOT NULL,
    PRIMARY KEY (id_estancia),
    FOREIGN KEY (id_cliente) REFERENCES clientes (id_cliente),
    FOREIGN KEY (id_casa) REFERENCES casas (id_casa)

 */

package entidades;

import java.util.Date;

/**
 * 
 * @author Adrian E. Camus
 */
public class Estancia {
        
    private int id_estancia;
    private Cliente cliente;
    private Casa casa;
    private String nombre_huesped;
    private Date fecha_desde;
    private Date fecha_hasta;

    public Estancia() {
        this.cliente = new Cliente();
        this.casa = new Casa();
    }

    public Estancia(int id_estancia, Cliente cliente, Casa casa, String nombre_huesped, Date fecha_desde, Date fecha_hasta) {
        this.id_estancia = id_estancia;
        this.cliente = cliente;
        this.casa = casa;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
    }

    public int getId_estancia() {
        return id_estancia;
    }

    public void setId_estancia(int id_estancia) {
        this.id_estancia = id_estancia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
    }

    public Date getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Date fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Date getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Date fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }
    
    
    
}
