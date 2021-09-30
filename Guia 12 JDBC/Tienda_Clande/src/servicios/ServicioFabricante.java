/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package servicios;

import entidades.Fabricante;
import java.util.List;
import java.util.logging.Logger;
import persistencia.FabricanteDAO;

/**
 *
 * @author Alta Clande
 */
public class ServicioFabricante {

    private FabricanteDAO f_DAO;

    public ServicioFabricante() {
        f_DAO = new FabricanteDAO();
    }

    /*
    CRUD
            Create - Release - Update - Delete
     */

//CREA NUEVO    
    public void crearFabricante(String nombre) throws MiExcepcion {

        //direccion.setId(UUID.randomUUID().toString());
        try
        {
            // VALIDACIÓN
            if (nombre == null | nombre.trim().isEmpty())
            {
                throw new MiExcepcion("DEBE INGRESAR UN NOMBRE");
            }
            Fabricante aux = new Fabricante();
            aux.setNombre(nombre);
            f_DAO.guardarFabricante(aux);

        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

//MODIFICA
    public void modificarFabricante(Integer codigo, String nombre) throws MiExcepcion {
        try
        {
            // VALIDACIÓN
            if (codigo == null | codigo < 0)
            {
                throw new MiExcepcion("DEBE INGRESAR UN CODIGO");
            }

            if (nombre == null | nombre.trim().isEmpty())
            {
                throw new MiExcepcion("DEBE INGRESAR UN NOMBRE");
            }

            Fabricante aux = f_DAO.buscarPorClavePrincipal(codigo);

            if (aux == null)
            {
                throw new MiExcepcion("EL CODIGO INGRESADO NO ESTÁ ASOCIADO A NINGÚN FABRICANTE");
            }

            aux.setNombre(nombre);

            f_DAO.modificarFabricante(aux);

        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

//ELIMINA
    public void eliminarFabricante(Integer cod) throws MiExcepcion {
        try
        {
            if (cod == null || cod < 0)
            {
                throw new MiExcepcion("DEBE INGRESAR UN CORREO");
            }
            //busco por el codigo en la BD si existe un fabricante
            Fabricante fabricante = f_DAO.buscarPorClavePrincipal(cod);
            if (fabricante == null)
            {
                throw new MiExcepcion("EL CODIGO INGRESADO NO ESTÁ ASOCIADO A NINGÚN USUARIO");
            }
            System.out.println("Se Elimina el fabricante " + fabricante.getNombre());

            f_DAO.eliminarPorCodigo(cod);
        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

//MUESTRA    
    public void muestraFabricante() throws MiExcepcion {
        try
        {
            List<Fabricante> fabricantes = f_DAO.obtenerFabricante();

            if (fabricantes.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN FABRICANTES");
            } else
            {
                System.out.println("*** LISTA DE FABRICANTES ***");
                System.out.printf("%-15s%-15s\n", "CODIGO", "NOMBRE"); // FORMATO DE IMPRESIÓN
                for (Fabricante aux : fabricantes)
                {
                    System.out.println(aux);
                }
                System.out.println();
            }
        } catch (MiExcepcion e)
        {
            // e.printStackTrace();
            throw e;
        } catch (Exception e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR DE SISTEMA");
        }
    }

    public Fabricante verificaFabricante(int codigo) throws MiExcepcion {

        Fabricante f = null;

        try
        {

            f = f_DAO.buscarPorClavePrincipal(codigo);

            //if(f==)
        } catch (MiExcepcion ex)
        {
            ex.getMessage();
            System.out.println("ALGO FALLO");

        }
        return f;
    }

}
