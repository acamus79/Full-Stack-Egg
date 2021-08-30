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

import enumeradores.Consumo;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Televisor extends Electrodomestico {

    private int resolucionPulg;
    private boolean sintTDT;

    public Televisor() {
    }

    public Televisor(int resolucionPulg, boolean sintTDT, double precio, String color, Consumo conEnerg, double peso) {
        super(precio, color, conEnerg, peso);
        this.resolucionPulg = resolucionPulg;
        this.sintTDT = sintTDT;
    }

    public int getResolucionPulg() {
        return resolucionPulg;
    }

    public void setResolucionPulg(int resolucionPulg) {
        this.resolucionPulg = resolucionPulg;
    }

    public boolean isSintTDT() {
        return sintTDT;
    }

    public void setSintTDT(boolean sintTDT) {
        this.sintTDT = sintTDT;
    }

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("TELEVISOR: Cuantas Pulgadas?");
        this.resolucionPulg = leer.nextInt();
        System.out.println("Tiene Sintonizador TDT incorporado? S/N");
        char sele = leer.next().toUpperCase().charAt(0);

        switch (sele)
        {
            case 'S':
                this.sintTDT = true;
                break;
            case 'N':
                this.sintTDT = false;
            default:
                System.out.println("Opcion no valida, por defecto se crea sin sintonizador");
                this.sintTDT = false;
        }
        super.creaElectrodomestico();
        precioFinal();
    }

    public void precioFinal() {
        double vPrecio = super.getPrecio()*0.30;

        if (this.resolucionPulg > 40)
        {
            super.setPrecio(super.getPrecio() + vPrecio);
        }

        if (this.sintTDT)
        {
            super.setPrecio(super.getPrecio() + 500);
        }

    }

    @Override
    public String toString() {
        String sintoniza = "NO posee";
        if (this.sintTDT)
        {
            sintoniza = "SI posee";
        }

        return "Televisor de " + resolucionPulg + " pulgadas, TDT: " + sintoniza + "\n"
                + super.toString();
    }

}
