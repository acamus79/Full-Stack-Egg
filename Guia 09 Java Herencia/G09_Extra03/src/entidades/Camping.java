/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones.

 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Camping extends ExtraHotelero {
    private Integer capMaxCarpas, cantDeBanios;
    private boolean restorant;

    public Camping() {
    }

    public Camping(Integer capMaxCarpas, Integer cantDeBanios, boolean restorant, boolean privado, Integer mts2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mts2, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantDeBanios = cantDeBanios;
        this.restorant = restorant;
    }

    public Integer getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(Integer capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public Integer getCantDeBanios() {
        return cantDeBanios;
    }

    public void setCantDeBanios(Integer cantDeBanios) {
        this.cantDeBanios = cantDeBanios;
    }

    public boolean isRestorant() {
        return restorant;
    }

    public void setRestorant(boolean restorant) {
        this.restorant = restorant;
    }
    
    public void creaCamping(){
        super.creaExtraHotel();
        System.out.println("Camping: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Capacidad Maxima de Carpas?");
        this.capMaxCarpas = leer.nextInt();
        System.out.println("Cantidad de Baños?");
        this.cantDeBanios = leer.nextInt();
        System.out.println("Tiene Restorant? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.restorant = true;
        } else if (op == 'N') {
            this.restorant = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que No tiene");
            this.restorant = false;
        }
    }

    @Override
    public String toString() {
        String rest = "No posee";
        if(restorant){
            rest = "Si Posee";
        }
        System.out.println(super.toString());
        return "Camping " + capMaxCarpas + " carpas, " + cantDeBanios + " baños " + rest + " Restorant";
    }
    

    
}
