package entidades;

public class ClasePersona {

    // Declaro los atributos, que "cosas va a contener mi objeto del tipo CLASEPERSONA"
    private String varNombre;
    private String varApellido;
    private int varEdad; // Declaro los atributos
    private float varAltura;
    
    // Creo contructor vacio
    public ClasePersona() {
    }

    // Creo contructor con todos los atributos
    public ClasePersona(String varNombre, String varApellido, int varEdad, float varAltura) {
        this.varNombre = varNombre;
        this.varApellido = varApellido;
        this.varEdad = varEdad;
        this.varAltura = varAltura;
    }
    // Creo contructores con atributos especificos si quiero
    public ClasePersona(String varNombre, String varApellido) {
        this.varNombre = varNombre;
        this.varApellido = varApellido;
    }

    
    public ClasePersona(String varNombre, int varEdad) {
        this.varNombre = varNombre;
        this.varEdad = varEdad;
    }

    //Creo los GETTER (Permiten llevar la info a otra clase)
    public String getVarNombre() { // GET 
        return varNombre;
    }

    public String getVarApellido() {
        return varApellido;
    }

    public int getVarEdad() {
        return varEdad;
    }

    public float getVarAltura() {
        return varAltura;
    }
    //Creo los SETTER (Permiten modficar la info en otra clase)
    public void setVarNombre(String varNombre) {//SETT
        this.varNombre = varNombre;
    }

    public void setVarApellido(String varApellido) {
        this.varApellido = varApellido;
    }

    public void setVarEdad(int varEdad) {
        this.varEdad = varEdad;
    }

    public void setVarAltura(float varAltura) {
        this.varAltura = varAltura;
    }
    //Creo los metodos que necesite (Aca hice una FUNCION para calcular dias, recibiendo como parametro la edad)
    public int diasVividos(int varEdad) {
        return varEdad * 365;
    }

    //Metodo para MOSTRAR los datos completos del objeto
    @Override
    public String toString() {
        return "ClasePersona{" + "Nombre=" + varNombre + ", Apellido=" + varApellido + ", Edad=" + varEdad + ", Altura=" + varAltura + '}';
    }

}
