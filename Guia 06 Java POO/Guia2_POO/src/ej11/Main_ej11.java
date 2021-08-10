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

import java.util.Date;
import java.util.Scanner;

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

        System.out.println("Ingrese el Dia (dd)");
        int d = leer.nextInt();
        System.out.println("Ingrese el Mes(mm)");
        int m = leer.nextInt();
        System.out.println("Ingrese el Año (aa)");
        int a = leer.nextInt();
        
        /* Usando una cadena y SimpleDateFormat
        String str = new String();
        str = String.valueOf(a) + "/" + String.valueOf(m) + "/" + String.valueOf(d);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Date fecha = formato.parse(str);
        
        Otra manera
        //por alguna razon le tengo que restar 1 al mes
        Date fecha = new Date(a-1900, m - 1, d);
         */
        //usando los set de Date
        Date fecha = new Date();
        fecha.setDate(d);
        fecha.setMonth(m-1);
        fecha.setYear(a-1900);
        
        System.out.println(fecha.toString());
        Date ahora = new Date();
        System.out.println(ahora.toString());
        int year = ahora.getYear() - fecha.getYear();
        System.out.println("Edad: " + year);

    }

}
