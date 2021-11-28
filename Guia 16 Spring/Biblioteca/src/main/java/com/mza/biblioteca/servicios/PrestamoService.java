/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package com.mza.biblioteca.servicios;

import com.mza.biblioteca.entidades.Libro;
import com.mza.biblioteca.entidades.Prestamo;
import com.mza.biblioteca.entidades.Usuario;
import com.mza.biblioteca.excepciones.MiExcepcion;
import com.mza.biblioteca.repositorios.RepoPrestamo;
import com.mza.biblioteca.repositorios.RepoUsuario;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




/**
 *
 * @author Adrian E. Camus
 */

@Service
public class PrestamoService {

    @Autowired
    LibroService sLibro;

    @Autowired
    UsuarioService sUsuario;

    @Autowired
    RepoPrestamo rPrestamo;

    @Autowired
    RepoUsuario rUsuario;

    @Transactional
    public Prestamo creaPrestamo(String idLibro, String idUsuario) throws MiExcepcion {

        Libro libroPrestado = new Libro();
        Usuario usuario = new Usuario();
        try
        {
            libroPrestado = sLibro.buscarPorId(idLibro);
            usuario = sUsuario.buscarPorId(idUsuario);
        } catch (Exception e)
        {
            throw new MiExcepcion("No se pudo crear el prestamo: "+ e.getMessage());
        }

        //Verifico que existan ejemplares disponibles para realizar el prestamo
        if (libroPrestado.getEjemplaresRestantes() > 0 && libroPrestado.getAlta())
        {
            libroPrestado.setEjemplaresRestantes(libroPrestado.getEjemplaresRestantes() - 1);
            libroPrestado.setEjemplaresPrestados(libroPrestado.getEjemplaresPrestados() + 1);
        } else
        {
            throw new MiExcepcion("No se puede prestar el Libro, no quedan ejemplares disponibles");
        }
        //creo un nuevo prestamo y le seteo atributos
        Prestamo prestamo = new Prestamo();
        prestamo.setAlta(Boolean.TRUE);
        prestamo.setPrestamo(new Date());
        prestamo.setDevolucion(null);
        //Le seteo el Libro al Prestamo
        prestamo.setLibro(libroPrestado);
        //El usuario al prestamo
        prestamo.setUsuario(usuario);
        usuario.setCantidadPrestamos(usuario.getCantidadPrestamos() + 1);
        rPrestamo.save(prestamo);
        rUsuario.save(prestamo.getUsuario());
        
        return prestamo;
    }

    @Transactional
    public void confirmaPrestamo(Prestamo prestamo) throws MiExcepcion {
        try
        {
            rPrestamo.save(prestamo);
            rUsuario.save(prestamo.getUsuario());
        } catch (Exception e)
        {
            throw new MiExcepcion("No se pudo confirmar el prestamo: "+ e.getMessage());
        }
        
    }

    @Transactional(readOnly = true)
    public List<Prestamo> listaPrestamos() throws MiExcepcion {
        return rPrestamo.findAll();
    }
    
    // Suma los días recibidos a la fecha  
    private Date sumarRestarDiasFecha(Date fecha, int dias){

      Calendar calendar = Calendar.getInstance();

      calendar.setTime(fecha); // Configuramos la fecha que se recibe

      calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
      return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
 }

}
