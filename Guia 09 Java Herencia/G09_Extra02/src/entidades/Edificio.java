/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:

 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public abstract class Edificio {
    
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
        
    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();

   
}
