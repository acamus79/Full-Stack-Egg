/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.

Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.

Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.

• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.

• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.

• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
LETRA PRECIO 
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO 
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000


 */
package entidades;

import enumeradores.*;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Electrodomestico {

    protected double precio;
    protected Color color;
    protected double peso;
    protected Consumo conEnerg;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, Color color, double peso, Consumo conEnerg) {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.conEnerg = conEnerg;
    }

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Consumo getConEnerg() {
        return conEnerg;
    }

    public void setConEnerg(Consumo conEnerg) {
        this.conEnerg = conEnerg;
    }

    /**
     * Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
     * correcta, sino es correcta usara la letra F por defecto. Este método se
     * debe invocar al crear el objeto y no será visible.
     */
    private void comprobarConsumoEnergetico(char letra) {

        switch (letra) {
            case 'A':
                this.conEnerg = Consumo.A;
                break;
            case 'B':
                this.conEnerg = Consumo.B;
                break;
            case 'C':
                this.conEnerg = Consumo.C;
                break;
            case 'D':
                this.conEnerg = Consumo.D;
                break;
            case 'E':
                this.conEnerg = Consumo.E;
                break;
            case 'F':
                this.conEnerg = Consumo.F;
                break;
            default:
                System.out.println("Ingreso una opcion no valida se asignara el consumo por defecto");
                this.conEnerg = Consumo.F;
        }

    }

    /**
     * Método comprobarColor(String color): comprueba que el color es correcto,
     * y si no lo es, usa el color blanco por defecto. Los colores disponibles
     * para los electrodomésticos son blanco, negro, rojo, azul y gris. No
     * importa si el nombre está en mayúsculas o en minúsculas. Este método se
     * invocará al crear el objeto y no será visible.
     */
    private void comprobarColor(String color) {
        switch (color) {
            case "BLANCO":
                this.color = Color.BLANCO;
                break;
            case "NEGRO":
                this.color = Color.NEGRO;
                break;
            case "ROJO":
                this.color = Color.ROJO;
                break;
            case "GRIS":
                this.color = Color.GRIS;
                break;
            case "AZUL":
                this.color = Color.AZUL;
                break;
            default:
                System.out.println("Ingreso una opcion no valida se asignara el color por defecto");
                this.color = Color.BLANCO;
        }

    }

    /**
     * Metodo crearElectrodomestico(): le pide la información al usuario y llena
     * el electrodoméstico, también llama los métodos para comprobar el color y
     * el consumo. Al precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        this.precio = 1000;
        System.out.println("Ingrese el color del electrodomestico");
        comprobarColor(leer.next().toUpperCase());
        System.out.println("Cual es el consumo energetico? (A,B,C,D o F)");
        comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));
        System.out.println("Cuanto pesa?");
        this.peso = leer.nextDouble();
    }

    /**
     * Método precioFinal(): según el consumo energético y su tamaño, aumentará
     * el valor del precio.
     */
    public void precioFinal() {
        if (this.peso > 80) {
            this.precio += 1000;
        } else if (this.peso >= 50) {
            this.precio += 800;
        } else if (this.peso >= 20) {
            this.precio += 500;
        } else {
            this.precio += 100;
        }

        switch (this.conEnerg) {
            case A:
                this.precio += 1000;
                break;
            case B:
                this.precio += 800;
                break;
            case C:
                this.precio += 600;
                break;
            case D:
                this.precio += 500;
                break;
            case E:
                this.precio += 300;
                break;
            case F:
                this.precio += 100;
                break;
        }
    }

    @Override
    public String toString() {
        return "Color: " + color + " Peso: " + peso + "kg." +"\nConsumo de Energia: " + conEnerg + "\nPrecio $ " + precio+"00";
    }

}
