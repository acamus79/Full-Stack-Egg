/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package servicios;

import entidades.*;
import java.util.List;
import persistencia.ProductoDAO;

/**
 *
 * @author Adrian E. Camus
 */
public class ServicioProducto {

    private ProductoDAO p_DAO;

    public ServicioProducto() {
        p_DAO = new ProductoDAO();
    }

    public void crearProducto(String nombre, Double precio, Fabricante f) throws MiExcepcion {

        try
        {
            // VALIDACIÓN NOMBRE
            if (nombre == null | nombre.trim().isEmpty())
            {
                throw new MiExcepcion("DEBE INGRESAR UN NOMBRE");
            }
            Producto aux = new Producto();
            
            aux.setNombre(nombre);
            // VALIDACIÓN PRECIO
            if(precio == null | precio < 0 ){
                throw new MiExcepcion("EL PRECIO NO ES VIABLE");
            }
            aux.setPrecio(precio);
            // VALIDACIÓN FABRICANTE
            if(f == null){
                System.out.println("el fabricante esta vacio");
                throw new MiExcepcion("EL FABRICANTE NO ES VIABLE");
            }else{
                System.out.println("ACA ESTOY SETEANDO EL FABRICANTE");
            aux.setFabricante(f);
            }            
            //llamo al metodo del ProductoDAO que persiste un fabricante
            p_DAO.guardarProducto(aux);

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
/*
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

     public boolean verificaFabricante(int codigo){
        
        
        
        
        return false;
        
    }
   */ 
    
    
}
