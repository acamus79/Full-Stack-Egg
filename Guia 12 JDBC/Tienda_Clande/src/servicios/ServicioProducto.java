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
 * @author Alta Clande
 */
public class ServicioProducto {

    private ProductoDAO p_DAO;

    public ServicioProducto() {
        p_DAO = new ProductoDAO();
    }

    //CREATE - CREAR
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
            if (precio == null | precio < 0)
            {
                throw new MiExcepcion("EL PRECIO NO ES VIABLE");
            }
            aux.setPrecio(precio);
            // VALIDACIÓN FABRICANTE
            if (f == null)
            {
                throw new MiExcepcion("EL FABRICANTE NO ES VIABLE");
            } else
            {
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

    //READ - MUESTRA    
    public void muestraProducto() throws MiExcepcion {
        try
        {
            List<Producto> productos = p_DAO.obtenerProducto();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-15s\n", "NOMBRE"); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos)
                {
                    System.out.println(aux.getNombre());
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

    public void muestraProductoPrecio() throws MiExcepcion {
        try
        {
            List<Producto> productos = p_DAO.obtenerProducto();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-35s%-35s\n", "NOMBRE", "PRECIO"); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos)
                {
                    System.out.printf("%-35s%-35s\n", aux.getNombre() , "$ " + aux.getPrecio());
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

    public void muestraProducto120202() throws MiExcepcion {

        try
        {
            List<Producto> productos = p_DAO.obtenerProductoRangoPrecios();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-15s%-35s%-15s%-25s\n", "CODIGO", "NOMBRE", "PRECIO", "FABRICANTE"); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos)
                {
                    System.out.printf("%-15s%-35s%-15s%-25s\n", aux.getCodigo(), aux.getNombre(), "$" + aux.getPrecio(), aux.getFabricante().getNombre());
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

    public void muestraPortatiles() throws MiExcepcion {

        try
        {
            List<Producto> productos = p_DAO.obtenerPortatiles();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-15s%-35s%-15s%-25s\n", "CODIGO", "NOMBRE", "PRECIO", "FABRICANTE"); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos)
                {
                    System.out.printf("%-15s%-35s%-15s%-25s\n", aux.getCodigo(), aux.getNombre(), "$" + aux.getPrecio(), aux.getFabricante().getNombre());
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

    public void muestraMasBarato() throws MiExcepcion {

        try
        {
            List<Producto> productos = p_DAO.obtenerMasBarato();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-15s%-35s%-15s%-25s\n", "CODIGO", "NOMBRE", "PRECIO", "FABRICANTE"); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos)
                {
                    System.out.printf("%-15s%-35s%-15s%-25s\n", aux.getCodigo(), aux.getNombre(), "$" + aux.getPrecio(), aux.getFabricante().getNombre());
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

    public void muestraProductosTODO() throws MiExcepcion {

        try
        {
            List<Producto> productos = p_DAO.obtenerProducto();

            if (productos.isEmpty())
            {
                throw new MiExcepcion("NO EXISTEN PRODUCTOS");
            } else
            {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-15s%-35s%-15s%-25s\n", "CODIGO", "NOMBRE", "PRECIO", "FABRICANTE"); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos)
                {
                    System.out.printf("%-15s%-35s%-15s%-25s\n", aux.getCodigo(), aux.getNombre(), "$" + aux.getPrecio(), aux.getFabricante().getNombre());
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


//UPDATE - MODIFICA
    public void modificarProducto(Integer codigo, String nombre, Double precio, Fabricante fabri) throws MiExcepcion {
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

            if (precio == null)
            {
                throw new MiExcepcion("DEBE INGRESAR UN PRECIO");
            }

            Producto aux = p_DAO.buscarPorClavePrincipal(codigo);

            if (aux == null)
            {
                throw new MiExcepcion("EL CODIGO INGRESADO NO ESTÁ ASOCIADO A NINGÚN PRODUCTO");
            }

            aux.setNombre(nombre);

            aux.setFabricante(fabri);
            aux.setPrecio(precio);

            p_DAO.modificarProducto(aux);

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
// DELETE - ELIMINA
    public void eliminaProducto(Integer cod) throws MiExcepcion {
        try
        {
            if (cod == null || cod < 0)
            {
                throw new MiExcepcion("DEBE INGRESAR UN CORREO");
            }
            //busco por el codigo en la BD si existe un fabricante
            Producto prod = p_DAO.buscarPorClavePrincipal(cod);
            if (prod == null)
            {
                throw new MiExcepcion("EL CODIGO INGRESADO NO ESTÁ ASOCIADO A NINGÚN PRODUCTO");
            }
            System.out.println("Se Elimina el Producto " + prod.getNombre());

            p_DAO.eliminarPorCodigo(cod);
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
     */

    //PARA VERIFICAR SI EXISTE UN PRODUCTO EN LA BD
    public Producto verificaProducto(int codigo) throws MiExcepcion {

        Producto p = null;

        try
        {
            p = p_DAO.buscarPorClavePrincipal(codigo);
        } catch (MiExcepcion ex)
        {
            ex.getMessage();
            System.out.println("ALGO FALLO");
        }
        return p;
    }
}
