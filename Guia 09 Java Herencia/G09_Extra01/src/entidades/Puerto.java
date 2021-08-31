/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

En un puerto se alquilan amarres para barcos de distinto tipo. 
Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha 
de alquiler, fecha de devolución, la posición del amarre y el barco que 
lo ocupará.

 */

package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * 
 * @author Adrian E. Camus
 */
public class Puerto {

    private ArrayList<Barco> amarre;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public Puerto() {
    }

    public Puerto(LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Puerto(ArrayList<Barco> amarre, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.amarre = amarre;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }

    
//    public int getPosAmarre() {
//        return posAmarre;
//    }

    
    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public ArrayList<Barco> getAmarre() {
        return amarre;
    }

    public void setAmarre(ArrayList<Barco> amarre) {
        this.amarre = amarre;
    }
    
    
}
