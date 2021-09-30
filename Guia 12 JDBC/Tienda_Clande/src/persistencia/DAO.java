/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package persistencia;

/**
 *
 * @author Alta Clande
 */
import java.sql.*;
import servicios.MiExcepcion;

public class DAO {

    // ADMINISTRA NUESTRA CONEXIÓN
    protected Connection conexion = null;
    // INSTRUCCIÓN DE CONSULTA
    protected Statement sentencia = null;
    // MANIPULA LOS RESULTADOS
    protected ResultSet resultado = null;

    protected void conectarBase() throws MiExcepcion {
        try
        {
            // CARGA EL CONTROLADOR
            Class.forName("com.mysql.jdbc.Driver");
            // ESTABLECE LA CONEXIÓN
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda?useSSL=false", "root", "root");
        } catch (ClassNotFoundException | SQLException e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR AL CONECTARSE");
        }
    }

    protected void desconectarBase() throws MiExcepcion {
        try
        {
            if (resultado != null)
            {
                resultado.close();
            }
            if (sentencia != null)
            {
                sentencia.close();
            }
            if (conexion != null)
            {
                conexion.close();
            }
        } catch (SQLException e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR AL DESCONECTARSE");
        }
    }

    protected void insertarModificarEliminar(String query) throws MiExcepcion {
        try
        {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(query);
        } catch (SQLException e)
        {
            try
            {
                conexion.rollback();
            } catch (SQLException ex)
            {
                // ex.printStackTrace();
                throw new MiExcepcion("ERROR AL REALIZAR ROLLBACK");
            }
            // e.printStackTrace();
            throw new MiExcepcion("ERROR AL EJECUTAR SENTENCIA");
        } finally
        {
            desconectarBase();
        }
    }

    protected void consultarBase(String sql) throws MiExcepcion {
        try
        {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e)
        {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR AL CONSULTAR");
        }
    }
}
