/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Clase Revolver de agua: esta clase posee los siguientes atributos: 
posición actual (posición del tambor que se dispara, puede que esté el 
agua o no) y posición agua (la posición del tambor donde se encuentra el 
agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del 
agua. Los valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición
actual 
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde 
está el agua)


 */
package ej_02.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Revolver {

    private int posTambor;
    private int posMunicion;

    public Revolver() {
    }

    public Revolver(int posTambor, int posMunicion) {
        this.posTambor = posTambor;
        this.posMunicion = posMunicion;
    }

    public int getPosTambor() {
        return posTambor;
    }

    public void setPosTambor(int posTambor) {
        this.posTambor = posTambor;
    }

    public int getPosMunicion() {
        return posMunicion;
    }

    public void setPosMunicion(int posMunicion) {
        this.posMunicion = posMunicion;
    }

    public void llenaRevolver(){
        this.posMunicion = (int) (Math.random()*6+1);//numeros aleatorios de 0 al 6, excluido el 6, al sumar 1 el randon seria de 1 a 6
        this.posTambor = (int) (Math.random()*6+1);
    }
    
    public boolean muerto(){
        return this.posMunicion==this.posTambor;
    }
    
    public void siguienteTiro(){
     this.posTambor++;
    }
    
    @Override
    public String toString() {
        return "Revolver .357 de 6 alveolos" + "Posicion Tambor: " + posTambor + "Posicion de la Municion: " + posMunicion + '}';
    }
    
}
