package edu.egg.tinder;

import edu.egg.tinder.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TinderApplication {
    
    @Autowired
    private ServicioUsuario sUsuario;
    
	public static void main(String[] args) {
		SpringApplication.run(TinderApplication.class, args);
	}
        
        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
            auth.userDetailsService(sUsuario).passwordEncoder(new BCryptPasswordEncoder());
        }
}
