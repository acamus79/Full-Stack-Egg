/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package persistencia;

import entidades.Casa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import servicios.MiExcepcion;

/**
 * 
 * @author Adrian E. Camus
 */
public class CasaDAO extends DAO{
    
    //GUARDAR
    public void guardarCasa(Casa c) throws MiExcepcion {
        try
        {
            if (c == null)
            {
                throw new MiExcepcion("PRODUCTO INVÁLIDO");
            }
            // SENTENCIA SQL DE INSERCIÓN 
            String sql = "INSERT INTO casas (id_casa, calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda) "
                    + "VALUES('" + c.getId_casa()           //1
                    + "', '" + c.getCalle()                 //2
                    + "', '" + c.getNumero()                //3
                    + "', '" + c.getCodigo_postal()         //4
                    + "', '" + c.getCiudad()                //5
                    + "', '" + c.getPais()                  //6
                    + "', '" + c.getFecha_desde()           //7
                    + "', '" + c.getFecha_hasta()           //8
                    + "', '" + c.getTiempo_minimo()         //9
                    + "', '" + c.getTiempo_maximo()         //10
                    + "', '" + c.getPrecio_habitacion()     //11
                    + "', '" + c.getTipo_vivienda()         //12
                    + "');";
            
            insertarModificarEliminar(sql);

        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR PRODUCTO");
        }

    }

    //BUSCAR
    public Casa buscarCasaPorId(int id) throws MiExcepcion {

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
            String sql = "SELECT * FROM casas;";

            consultarBase(sql);

            List<Casa> casas = new ArrayList<>();
            Casa c = null;

            while (resultado.next())
            {
                //Instancio el objeto c con el constructor vacio de Casa
                c = new Casa();
                //Ahora seteo la Casa
                c.setId_casa(resultado.getInt(1));
                c.setCalle(resultado.getString(2));
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
