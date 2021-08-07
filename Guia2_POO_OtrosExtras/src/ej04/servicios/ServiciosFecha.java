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

        if (verifica(dd, mm, aa)) {
            laFecha.setAnio(aa);
            laFecha.setDia(dd);
            laFecha.setMes(mm);
        } else {
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
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0);
    }

    private static void verificaMes(Fecha f) {
        /* dos vectorres de 13 elementos dejo el indice 0 con valores vacios al principio
para que no se me haga lio con los indices y poder igualar el mes 1 con enero 
(indice uno) los declaro en este metodo porque solo los uso aca no se van a modificar*/
        final String mesesString[] = {"nada", "Enero", "Febrero", "Marzo", "Abril", "Mayo",
            "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
        final int mesesInt[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //Ahora muestro los vectores segun el indice con el metodo getMes del objeto Fecha
        System.out.println("El mes ingresado es " + mesesString[f.getMes()]
                + " y tiene " + mesesInt[f.getMes()] + " dias");
    }

    private static void diaPosterior(Fecha f) {

        int pD = f.getDia() + 1;
        int mm = f.getMes();
        int aa = f.getAnio();
        //si el mes es alguno de los que tiene 31 dias
        if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
            if (pD > 31) {//si el dia posterior es mayor que 31
                if (mm == 12) { //si el mes es 12
                    mm = 1;
                    pD = 1;
                    aa++;
                } else {
                    pD = 1;
                    mm++;
                }
            } else if (mm == 2 && pD > 29 && esBiciesto(aa)) {
                pD = 1;
                mm++;
            } else if (pD > 30) {//sino si el dia posterior es mayor que 30
                pD = 1;
                mm++;
            }
        }
        System.out.println("El dia Posterior es " + pD + "/" + mm + "/" + aa);
    }

    private static void diaAnterior(Fecha f) {
        int dA = f.getDia() - 1;//dia Anterior
        int mm = f.getMes();
        int mA = f.getMes() - 1;//mes Anterior
        int aa = f.getAnio();
        //si el mes es enero y el dia anterior es 0
        if (mm == 1 && dA == 0) {
            dA = 31;//dia anterior es 31
            mm = 12;//y el mes es diciembre
            aa--; // le resto uno al año
        }
        //si el mes es marzo el dia Anterior es 0 y el año es biciesto
        if (mm == 3 && dA == 0 && esBiciesto(aa)) {
            dA = 29;//dia anterior es 29
            mm = 2;//y el mes es febrero
        }
        //para el resto de meses si el dia anterior es 0
        if (dA == 0) {
            //si el Mes anterior tiene 31 dias
            if (mA == 1 || mA == 3 || mA == 5 || mA == 7 || mA == 8 || mA == 10 || mA == 12) {
                dA = 31;
                mm--;
            } else {
                dA = 30;
                mm--;
            }
        }

        System.out.println("El dia Anterior es " + dA + "/" + mm + "/" + aa);
    }

    public void verificaMBAP(Fecha f) {

        verificaMes(f);
        if (esBiciesto(f.getAnio())) {
            System.out.println("El año " + f.getAnio() + " SI es bisiesto");
        } else {
            System.out.println("El año " + f.getAnio() + " NO es bisiesto");
        }

        diaAnterior(f);

        diaPosterior(f);
    }
}
