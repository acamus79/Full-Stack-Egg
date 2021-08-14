/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_extra_ej_02.servicios;

import guia07_extra_ej_02.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Servicios {

    Scanner leer;
    ArrayList<CantanteFamoso> lista;

    public Servicios() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.lista = new ArrayList<>();
        //agrego 5 cantantes a la lista
        this.lista.add(new CantanteFamoso("ELTON JHON", "Goodbye Yellow Brick Road"));
        this.lista.add(new CantanteFamoso("GILDA", "Corazón valiente"));
        this.lista.add(new CantanteFamoso("JAF", "JAF Vivo!"));
        this.lista.add(new CantanteFamoso("MICHAEL JACKSON", "Thriller"));
        this.lista.add(new CantanteFamoso("Guns N’ Roses", "Appetite for Destruction"));
    }

    private CantanteFamoso creaCantF() {
        System.out.println("Ingrese el nombre del Cantante");
        String nomb = leer.next().toUpperCase();
        System.out.println("Cual fue el disco mas vendido de " + nomb);
        String dMVend = leer.next().toUpperCase();
        return new CantanteFamoso(nomb, dMVend);
    }

    private void creaLista() {
        char op;
        do {
            lista.add(creaCantF());
            System.out.println("Desea agregar otro cantante? S/N");
            op = leer.next().toUpperCase().charAt(0);
        } while (op != 'N');
    }

    private void muestra() {
        lista.forEach(aux -> {
            System.out.println(aux);
        });
    }

    private void borra() {
        boolean bandera = false;
        System.out.println("Ingrese el cantante a borrar");
        String buscado = leer.next().toUpperCase();
// con FOR EACH no funciona para borrar       
//        for (CantanteFamoso aux : lista) {
//            if (aux.getNombre().equalsIgnoreCase(buscado)) {
//                lista.remove(aux);
//            }
//        }

// con FOR comun        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(buscado)) {
                bandera = true;
                lista.remove(i);
            } else {
                bandera = false;
            }
        }
        if (bandera) {
            System.out.println("No se encontro el cantante " + buscado);
        } else {
            System.out.println("Se borro de la lista a " + buscado);
        }
    }

    public void menu() {
        int op = 0;

        do {
            System.out.println("***** CANTANTES FAMOSOS ******");
            System.out.println("** 1. MOSTRAR LISTA         **");
            System.out.println("** 2. AGREGAR CANTANTE      **");
            System.out.println("** 3. BORRAR CANTANTE       **");
            System.out.println("** 4. PARA SALIR            **");
            System.out.println("******************************");
            System.out.println("Ingrese la opcion...\n");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    muestra();
                    break;
                case 2:
                    creaLista();
                    break;
                case 3:
                    borra();
                    break;
                case 4:
                    System.out.println("\nUltima Lista de Cantantes\n");
                    muestra();
                    System.out.println("\nCHAU!!  \n");
                    break;
                default:
                    System.out.println("Ingresó una opcion no validad");
                    op = 0;
            }

        } while (op != 4);

    }
}
