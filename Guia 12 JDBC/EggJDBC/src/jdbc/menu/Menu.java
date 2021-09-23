package jdbc.menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import jdbc.excepcion.MiExcepcion;
import jdbc.servicio.UsuarioServicio;

public class Menu {

    private Scanner entrada;
    private UsuarioServicio usuarioServicio;
    private int respuesta;

    public Menu() {
        // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        usuarioServicio = new UsuarioServicio();
        respuesta = 0;
    }

    public void menuPrincipal() {
        do {
            try {
                System.out.println("ELIJA UNA OPCIÓN");
                System.out.println("1. CREAR USUARIO");
                System.out.println("2. MODIFICAR USUARIO");
                System.out.println("3. ELIMINAR USUARIO");
                System.out.println("4. MOSTRAR USUARIOS");
                System.out.println("5. SALIR");

                respuesta = entrada.nextInt();

                switch (respuesta) {
                    case 1:
                        crearUsuario();
                        break;
                    case 2:
                        modificarUsuario();
                        break;
                    case 3:
                        eliminarUsuario();
                        break;
                    case 4:
                        usuarioServicio.imprimirUsuarios();
                        break;
                    case 5:
                        System.out.println("*** SESIÓN FINALIZADA ***");
                        break;
                    default:
                        System.out.println("LA OPCIÓN INGRESADA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            } catch (MiExcepcion e) {
                System.out.println(e.getMessage());
            }
        } while (respuesta != 5);
    }

    // MÉTODO LECTURA DE DATOS
    public void crearUsuario() {
        try {
            System.out.println("INGRESE CORREO: ");
            String correo = entrada.next();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = entrada.next();

            System.out.println("INGRESE APELLIDO: ");
            String apellido = entrada.next();

            usuarioServicio.crearUsuario(correo, nombre, apellido);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    // MÉTODO LECTURA DE DATOS
    public void modificarUsuario() {
        try {
            System.out.println("INGRESE CORREO: ");
            String correo = entrada.next();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = entrada.next();

            System.out.println("INGRESE APELLIDO: ");
            String apellido = entrada.next();

            usuarioServicio.modificarUsuario(correo, nombre, apellido);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    // MÉTODO LECTURA DE DATOS
    public void eliminarUsuario() {
        try {
            System.out.println("INGRESE CORREO: ");
            String correo = entrada.next();

            usuarioServicio.eliminarUsuario(correo);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
