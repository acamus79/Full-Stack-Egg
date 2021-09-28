/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar un menú en java a través del cual se permita elegir qué consulta se 
desea realizar. Las consultas a realizar sobre la BD son las siguientes:

a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima
inferior a 10 años.

b) Buscar y listar las casas disponibles para el periodo comprendido entre 
el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.

c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.

d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de 
una fecha dada y un número de días específico.

e) Listar los datos de todos los clientes que en algún momento realizaron una
estancia y la descripción de la casa donde la realizaron.

f) Listar todas las estancias que han sido reservadas por un cliente, mostrar
el nombre, país y ciudad del cliente y además la información de la casa que 
reservó. La que reemplazaría a la anterior

g) Debido a la devaluación de la libra esterlina con respecto al euro se desea 
incrementar el precio por día en un 5% de todas las casas del Reino Unido. 
Mostar los precios actualizados.

h) Obtener el número de casas que existen para cada uno de los países diferentes.

i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas 
(comentarios) que están ‘limpias’.

j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad 
de las fechas. Para finalizar, pensar junto con un compañero cómo sería posible
optimizar las tablas de la BD para tener un mejor rendimiento


 */
package servicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Menu {
    
    private Scanner leer;
    //private ServicioFabricante servFab;
    //private ServicioProducto servProd;

    public Menu() {
        // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        //servFab = new ServicioFabricante();
        //servProd = new ServicioProducto();
    }
    
    
    
    
    
    
    public void menuPrincipal() {
        int opcion = 0;
        
        do {
            try {
                System.out.println("==     MENU PRINCIPAL   ==");
                System.out.println("|| 1.- Mostrar Tablas    ||");
                System.out.println("|| 2.- Editar Registros  ||");
                System.out.println("|| 3.- Borrar Registros  ||");
                System.out.println("|| 4.- Agregar Registros ||");
                System.out.println("|| 5.- Salir             ||");
                System.out.println("==========================");
        
            opcion = leer.nextInt();
                                
                switch (opcion) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        System.out.println("CHAU!!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                leer.next();
           // } catch (MiExcepcion e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 5);

    }
    
    
    
    
}
