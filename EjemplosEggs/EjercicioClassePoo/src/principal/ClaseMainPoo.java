package principal;

import entidades.ClasePersona;
import java.util.Scanner;

public class ClaseMainPoo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ClasePersona nuevaPersona1 = new ClasePersona(); // Creo una instancia de mi ClasePersona, CREO espacio en memoria al  OBJETO
        
        //Enviando los datos utilizando metodos SET, el objeto ya nacio con valores por defecto por haber utilizado
        //cnnnstructor vacio en linea 10 
        System.out.println("Ingrese su nombre");
        String auxiliarNombre = leer.next();
        nuevaPersona1.setVarNombre(auxiliarNombre);
        System.out.println("Ingrese su apellido");
        String auxiliarApellido = leer.next();
        nuevaPersona1.setVarApellido(auxiliarApellido);
        System.out.println("Ingrese su edad");
        int auxiliarEdad = leer.nextInt();
        nuevaPersona1.setVarEdad(auxiliarEdad);
        System.out.println("Ingrese su altura");
        float auxiliarAltura = leer.nextFloat();
        nuevaPersona1.setVarAltura(auxiliarAltura);

        //Creo otro objeto utilizando constructor que recibe parametros
        ClasePersona nuevaPersona2 = new ClasePersona("Adriana", "Bestilleiro",25, 174);

        //Imprimo datos 
        System.out.println("TUS OBJETOS PERSONAS SON:");
        System.out.println(nuevaPersona1.toString()); // IMPRIME TODO
        System.out.println("La edad de la segunda persona es:"+nuevaPersona2.getVarEdad());/// IMPRIME UN ATRIBUTO ESPEC
        System.out.println(nuevaPersona2.toString());
        System.out.println("Los dias vividos persona 1 es:" + nuevaPersona1.diasVividos(nuevaPersona1.getVarEdad()));
        
    }

}
