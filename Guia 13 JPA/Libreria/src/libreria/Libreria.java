/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package libreria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.servicios.ServicioAutor;

/**
 *
 * @author Adrian E. Camus
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
        
        ServicioAutor au = new ServicioAutor();
        au.creaautor("borges");
        //au.eliminarautor("Jose Luis Borges");
        au.modificarautor("borges", "Jose Luis Borges");
        
    }
    
}
