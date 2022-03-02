package com.github.jcarloscody;


import com.github.jcarloscody.domain.entity.Cliente;
import com.github.jcarloscody.domain.repositorio.Clientes_jdbcTemplate;

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
    public CommandLineRunner init(@Autowired Clientes_jdbcTemplate clientesJdbcTemplate){
        return args -> {
            System.out.println("SALVANDO OBJETOS...");
            clientesJdbcTemplate.salvar(new Cliente("lUCAS os"));
            clientesJdbcTemplate.salvar(new Cliente("mEREILES"));

            System.out.println("MOSTRANDO TODOS");
            clientesJdbcTemplate.obterTodos().forEach(c -> {
                System.out.println(c.getNome());
            });
            //OU
             clientesJdbcTemplate.obterTodos().forEach(System.out::println);

            System.out.println("Pesquisando por nome os");
            clientesJdbcTemplate.buscarNome("os").forEach(System.out::println);


            System.out.println("ATUALIZANDO");
            clientesJdbcTemplate.obterTodos().forEach( c-> {
                    c.setNome(c.getNome() + "nome atualizado test");
                    clientesJdbcTemplate.atualizar(c);
            }
            );

            System.out.println("MOSTRANDO TODOS - apos atualizacao");
            clientesJdbcTemplate.obterTodos().forEach(System.out::println);


            System.out.println("DELETANDO TODOS");
            clientesJdbcTemplate.obterTodos().forEach(c -> {
                clientesJdbcTemplate.deletar(c);
            });




            System.out.println("DELETANDO TODOS");


            System.out.println("RESULTADO APOS DELECAO");
            clientesJdbcTemplate.obterTodos().forEach(System.out::println);


        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }


}
