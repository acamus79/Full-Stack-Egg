/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs 
con su correspondiente letra (NIF). Los atributos serán el número de DNI 
(entero largo) y la letra (String o char) que le corresponde. 
Dispondrá de los siguientes métodos: 

• Métodos getters y setters para el número de DNI y la letra.

 */
package ej04.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class NIF {

    private long dnis;
    private String letraNIF;

    public NIF(long dnis, String letraNIF) {
        this.dnis = dnis;
        this.letraNIF = letraNIF;
    }

    

    public long getDnis() {
        return dnis;
    }

    public void setDnis(long dnis) {
        this.dnis = dnis;
    }

    public String getLetraNIF() {
        return letraNIF;
    }

    public void setLetraNIF(String letraNIF) {
        this.letraNIF = letraNIF;
    }

    @Override
    public String toString() {
        return "NIF: " + dnis + "-" + letraNIF;
    }

}
