/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
como la cantidad de metros cuadrados que ocupa. Existen dos tipos de
alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo. Realizar un programa en el que se representen
todas las relaciones descriptas. 
Realizar un sistema de consulta que le permite al usuario consultar por diferentes
criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.

 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public abstract class ExtraHotelero extends Alojamiento {

    protected boolean privado;
    protected Integer mts2;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, Integer mts2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mts2 = mts2;
    }

    public void creaExtraHotel() {
        super.creaAlojamiento();
        System.out.println("ESTABLECIMIENTO EXTRAHOTELERO");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Es un establecimiento Privado? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.privado = true;
        } else if (op == 'N') {
            this.privado = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que es privado");
            this.privado = true;
        }

        System.out.println("Cuantas Metros cuadrados tiene?");
        this.mts2 = leer.nextInt();

    }

    @Override
    public String toString() {
        String priv = "Publico";
        if(privado){
            priv = "Privado";
        }
        System.out.println(super.toString());
        return "Establecimiento Extra Hotel de tipo " + priv + " con " + mts2 + " metros 2";
    }

    
    
    
}
