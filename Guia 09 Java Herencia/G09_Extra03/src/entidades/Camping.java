/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones.

 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Camping extends ExtraHotelero {
    private Integer capMaxCarpas, cantDeBanios;
    private boolean restorant;

    public Camping() {
    }

    public Camping(Integer capMaxCarpas, Integer cantDeBanios, boolean restorant, boolean privado, Integer mts2, String nombre, String direccion, String localidad, Persona gerente) {
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
    
    
    
    
}
