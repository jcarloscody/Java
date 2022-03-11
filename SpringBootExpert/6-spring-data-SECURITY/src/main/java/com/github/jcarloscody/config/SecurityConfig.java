package com.github.jcarloscody.config;
//essa classe terá toda a configuracao do spring security

import com.github.jcarloscody.service.implementacao.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @Bean
    public PasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder();
    }

    @Override  //esse metodo irá servir para trazer os objetos que vao fazer a autenticacao dos usuarios e adicionar estes usuarios dentro do contexto do security. podemos dizer   q vamos configurar a autenticacao aqui
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usuarioService)
                .passwordEncoder(passwordEncoder());
    }

    @Override //podemos olhar para este metodo como q ira lidar com a autorizacao
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("api/clientes/**")
                .hasAnyRole("ADMIN","USER")
                .antMatchers("api/produtos/**")
                .hasRole("ADMIN")
                .antMatchers("api/pedidos/**")
                .hasAnyRole("ADMIN","USER")
                .and()
                .httpBasic() ;
        ;
    }
}
