/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.livrojavalambda.cap2;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author developer
 */
public class TestCap2 {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);//Arrays.asList é uma maneira simples de criar uma List imutável
        
        for(Usuario u : usuarios) {
            System.out.println(u.getNome());
        }
        
        usuarios.forEach(new ShowConsumer()); //JAVA 8 - Ele recebe um objeto do tipo java.util.function.Consumer, que tem um único método, o accept. Ela é uma nova interface do Java 8,
        
        
        //CLASS ANONIMA
        Consumer<Usuario> showConsumerAnonima = new Consumer<>(){
            @Override
            public void accept(Usuario t) {   
                System.out.println(t.getNome());
            }
        };
        
        usuarios.forEach(showConsumerAnonima);
        
        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        });
    }
}
