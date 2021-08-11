/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_ej_01_02.servicios;

import guia07_ej_01_02.entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
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
     * Crea y añade a mi arraylist un objeto Perro
     *
     * @return un objeto de la clase perro
     */
    private Perro creaPerro() {
        System.out.println("Ingrese la Raza del Perro");
        String laRaza = leer.next().toUpperCase();
        Perro p = new Perro(laRaza);
        perrosList.add(p);
        return p;
    }

    private void mostrarPerros() {
        System.out.println("Las razas cargadas son");
        for (Perro aux : perrosList) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad de razas de perro: " + perrosList.size());
    }

    /**
     * para vos dolape
     */
    public void criaderoDeChiquitos() {
        char op;
        do {
            creaPerro();
            System.out.println("Desea agregar otro Perro"
                    + " 'S' para Continuar o 'N' para Salir");
            op = leer.next().toUpperCase().charAt(0);
        } while (op != 'N');

        mostrarPerros();
    }

    public void perrera() {
//le pido al usuario la raza a buscar        
        System.out.println("Ingresa la Raza a buscar");
        String buscaRaza = leer.next().toUpperCase();
//creo una bandera logica para saber si encontre o no la raza
        boolean bandera = true;
//Iterator fr tipo Perro llamado it con lo que tiene el arraylist perrosList
        Iterator<Perro> it = perrosList.iterator();

//Mientras haya otro objeto en la lista hacer        
        while (it.hasNext()) {
            Perro aux = it.next();
            if (aux.getRaza().equals(buscaRaza)) {
                it.remove();
                bandera = true;
                break;
            }else{
                bandera = false;
            }
        }
        
        if(bandera){
            System.out.println("Encontre la raza " + buscaRaza);
        }else{
            System.out.println("No está la raza buscada");
        }
               
        //podria llamar al metodo mostrarPerros pero quiero ver como es con
        //forech de una linea
        perrosList.forEach((e) -> System.out.println(e));
    }

}
