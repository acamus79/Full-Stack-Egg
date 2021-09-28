/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package persistencia;

import entidades.Fabricante;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import servicios.MiExcepcion;

/**
 *
 * @author Adrian E. Camus
 */
public class FabricanteDAO extends DAO{
    
    //GUARDAR 
    public void guardarFabricante(Fabricante aux) throws MiExcepcion {
        try {
            if (aux == null) {
                throw new MiExcepcion("OBJETO FABRICANTE NULO");
            }
            /* SENTENCIA SQL DE INSERCIÓN
            
            INSERT INTO fabricante (codigo, nombre) 
            VALUES ('12', 'LG');
            
            */
            String query = "INSERT INTO fabricante (nombre) VALUES ('" 
                    + aux.getNombre()
                    + "');";
            //llamo al metodo HEREDADO de DAO 
            insertarModificarEliminar(query);
                        
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR FABRICANTE");
        }
    }

    public void modificarFabricante(Fabricante aux) throws MiExcepcion {
        try {
            if (aux == null) {
                throw new MiExcepcion("OBJETO FABRICANTE NULO");
            }

            /*
            SENTENCIA SQL DE MODIFICACIÓN
            UPDATE fabricante 
            SET nombre = 'Samsung' 
            WHERE (codigo = '12');
            */
            
            String sql = "UPDATE fabricante SET nombre = '" 
                    +aux.getNombre()+"' WHERE (codigo = '"+aux.getCodigo()+"');";
            
            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL MODIFICAR USUARIO");
        }
    }

    public Fabricante buscarPorClavePrincipal(Integer cod) throws MiExcepcion {
        try {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM Fabricante WHERE codigo = '" + cod + "';";
            //llama al metodo heredado con el el string creado como parametro
            consultarBase(sql);

            Fabricante f = null;

            while (resultado.next()) {
                f = new Fabricante();
                f.setCodigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
            }
            return f;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER FABRICANTE");
        } finally {
            desconectarBase();
        }
    }

    public void eliminarPorCodigo(Integer cod) throws MiExcepcion {
        try {
            // SENTENCIA SQL DE ELIMINACIÓN
            String sql = "DELETE FROM fabricante WHERE codigo = '" + cod + "';";

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL ELIMINAR FABRICANTE");
        }
    }

    public List<Fabricante> obtenerFabricante() throws MiExcepcion {
        try {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM fabricante;";

            consultarBase(sql);

            List<Fabricante> fabricantes = new ArrayList<>();
            Fabricante aux = null;

            while (resultado.next()) {
                aux = new Fabricante();

                aux.setCodigo(resultado.getInt(1));
                aux.setNombre(resultado.getString(2));

                fabricantes.add(aux);
            }

            return fabricantes;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER USUARIOS");
        } finally {
            desconectarBase();
        }
    }
    
    
}
