
package com.Biblioteca.EggClandestina.errores;


public class ErrorServicio extends Exception {
    /*Crea aun mensaje de error personalizado*/
    public ErrorServicio(String msn){
        super(msn);
    }
    
}
