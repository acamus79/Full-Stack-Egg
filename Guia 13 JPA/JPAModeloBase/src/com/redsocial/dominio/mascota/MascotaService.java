package com.redsocial.dominio.mascota;

import com.redsocial.dominio.usuario.Usuario;
import com.redsocial.persistencia.MascotaDAO;
import com.redsocial.persistencia.UsuarioDAO;
import java.util.Collection;
import java.util.UUID;

public class MascotaService {
// RECORDAR QUE SIEMPRE, LA LOGICA DEBE ESTAR EN EL SERVICIO CORRESPONDIENTE
    private final MascotaDAO daoMascota;
    private final UsuarioDAO daoUsuario;

    public MascotaService() {
        this.daoMascota = new MascotaDAO();
        this.daoUsuario= new UsuarioDAO();
    }

    
    public Mascota crearMascota(String apodo, String raza){
           Mascota mascotaNueva = new Mascota();
        try {          
            //Validamos
            if (apodo == null || apodo.trim().isEmpty()) {
                throw new Exception("Debe indicar el apodo");
            }
            if (raza == null || raza.trim().isEmpty()) {
                throw new Exception("Debe indicar la raza");
            }
                    
            mascotaNueva.setApodo(apodo);
            mascotaNueva.setRaza(raza);
            mascotaNueva.setId(UUID.randomUUID().toString());   
            
            daoMascota.guardarMascota(mascotaNueva);
            
            return mascotaNueva;
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
    }
    }
  
    public void modificarApodoMascota(String idMascota,String apodoNuevo){
       try{
        Mascota mascota = buscarMascotaPorId(idMascota);
        mascota.setApodo(apodoNuevo);
        daoMascota.modificarMascota(mascota);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
    
    public Mascota buscarMascotaPorId(String id) throws Exception {
        try {
            //Validamos
            if (id == null) {
                throw new Exception("Debe indicar el id de la mascota a encontrar");
            }
            Mascota mascota = daoMascota.buscarMascotaPorId(id);
            //Verificamos
            if (mascota == null) {
                throw new Exception("No se econtró mascota para el correo electrónico indicado");
            }
            return mascota;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Collection<Mascota> listaMascota() throws Exception {
        try {
            Collection<Mascota> mascotas = daoMascota.listarMascotas();
            return mascotas;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirMascotas() throws Exception {
        try {
            //Listamos los mascotas
            Collection<Mascota> mascotas = listaMascota();
            //Imprimimos los mascotas
            if (mascotas.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Mascota u : mascotas) {
                    System.out.println("**********************************");
                    System.out.println(" Apodo Mascota:" + u.getApodo()
                            + "\n Raza Mascota:" + u.getRaza());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostarXRaza(String raza) throws Exception {
        try {
            //Listamos los mascotas
            Collection<Mascota> mascotas = daoMascota.listarMascotasRaza(raza);
            //Imprimimos los mascotas
            if (mascotas.isEmpty()) {
                throw new Exception("No existen mascotas con esas razas para imprimir");
            } else {
                for (Mascota u : mascotas) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception i) {
            System.out.println(i.getMessage());
        }
    }

}
