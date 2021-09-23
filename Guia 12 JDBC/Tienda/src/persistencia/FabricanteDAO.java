/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package persistencia;

import entidad.Fabricante;
import excepcion.MiExcepcion;

/**
 *
 * @author Adrian E. Camus
 */
public class FabricanteDAO extends DAO{
    
    
    
    
    
    public void guardarFabricante(Fabricante f) throws MiExcepcion{
        try {
            if (f == null){
                throw new MiExcepcion("FABRICANTE INVÁLIDO");
            }
            // SENTENCIA SQL DE INSERCIÓN -- INSERT INTO `tienda`.`fabricante` (`codigo`, `nombre`) VALUES ('10', 'pHILLIPS');
            String sql = "INSERT INTO fabricante (codigo, nombre) "
                    + "VALUES('" + f.getCodigo()
                    + "', '" + f.getNombre()+ "');";
            insertarModificarEliminar(sql);     
                        
        }catch(MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR USUARIO");
        }
        
    }
    
    
    
}
