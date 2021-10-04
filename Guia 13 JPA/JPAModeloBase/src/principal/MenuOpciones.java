package principal;

import com.redsocial.dominio.mascota.MascotaService;
import com.redsocial.dominio.usuario.Usuario;
import com.redsocial.dominio.usuario.UsuarioService;
import java.awt.AWTException;
import java.awt.Robot;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class MenuOpciones {
/*Recordar que este menu es a modo de orden para ir probando los metodos, no tiene importancia
    en si, ya que muy pronto los datos seran recibidos desde los formularios de las paginas web*/
    private final Scanner sc;
    private final UsuarioService usuarioService;
    private final MascotaService mascotaService;
   

    public MenuOpciones() {
        this.sc = new Scanner(System.in);
        this.mascotaService = new MascotaService();
        this.usuarioService = new UsuarioService();
    }

    public void menu() throws Exception {
        String respuesta;
        do {
            System.out.println("Seleccione la opción:");
            System.out.println("=====================================");

            System.out.println(" 1- Crear Usuario");//OK
            System.out.println(" 2- Crear Mascota para un usuario");//OK

            System.out.println(" 3- Mostrar Usuarios");//OK
            System.out.println(" 4- Mostrar Mascotas");//OK
            System.out.println(" 5- Mostrar Mascotas de una RAZA");//OK

            System.out.println(" 6- Modificar Clave Usuario");//OK
            System.out.println(" 7- Ver DATOS de un usuario segun correo electronico");//OK
            System.out.println(" 8- Eliminar Usuario");//OK

            System.out.println(" 9 - Modificar Apodo Mascota");
            
            System.out.println(" 0- Salir");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    usuarioService.crearUsuario(cargarCorreo(), cargarClave(), cargarDni(), cargarFecha(), "PAIS", "PROVINCIA");
                    break;
                case 2:
                    usuarioService.cargarMascotaUsuario(cargarApodo(), cargarRaza(),ingresarIdUsuario());                    
                    break;
                case 3:
                    usuarioService.imprimirUsuarios();
                    break;
                case 4:
                    mascotaService.imprimirMascotas();
                    break;
                case 5:
                    mascotaService.mostarXRaza(cargarRaza());
                    break;
                case 6:
                    usuarioService.modificarClaveUsuario(ingresarIdUsuario(), cargarClave(), cargarNuevaClave());
                    break;
                case 7:
                    usuarioService.imprimirUnUsuario(buscarPorCorreo());
                    break;
                case 8:
                    usuarioService.eliminarUsuario(buscarPorCorreo()); // Tener en cuenta que si elimino usuario, elimino sus mascotas asociadas 
                    break;
                case 9:
                    mascotaService.modificarApodoMascota(cargarIdMascot(), cargarApodo());
                    break;               
                case 0:
                    System.exit(0);
                    break;
            }

            System.out.println("Desea realizar una nueva consulta o gestion ???:SI/NO");
            respuesta = sc.next();
            respuesta = respuesta.toUpperCase();
            limpiarPantalla();
        } while ("SI".equals(respuesta));

    }

    public void limpiarPantalla() throws AWTException {
        //Dejo esre metodo para ir borrando la consola.. y que no sea un desorden.
        Robot pressbot = new Robot();
        pressbot.setAutoDelay(30); // Tiempo de espera antes de borrar
        pressbot.keyPress(17); // Orden para apretar CTRL key
        pressbot.keyPress(76);// Orden para apretar L key
        pressbot.keyRelease(17); // Orden para soltar CTRL key
        pressbot.keyRelease(76); // Orden para soltar L key

    }

    public String cargarCorreo() throws Exception {
        String correoI;
        System.out.println("Ingrese el correo");
        correoI = sc.next();
        try {
            if (validarCorreo(correoI)) {
                System.out.println("Correo ingresado NO registrado con antelacion, continue con el registro d datos");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cargarCorreo();
        }
        return correoI;
    }

    public boolean validarCorreo(String correoI) throws Exception {
        boolean validar = false;
        try {
            Collection<Usuario> usuarios = usuarioService.listaUsuarios();
            for (Usuario u : usuarios) {
                if (u.getCorreoElectronico().equalsIgnoreCase(correoI)) {
                    throw new Exception("Correo electronico ya registrado, ingrese un correo valido");
                }
            }
            validar = true;
        } catch (Exception e) {
            throw e;
        }
        return validar;
    }

    public String cargarClave() {
        System.out.println("Ingrese la clave - Recorda que debe tener 6 digitos");
        String claveI = sc.next();
        return claveI;
    }

    public String cargarDni() {
        System.out.println("Ingrese el DNI");
        String dniI = sc.next();
        return dniI;
    }

    public String cargarNuevaClave() {
        System.out.println("Ingrese la NUEVA clave - Recorda que debe tener 6 digitos");
        String claveI = sc.next();
        return claveI;
    }

    public Date cargarFecha() throws ParseException {
        System.out.println("Ingrese mes , dia , anio  de nacimiento MM/DD/ANIO");
        Date fecha = null;

        String inputDate = sc.nextInt() + "/" + sc.nextInt() + "/" + sc.nextInt();
        fecha = new SimpleDateFormat("MM/dd/yyyy").parse(inputDate);
        System.out.println(fecha);
        return fecha;
    }

    public String cargarApodo() {
        System.out.println("Ingrese apodo de la mascota");
        String apodoI = sc.next();
        return apodoI;
    }

    public String cargarRaza() {
        System.out.println("Ingrese raza  de la mascota");
        String razaI = sc.next();
        return razaI;
    }

    public Usuario encontrarUsuario() throws Exception {
        System.out.println("Ingrese el ID del usuario");
        String idUsuario = sc.next();
        Usuario usuario = usuarioService.buscarUsuarioPorId(idUsuario);
        return usuario;
    }

    public String buscarPorCorreo() {
        System.out.println("Ingrese el correo de la persona ");
        String correoI = sc.next();
        return correoI;
    }

    public String ingresarIdUsuario() {
        System.out.println("Ingrese el ID del usuario");
        String idUsuario = sc.next();
        return idUsuario;
    }

    public String cargarIdMascot() {
        System.out.println("Ingrese el Id Mascota");
        String idMascota = sc.next();
        return idMascota;
    }
}
