/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar una clase llamada Persona que tenga los siguientes atributos: nombre,
edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea
añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:

• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.

 */
package ej07.Entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private float peso;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
