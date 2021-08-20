package servicios;

import entidades.Departamento;
import java.util.ArrayList;
import java.util.Scanner;

public class DepartamentoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Departamento> listaDepartamentos = new ArrayList();

    public DepartamentoServicio() {
        //Cargo departamentos directo usando constructor para agilizar   
        Departamento nuevoDepartamento1 = new Departamento("SAN MARTIN 45", 40);
        Departamento nuevoDepartamento2 = new Departamento("LA KONGA 45", 100);
        Departamento nuevoDepartamento3 = new Departamento("COLON 458", 200);
        listaDepartamentos.add(nuevoDepartamento1);
        listaDepartamentos.add(nuevoDepartamento2);
        listaDepartamentos.add(nuevoDepartamento3);
    }

    //Dejo SET u GET para poder acceder a los Deptos desde otra clase
    public ArrayList<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public void cargarDepto() {
        //Otra opcion de carga, creo un OBJETO usando constructor vacio, y seteo sus atributos
        Departamento deptoCargar = new Departamento();
        System.out.println("Ingrese la direccion");
        String domicilioI = leer.next();
        System.out.println("Ingrese los metros que tiene el depto");
        Integer superficeI = leer.nextInt();
        deptoCargar.setDomicilio(domicilioI.toUpperCase()); // Modifico valores del atributo
        deptoCargar.setSuperficie(superficeI);
        listaDepartamentos.add(deptoCargar);//Incorporo el nuevo depto a la lista
    }

    public void imprimirDepartamentos() {
        for (Departamento departamentoUnitario : listaDepartamentos) {
            System.out.println(departamentoUnitario);
        }
    }

    public void imprimirDepartamentosSinPropie() {
        System.out.println("**************DEPTOS SIN PROPIETARIOS*****************");
        for (Departamento departamentoUnitario : listaDepartamentos) {
            if (!departamentoUnitario.isTienePropietario()) {
                System.out.println(departamentoUnitario);
            }
        }
    }
}
