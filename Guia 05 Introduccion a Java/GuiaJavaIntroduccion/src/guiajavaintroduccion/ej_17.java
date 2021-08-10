/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    17.Realizar un programa que simule el funcionamiento de un dispositivo RS232,
    este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
    deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
    de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, 
    
    la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
    y toda secuencia distinta de FDE, que no respete el formato se considera 
    incorrecta. 
    
    Al finalizar el proceso, se imprime un informe indicando la cantidad
    de lecturas correctas e incorrectas recibidas. 
    Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
    funciones de JavaSubstring(),Length(), equals().

 */
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_17 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rs232 = "";
        String fde = "&&&&&";
        int contC = 0;
        int contI = 0;
       
        do {//hacer
            System.out.println("Ingrese una Secuencia de 5 caracteres que comience con X y termine con O");
                rs232 = leer.next();
                rs232 = rs232.toUpperCase();
                
                //Si el conteo de caracteres de rs232 es igual a 5
                if (rs232.length()==5){
                        //si el primer caracter es X y el Ultimo es O, cuento correcto                
                        if (rs232.charAt(0)=='X' && rs232.charAt(rs232.length()-1)=='O'){
                            contC=contC+1;
                            }
                        else{
                            contI=contI+1;//sino cuento incorrecto
                            }
                }else{
                     contI=contI+1;//sino cuento incorrecto
                     }
        //Mientras el contenido de rs232 sea distinto a fde
        }while(!rs232.equals(fde)); 
        
        leer.close();//cierro el scanner porque ya no lo voy a usar mas
        
        System.out.println("Se capturó la secuencia FDE");
        System.out.println("La suma de las secuencias correctas es "+contC);
        System.out.println("La suma de las secuencias incorrectas es "+contI);
        }
}