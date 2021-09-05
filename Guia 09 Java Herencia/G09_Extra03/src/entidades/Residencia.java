/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo.

 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Residencia extends ExtraHotelero {

    private int cantHab;
    private boolean descGremio;
    private boolean campDepor;

    public Residencia() {
    }

    public Residencia(int cantHab, boolean descGremio, boolean campDepor, boolean privado, Integer mts2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mts2, nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.descGremio = descGremio;
        this.campDepor = campDepor;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isCampDepor() {
        return campDepor;
    }

    public void setCampDepor(boolean campDepor) {
        this.campDepor = campDepor;
    }

    public void creaResidencia() {
        super.creaExtraHotel();
        System.out.println("Residencia: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantas habitaciones tiene?");
        this.cantHab = leer.nextInt();
        System.out.println("Tiene Campo Deportivo? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.campDepor = true;
        } else if (op == 'N') {
            this.campDepor = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que No tiene");
            this.campDepor = false;
        }
        System.out.println("Tiene descuento para Gremios? S/N");
        op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.descGremio = true;
        } else if (op == 'N') {
            this.descGremio = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que no tiene descuento");
            this.descGremio = false;
        }
    }

    @Override
    public String toString() {
        return "Residencias{" + "cantHab=" + cantHab + ", descGremio=" + descGremio + ", campDepor=" + campDepor + '}';
    }

}
