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
    public CommandLineRunner init( @Autowired Clientes clientes){
        return args -> {
            System.out.println("SALVANDO COM JpaRepositoruy ...");
            clientes.save(new Cliente("josue"));
            clientes.save(new Cliente("marcos"));
            clientes.save(new Cliente("silveira"));

            System.out.println("BUSCANDO TODOS COM JpaRepositoruy ...");
            clientes.findAll().forEach(System.out::println);

            System.out.println("ATUALIZANDO TODOS COM JpaRepositoruy ...");
            clientes.findAll().forEach(c -> {
                c.setNome(c.getNome() + "Atualizando teste");
                clientes.save(c);
            });



            System.out.println("BUSCANDO APOS ATUALIZACAO ...");
            clientes.findAll().forEach(System.out::println);

            System.out.println("PESQUISA POR NOME ...  fazendo metodo proprio");
            clientes.findByNomeLike("josue").forEach(System.out::println);

            System.out.println("DELETANDO TODOS TODOS COM JpaRepositoruy ...");
            clientes.findAll().forEach(cliente -> {
                clientes.delete(cliente);
            });

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }


}
