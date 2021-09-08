/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package principal;

/**
 *
 * @author Adrian E. Camus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//EJERCICIO 5
//Dado el método metodoA de la clase A, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción 
//MioException? RT: 1ro sentencia_a1
//                  2do sentencia_a2
//                  3ro sentencia_a6
//  ********** Que pasa si la excepcion la provoca la sentencia a4?? ********
// 
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción 
//MioException? RT: 1ro sentencia_a1
//                  2do sentencia_a2
//                  3ro sentencia_a3
//                  4do sentencia_a4
//                  5do sentencia_a5
//
//        class A {
//            void metodoA() {
//                sentencia_a1
//                sentencia_a2
//                try {
//                    sentencia_a3
//                    sentencia_a4
//                } catch (MioException e){ 
//                    sentencia_a6 
//                }
//            sentencia_a5
//            }
//        }

//EJERCICIO 6 
//Dado el método metodoB de la clase B, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción 
//MioException? RT: 1ro sentencia_b1
//                  2do sentencia_b3
//                  3ro sentencia_b4
//
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción 
//MioException? RT: 1ro sentencia_b1
//                  2do sentencia_b2
//                  3ro sentencia_b4
//          
//      class B {
//          void metodoB() {
//              sentencia_b1
//                  try {
//                      sentencia_b2
//                  } catch (MioException e){ 
//                      sentencia_b3 
//                  }
//                  finally
//                      sentencia_b4
//                  }
//      }

//EJERCICIO 7
//Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
//  class Uno{
//      private static int metodo() {
//          int valor=0;
//              try {
//                  valor = valor+1;
//                  valor = valor + Integer.parseInt (”42”);
//                  valor = valor +1;
//                  System.out.println(”Valor final del try:” + valor) ;
//              } catch (NumberFormatException e) {
//                  Valor = valor + Integer.parseInt(”42”);
//                  System.out.println(“Valor final del catch:” + valor);
//              } finally {
//                  valor = valor + 1;
//                  System.out.println(”Valor final del finally: ” + valor) ;
//              }
//          valor = valor +1;
//          System.out.println(”Valor antes del return: ” + valor) ;
//      return valor;
//      }
//
//          public static void main (String[] args) {
//              try {
//                  System.out.println (metodo()) ;
//              }catch(Exception e) {
//                  System.err.println(”Excepcion en metodo() ”) ;
//                  e.printStackTrace();
//              }
//          }
//  }
//RT: SE MOSTRARA 
//Valor final del try: 44
//Valor final del finally: 45
//Valor antes del return: 46
//46

//  class Dos{
//      private static metodo() {
//          int valor=0;
//          try{
//              valor = valor + 1;
//              valor = valor + Integer.parseInt (”W”);
//              valor = valor + 1;
//              System.out.println(”Valor final del try: ” + valor) ;
//          } catch ( NumberFormatException e ) {
//              valor = valor + Integer.parseInt (”42”);
//              System.out.println(”Valor final del catch: ” + valor) ;
//          } finally {
//              valor = valor + 1;
//              System.out.println(”Valor final del finally: ” + valor) ;
//          }
//          valor = valor + 1;
//          System.out.println(”Valor antes del return: ” + valor) ;
//      return valor;
//      }
//  public static void main (String[] args) {
//      try{
//      System.out.println (metodo());
//      } catch(Exception e) {
//          System.err.println (”Excepcion en metodo()”) ;
//          e.printStackTrace();
//      }
//  }
// }
//RT: SE MOSTRARA 
//Valor final del catch: 43
//Valor final del finally: 44
//Valor antes del return: 45
//45



//class Tres{
//private static metodo( ) {
//int valor=0;
//try{
//valor = valor + 1;
//valor = valor + Integer.parseInt (”W”);
//valor = valor + 1;
//System.out.println(”Valor final del try: ” + valor);
//} catch(NumberFormatException e) {
//valor = valor + Integer.parseInt (”W”);
//System.out.println(”Valor final del catch: ” + valor);
//} finally{
//valor = valor + 1;
//System.out.println(”Valor final del finally:” + valor);
//}
//valor = valor + 1;
//System.out.println(”Valor antes del return: ” + valor) ;
//return valor;
//}
// 
//public static void main (String[] args) {
//try{
//System.out.println( metodo ( ) ) ;
//} catch(Exception e) {
//System.err.println(”Excepcion en metodo ( ) ” ) ;
//e.printStackTrace();
//}
//}
//}









    }
}
