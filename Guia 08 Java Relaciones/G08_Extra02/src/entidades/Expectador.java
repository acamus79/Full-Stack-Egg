/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Por último, del espectador, nos interesa saber su nombre, edad y el dinero 
que tiene disponible.

 */

package entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Expectador {

    private String nombre;
    private Integer edad;
    private Double money;

    public Expectador() {
    }

    public Expectador(String nombre, Integer edad, Double money) {
        this.nombre = nombre;
        this.edad = edad;
        this.money = money;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Expectador{" + "nombre=" + nombre + ", edad=" + edad + ", money=" + money + '}';
    }
    
    
    
    
}
