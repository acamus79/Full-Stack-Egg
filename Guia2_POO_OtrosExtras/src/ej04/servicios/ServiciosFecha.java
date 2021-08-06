/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Se deberá en métodos independientes:
 Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
 Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
 Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de cada
mes)
 Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
 Crear un método para verificar si el año ingresado es bisiesto



 */
package ej04.servicios;

import ej04.entidades.Fecha;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosFecha {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public Fecha crearFecha() {
        //la creo si parametros cosa que si no ingresan bien la fecha quede 
        //con los valores por defecto 1/1/1900
        Fecha laFecha = new Fecha();

        System.out.println("Ingrese el dia (dd)");
        int dd = leer.nextInt();
        System.out.println("Ingres el mes (mm)");
        int mm = leer.nextInt();
        System.out.println("Ingrese el año (aaaa)");
        int aa = leer.nextInt();
        
        if(verifica(dd,mm,aa)){
            laFecha.setAnio(aa);
            laFecha.setDia(dd);
            laFecha.setMes(mm);
        }else {
            System.out.println("Los Datos ingresados no son una fecha posible");
            System.out.println("La fecha se registro con los valores por defecto");
        }

        return laFecha;
    }

    private static boolean verifica(int dd, int mm, int aa) {
        boolean bandera = false;
        if (mm > 0 && mm < 13) {//verifico que los meses sean del 1 al 12
            //verifico por los meses que tengan 31 dias
            if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
                if (dd > 0 || dd < 32) {//en estos meses los dias pueden ser hasta 31
                    bandera = true;
                } else {
                    System.out.println("Los dias ingresados no corresponden al mes");
                    bandera = false;
                }
            } else if (esBiciesto(aa) && mm == 2) { //si es biciesto y es febrero
                bandera = dd > 0 || dd < 30;//los dias pueden ser hasta el 29
            } else {
                bandera = dd > 0 && dd < 31;
            }
        }

        return bandera;

    }

    private static boolean esBiciesto(int anio) {
        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("El año " + anio + " SI es bisiesto");
            return true;
        } else {
            System.out.println("El año " + anio + " NO es bisiesto");
            return false;
        }

    }
    
    public void verificaMes(Fecha f){
/* dos vectorres de 13 elementos dejo el indice 0 con valores vacios al principio
para que no se me haga lio con los indices y poder igualar el mes 1 con enero 
(indice uno) los declaro privados estaticos y finales porque solo los voy a 
usar en esta clase por varios metodos y no se van a modificar*/
    String mesesString[] = {"nada", "Enero", "Febrero", "Marzo", "Abril",
        "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
    int mesesInt[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //Ahora muestro los vectores segun el indice con el metodo getMes del objeto Fecha
        System.out.println("El mes ingresado es "+mesesString[f.getMes()]+
                " y tiene "+mesesInt[f.getMes()]+" dias");
       
    }
}
