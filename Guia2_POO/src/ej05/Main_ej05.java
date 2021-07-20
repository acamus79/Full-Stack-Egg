/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

 */
package ej05;

import ej05.entidades.Cuenta;
import ej05.servicios.ServiciosCuenta;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Main_ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServiciosCuenta sc = new ServiciosCuenta();
        System.out.println("Crear Cuenta 1");
        Cuenta c1 = sc.crearCuenta();

        System.out.println("Crear Cuenta 2");
        Cuenta c2 = sc.crearCuenta();

        System.out.println("Ingrese el monto a transferir de la Cuenta 1 a la Cuenta 2");
        double deposito = leer.nextDouble();
        sc.retiro(c1, deposito);
        sc.ingreso(c2, deposito);

        System.out.println("Consulta Saldo Cuenta 1 $ " + c1.getSaldoActual());
        System.out.println("Consulta Saldo Cuenta 2 $ " + c2.getSaldoActual());

        System.out.println("Extraccion Rapida Cuenta 2");
        sc.extraccionRapida(c2);
        System.out.println("Consulta Saldo Cuenta 2 $ " + c2.getSaldoActual());
        leer.close();
    }

}
