/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package libreria.servicios;

import java.util.List;
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

    public Editorial creaEditorial(String nombre) {
        Editorial editorialnuevo = new Editorial();
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del editorial");
            }
            editorialnuevo.setNombre(nombre);
            editorialnuevo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            editorialnuevo.setAlta(Boolean.TRUE);
            editorialDAO.guardarEditorial(editorialnuevo);

            return editorialnuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void eliminaPorNombre(String nombre) {

        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del editorial");
            }
            editorialDAO.eliminarPorNombre(nombre);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public void eliminaEditorial(Editorial edit){
        try
        {
            if (edit == null )
            {
                throw new Exception("Editorial no valida");
            }
            editorialDAO.eliminar(edit.getId());
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }

    public void modificarEditorial(String nombre, String nuevonombre) {
        Editorial aux = null;
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }
            if (nuevonombre == null || nuevonombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre de la Editorial");
            }
            aux = editorialDAO.buscarPorNombre(nombre);
            aux.setNombre(nuevonombre);
            editorialDAO.modificarEditorial(aux);

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public List<Editorial> buscaTodo() {
        List<Editorial> buscado = null;

        try
        {

            buscado = editorialDAO.listarTodos();

            return buscado;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
