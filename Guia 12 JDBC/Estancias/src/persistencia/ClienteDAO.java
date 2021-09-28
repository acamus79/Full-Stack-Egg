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
            Casa c = null;
            while (resultado.next())
            {
                c = new Casa();
                c.setId_casa(resultado.getInt(1));
                c.setCalle(resultado.getNString(2));
                c.setNumero(resultado.getInt(3));
                c.setCodigo_postal(resultado.getString(4));
                c.setCiudad(resultado.getString(5));
                c.setPais(resultado.getString(6));
                c.setFecha_desde(resultado.getDate(7));
                c.setFecha_hasta(resultado.getDate(8));
                c.setTiempo_minimo(resultado.getInt(9));
                c.setTiempo_maximo(resultado.getInt(10));
                c.setPrecio_habitacion(resultado.getDouble(11));
                c.setTipo_vivienda(resultado.getString(12));
            
            }
            return c;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTO");
        } finally
        {
            desconectarBase();
        }

    }

    public boolean verificaCasaPorId(int id_casa) throws MiExcepcion {

        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM casas WHERE id_casa = '" + id_casa + "';";
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
    public void modificarCasa(Casa c) throws MiExcepcion {

        try
        {
            if (c == null)
            {
                throw new MiExcepcion("FAMILIA INVALIDA");
            }
            // SENTENCIA SQL DE MODIFICACIÓN
            String sql = "UPDATE casas SET"
                    + "calle = '" + c.getCalle() + "', "
                    + "numero = '" + c.getNumero() + "' "
                    + "codigo_postal= '" + c.getCodigo_postal() + "' "
                    + "ciudad = '" + c.getCiudad() + "' "
                    + "pais = '" + c.getPais() + "' "
                    + "fecha_desde = '" + c.getFecha_desde() + "' "
                    + "fecha_hasta = '" + c.getFecha_hasta() + "' "
                    + "tiempo_minimo = '" + c.getTiempo_minimo() + "' "
                    + "tiempo_maximo = '" + c.getTiempo_maximo() + "' "
                    + "precio_habitacion = '" + c.getPrecio_habitacion() + "' "
                    + "tipo_vivienda = '" + c.getTipo_vivienda() + "' "
                    + "WHERE id_casa = '" + c.getId_casa() + "';";

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL MODIFICAR PRODUCTO");
        }

    }

    //ELIMINAR
    public void eliminarCasa(Integer id) throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE ELIMINACIÓN
            String sql = "DELETE FROM casas WHERE id_casa = '" + id + "';";
            insertarModificarEliminar(sql);
            
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL ELIMINAR FAMILIA");
        }

    }

    //OBTENER
    public List<Casa> obtenerCasa() throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM casas f;";

            consultarBase(sql);

            List<Casa> casas = new ArrayList<>();
            Casa c = null;

            while (resultado.next())
            {
                //Instancio el objeto c con el constructor vacio de Casa
                c = new Casa();
                //Ahora seteo la Casa
                c.setId_casa(resultado.getInt(1));
                c.setCalle(resultado.getNString(2));
                c.setNumero(resultado.getInt(3));
                c.setCodigo_postal(resultado.getString(4));
                c.setCiudad(resultado.getString(5));
                c.setPais(resultado.getString(6));
                c.setFecha_desde(resultado.getDate(7));
                c.setFecha_hasta(resultado.getDate(8));
                c.setTiempo_minimo(resultado.getInt(9));
                c.setTiempo_maximo(resultado.getInt(10));
                c.setPrecio_habitacion(resultado.getDouble(11));
                c.setTipo_vivienda(resultado.getString(12));
                //y ahora agrego el objeto "c" a la lista "casas"
                casas.add(c);
            }
            return casas;
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
