/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package entidad;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Adrian E. Camus
 */
public class Alquiler {

    private LocalDate inicioAlquiler, finAlquiler;
    private Capitan capi;

    public Alquiler() {
    }

    public Alquiler(LocalDate inicioAlquiler, LocalDate finAlquiler, Capitan capi) {
        this.inicioAlquiler = inicioAlquiler;
        this.finAlquiler = finAlquiler;
        this.capi = capi;
    }

    public LocalDate getInicioAlquiler() {
        return inicioAlquiler;
    }

    public void setInicioAlquiler(LocalDate inicioAlquiler) {
        this.inicioAlquiler = inicioAlquiler;
    }

    public LocalDate getFinAlquiler() {
        return finAlquiler;
    }

    public void setFinAlquiler(LocalDate finAlquiler) {
        this.finAlquiler = finAlquiler;
    }

    public Capitan getCapi() {
        return capi;
    }

    public void setCapi(Capitan capi) {
        this.capi = capi;
    }

    public double calculoAlquiler() {

        Period dias = Period.between(this.inicioAlquiler, this.finAlquiler);

        return capi.getShip().calculoModulo() * dias.getDays();

    }

    
    
    
    
}
