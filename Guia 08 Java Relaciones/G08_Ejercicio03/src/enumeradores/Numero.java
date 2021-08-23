/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package enumeradores;

/**
 *
 * @author Drok
 */
public enum Numero {
    
    UNO,DOS,TRES,CUATRO,CINCO,SEIS,SIETE,SOTA,CABALLO,REY;
    
   public static Numero getRandom() {
        return values()[(int) (Math.random() * values().length)];

}
    
}
