/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Métodos para desarrollar:
 Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no
por teclado)

 Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.

 Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO

 Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.

 A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios


 */
package ej03.control;

import ej03.entidades.Pass;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ControlPass {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Ingresar datos de usuarios (usando el constructor. 
    //HACER INGRESO DE DATOS FIJOS (no por teclado)        
    Pass p1 = new Pass("laclavees1", "root", 27449880);

    public void menuOpciones() {

        char op = 'O';
        do {
            System.out.println("***** O P C I O N E S ******");
            System.out.println("** A. Modificar Contraseña**");
            System.out.println("** B. Modificar nombre    **");
            System.out.println("** C. Modificar DNI       **");
            System.out.println("** X. Para Salir          **");
            System.out.println("***************************");
            System.out.println("Ingrese la opcion...\n");

            op = leer.next().toUpperCase().charAt(0);

            switch (op) {
                case 'A':

                    break;
                case 'B':

                    break;
                case 'C':

                    break;
                case 'X':
                    System.out.println("CHAU!!\n");
                    break;
                default:
                    System.out.println("Ingresó una opcion no validad");
                    op = 'O';
            }

        } while (op != 'X');//hacer..... mientras op sea diferente de X
    }

    public void menu() {
        int dni = 0;
        String pass = " ";
        boolean bandera = false;
        do {
            System.out.println("***** I N G R E S O *****");
            System.out.println("**  DNI y CONTRASEÑA   **");
            System.out.println("*************************");
            System.out.println("Ingrese los dos valores...\n");
            dni = leer.nextInt();
            while (!(dni >= 4000000 && dni < 99999999)) {
                System.out.println("no es un DNI valido");
                dni = leer.nextInt();
            }
            pass = leer.next();
            while (!(pass.length() >= 10 && pass.length() < 20)) {
                System.out.println("No es una contraseña validad");
                pass = leer.next();
            }
            if (verificaUsuario(p1, dni, pass)) {
                bandera = true;
                menuOpciones();
            } else {
                System.out.println("DNI o Contraseña no valida");
                bandera = false;
            }

        } while (bandera != true);//hacer..... mientras bandera sea true
    }

    private static boolean verificaUsuario(Pass p, int dni, String clave) {
        if (dni == p.getDni() && (clave.equals(p.getPass()))) {
            System.out.println("Bienvenido " + p.getNombre());
            return true;
        } else {
            System.out.println("El DNI corresponde");
            return false;
        }
    }

    private static void modificaPass(Pass p) {
        if (verificaPass(p)) {
            System.out.println("Ingrese la nueva contraseña");
            p.setPass(leer.next());
        }else{
            System.out.println("Metiste mal la pass");
        }

    }

    private static boolean verificaPass(Pass p) {
        System.out.println("Ingrese su contraseña actual");
        String clave = leer.next();
        return clave.equals(p.getPass());
    }
}
