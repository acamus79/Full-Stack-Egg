/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
personas por oficina y numero de pisos. Esta clase implementará los dos
métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.

 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class EdificioDeOficinas extends Edificio{
    private int nroDeOficinas;
    private int cantPersPorOficina;
    private int nroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nroDeOficinas, int cantPersPorOficina, int nroDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nroDeOficinas = nroDeOficinas;
        this.cantPersPorOficina = cantPersPorOficina;
        this.nroDePisos = nroDePisos;
    }

    
    public int getNroDeOficinas() {
        return nroDeOficinas;
    }

    public void setNroDeOficinas(int nroDeOficinas) {
        this.nroDeOficinas = nroDeOficinas;
    }

    public int getCantPersPorOficina() {
        return cantPersPorOficina;
    }

    public void setCantPersPorOficina(int cantPersPorOficina) {
        this.cantPersPorOficina = cantPersPorOficina;
    }

    public int getNroDePisos() {
        return nroDePisos;
    }

    public void setNroDePisos(int nroDePisos) {
        this.nroDePisos = nroDePisos;
    }

    @Override
    public double calcularSuperficie() {
     return super.getAncho()*super.getLargo();
    }

    @Override
    public double calcularVolumen() {
       return super.getAncho()*super.getLargo()*super.getAlto();  
    }
    
    public void cantPersonas(){
       System.out.println("Cantidad de Personas por Piso "+this.cantPersPorOficina*this.nroDeOficinas);
       System.out.println("Cantidad Total de Personas en el Edificio " + this.cantPersPorOficina*this.nroDeOficinas*this.nroDePisos);
    }

    @Override
    public String toString() {
        return "Edificio de Oficinas con " + nroDePisos +  " pisos, " + nroDeOficinas + " of/piso";
    }
    
}
