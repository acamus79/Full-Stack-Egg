/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package entidades;

import enumeradores.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Estudiante extends Persona {

    private String curso;

    public Estudiante(String Nombre, String apellido, long dni, EstadoCivil estado) {
        super(Nombre, apellido, dni, estado);
    }

    public Estudiante(String curso, String Nombre, String apellido, long dni, EstadoCivil estado) {
        super(Nombre, apellido, dni, estado);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void cambioEstado() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        switch (super.estado) {
            case CASADO: {
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
                }
                break;
            }
            case DIVORCIADO: {
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
                }
                break;
            }
            case VIUDO: {
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
                }
                break;
            }
            case UNIDO: {
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
                }
                break;
            }
            default: {
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
                }
                break;
            }
        }

    }
}
