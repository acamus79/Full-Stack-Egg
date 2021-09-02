/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• Clase Polideportivo con su nombre y tipo de instalación que puede ser
Techado o Abierto, esta clase implementará los dos métodos abstractos y los
atributos del padre.

 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Polideportivo extends Edificio {

    private String nombre;
    private boolean instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isInstalacion() {
        return instalacion;
    }

    public void setInstalacion(boolean instalacion) {

        this.instalacion = instalacion;
    }

    @Override
    public double calcularSuperficie() {
        return super.ancho * super.largo;
    }

    @Override
    public double calcularVolumen() {
        return super.ancho * super.largo * super.alto;
    }

    @Override
    public String toString() {
        String instala = "TECHADO";
        if (instalacion)
        {
            instala = "AIRE LIBRE";
        }
        return "Polideportivo " + nombre + ", Instalaciones de tipo " + instala;
    }

}
