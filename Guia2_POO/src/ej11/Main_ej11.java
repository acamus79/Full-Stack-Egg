/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha 
usando la clase Date, para esto vamos a tener que crear 3 variables, dia, mes 
y anio que se le pedirán al usuario para poner el constructor del objeto Date. 
Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos 
años hay entre esa fecha y la fecha actual, que se puede conseguir instanciando
un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Ejemplo fecha actual: Date fechaActual = new Date();

 */
package ej11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {

            System.out.println("Ingrese el Dia (dd)");
            int d = leer.nextInt();
            System.out.println("Ingrese el Mes(mm)");
            int m = leer.nextInt();
            System.out.println("Ingrese el Año (aaa)");
            int a = leer.nextInt();

            String str = new String();
            str = String.valueOf(a) + "/" + String.valueOf(m) + "/" + String.valueOf(d);

            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

            Date fecha = formato.parse(str);
            System.out.println(fecha.toString());
            Date ahora = new Date();
            System.out.println(ahora.toString());
            int year = ahora.getYear() - fecha.getYear();
            System.out.println("Edad: "+year);
            
        } catch (ParseException ex) {
            Logger.getLogger(Main_ej11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
