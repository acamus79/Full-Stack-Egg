package servicios;

import entidades.Departamento;
import entidades.PersonaTerrateniente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PersonaTerratenienteServicio {

    private Scanner leer = new Scanner(System.in);
    private ArrayList<PersonaTerrateniente> listaPersonasTerratenientes = new ArrayList();

    public PersonaTerratenienteServicio() {
        //Esto lo hago, para precargar datos a mi lista.... y no hacer tanta carga de datos MANUAL
        PersonaTerrateniente nuevaPersona1 = new PersonaTerrateniente("ADRIANA", "BESTILLEIRO");
        PersonaTerrateniente nuevaPersona2 = new PersonaTerrateniente("PABLO", "ESCOBAR");
        PersonaTerrateniente nuevaPersona3 = new PersonaTerrateniente("TOTA", "SANTILLAN");
        listaPersonasTerratenientes.add(nuevaPersona1);//LAS AGREGO A MI LISTA
        listaPersonasTerratenientes.add(nuevaPersona2);
        listaPersonasTerratenientes.add(nuevaPersona3);

    }

    public void cargarPersonaTerrateniente() {
        System.out.println("Ingrese el nombre");
        String nombreI = leer.next();

        System.out.println("Ingrese el apellido");
        String apelldoI = leer.next();

        //En mi misma linea de codigo, agrego a la persona a la lista para persistir datos durante ejecucion del programa
        //Hago uso del constructor que recibe parametros.        
        listaPersonasTerratenientes.add(new PersonaTerrateniente(nombreI.toUpperCase(), apelldoI.toUpperCase()));
    }

    public void asignarleDeptoaLista(DepartamentoServicio nuevaEjecucion2, String varElegido) {
        System.out.println("Ingrese el apellido de la persona que va a asignar un depto");
        String apellidoI = leer.next(); // Carga a quien quiere modificar

        //Recorro mi lista de personas para ver si existe
        for (PersonaTerrateniente personaUnitario : listaPersonasTerratenientes) {
            //Condicion para encontrar a la persona por Apellido
            if (personaUnitario.getApellido().equals(apellidoI.toUpperCase())) {
                //Si la encuentro..... recorro los deptos existentes 
                for (Departamento unitarioDepto : nuevaEjecucion2.getListaDepartamentos()) {
                    if (unitarioDepto.getDomicilio().equals(varElegido)) { // Esta condicion la hago para ver solo LOS DEPTOS SIN duenio
                        //Si el depto existe,  lo cargo en el atributo de la persona   
                        personaUnitario.getListaPropiedades().add(unitarioDepto);
                        unitarioDepto.setTienePropietario(true); //set EL ATRIBUTO del dpto para que no este mas disponible
                    }
                }
            }
        }
    }

    public void imprimirPersonasTerratenientes() {
        System.out.println("╬╬╬╬PERSONAS CARGADAS╬╬╬╬");
        for (PersonaTerrateniente personaUnitario : listaPersonasTerratenientes) {
            System.out.println(personaUnitario);
        }
    }

    public void ordenarDeAaZ() {
        //Ordeno de A a Z - Teniendo en consideracion al APELLIDO
        Collections.sort(listaPersonasTerratenientes,
                (PersonaTerrateniente objeto1, PersonaTerrateniente objeto2) -> objeto1.getApellido().compareTo(objeto2.getApellido()));
    }

    public void eliminarPersona() {
        System.out.println("Ingrese el apellido de la persona que va a eliminar");
        String apellidoI = leer.next(); // Carga a quien quiere eliinar

        Iterator<PersonaTerrateniente> it = listaPersonasTerratenientes.iterator();
        while (it.hasNext()) {
            PersonaTerrateniente unitario = it.next();
            if (unitario.getApellido().equals(apellidoI.toUpperCase())) {
                //Recorro los deptos del que voy a eliminar
                for (Departamento unitarioDepto : unitario.getListaPropiedades()) { // Lo hago para volver a tener disponible los deptos
                    unitarioDepto.setTienePropietario(false);
                }
               it.remove();
            }
            imprimirPersonasTerratenientes(); // INVOCO AL METODO IMPRIMIR PARA VER Q SE FUE
        }
    }
}
