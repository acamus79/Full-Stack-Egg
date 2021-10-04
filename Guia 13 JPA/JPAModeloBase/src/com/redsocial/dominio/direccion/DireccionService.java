package com.redsocial.dominio.direccion;

import com.redsocial.persistencia.DireccionDAO;
import java.util.UUID;

public class DireccionService {
// RECORDAR QUE SIEMPRE, LA LOGICA DEBE ESTAR EN EL SERVICIO CORRESPONDIENTE
    private final DireccionDAO direccionDAO = new DireccionDAO();

    public Direccion crearDireccion(String pais, String provincia) {
        Direccion direccion = new Direccion();
        try {
            direccion.setPais(pais);
            direccion.setProvincia(provincia);
            direccion.setId(UUID.randomUUID().toString());
            direccionDAO.guardarDireccion(direccion);
            return direccion;
        } catch (Exception e) {
            System.out.println("No se guardo la direccion de forma correcta" + e.getMessage());
            return null;
        }
    }

}
