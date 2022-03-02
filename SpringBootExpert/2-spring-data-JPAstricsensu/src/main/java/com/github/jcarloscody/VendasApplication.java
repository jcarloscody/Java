package com.github.jcarloscody;


import com.github.jcarloscody.domain.entity.Cliente;
import com.github.jcarloscody.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Bean
    public CommandLineRunner init( @Autowired Clientes clientesEntityManager){
        return args -> {
            System.out.println("SALVANDO COM JPA ...");
            clientesEntityManager.salvar(new Cliente("josue"));
            clientesEntityManager.salvar(new Cliente("marcos"));
            clientesEntityManager.salvar(new Cliente("silveira"));

            System.out.println("BUSCANDO TODOS COM JPA ...");
            clientesEntityManager.buscarTodos().forEach(System.out::println);

            System.out.println("DELETANDO TODOS TODOS COM JPA ...");
            clientesEntityManager.buscarTodos().forEach(cliente -> {
                clientesEntityManager.deletar(cliente);
            });

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }


}
