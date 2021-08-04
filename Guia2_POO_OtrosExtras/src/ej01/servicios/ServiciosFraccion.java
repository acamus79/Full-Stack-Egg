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
        int num = leer.nextInt();
        System.out.println("Ingrese el denominador (numero de abajo)");
        int deno = leer.nextInt();
        //leer.close();
        return new Fraccion(num, deno);
    }

    private static void sumaF() {
        //Creo dos fracciones con mi metodo creaFracion
        Fraccion f1 = creaFraccion();
        Fraccion f2 = creaFraccion();
        //Numerador y Denominador del Resultado
        int resNum = 0;
        int resDeno = 0;

        //Si el denominador es igual sumo los numeradores
        if (f1.getDenominador() == f2.getDenominador()) {
            resNum = (int) (f1.getNumerador() + f2.getNumerador());
            resDeno = (int) f1.getDenominador();
        } else {//en cambio si son diferente sumo los numeradores y multiplico los denominadores
            resNum = (int) (f1.getNumerador() + f2.getNumerador());
            resDeno = (int) (f1.getDenominador() * f2.getDenominador());
        }
        
        //una nueva fraccion con los resultados
        Fraccion resultado = new Fraccion(resNum, resDeno);
        //muestro la operacion y el resultado usando mi metodo muestraOP
        muestraOP(f1, f2, resultado, '+');
    }

    private static void restaF() {
        //Creo dos fracciones con mi metodo creaFracion
        Fraccion f1 = creaFraccion();
        Fraccion f2 = creaFraccion();
        //Numerador y Denominador del Resultado
        int resNum = 0;
        int resDeno = 0;
        //Si el Denominador es igual resto los numeradores
        if (f1.getDenominador()== f2.getDenominador()) {
            resNum = f1.getNumerador() - f2.getNumerador();
            resDeno = (int) f1.getDenominador();
        }else{
//en cambio el producto del numerador de f1 por el denominador de f2 le resto el producto del denominador de la primera fraccion por el numerador de la segunda 
            resNum = (int) ((f1.getNumerador()*f2.getDenominador())-(f1.getDenominador()*f2.getNumerador()));
            resDeno = (int) (f1.getDenominador()*f2.getDenominador());
        }
        
        //una nueva fraccion con los resultados
        Fraccion resultado = new Fraccion(resNum, resDeno);
        //muestro la operacion y el resultado usando el toString de Fraccion
        System.out.println(f1.toString() + " - " + f2.toString() + " = " + resultado.toString());
    }

    private static void multiplicaF() {

        
    }

    private static void divideF() {

        
    }
    
    private static void muestraOP(Fraccion f1,Fraccion f2,Fraccion r, char o){
        
        System.out.println(f1.getNumerador() + "    " + f2.getNumerador()+ "    " + r.getNumerador());
        System.out.println("----- "+o+" ----- "+"= ----- ");
        System.out.println(f1.getDenominador()+"    "+f2.getDenominador()+"    "+r.getDenominador());
        
        
    }
}
