package ExcepcionesEjemplosClase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo02Verificadas {

    //CUANDO NO QUIERO HACER NADA, SOLO LA DECLARO / PORQUE NO QUIERO TRATARLA ACA (Las verficadas JAVA me obliga a declarar)
    public static void main(String[] args) throws FileNotFoundException, IOException {
      //  leerArchivo();
    }

//    public static void leerArchivo() throws FileNotFoundException   {
//      //  OPCION A PARA LEER UN ARCHIVO TEXTO   - Sin manejar la EXC         
//        File archivo = new File("C:\\Users\\adrib\\Desktop\\PROBANDO55555.txt");  
//        Scanner leer = new Scanner(archivo);  
//        leer.useDelimiter("\\Z"); // Z Lee todo el archivo , z lee hasta 1021 caracteres
//        System.out.println(leer.next());
//        System.out.println("FIN PROGRAMA");      
//    }}
//     public static void leerArchivo() throws FileNotFoundException, IOException {
//        OPCION B PARA LEER UN ARCHIVO TEXTO  - Sin manejar la EXC - La dejo para que recuerden en un futuro
//        File archivo = new File("C:\\Users\\adrib\\Desktop\\PROBANDO.txt");
//        Scanner leer = new Scanner(archivo);
//        leer.useDelimiter("\\Z"); // Z Lee todo el archivo , z lee hasta 1021 caracteres
//        System.out.println(leer.next());
//        while (leer.hasNextLine()) { // Uso un ciclo, mientras exista algo para leer en la siguiente linea......
//            String line = leer.nextLine();
//        }
//     }}
//    
//    public static void leerArchivo() throws FileNotFoundException, IOException {
//        //OPCION C - Ademas de declararla la trato de forma individual con TRYCATCH
//        try {
//            //TODAS LAS INSTRUCCIONES QUE QUIERO QUE INTENTE REALIZAR
//            File archivo = new File("C:\\Users\\adrib\\Desktop\\PROBANDO.txt");
//            Scanner leer = new Scanner(archivo);
//            leer.useDelimiter("\\Z"); // Z Lee todo el archivo , z lee hasta 1021 caracteres
//            System.out.println(leer.next());
//        } catch (FileNotFoundException y) { // Declaro la Clase a la que podria pertenecer el error
//            System.out.println("OUCH QUE CAGADA");
//        } catch (IOException x) {
//            System.out.println("ALGUNA EXC QUE NO TRABAJA IO");
//        } finally { // TANTO SI OCURRE O NO, SALE POR ACA
//            System.out.println("TERMINO EL PROGRAMA");
//        }
//    }
}
//  }}

