package com.github.jcarloscody.config;
//essa classe terá toda a configuracao do spring security

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override  //esse metodo irá servir para trazer os objetos que vao fazer a autenticacao dos usuarios e adicionar estes usuarios dentro do contexto do security. podemos dizer   q vamos configurar a autenticacao aqui
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    @Override //podemos olhar para este metodo como q ira lidar com a autorizacao
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }
}
