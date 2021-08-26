/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Además, crearemos una clase
Simulador que va a tener los métodos para manejar los alumnos y sus votaciones. Estos
métodos serán llamados desde el main.
• La clase Simulador debe tener un método que genere un listado de alumnos
manera aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser
generadas de manera aleatoria. Nota: usar listas de tipo String para generar los
nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar
dentro de un rango real de números de documentos. Y agregar a los alumnos su
DNI. Este método debe retornar la lista de dnis.

• Ahora tendremos un método que, usando las dos listas generadas, cree una
cantidad de objetos Alumno, elegidos por el usuario, y le asigne los nombres y los
dnis de las dos listas a cada objeto Alumno. No puede haber dos alumnos con el
mismo dni, pero si con el mismo nombre.

• Se debe imprimir por pantalla el listado de alumnos.

• Crearemos un método votación en la clase Simulador que, recibe el listado de
alumnos y para cada alumno genera tres votos de manera aleatoria. En este
método debemos guardar a el alumno que vota, a los alumnos a los que votó y
sumarle uno a la cantidad de votos a cada alumno que reciba un voto, que es un
atributo de la clase Alumno.

Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una
vez al mismo alumno. Utilizar un hashset para resolver esto.

• Se debe crear un método que muestre a cada Alumno con su cantidad de votos
y cuales fueron sus 3 votos.
• Se debe crear un método que haga el recuento de votos, este recibe la lista de
Alumnos y comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben
crear 5 facilitadores suplentes con los 5 segundos alumnos más votados. A
continuación, mostrar los 5 facilitadores y los 5 facilitadores suplentes

 */
package control;

import entidades.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Adrian E. Camus
 */
public class Simulador {

    public ArrayList<String> generaNombres() {
        ArrayList<String> nombres = new ArrayList();

        nombres.add("Fulano Denadie");
        nombres.add("Elena Nito");
        nombres.add("Lucila Tanga");
        nombres.add("Elber Galarga");
        nombres.add("Debora Meltrozo");
        nombres.add("Armando Paredes");
        nombres.add("Fulano Denadie");
        nombres.add("Sevelinda Parada");
        nombres.add("Jorge Nitales");
        nombres.add("Mary Conazo");
        Collections.shuffle(nombres);

        return nombres;
    }

    private String generaDNI() {
        int dn = (int) (Math.random() * 2075 + 1);
        int ni = (int) (Math.random() * 4000 + 1);
        String dni = Integer.toString(dn) + Integer.toString(ni);

        if (dni.length() <= 6)
        {
            dni = dni + "00";
        } 

        return dni;

    }

    public HashSet<Alumno> listaAlumno(ArrayList<String> nombres, int cantAlumnos) {

        HashSet<Alumno> setAlumno = new HashSet();

        for (int i = 0; i < cantAlumnos; i++)
        {
            Alumno a = new Alumno();
            a.setDni(generaDNI());
            setAlumno.add(a);
        }

        Iterator<Alumno> it = setAlumno.iterator();

        while (it.hasNext())
        {
            Collections.shuffle(nombres);
            it.next().setNombre(nombres.get((int) (Math.random() * nombres.size())));
        }
        return setAlumno;
    }

    public void imprimeLista(HashSet<Alumno> lista) {
        for (Alumno alumno : lista)
        {
            System.out.println(alumno);
        }

    }

    public HashSet<Alumno> votacion(HashSet<Alumno> lista) {

        Voto v = new Voto();//creo un objeto Voto
        Random aleatorio = new Random();//utilidad para hacer Random de una lista
        ArrayList<Alumno> auxAlumnos = new ArrayList(lista);//creo un arraylist auxiliar con todo lo que tiene el hashset que viene por parametro

        //Iterator<Alumno> it = auxAlumnos.iterator();//iterador para recorrer

        for (Alumno aux : lista) {
            auxAlumnos.remove(aux);//asi me aseguro que no se vote a si mismo
            ArrayList<Alumno> votados = new ArrayList();//creo un arraylist de alumnos para usarlo como set de Voto
            
            //creo 3 indices aleatorios para las votaciones
            int voto1 = aleatorio.nextInt(auxAlumnos.size()); 
            int voto2 = aleatorio.nextInt(auxAlumnos.size());  
            int voto3 = aleatorio.nextInt(auxAlumnos.size()); 
            
            int tam = auxAlumnos.size();
            
            //verifico que los votos no sean iguales
            if (voto1 == voto2)
            {
                voto2 += 1;
                if(voto2>=tam){
                    voto2-=2;
                }
                
            } else if (voto1 == voto3)
            {
               voto3 += 1;
               if(voto3>=tam){
                    voto3-=2;
                }
            }else if (voto2 == voto3)
            {
               voto3 += 1;
               if(voto3>=tam){
                    voto3-=2;
                }
            }
            
            votados.add(auxAlumnos.get(voto3));
            votados.add(auxAlumnos.get(voto2));
            votados.add(auxAlumnos.get(voto1));
            
            auxAlumnos.get(voto1).incrementaVoto();
            auxAlumnos.get(voto2).incrementaVoto();
            auxAlumnos.get(voto3).incrementaVoto();
            
            v.setAlumnoQueVota(aux);//le seteo el alumno que vota al Voto creado
            v.setAlumnosVotados(votados);//le seteo el arraylist de votados al Voto
            auxAlumnos.add(aux);
            System.out.println(v.toString());//mensajito para saber quien esta votando con el toString de Voto

            //recorro la lista de votados para mostrar a quien voto cada alumno
            for (Alumno vot : votados)
            {
                System.out.println("Vota a: " + vot.vistaSimple());
            }
            System.out.println("");
            
            
        }
   
        //transformo mi lista auxAlumnos de nuevo en un HashSet para retornarlo
        lista = new HashSet<Alumno>(auxAlumnos);
        return lista;
    }

    
    
    
   
    
    
    
    public void recuento(HashSet<Alumno> lista){
        List<Alumno> listaAux = new ArrayList(lista);
        Collections.sort(listaAux, porVotos);
        System.out.println("**** FACILITADORES TITULARES ****");
        for (int i = 0; i < 5; i++) {
            System.out.println(listaAux.get(i).toString());
        }
            
        System.out.println("**** FACILITADORES SUPLENTES ****");
        for (int i = 6; i < 10; i++) {
            System.out.println(listaAux.get(i).toString());
        }
        
    }
    
     public static Comparator<Alumno> porVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a1, Alumno a2) {
            return a2.getCantVotos().compareTo(a1.getCantVotos());
        }
    };
    
    
    
    
}
