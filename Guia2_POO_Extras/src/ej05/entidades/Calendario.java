/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package ej05.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Calendario {
//"final" porque seria como una constante para que no se modifique
    private final String calendario[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","setiembre","octubre","noviembre","diciembre"};
    

    public Calendario() {
        
    }

    public String getCalendario(int i) {
        return calendario[i];
    }

    
    
}
