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
        ServicioEditorial editorSv = new ServicioEditorial();
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
        
        Autor aut1 = au.creaautor("Cortazar");
        Autor aut2 = au.creaautor("Cortazar");
        Autor aut3 = au.creaautor("Cortazar");
        Autor aut4 = au.creaautor("Cortazar");
        Autor aut5 = au.creaautor("Cortazar");
        


        Editorial edit1 = editorSv.creaEditorial("MINOTAURO");
        Editorial edit2 =editorSv.creaEditorial("SUDAMERICANA");
        Editorial edit3 =editorSv.creaEditorial("PENGUIN RANDOM HOUSE");
        Editorial edit4 =editorSv.creaEditorial("PLANETA");
        Editorial edit5 =editorSv.creaEditorial("EMECE");
        Editorial edit6 =editorSv.creaEditorial("SANTILLANA");
        Editorial edit7 =editorSv.creaEditorial("ESTRADA");
        Editorial edit8 =editorSv.creaEditorial("COMBEL");
        Editorial edit9 =editorSv.creaEditorial("BRUGUERA");
        Editorial edit10 =editorSv.creaEditorial("COMPANHIA DAS LETRAS");
        
        
        
        
        Libro lb1 = lu.creaLibro("El señor de los anillos", 1937, aut1, edit1);
        Libro lb2 = lu.creaLibro("El señor de los anillos 2", 1939, aut1, edit1);
        Libro lb3 = lu.creaLibro("El señor de los anillos 3", 1940, aut1, edit1);
        Libro lb4 = lu.creaLibro("Cien años de soledad", 1967, aut2, edit2);
        Libro lb5 = lu.creaLibro("El amor en tiempos del colera", 1985, aut2, edit3);
        Libro lb6 = lu.creaLibro("Cronica de una muerte anunciada", 1981, aut2, edit4);
        Libro lb7 = lu.creaLibro("Del amor y otros demonios", 1994, aut2, edit2);
        Libro lb8 = lu.creaLibro("El alquimista", 1988, aut3, edit5);
        Libro lb9 = lu.creaLibro("Veronika decide morir", 1998, 5, 1, 4, true, aut3, edit5);
        Libro lb10 = lu.creaLibro("Adulterio", 2014, 5, 4, 1, true, aut3, edit5);
        Libro lb11 = lu.creaLibro("Manual del guerrero de la luz", 1997, 5, 2, 3, true, aut3, edit7);  
        Libro lb12 = lu.creaLibro("Ficciones", 1944, 5, 0, 5, true, aut3, edit7);
        Libro lb13 = lu.creaLibro("La biblioteca de Babel", 1941, 3, 1, 2, true, aut4, edit8);
        Libro lb14 = lu.creaLibro("El libro de arena", 1975, 7, 3, 4, true, aut4, edit7);
        Libro lb15 = lu.creaLibro("El hacedor", 1917, 4, 2, 2, true, aut4, edit2);
        Libro lb16 = lu.creaLibro("Labyrinths", 1962, 6, 2, 4, true, aut4, edit10);
        Libro lb17 = lu.creaLibro("El retrato de Dorian Gray", 1890, 5, 1, 4, true, aut5, edit11);
        Libro lb18 = lu.creaLibro("El principe feliz y otros cuentos", 1888, 5, 0, 5, true, aut5, edit12);
        Libro lb19 = lu.creaLibro("El fantasma de Canterville", 1887, 5, 4, 1, true, aut5, edit13);
        Libro lb20 = lu.creaLibro("El gigante egoista", 1888, 5, 1, 4, true, aut5, edit14);
        
     


    }
    
}
