/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package libreria.servicios;

import java.util.UUID;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 * 
 * @author Adrian E. Camus
 */
public class ServicioEditorial {
    
    private EditorialDAO editorialDAO;

    public ServicioEditorial() {
        editorialDAO = new EditorialDAO();

    }

    public Editorial creaeditorial(String nombre) {
        Editorial editorialNuevo = new Editorial();
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la editorial");
            }
            editorialNuevo.setNombre(nombre);
            editorialNuevo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            editorialNuevo.setAlta(Boolean.TRUE);
            editorialDAO.guardarEditorial(editorialNuevo);

            return editorialNuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void eliminareditorial(String nombre) {

        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la editorial");
            }
            editorialDAO.eliminarPorNombre(nombre);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void modificareditorial(String nombre, String nuevonombre) {
        Editorial aux = null;
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la editorial");
            }
            if (nuevonombre == null || nuevonombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la editorial");
            }
            aux = editorialDAO.buscarPorNombre(nombre);
            aux.setNombre(nuevonombre);
            editorialDAO.modificarEditorial(aux);

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    

}
