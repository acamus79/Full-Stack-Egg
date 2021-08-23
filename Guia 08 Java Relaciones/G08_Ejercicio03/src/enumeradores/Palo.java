/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package enumeradores;

/**
 *
 * @author Adrian E. Camus
 */
public enum Palo {
    ESPADA, BASTOS, ORO, COPAS;
    
    //asi hago un metodo para obtener un value Random
    public static Palo getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
    
    
}
