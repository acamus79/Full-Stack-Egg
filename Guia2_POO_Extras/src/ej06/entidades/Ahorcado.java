/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package ej06.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Ahorcado {
    
    private final String palabra[] = {"electroencefalograma","psicofarmaco","prohibido","atencion","","credencial","coronavirus","vacuna","abogado","cirujano","noviembre","abril"};
    

    public Ahorcado() {
        
    }

    public String getPalabra(int i) {
        return palabra[i];
    }

}
