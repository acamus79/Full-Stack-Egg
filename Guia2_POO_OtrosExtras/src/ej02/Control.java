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

    public Tiempo creaReloj() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("VAMOS A SIMULAR UN RELOJ");
        System.out.println("Dame la hora...");
        int hr = leer.nextInt();
        System.out.println("Dame los minutos...");
        int min = leer.nextInt();
        System.out.println("y ahora los segundos");
        int seg = leer.nextInt();
        return new Tiempo(hr, min, seg);
    }

    private static void imprimirHoraCompleta(Tiempo t) {
        System.out.println(t.getHora() + " : " + t.getMinuto() + " : " + t.getSegundo() + "\n");
    }

    public void reloj(Tiempo t) throws InterruptedException {
        int a = 0;//lo uso como para ponerle un limite en este caso muy aplio porque sera de 24 hs
        int i = t.getHora();
        int j = t.getMinuto();
        int k = t.getSegundo();

        do {
            for (i = t.getHora(); i <= 24; i++) {
                a++;
                if (t.getHora() == 24) {
                    i = 0;
                    t.setHora(i);
                }
                for (j = t.getMinuto(); j < 60; j++) {
                    t.setMinuto(j);
                    if (t.getMinuto() == 60) {
                        j = 0;
                        t.setMinuto(0);
                        t.setHora(t.getHora() + 1);
                    }
                    while (j < 60) {
                        k++;
                        t.setSegundo(k);
                        if (t.getSegundo() == 60) {
                            k = 0;
                            t.setSegundo(0);
                            t.setMinuto(t.getMinuto() + 1);
                        }
                        TimeUnit.SECONDS.sleep(1);//mando a dormir un segundo para que parezca un reloj
                        imprimirHoraCompleta(t);
                    }

                }
            }

        } while (a <= 24);
    }
}
