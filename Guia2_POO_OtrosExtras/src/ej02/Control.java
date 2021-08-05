/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej02;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Adrian E. Camus
 */
public class Control {
//Creo el Objeto de la clase Tiempo con verificacion por cada atributo

    public Tiempo creaReloj() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("VAMOS A SIMULAR UN RELOJ");
        System.out.println("Dame la hora...");
        int hr = leer.nextInt();
        while (!(hr >= 0 && hr < 24)) {
            System.out.println("no es una hora valida");
            hr = leer.nextInt();
        }
        System.out.println("Dame los minutos...");
        int min = leer.nextInt();
        while (!(min >= 0 && hr < 60)) {
            System.out.println("los minutos no cumplen el estandar");
            min = leer.nextInt();
        }
        System.out.println("y ahora los segundos");
        int seg = leer.nextInt();
        while (!(seg >= 0 && hr < 60)) {
            System.out.println("los segundos no son validos");
            seg = leer.nextInt();
        }
        return new Tiempo(hr, min, seg);
    }
//un metodo para mostrar el tiempo

    private static void imprimirHoraCompleta(Tiempo t) {
        System.out.println(t.getHora() + " : " + t.getMinuto() + " : " + t.getSegundo() + "\n");
    }
//un metodo que simula un reloj por consola

    public void reloj(Tiempo t) throws InterruptedException {
        do {
            TimeUnit.SECONDS.sleep(1);//mando a dormir un segundo para que parezca un reloj
            t.setSegundo(t.getSegundo() + 1);
            if (t.getSegundo() > 59) {
                t.setMinuto(t.getMinuto() + 1);
                t.setSegundo(0);
                if (t.getMinuto() > 59) {
                    t.setHora(t.getHora() + 1);
                    t.setMinuto(0);
                    if (t.getHora() > 23) {
                        t.setHora(0);
                    }
                }
            }
            imprimirHoraCompleta(t);
        } while (t.getHora() < 24);
    }
}
