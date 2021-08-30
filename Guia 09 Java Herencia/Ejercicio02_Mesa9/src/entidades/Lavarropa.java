/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.

• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set del atributo carga.

• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.

• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.

 */
package entidades;

import enumeradores.Color;
import enumeradores.Consumo;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Lavarropa extends Electrodomestico{
    
    private int carga;

    public Lavarropa() {
    }

    public Lavarropa(int carga, double precio, Color color, double peso, Consumo conEnerg) {
        super(precio, color, peso, conEnerg);//aca llama al constructor de la clase padre
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    /**
     * Método crearLavadora (): este método llama a crearElectrodomestico() 
     * de la clase padre, lo utilizamos para llenar los atributos heredados 
     * del padre y después llenamos el atributo propio de la lavadora.
     */
    public void crearLavarropa(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("**LAVAROPA**");
        super.crearElectrodomestico();
        System.out.println("Cuantos kilos de ropa carga?");
        this.carga = leer.nextInt();
    }
    
    /**
     * Método precioFinal(): este método será heredado y se le sumará la
     * siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará 
     * el precio en $500, si la carga es menor o igual, no se incrementará el
     * precio. Este método debe llamar al método padre y añadir el código 
     * necesario. Recuerda que las condiciones que hemos visto en la clase 
     * Electrodoméstico también deben afectar al precio.
     */
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.carga>30){
            System.out.println("Precio aumentado por carga");
            super.setPrecio(super.getPrecio()+500);
        }
    }

    @Override
    public String toString() {
        return "Lavarropa capacidad de carga: " + carga + "\n"+
                super.toString();
    }
    
    
    
    
}
