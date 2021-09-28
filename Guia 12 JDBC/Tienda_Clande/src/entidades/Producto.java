/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Producto {
    
    private Integer codigo;
    private String nombre;
    private Double precio;
    private Fabricante cod_fab;

    public Producto() {
    this.cod_fab = new Fabricante();
    }

    public Producto(Integer codigo, String nombre, Double precio, Fabricante cod_fab) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cod_fab = cod_fab;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Fabricante getCod_fab() {
        return cod_fab;
    }

    public void setCod_fab(Fabricante cod_fab) {
        this.cod_fab = cod_fab;
    }
    
    
    
}
