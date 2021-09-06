/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
Habitaciones.

 */
package entidades;

import enumeradores.Gimnasio;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Hotel4Estrellas extends Hotel{
    
    private String nombRestaurant;
    private Integer capRestaurante;
    private Gimnasio gym;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String nombRestaurant, Integer capRestaurante, Gimnasio gym, Integer cantHabitaciones, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.nombRestaurant = nombRestaurant;
        this.capRestaurante = capRestaurante;
        this.gym = gym;
    }

    public String getNombRestaurant() {
        return nombRestaurant;
    }

    public void setNombRestaurant(String nombRestaurant) {
        this.nombRestaurant = nombRestaurant;
    }

    public Integer getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(Integer capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    public Gimnasio getGym() {
        return gym;
    }

    public void setGym(Gimnasio gym) {
        this.gym = gym;
    }
    
    public void creaHotel4E(){
        super.creaHotel();
        System.out.println("Restorant y Gimnasio: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es el nombre del Restorant?");
        this.nombRestaurant = leer.next().toUpperCase();
        System.out.println("Cantidad de comensales");
        this.capRestaurante = leer.nextInt();
        System.out.println("De que Categoria es el Gimnasio? A ó B");
        char gy = leer.next().toUpperCase().charAt(0);
        this.gym = compruebaGym(gy);
        
    }
    
    private Gimnasio compruebaGym(char letra){
        Gimnasio g;
        switch(letra){
            case 'A':
                g= Gimnasio.A;
                break;
            case 'B':
                g= Gimnasio.B;
                break;
            default:
                System.out.println("Ingreso una opcion no validad se asignara tipo B");
                g= Gimnasio.B;
        }
        return g;
    }
    
    @Override
    public void precioHabitacion(){
       super.precioHabitacion();
       double vAgregado=0;
       
       if(this.capRestaurante>50){
           vAgregado+=50;
       }else if(this.capRestaurante>30){
           vAgregado+=30;
       }else {
           vAgregado+=10;
       }
           if(this.gym==Gimnasio.A){
               vAgregado+=50;
           }else{
               vAgregado+=30;
           }
       
       super.precioHabitacion += vAgregado;
        
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Restaurant: " + nombRestaurant + " Capacidad " + capRestaurante + " Comensales, Gimnasio de tipo " + gym;
    }
    
    
}
