/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.

 */
package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Adrian E. Camus
 */
public class Barco {

    protected String matricula;
    protected Integer eslora;
    protected Integer anioFabricacion;
    protected Persona propietario;
    
    //constructores
    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anioFabricacion, Persona duenio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.propietario = duenio;
    }
        
    //metodos
    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona duenio) {
        this.propietario = duenio;
    }

    public double valorModulo(){
        return this.eslora*10;
    }

}
