/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej01.servicios;

import ej01.entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosFraccion {

    public void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op = 0;
        do {
            System.out.println("***** FRACCIONES *****");
            System.out.println("** 1 SUMA           **");
            System.out.println("** 2 RESTA          **");
            System.out.println("** 3 MULTIPLICACION **");
            System.out.println("** 4 DIVISION       **");
            System.out.println("** 0 PARA SALIR     **");
            System.out.println("**********************");
            System.out.println("Ingrese la opcion...");
            op = leer.nextInt();

            switch (op) {
                case 1: sumaF();
                    break;
                case 2: restaF();
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }

        } while (op == 0);

    }

    private static Fraccion creaFraccion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numerador (numero de arriba)");
        double num = leer.nextDouble();
        System.out.println("Ingrese el denominador (numero de abajo)");
        double deno = leer.nextDouble();
        leer.close();
        return new Fraccion(num, deno);
    }

    private static void sumaF() {
        //Creo dos fracciones con mi metodo creaFracion
        Fraccion f1 = creaFraccion();
        Fraccion f2 = creaFraccion();
        //Numerador y Denominador del Resultado
        double resNum = 0;
        double resDeno = 0;

        //Si el denominador es igual sumo los numeradores
        if (f1.getDenominador() == f2.getDenominador()) {
            resNum = f1.getNumerador() + f2.getNumerador();
            resDeno = f1.getDenominador();
        } else {//en cambio si son diferente sumo los numeradores y multiplico los denominadores
            resNum = f1.getNumerador() + f2.getNumerador();
            resDeno = f1.getDenominador() * f2.getDenominador();
        }
        
        //una nueva fraccion con los resultados
        Fraccion resultado = new Fraccion(resNum, resDeno);
        //muestro la operacion y el resultado usando el toString de Fraccion
        System.out.println(f1.toString() + " + " + f2.toString() + " = " + resultado.toString());
    }

    private static void restaF() {

        

    }

    private static void multiplicaF() {

        
    }

    private static void divideF() {

        
    }
}
