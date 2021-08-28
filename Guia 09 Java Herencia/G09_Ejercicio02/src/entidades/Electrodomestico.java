/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.

*Los constructores que se deben implementar son los siguientes:

• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.

*Los métodos a implementar son:

• Métodos getters y setters de todos los atributos.



 */
package entidades;

import java.util.Scanner;
import utilidades.*;

/**
 *
 * @author Adrian E. Camus
 */
public class Electrodomestico {

    private double precio;
    private Color color;
    private Consumo conEnerg;
    private double peso;

    //Constructores
    public Electrodomestico() {
        creaElectrodomestico();
    }

    public Electrodomestico(double precio, String color, char conEnerg, double peso) {
        this.precio = precio + precioFinal(conEnerg, peso);
        this.color = compruebaColor(color);
        this.conEnerg = compruebaConsumo(conEnerg);
        this.peso = peso;
    }

    //Metodos
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Consumo getConEnerg() {
        return conEnerg;
    }

    public void setConEnerg(Consumo conEnerg) {
        this.conEnerg = conEnerg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private double precioFinal(char consumo, double peso) {
        double precioC, precioP = 0;

        switch (consumo) {
            case 'A':
                precioC = 2000;
                break;
            case 'B':
                precioC = 1800;
                break;
            case 'C':
                precioC = 1600;
                break;
            case 'D':
                precioC = 1500;
                break;
            case 'E':
                precioC = 1300;
                break;
            case 'F':
                precioC = 1100;
                break;
            default:
                precioC = 1000;
        }

        if (peso > 0 && peso < 20) {
            precioP = 100;
        } else if (peso > 19 && peso < 50) {
            precioP = 500;
        } else if (peso > 49 && peso < 80) {
            precioP = 800;
        } else if (peso >= 80) {
            precioP = 1000;
        }

        return precioC + precioP;
    }

    private Consumo compruebaConsumo(char consumo) {
        Consumo rConsumo;
        switch (consumo) {
            case 'A':
                rConsumo = Consumo.A;
                break;
            case 'B':
                rConsumo = Consumo.B;
                break;
            case 'C':
                rConsumo = Consumo.C;
                break;
            case 'D':
                rConsumo = Consumo.D;
                break;
            case 'E':
                rConsumo = Consumo.E;
                break;
            case 'F':
                rConsumo = Consumo.F;
                break;
            default:
                rConsumo = Consumo.F;
        }
        return rConsumo;
    }

    private Color compruebaColor(String color) {
        Color rColor;
        switch (color) {
            case "BLANCO":
                rColor = Color.BLANCO;
                break;
            case "NEGRO":
                rColor = Color.NEGRO;
                break;
            case "GRIS":
                rColor = Color.GRIS;
                break;
            case "AZUL":
                rColor = Color.AZUL;
                break;
            case "ROJO":
                rColor = Color.ROJO;
                break;
            default:
                rColor = Color.BLANCO;
        }
        return rColor;
    }

    public void creaElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Color");
        String vColor = leer.next().toUpperCase();
        System.out.println("Ingrese el Consumo (A,B,C,D o F)");
        char consumo = leer.next().toUpperCase().charAt(0);
        System.out.println("Cuanto Pesa?");
        double vPeso = leer.nextDouble();
        //double precio, Color color, Consumo conEnerg, double peso
        this.precio = precioFinal(consumo, vPeso);
        this.color = compruebaColor(vColor);
        this.conEnerg = compruebaConsumo(consumo);
        this.peso = vPeso;
    }
}
