/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Perro;
import enumeradores.Raza;
import enumeradores.Tamanio;
import java.util.Scanner;

/**
 *
 * @author Drok
 */
public class ServicioAdopcion {
    
    Scanner leer;

    public ServicioAdopcion() {
    this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void adoptaPerro(Perro choco){
        System.out.println("*******RAZAS******");
        //recorre desde los valores del enum Raza y por cada vuelta del for
        // le asigna un valor del enum a la variable aux.
        for (Raza aux : Raza.values()) {
            System.out.println(aux);
        }
        System.out.println("*******TAMAÑOS******");
        for (Tamanio aux : Tamanio.values()) {
            System.out.println(aux);
        }
       
        System.out.println("\nElija la raza y el tamaño");
        String eleRaza = leer.next();
        String eleTam = leer.next();
        
        for (Raza aux : Raza.values()) {
//si lo que escribio el usuario es igual a el objeto auxiliar del enum convertido a String
            if(eleRaza.equalsIgnoreCase(aux.toString())){
                choco.setRaza(aux);
            }
        }
        
        for (Tamanio aux : Tamanio.values()) {
            if(eleTam.equalsIgnoreCase(aux.toString())){
                choco.setTamanio(aux);
            }
            
        }
        
    }
    
    
    
    
}
