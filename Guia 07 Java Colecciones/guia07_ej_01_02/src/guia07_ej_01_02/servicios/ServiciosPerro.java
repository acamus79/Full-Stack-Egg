/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_ej_01_02.servicios;

import guia07_ej_01_02.entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosPerro {
    private Scanner leer;
    //aca creo mi Coleccion de Objetos Perros
    private ArrayList<Perro> perrosList;

    public ServiciosPerro() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        //aca la instancio
        this.perrosList = new ArrayList();
    }
    
    /**
     * Crea y añade a mi arraylist un objetop Perro
     * @return un objeto de la clase perro 
     */
    public Perro creaPerro(){
        System.out.println("Ingrese la Raza del Perro");
        String laraza = leer.next().toUpperCase();
        Perro p = new Perro(laraza);
        perrosList.add(p);
        return p;
    }
    
    public void mostrarPerros(){
        System.out.println("Las razas cargadas son");
        for (Perro aux : perrosList) {
            System.out.println(aux.toString());
        }
    System.out.println("Cantidad de razas de perro: "+perrosList.size());
        }
        
    /**
     * para vos dolape
     */
    public void criaderoDeChiquitos(){
        char op;
        do{
            creaPerro();
            System.out.println("Desea agregar otro Perro"+
                    "'S' para Continuar o 'N' para Salir");
            op = leer.next().toUpperCase().charAt(0);
        }while (op!='N');
       
        mostrarPerros();
    }
    
    
        
    }
    
    

