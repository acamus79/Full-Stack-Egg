/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package persistencia;

import entidad.Producto;
import excepcion.MiExcepcion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian E. Camus
 */
public class ProductoDAO extends DAO {

    //GUARDAR
    public void guardarProducto(Producto p) throws MiExcepcion {
        try
        {
            if (p == null)
            {
                throw new MiExcepcion("PRODUCTO INVÁLIDO");
            }
            // SENTENCIA SQL DE INSERCIÓN -- INSERT INTO `tienda`.`fabricante` (`codigo`, `nombre`) VALUES ('10', 'pHILLIPS');
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) "
                    + "VALUES('" + p.getCodigo()
                    + "', '" + p.getNombre() + "', '" + p.getPrecio() + "', '" + p.getCodigoFabricante() + "');";
            insertarModificarEliminar(sql);

        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR PRODUCTO");
        }

    }

    //BUSCAR
    public Producto buscarProductoPorCodigo(int cod) throws MiExcepcion {

        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto WHERE codigo = '" + cod + "';";
            consultarBase(sql);
            Producto p = null;

            while (resultado.next())
            {
                p = new Producto();

                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigoFabricante(resultado.getInt(4));
            }
            return p;
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
    public void modificarProducto(Producto p) throws MiExcepcion {

        try
        {
            if (p == null)
            {
                throw new MiExcepcion("PRODUCTO INVÁLIDO");
            }
            // SENTENCIA SQL DE MODIFICACIÓN
            String sql = "UPDATE producto SET nombre = '" + p.getNombre() + "', "
                    + "apellido = '" + p.getPrecio() + "' "
                    + "apellido = '" + p.getCodigoFabricante() + "' "
                    + "WHERE codigo = '" + p.getCodigo() + "';";

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL MODIFICAR PRODUCTO");
        }

    }

    //ELIMINAR
    public void eliminarProducto(Integer cod) throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE ELIMINACIÓN
            String sql = "DELETE FROM producto WHERE codigo = '" + cod + "';";

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e)
        {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL ELIMINAR PRODUCTO");
        }

    }

    //OBTENER
    public List<Producto> obtenerProducto() throws MiExcepcion {
        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto";
            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto aux = null;

            while (resultado.next())
            {
                aux = new Producto();
                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));
                aux.setPrecio(resultado.getDouble(3));
                aux.setCodigoFabricante(resultado.getInt(4));

                productos.add(aux);
            }

            return productos;
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
