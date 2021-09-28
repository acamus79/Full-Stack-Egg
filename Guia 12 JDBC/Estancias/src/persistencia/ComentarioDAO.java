/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package persistencia;

import entidades.Casa;
import entidades.Comentario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import servicios.MiExcepcion;

/**
 * 
 * @author Adrian E. Camus
 */
public class ComentarioDAO extends DAO{

    //GUARDAR
    public void guardarComentario(Comentario c) throws MiExcepcion {
        try
        {
            if (c == null)
            {
                throw new MiExcepcion("COMENTATIO INVÁLIDO");
            }
            // SENTENCIA SQL DE INSERCIÓN 
            String sql = "INSERT INTO comentarios (id_comentario, id_casa, comentario) "
                    + "VALUES('" + c.getId_comentario()
                    + "', '" + c.getCasa().getId_casa() 
                    + "', '" + c.getComentario() + "');";
            
            insertarModificarEliminar(sql);

        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR PRODUCTO");
        }

    }

    //BUSCAR
    public Comentario buscarComentarioPorId(int id) throws MiExcepcion {

        try
        {
            // SENTENCIA SQL DE CONSULTA CON INNER JOIN
            String sql = "SELECT * FROM comentarios com"
                    + " INNER JOIN casas c on c.id_casa = com.id_casa "
                    + "WHERE id_comentario = '" + id + "';";

            consultarBase(sql);
            Comentario com = null;
            Casa c = null;
            while (resultado.next())
            {
                com = new Comentario();
                c = new Casa();
                
                com.setId_comentario(resultado.getInt(1));
                com.setComentario(resultado.getString(3));
                                
                //Ahora la Casa
                c.setId_casa(resultado.getInt(4));
                c.setCalle(resultado.getNString(5));
                c.setNumero(resultado.getInt(6));
                c.setCodigo_postal(resultado.getString(7));
                c.setCiudad(resultado.getString(8));
                c.setPais(resultado.getString(9));
                c.setFecha_desde(resultado.getDate(10));
                c.setFecha_hasta(resultado.getDate(11));
                c.setTiempo_minimo(resultado.getInt(12));
                c.setTiempo_maximo(resultado.getInt(13));
                c.setPrecio_habitacion(resultado.getDouble(14));
                c.setTipo_vivienda(resultado.getString(15));
                // y recien ahora seteo el objeto casa a la familia
                com.setCasa(c);
            }
            return com;
        } catch (SQLException | MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTO");
        } finally
        {
            desconectarBase();
        }

    }

    public boolean buscarFamiliaPorCasa(int id_casa) throws MiExcepcion {

        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM familias WHERE id_casa_familia = '" + id_casa + "';";
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
    public void modificarFamilia(Familia f) throws MiExcepcion {

        try
        {
            if (f == null)
            {
                throw new MiExcepcion("FAMILIA INVALIDA");
            }
            // SENTENCIA SQL DE MODIFICACIÓN
            String sql = "UPDATE familias SET nombre = '" + f.getNombre() + "', "
                    + "edad_minima = '" + f.getEdad_minima() + "' "
                    + "edad_maxima = '" + f.getEdad_maxima() + "' "
                    + "num_hijos = '" + f.getNum_hijos() + "' "
                    + "email = '" + f.getEmail() + "' "
                    + "id_casa_familia = '" + f.getEmail() + "' "
                    + "WHERE id_familia = '" + f.getId() + "';";

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL MODIFICAR PRODUCTO");
        }

    }

    //ELIMINAR
    public void eliminarFamilia(Integer id) throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE ELIMINACIÓN
            String sql = "DELETE FROM familias WHERE id_familia = '" + id + "';";

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL ELIMINAR FAMILIA");
        }

    }

    //OBTENER
    public List<Familia> obtenerFamilia() throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE CONSULTA CON INNER JOIN
            String sql = "SELECT * FROM familias f"
                    + " INNER JOIN casas c on c.id_casa = f.id_casa_familia;";

            consultarBase(sql);

            List<Familia> familias = new ArrayList<>();
            Familia f = null;
            Casa c = null;

            while (resultado.next())
            {
                f = new Familia();
                c = new Casa();

                f.setId(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
                f.setEdad_minima(resultado.getInt(3));
                f.setEdad_maxima(resultado.getInt(4));
                f.setNum_hijos(resultado.getInt(5));
                f.setEmail(resultado.getString(6));
                f.setId_casa_familia(resultado.getInt(7));

                //Ahora seteo la Casa
                c.setId_casa(resultado.getInt(8));
                c.setCalle(resultado.getNString(9));
                c.setNumero(resultado.getInt(10));
                c.setCodigo_postal(resultado.getString(11));
                c.setCiudad(resultado.getString(12));
                c.setPais(resultado.getString(13));
                c.setFecha_desde(resultado.getDate(14));
                c.setFecha_hasta(resultado.getDate(15));
                c.setTiempo_minimo(resultado.getInt(16));
                c.setTiempo_maximo(resultado.getInt(17));
                // y recien ahora seteo el objeto casa a la familia
                f.setCasa(c);
                //y ahora agrego el objeto familia a la lista
                familias.add(f);
            }
            return familias;
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
