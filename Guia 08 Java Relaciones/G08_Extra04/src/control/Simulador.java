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

 */
package control;

import java.util.ArrayList;
import java.util.Collections;

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

    public ArrayList<String> generaDNI(int cantidad) {
        ArrayList<String> dnis = new ArrayList();
        int dn,ni;
        String dni;
        
        for (int i = 0; i < cantidad; i++) {
            dn = (int) (Math.random()*1807+1);
            ni = (int) (Math.random()*1001+1);
            dni = Integer.toString(dn)+Integer.toString(ni);
            dnis.add(dni);
        }
        
        Collections.shuffle(dnis);
        
        return dnis;

    }

}
