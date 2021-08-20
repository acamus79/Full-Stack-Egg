/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua.
Los valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

 */
package entidades;

/**
 *
 * @author Drok
 */
public class Revolver {
    private int posActual;
    private int posBala;
/**
 * llenarRevolver(): le pone los valores de posición actual y de posición del agua.
 * Los valores son aleatorios.
 */
    public Revolver() {
    this.posActual = (int) (Math.random() * 6 + 1);//entre 1 y 6 en realidad es entre 0 y 7 sin incluir el 7
    this.posBala = (int) (Math.random() * 6 + 1);
    }

    public int getPosActual() {
        return posActual;
    }

    public int getPosBala() {
        return posBala;
    }
    
    /**
     * devuelve true si la posición del agua coincide con la posición actual
     * @return true o false
     */
    public boolean matar(){
        if(posBala==posActual){
            return true;
        }else{
                return false;
        }
            
    }
   /**
    * cambia a la siguiente posición del tambor
    */ 
    public void siguienteDisparo(){
       
        if(posActual==6){
            this.posActual=1;
        }else{
            this.posActual++;
        }
    }

    @Override
    public String toString() {
        return "\nRevolver Colt Las Heras:" + "\nPosicion Actual del Tambor: " + posActual + " Posicion del Proyectil: " + posBala;
    }
    
    
}
