/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package persistencia;

import entidades.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import servicios.MiExcepcion;

/**
 *
 * @author Alta Clande
 */
public class ProductoDAO extends DAO{
    
    //GUARDAR 
    public void guardarProducto(Producto aux) throws MiExcepcion {
        try {
            if (aux == null) {
                throw new MiExcepcion("OBJETO FABRICANTE NULO");
            }
          
            /*
            Insert completa con clave principal autoincremental lo que no seria necesario
            
            String query = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) VALUES ('" 
                    + aux.getCodigo() 
                    +"',"+ aux.getNombre()+"','"
                    + aux.getPrecio()+"','"
                    + aux.getCod_fab().getCodigo()+"');";
            
            */
            
            String query = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('" 
                    + aux.getNombre()+"','"
                    + aux.getPrecio()+"','"
                    + aux.getFabricante().getCodigo()+"');";
            //llamo al metodo HEREDADO de DAO 
            insertarModificarEliminar(query);
                        
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR PRODUCTO");
        }
    }

    public void modificarProducto(Producto aux) throws MiExcepcion {
        try {
            if (aux == null) {
                throw new MiExcepcion("OBJETO PRODUCTO NULO");
            }

            /*
            SENTENCIA SQL DE MODIFICACIÓN
            UPDATE producto SET codigo = '49', 
            nombre = 'Microfono', 
            precio = '2000', 
            codigo_fabricante = '11' 
            WHERE (codigo = '51');
            */
           
            String sql = "UPDATE producto SET nombre = '" 
                    +aux.getNombre()
                    +"' , precio = '" + aux.getPrecio()+"', codigo_fabricante = '"
                    + aux.getFabricante().getCodigo()
                    +"' WHERE (codigo = '"+aux.getCodigo()+"');";
            
            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL MODIFICAR PRODUCTO");
        }
    }

    public Producto buscarPorClavePrincipal(Integer cod) throws MiExcepcion {
        try {
            /* SENTENCIA SQL DE CONSULTA
            
            SELECT * FROM producto p
            join fabricante f
            on f.codigo = p.codigo_fabricante
            
            */
            
            String sql = "SELECT * FROM producto p JOIN fabricante f ON f.codigo = p.codigo_fabricante WHERE p.codigo = " + cod + ";";
            //llama al metodo heredado con el el string creado como parametro
            consultarBase(sql);

            Producto p = null;
            Fabricante f = null;

            while (resultado.next()) {
                p = new Producto();
                f = new Fabricante();
                
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                //lleno el objeto fabricante con los datos del resulset
                f.setCodigo(resultado.getInt(5));
                f.setNombre(resultado.getString(6));
                //y ahoira se asigno el fabricante al producto
                p.setFabricante(f);
                
            }
            return p;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTO");
        } finally {
            desconectarBase();
        }
    }

    public void eliminarPorCodigo(Integer cod) throws MiExcepcion {
        try {
            // SENTENCIA SQL DE ELIMINACIÓN
            String sql = "DELETE FROM producto WHERE codigo = '" + cod + "';";

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL ELIMINAR PRODUCTO");
        }
    }

    public List<Producto> obtenerProducto() throws MiExcepcion {
        try {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto p JOIN fabricante f ON f.codigo = p.codigo_fabricante;";

            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto p = null;
            Fabricante f = null;
            
            while (resultado.next()) {
                p = new Producto();
                f = new Fabricante();
                
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                //lleno el objeto fabricante con los datos del resulset
                f.setCodigo(resultado.getInt(5));
                f.setNombre(resultado.getString(6));
                //y ahoira se asigno el fabricante al producto
                p.setFabricante(f);
                
                productos.add(p);
            }

            return productos;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally {
            desconectarBase();
        }
    }
    
    
    public List<Producto> obtenerProductoRangoPrecios() throws MiExcepcion {
        try {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto p JOIN fabricante f ON f.codigo = p.codigo_fabricante "
                    + "WHERE p.precio BETWEEN 120 AND 202 ;";

            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto p = null;
            Fabricante f = null;
            
            while (resultado.next()) {
                p = new Producto();
                f = new Fabricante();
                
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                //lleno el objeto fabricante con los datos del resulset
                f.setCodigo(resultado.getInt(5));
                f.setNombre(resultado.getString(6));
                //y ahoira se asigno el fabricante al producto
                p.setFabricante(f);
                
                productos.add(p);
            }

            return productos;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally {
            desconectarBase();
        }
    }
    
    public List<Producto> obtenerPortatiles() throws MiExcepcion {
        try {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto p JOIN fabricante f ON f.codigo = p.codigo_fabricante "
                    + "WHERE p.nombre LIKE 'Port%';" ;

            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto p = null;
            Fabricante f = null;
            
            while (resultado.next()) {
                p = new Producto();
                f = new Fabricante();
                
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                //lleno el objeto fabricante con los datos del resulset
                f.setCodigo(resultado.getInt(5));
                f.setNombre(resultado.getString(6));
                //y ahoira se asigno el fabricante al producto
                p.setFabricante(f);
                
                productos.add(p);
            }

            return productos;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally {
            desconectarBase();
        }
    }
    
    public List<Producto> obtenerMasBarato() throws MiExcepcion {
        try {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto p JOIN fabricante f ON f.codigo = p.codigo_fabricante "
                    + " ORDER BY p.precio"
                    + " LIMIT 1; " ;

            
            // SELECT nombre, precio FROM producto WHERE precio = (SELECT MIN(precio) FROM producto )

            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto p = null;
            Fabricante f = null;
            
            while (resultado.next()) {
                p = new Producto();
                f = new Fabricante();
                
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                //lleno el objeto fabricante con los datos del resulset
                f.setCodigo(resultado.getInt(5));
                f.setNombre(resultado.getString(6));
                //y ahoira se asigno el fabricante al producto
                p.setFabricante(f);
                
                productos.add(p);
            }

            return productos;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally {
            desconectarBase();
        }
    }
}
