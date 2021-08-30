/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.

• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.

• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.

 */
package entidades;

import enumeradores.Color;
import enumeradores.Consumo;
import java.util.Scanner;

/**
 *
 * @author Mesa 9
 */
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, double precio, Color color, double peso, Consumo conEnerg) {
        super(precio, color, peso, conEnerg);//llama al constructor de la clase padre
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    /**
     * Método crearTelevisor(): este método llama a crearElectrodomestico() de
     * la clase padre, lo utilizamos para llenar los atributos heredados del
     * padre y después llenamos los atributos del televisor.
     */
    public void crearTelevisor() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char op;
        System.out.println("***TELEVISOR**");
        super.crearElectrodomestico();
        System.out.println("De cuantas pulgadas es?");
        this.resolucion = leer.nextInt();
        System.out.println("Tienen Sintonizador TDT? S/N");
        op = leer.next().toUpperCase().charAt(0);
        
        //switch(op)
        
        do {
            if (op == 'S') {
                this.tdt = true;
            } else if (op == 'N') {
                this.tdt = false;
            } else {
                System.out.println("S ó N no es tan dificil");
                op = leer.next().toUpperCase().charAt(0);
            }

        } while (op != 'S' && op != 'N');

    }

    /**
     * Método precioFinal(): este método será heredado y se le sumará la 
     * siguiente funcionalidad. Si el televisor tiene una resolución mayor 
     * de 40 pulgadas, se incrementará el precio un 30% y si tiene un 
     * sintonizador TDT incorporado, aumentará $500. Recuerda que las 
     * condiciones que hemos visto en la clase Electrodomestico también 
     * deben afectar al precio.
     */
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.resolucion>40){
            System.out.println("Precio aumentado por Resolucion");
            super.setPrecio(super.getPrecio()*1.30);
        }
        
        if(this.tdt){
            System.out.println("Precio aumentado por TDT");
            super.setPrecio(super.getPrecio()+500);
        }
    }
    
}
