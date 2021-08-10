/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Los profesores del curso de programación de Eggnecesitan llevar un registro
    de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad 
    de aprobados y desaprobados. Durante el periodo de cursado cada alumno 
    obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
    Las ponderaciones de cada nota son:

    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%

    Una vez cargadas las notas, se calcula el promedio y se guarda en el 
    arreglo. Al final del programa los profesores necesitan obtener por 
    pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta 
    que solo aprueban los alumnos conpromedio mayor o 
    igual al 7 de sus notas del curso.

 */
package guiajavaintroduccion;

import java.util.Arrays;

/**
 *
 * @author Adrian E. Camus
 */
public class ej_extra_20 {

    public static int rellenarNotas() {
        return (int) (Math.random() * 10);
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double practico1, practico2, integrador1, integrador2, promedio;
        double[] nota = new double[10];
        int aprobados, desaprobados;
        aprobados = 0;
        desaprobados = 0;
        for (int i = 0; i < 10; i++) {
            practico1 = rellenarNotas();
            practico2 = rellenarNotas();
            integrador1 = rellenarNotas();
            integrador2 = rellenarNotas();
            promedio = practico1 * .1 + practico2 * .15 + integrador1 * .25 + integrador2 * .5;
            nota[i] = promedio;
            if (promedio >= 7) {
                aprobados += 1;
            } else {
                desaprobados += 1;
            }
        }
        System.out.println("La cantidad de aprobados es de " + aprobados);
        System.out.println("La cantidad de desaprobados es de " + desaprobados);
        System.out.println("Las notas son: " + Arrays.toString(nota));
   
    }
}