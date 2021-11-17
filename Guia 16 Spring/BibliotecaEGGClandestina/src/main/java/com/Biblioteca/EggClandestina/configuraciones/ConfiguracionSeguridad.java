
package com.Biblioteca.EggClandestina.configuraciones;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
@Order(1)
public class ConfiguracionSeguridad extends WebSecurityConfigurerAdapter{
protected void configure(HttpSecurity http) throws Exception {
http
.authorizeRequests()
.antMatchers("/css/*", "/js/*","/img/*", "/**").permitAll()
.and().formLogin()
.loginPage("/login") // Que formulario esta mi login
.loginProcessingUrl("/logincheck")
.usernameParameter("username") // Como viajan los datos del logueo
.passwordParameter("password")// Como viajan los datos del logueo
.defaultSuccessUrl("/inicio") // A que URL viaja
.permitAll()
.and().logout() // Aca configuro la salida
.logoutUrl("/logout")
.logoutSuccessUrl("/")
.permitAll().and().csrf().disable();
}
}
