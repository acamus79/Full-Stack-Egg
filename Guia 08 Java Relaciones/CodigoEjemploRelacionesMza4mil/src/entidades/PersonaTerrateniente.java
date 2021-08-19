package entidades;

import java.util.ArrayList;
/*Esta Clase es un MOLDE de una persona que va a tener la posibilidad de tener muchos DEPTOS*/
public class PersonaTerrateniente {
    //Declaracion de atributos
    private String nombre;
    private String apellido;

    //Atributos que originan relaciones //
    private ArrayList<Departamento> listaPropiedades=new ArrayList();// Varios OBJETOS relacionados

    //Constructores
    public PersonaTerrateniente() {
    }

    //El constructor que recibe parametros, no recibe DEPARTAMENTOS (No obligo a que la persona tenga UNOal nacer deptos)
    public PersonaTerrateniente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;        
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

  
    public ArrayList<Departamento> getListaPropiedades() {
        return listaPropiedades;
    }

    public void setListaPropiedades(ArrayList<Departamento> listaPropiedades) {
        this.listaPropiedades = listaPropiedades;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido  + ", listaPropiedades=" + listaPropiedades + '}';
    }

    
    
}
