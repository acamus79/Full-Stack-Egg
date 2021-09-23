/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package persistencia;

import excepcion.MiExcepcion;
import java.sql.*;

/**
 *
 * @author Adrian E. Camus
 */
public class DAO {
    
    protected Connection conexion = null;
    protected Statement sentencia = null;
    protected ResultSet resultado = null;
    private final String USUARIO = "root";
    private final String CLAVE = "root";
    private final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/egg?useSSL=false";
    
    
    protected void conectarDB() throws MiExcepcion {
        try {
            Class.forName(CONTROLADOR);// CARGA EL CONTROLADOR
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);// ESTABLECE LA CONEXIÓN
        } catch (ClassNotFoundException | SQLException e) {
            // e.printStackTrace(); //para ver la traza del error
            throw new MiExcepcion("ERROR AL CONECTARSE");
        }
    }

    protected void desconectarBase() throws MiExcepcion {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR AL DESCONECTARSE");
        }
    }

    protected void insertarModificarEliminar(String sql) throws MiExcepcion {
        try {
            conectarDB();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException e) {
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                // ex.printStackTrace();
                throw new MiExcepcion("ERROR AL REALIZAR ROLLBACK");
            }
            // e.printStackTrace();
            throw new MiExcepcion("ERROR AL EJECUTAR SENTENCIA");
        } finally {
            desconectarBase();
        }
    }

    protected void consultarBase(String sql) throws MiExcepcion {
        try {
            conectarDB();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new MiExcepcion("ERROR AL CONSULTAR");
        }
    }
    
    
}
