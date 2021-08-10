/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ejemplosiniciales;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opinion;
        System.out.println("Califica la pelicula de 1 a 5 estrellas");
        opinion = leer.nextInt();

        if (opinion >= 1 && opinion <= 5) {

            switch (opinion) {
                case 1://no pongo instruccion entonces si opinion es 1 tomará las instrucciones del caso 2
                case 2:
                    System.out.println("Nos sentimos apenados de que no hayas disfrutado la peli...");
                    break;//aqui finaliza el caso 1 y 2
                case 3:
                    System.out.println("Has calificado la peli como Buena");
                    break;//aqui finaliza el caso 3
                case 4:
                    System.out.println("Has calificado la peli como Muy Buena");
                    break;//aqui finaliza el caso 4
                case 5:
                    System.out.println("Fastastico que haya disfrutado un excelente entretenimiento");
                //El equivalente a **De Otro Modo** es default
                //default:
                //<<acciones>>                                            
            }

        } //sino si, permite concatenar condicionales
        else if (opinion < 0) {
            System.out.println("una opinion negativa? tannn mala fue la pelicula?");

        } //sino si
        else if (opinion == 0) {
            System.out.println("El valor " + opinion + " no es valido y no se tomara en cuenta");

        } //sino
        else {
            System.out.println("WOW!! se te fue la mano con la calificacion");

        }
        System.out.println("");
        System.out.println("Hasta la proxima");
    }

}
