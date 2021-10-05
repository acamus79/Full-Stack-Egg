/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package libreria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.*;
import libreria.servicios.*;

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
        ServicioEditorial eu = new ServicioEditorial();
        ServicioLibro lu = new ServicioLibro();
//        
//        Autor au1 = au.creaautor("Cortazar");
//        Editorial ed1 = eu.creaEditorial("Planeta");
//        Libro l1 = lu.creaLibro("RAYUELA", 1974, au1, ed1);
        
        
//        au.modificarautor("borges", "Jose Luis Borges");
        //au.eliminarautor("Jose Luis Borges");
//        Menu m = new Menu();
//        
//        m.menu();
        
        
        


        Editorial edit1 = eu.creaEditorial("Minotauro");
        Editorial edit2 = eu.creaEditorial("Sudamericana");
        Editorial edit3 = eu.creaEditorial("Penguin Random House");
        Editorial edit4 = eu.creaEditorial("Bruguera");
        Editorial edit5 = eu.creaEditorial("Planeta");
        Editorial edit7 = eu.creaEditorial("Emece");
        Editorial edit8 = eu.creaEditorial("Siruela");
        Editorial edit9 = eu.creaEditorial("Companhia das Letras");
        Editorial edit10 = eu.creaEditorial("New Directions");
        Editorial edit11 = eu.creaEditorial("Lippincott's Monthly Magazine");
        Editorial edit12 = eu.creaEditorial("Santillana");
        Editorial edit13 = eu.creaEditorial("Estrada");
        Editorial edit14 = eu.creaEditorial("Combel");
        
        
        Libro lb1 = new Libro("El señor de los anillos", 1937, aut1, edit1);
        Libro lb2 = new Libro("El señor de los anillos 2", 1939,  aut1, edit1);
        Libro lb3 = new Libro("El señor de los anillos 3", 1940,  aut1, edit1);
        Libro lb4 = new Libro("Cien años de soledad", 1967, aut2, edit2);
        Libro lb5 = new Libro("El amor en tiempos del colera", 1985, aut2, edit3);
        Libro lb6 = new Libro("Cronica de una muerte anunciada", 1981, aut2, edit4);
        Libro lb7 = new Libro("Del amor y otros demonios", 1994, aut2, edit2);
        Libro lb8 = new Libro("El alquimista", 1988,  aut3, edit5);
        Libro lb9 = new Libro("Veronika decide morir", 1998, aut3, edit5);
        Libro lb10 = new Libro("Adulterio", 2014, aut3, edit5);
        Libro lb11 = new Libro("Manual del guerrero de la luz", 1997, aut3, edit7);  
        Libro lb12 = new Libro("Ficciones", 1944, aut3, edit7);
        Libro lb13 = new Libro("La biblioteca de Babel", 1941, aut4, edit8);
        Libro lb14 = new Libro("El libro de arena", 1975, aut4, edit7);
        Libro lb15 = new Libro("El hacedor", 1917,  aut4, edit2);
        Libro lb16 = new Libro("Labyrinths", 1962,  aut4, edit10);
        Libro lb17 = new Libro("El retrato de Dorian Gray", 1890,  aut5, edit11);
        Libro lb18 = new Libro("El principe feliz y otros cuentos", 1888,  aut5, edit12);
        Libro lb19 = new Libro("El fantasma de Canterville", 1887, aut5, edit13);
        Libro lb20 = new Libro("El gigante egoista", 1888, aut5, edit14);
        
        



    }
    
}
