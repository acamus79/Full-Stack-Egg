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
public class Polideportivo extends Edificio{
    private String nombre;
    private boolean instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean instalacion) {
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

    public double getAncho() {
        return getAncho();
    }

    public void setAncho(double ancho) {
        this.setAncho(ancho);
    }

    public double getAlto() {
        return getAlto();
    }

    public void setAlto(double alto) {
        this.setAlto(alto);
    }

    public double getLargo() {
        return getLargo();
    }

    public void setLargo(double largo) {
        this.setLargo(largo);
    }
    
    @Override
    public double calcularSuperficie() {
        return this.getAncho()*this.getLargo();
    }

    @Override
    public double calcularVolumen() {
        return this.getAncho()*this.getLargo()*this.getAlto();
    }
    
    
}
