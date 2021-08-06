/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos 
(día, mes, año). No se podrá utilizar ningún tipo de objeto de “clase fechas”. 
Inicializando desde la entidad los valores en 1, 1, 1900 respectivamente.
 */
package ej04.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Fecha {
    int dia;
    int mes;
    int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "La Fecha es: " + dia + "/" + mes + "/" + anio+"\n";
    }

    
    
    
}
