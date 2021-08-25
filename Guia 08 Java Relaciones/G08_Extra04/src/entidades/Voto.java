/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como
atributos, un objeto Alumno que será el alumno que vota y una lista de los
alumnos a los que votó.

 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Adrian E. Camus
 */
public class Voto {

    private Alumno alumnoQueVota;
    private ArrayList<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumnoQueVota, ArrayList<Alumno> alumnosVotados) {
        this.alumnoQueVota = alumnoQueVota;
        this.alumnosVotados = alumnosVotados;
    }

    public void votando() {

    }

    public Alumno getAlumnoQueVota() {
        return alumnoQueVota;
    }

    public void setAlumnoQueVota(Alumno alumnoQueVota) {
        this.alumnoQueVota = alumnoQueVota;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto del Alumno: " + alumnoQueVota.getNombre() + " DNI: " + alumnoQueVota.getDni();
//                + "\nVota a: " + alumnosVotados.get(0).getNombre() + " " + alumnosVotados.get(1).getNombre() + " " + alumnosVotados.get(2).getNombre();

    }
}

