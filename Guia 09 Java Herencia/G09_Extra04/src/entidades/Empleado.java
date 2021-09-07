/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.

 */
package entidades;

import enumeradores.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Empleado extends Persona {

    private Integer anioIncorpora;
    private Integer despacho;

    public Empleado() {
    }

    public Empleado(Integer anioIncorpora, Integer despacho, String nombre, String apellido, long dni,EstadoCivil estado) {
        this.anioIncorpora = anioIncorpora;
        this.despacho = despacho;
        
    }
    
    

    @Override
    public void cambioEstado() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        switch (super.estado) {
            case CASADO:
                {
                    System.out.println("Seleccione 1 para Divorciado/a o 2 para Viudo/a");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            estado = EstadoCivil.DIVORCIADO;
                            break;
                        case 2:
                            estado = EstadoCivil.VIUDO;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    }       break;
                }
            case DIVORCIADO:
                {
                    System.out.println("Seleccione 1 para Unido/a o 2 para Casado/a");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            estado = EstadoCivil.UNIDO;
                            break;
                        case 2:
                            estado = EstadoCivil.CASADO;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    }       break;
                }
            case VIUDO:
                {
                    System.out.println("Seleccione 1 para Casado/a o 2 para Unido/a");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            estado = EstadoCivil.CASADO;
                            break;
                        case 2:
                            estado = EstadoCivil.UNIDO;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    }       break;
                }
            case UNIDO:
                {
                    System.out.println("Seleccione 1 para Soltero/a o 2 para Casado/a");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            estado = EstadoCivil.SOLTERO;
                            break;
                        case 2:
                            estado = EstadoCivil.CASADO;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    }       break;
                }
            default:
                {
                    System.out.println("Seleccione 1 para Unido/a o 2 para Casado/a");
                    byte op = leer.nextByte();
                    switch (op) {
                        case 1:
                            estado = EstadoCivil.UNIDO;
                            break;
                        case 2:
                            estado = EstadoCivil.CASADO;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    }       break;
                }
        }

    }
}
