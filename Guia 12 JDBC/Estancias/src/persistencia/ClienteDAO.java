/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package persistencia;

import entidades.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import servicios.MiExcepcion;

/**
 * 
 * @author Adrian E. Camus
 */
public class ClienteDAO extends DAO{
    
    //GUARDAR
    public void guardarCliente(Cliente c) throws MiExcepcion {
        try
        {
            if (c == null)
            {
                throw new MiExcepcion("CLIENTE INVÁLIDO");
            }
            
            //SENTENCIA SQL DE INSERCIÓN 
            String sql = "INSERT INTO clientes (id_cliente, nombre, calle, numero, codigo_postal, ciudad, pais, email) "
                    + "VALUES('" + c.getId_cliente()        //1
                    + "', '" + c.getNombre()                //2
                    + "', '" + c.getCalle()                 //3
                    + "', '" + c.getNumero()                //4
                    + "', '" + c.getCodigo_postal()         //5
                    + "', '" + c.getCiudad()                //6
                    + "', '" + c.getPais()                  //7
                    + "', '" + c.getEmail()                 //8
                    + "');";
            
            insertarModificarEliminar(sql);

        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR CLIENTE");
        }

    }

    //BUSCAR
    public Cliente buscarClientePorId(int id) throws MiExcepcion {

        try
        {
            // SENTENCIA SQL DE CONSULTA CON INNER JOIN
            String sql = "SELECT * FROM casas"
                       + "WHERE id_casa = '" + id + "';";

            consultarBase(sql);
            Cliente c = null;
            while (resultado.next())
            {
                c = new Cliente();
                c.setId_cliente(resultado.getInt(1));
                c.setNombre(resultado.getString(2));
                c.setCalle(resultado.getString(3));
                c.setNumero(resultado.getInt(4));
                c.setCodigo_postal(resultado.getString(5));
                c.setCiudad(resultado.getString(6));
                c.setPais(resultado.getString(7));
                c.setEmail(resultado.getString(8));
                            
            }
            return c;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER CLIENTE");
        } finally
        {
            desconectarBase();
        }

    }

    public boolean verificaClientePorId(int id) throws MiExcepcion {

        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM clientes WHERE id_cliente = '" + id + "';";
            consultarBase(sql);
            return resultado.next();

        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTO");
        } finally
        {
            desconectarBase();
        }

    }

    //MODIFICAR
    public void modificarCliente(Cliente c) throws MiExcepcion {

        try
        {
            if (c == null)
            {
                throw new MiExcepcion("CLIENTE INVALIDO");
            }
            // SENTENCIA SQL DE MODIFICACIÓN
            String sql = "UPDATE casas SET"
                    + "nombre = '" + c.getNombre() + "', "
                    + "calle = '" + c.getCalle() + "', "
                    + "numero = '" + c.getNumero() + "' "
                    + "codigo_postal= '" + c.getCodigo_postal() + "' "
                    + "ciudad = '" + c.getCiudad() + "' "
                    + "pais = '" + c.getPais() + "' "
                    + "email = '" + c.getEmail() + "' "
                    + "WHERE id_cliente = '" + c.getId_cliente() + "';";

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL MODIFICAR PRODUCTO");
        }

    }

    //ELIMINAR
    public void eliminarCliente(Integer id) throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE ELIMINACIÓN
            String sql = "DELETE FROM clientes WHERE id_cliente = '" + id + "';";
            insertarModificarEliminar(sql);
            
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL ELIMINAR CLIENTE");
        }

    }

    //OBTENER
    public List<Cliente> obtenerCliente() throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM clientes;";

            consultarBase(sql);

            List<Cliente> clientes = new ArrayList<>();
            Cliente c = null;

            while (resultado.next())
            {
                //Instancio el objeto c con el constructor vacio de Casa
                c = new Cliente();
                //Ahora seteo la Casa
                c.setId_cliente(resultado.getInt(1));
                c.setNombre(resultado.getString(2));
                c.setCalle(resultado.getString(3));
                c.setNumero(resultado.getInt(4));
                c.setCodigo_postal(resultado.getString(5));
                c.setCiudad(resultado.getString(6));
                c.setPais(resultado.getString(7));
                c.setEmail(resultado.getString(8));
                //y ahora agrego el objeto "c" a la lista "casas"
                clientes.add(c);
            }
            return clientes;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally
        {
            desconectarBase();
        }
    }


}
