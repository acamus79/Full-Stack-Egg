/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Ejercicio 4
Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
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

package ej04;

import ej04.entidades.Fecha;
import ej04.servicios.ServiciosFecha;

/**
 *
 * @author Adrian E. Camus
 */
public class Principal04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        
        ServiciosFecha sf = new ServiciosFecha();
        Fecha f1 = sf.crearFecha();
        //Uso de toString
        System.out.println(f1);
        //Verifico Mes, año Biciesto, dia Anterior y dia Posterior
        sf.verificaMBAP(f1);
        
    }

}
