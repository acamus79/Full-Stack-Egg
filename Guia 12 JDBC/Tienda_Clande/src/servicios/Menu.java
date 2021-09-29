/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar un menú en java a través del cual se permita elegir qué consulta se desea
realizar. Las consultas a realizar sobre la BD son las siguientes:

a) Lista el nombre de todos los productos que hay en la tabla producto. 

b) Lista los nombres y los precios de todos los productos de la tabla producto. 

c) Listar aquellos productos que su precio esté entre 120 y 202. 

d) Buscar y listar todos los Portátiles de la tabla producto. 

e) Listar el nombre y el precio del producto más barato. 
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.



 */
package servicios;

import entidades.Fabricante;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Menu {

        Scanner sc;
        private int var;
        private ServicioFabricante sf;
        private ServicioProducto sp;

    public Menu() {
        // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        var=0;
        sf = new ServicioFabricante();
        sp = new ServicioProducto();
        
    }
    
    
    
    
    public void menuPrincipal() throws MiExcepcion {
        
                
        do{
          try{  
              
            System.out.println(" MENU PRINCIPAL ");
            System.out.println(" 1- ver nombre producto");
            System.out.println(" 2- Producto por nombre y precio");
            System.out.println(" 3- Producto entre $120 y $202");
            System.out.println(" 4- Ver todos los portatiles");
            System.out.println(" 5- Producto mas Barats");
            System.out.println(" 6- Nuevo producto");
            System.out.println(" 7- Nuevo Fabricante");
            System.out.println(" 8- Editar un producto");
            System.out.println(" 9- SALIR");
            
            var= sc.nextInt();
            
            switch(var){
                case 1: 
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6: nuevoProducto();
                    break;
                case 7: nuevoFabricante();
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("NOS VIMOS EN DYSNEY");
                default:
                    System.out.println("PUSISTE MAL EL DEDO");
           
            }
          }catch(InputMismatchException | MiExcepcion e ){
              e.getMessage();
              System.out.println("PAPARULO NO METAS LETRAS\n\n");
              sc.next(); 
          }   
            
        }while(var!=9);
            
    }
    
    
    private void nuevoFabricante() throws MiExcepcion{
        
        
        
        
        
        System.out.println("Ingrese el nombre del nuevo fabricante");
        
    try {    
        String palabra = sc.next().toUpperCase().trim();
        sf.crearFabricante(palabra);
        
        } catch(MiExcepcion e){
            
        e.getMessage();
            
            }    
        
    }
    
     private void nuevoProducto() throws MiExcepcion{
        
         Fabricante fabri = null;
         
    try {  
        //String nombre, Double precio, Fabricante f
        System.out.println("Ingrese el nombre del nuevo Producto");
        String palabra = sc.next().toUpperCase().trim();
        
        System.out.println("Ingrese el precio");
        Double precio = sc.nextDouble();
        
        System.out.println("Ingrese el codigo de fabricante");
        int cod = sc.nextInt();
        fabri = sf.verificaFabricante(cod);
       
        sp.crearProducto(palabra, precio, fabri);
        
        } catch(MiExcepcion e){
                                               
        e.getMessage();
            
            }    
        
    }
    
    
    
}
