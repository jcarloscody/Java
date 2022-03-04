package com.github.jcarloscody;


import com.github.jcarloscody.domain.entity.Cliente;
import com.github.jcarloscody.domain.entity.Pedido;
import com.github.jcarloscody.domain.repository.Clientes;
import com.github.jcarloscody.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes, @Autowired Pedidos pedidos){
        return args -> {
            System.out.println("");System.out.println("");
            System.out.println("SALVANDO COM JpaRepositoruy ...");
            Cliente c1 = clientes.save(new Cliente("josue"));
            Cliente c2 = clientes.save(new Cliente("marcos"));
            Cliente c3 = clientes.save(new Cliente("silveira"));


          /*  System.out.println("");System.out.println("");
            System.out.println("BUSCANDO TODOS COM JpaRepositoruy ...");
            clientes.findAll().forEach(System.out::println);

            System.out.println("");System.out.println("");
            System.out.println("ATUALIZANDO TODOS COM JpaRepositoruy ...");
            clientes.findAll().forEach(c -> {
                c.setNome(c.getNome() + " Atualizando teste");
                clientes.save(c);
            });

            System.out.println("");System.out.println("");
            System.out.println("SALVANDO PEDIDOS ...");
            Pedido p = new Pedido();
            p.setCliente(c1);
            p.setDatePedido(LocalDate.now());
            p.setTotal(BigDecimal.valueOf(22.22));
            pedidos.save(p);

            System.out.println("");System.out.println("");
            System.out.println("BUSCANDO PEDIDOS DOS CLIENTES...");
            System.out.println(clientes.findClienteFetchPedidos(c1.getId()).getPedidos());

            System.out.println("");System.out.println("");
            System.out.println("BUSCANDO APOS ATUALIZACAO ...");
            clientes.findAll().forEach(System.out::println);

            System.out.println("");System.out.println("");
            System.out.println("PESQUISA...  fazendo metodo proprio");
            System.out.println("AQUIIIIIIIIIIIIIII:::::  " + clientes.findOneByNomeLike("os"));

            System.out.println(clientes.findOneByNome("josue"));
            clientes.findByNomeOrId("josue", 2).forEach(System.out::println);

            System.out.println("");System.out.println("");
            System.out.println("Carregando os pedidos do cliente ...");
            pedidos.findByCliente(c1).forEach(System.out::println);


            System.out.println("");System.out.println("");
            System.out.println("DELETANDO TODOS TODOS COM JpaRepositoruy ...");
            //clientes.findAll().forEach(cliente -> clientes.delete(cliente));
            clientes.findAll().forEach(clientes::delete);*/



        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }


}
