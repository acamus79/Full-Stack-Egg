/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package guia07_extra04.servicios;

import guia07_extra04.entidades.CodigoPostal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosCP {

    private Scanner leer;
    HashMap<String, CodigoPostal> mapaPostal;

    public ServiciosCP() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mapaPostal = new HashMap<>();
        mapaPostal.put("MENDOZA", new CodigoPostal("CAPITAL", 5500));
        mapaPostal.put("CIUDAD DE", new CodigoPostal("GODOY CRUZ", 5501));
        mapaPostal.put("CIUDAD DE", new CodigoPostal("LAS HERAS", 5539));
        mapaPostal.put("SAN JOSE", new CodigoPostal("GUAYMALLEN", 5519));
        mapaPostal.put("LA COLONIA", new CodigoPostal("JUNIN", 5566));
        mapaPostal.put("ALPATACAL", new CodigoPostal("LA PAZ", 5591));
        mapaPostal.put("CIUDAD DE", new CodigoPostal("SAN RAFAEL", 5600));
        mapaPostal.put("VILLA SAN ISIDRO", new CodigoPostal("RIVADAVIA", 5577));
        mapaPostal.put("LIBERTADOR GRAL SAN MARTIN", new CodigoPostal("SAN MARTIN", 5570));
        mapaPostal.put("12 DE OCTUBRE", new CodigoPostal("SANTA ROSA", 5597));
    }

    private void cargaCP() {
        char op;
        do {
            System.out.println("Ingrese el nombre de la Ciudad");
            String ciudad = leer.next().toUpperCase();
            System.out.println("Ingrese el Departamento");
            String depto = leer.next();
            System.out.println("Ingrese el codigo postal");
            Integer cp = leer.nextInt();
            //De este modo agrego elementos a un mapa. El primer termino se corresponde a la KEY
            mapaPostal.put(ciudad, new CodigoPostal(depto, cp));
            System.out.println("Desea agregar otro producto? S/N");
            op = leer.next().toUpperCase().charAt(0);
        } while (op == 'S');

    }

    private void mostrar() {
        // entry.getKey trae la llave y entry.getValue trae los valores del mapa, Es decir todos sus atributos
        for (Map.Entry<String, CodigoPostal> entry : mapaPostal.entrySet()) {
            System.out.println("Ciudad  " + entry.getKey() + "  -  " + entry.getValue());
        }
    }

    private void modifica() {
        System.out.println("Ingresa la ciudad a modificar");
        String buscado = leer.next().toUpperCase();
        if (mapaPostal.containsKey(buscado)) {

            CodigoPostal aux = mapaPostal.get(buscado);

            System.out.println("Ingrese el nuevo Codigo Postal");
            aux.setCp(leer.nextInt());

            mapaPostal.put(buscado, aux);
        } else {
            System.out.println("No se encontro la ciudad");
        }
    }

    private void borrar() {
        System.out.println("Ingresa la ciudad a Borrar");
        String buscado = leer.next().toUpperCase();
        if (mapaPostal.containsKey(buscado)) {
            mapaPostal.remove(buscado);
        } else {
            System.out.println("No se encontro la ciudad");
        }
    }

    public void menu(){
        int op = 0;
        do {
            System.out.println("\n************************");
            System.out.println("**  CODIGOS POSTALES  **");
            System.out.println("** 1. MOSTRAR CODIGOS **");
            System.out.println("** 2. MODIFICAR       **");
            System.out.println("** 3. BORRAR CIUDAD   **");
            System.out.println("** 4. AGREGAR CIUDAD  **");//este va de yapa
            System.out.println("** 5. SALIR           **");
            System.out.println("************************");
            System.out.println("Ingrese la opcion...\n");
            op = leer.nextInt();

            switch (op) {
                case 1 -> mostrar();
                case 2 -> modifica();
                case 3 -> borrar();
                case 4 -> cargaCP();
                case 5 -> System.out.println("\nCHAU!!  \n");
                default -> {
                    System.out.println("Ingresó una opcion no valida");
                    op = 0;
                }
            }

        } while (op != 7);
    }
       
    
}
