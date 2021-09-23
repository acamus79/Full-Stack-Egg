package jdbc.entidad;

public class Usuario {

    private String correo;
    private String nombre;
    private String apellido;

    public Usuario() {
    }

    public Usuario(String correo, String nombre, String apellido) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /*
    @Override
    public String toString() {
        return "Usuario (correo: " + correo + ", nombre: " + nombre + ", apellido: " + apellido + ")";
    }
    */
    
    @Override
    public String toString() {
        return String.format("%-20s%-15s%-15s", correo, nombre, apellido);
    }
}
