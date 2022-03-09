package com.github.jcarloscody;


import com.github.jcarloscody.domain.entity.Cliente;
import com.github.jcarloscody.domain.entity.Produto;
import com.github.jcarloscody.domain.repository.Clientes;
import com.github.jcarloscody.domain.repository.Pedidos;
import com.github.jcarloscody.domain.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes repositoryClientes, @Autowired Pedidos repositoryPedidos, @Autowired Produtos repositoryProdutos){
        return args -> {
            System.out.println("");System.out.println("");
            System.out.println("SALVANDO COM JpaRepositoruy ...");
            Cliente c1 = repositoryClientes.save(new Cliente("josue", "11111111111"));
            Cliente c2 = repositoryClientes.save(new Cliente("marcos", "22222222222"));
            Cliente c3 = repositoryClientes.save(new Cliente("silveira", "33333333333"));

            Produto p1 = repositoryProdutos.save(new Produto(null, "TV", BigDecimal.valueOf(565.58)));
            Produto p2 = repositoryProdutos.save(new Produto( null,"carro", BigDecimal.valueOf(56565.58)));
            Produto p3 = repositoryProdutos.save(new Produto( null,"dvd", BigDecimal.valueOf(100.56)));
            Produto p4 = repositoryProdutos.save(new Produto(null, "moto", BigDecimal.valueOf(12565.89)));
            Produto p5 = repositoryProdutos.save(new Produto(null, "note", BigDecimal.valueOf(1000.56)));

          /*  System.out.println("");System.out.println("");
            System.out.println("BUSCANDO TODOS COM JpaRepositoruy ...");
            repositoryClientes.findAll().forEach(System.out::println);

            System.out.println("");System.out.println("");
            System.out.println("ATUALIZANDO TODOS COM JpaRepositoruy ...");
            repositoryClientes.findAll().forEach(c -> {
                c.setNome(c.getNome() + " Atualizando teste");
                repositoryClientes.save(c);
            });

            System.out.println("");System.out.println("");
            System.out.println("SALVANDO PEDIDOS ...");
            Pedido p = new Pedido();
            p.setCliente(c1);
            p.setDatePedido(LocalDate.now());
            p.setTotal(BigDecimal.valueOf(22.22));
            repositoryPedidos.save(p);

            System.out.println("");System.out.println("");
            System.out.println("BUSCANDO PEDIDOS DOS CLIENTES...");
            System.out.println(repositoryClientes.findClienteFetchPedidos(c1.getId()).getPedidos());

            System.out.println("");System.out.println("");
            System.out.println("BUSCANDO APOS ATUALIZACAO ...");
            repositoryClientes.findAll().forEach(System.out::println);

            System.out.println("");System.out.println("");
            System.out.println("PESQUISA...  fazendo metodo proprio");
            System.out.println("AQUIIIIIIIIIIIIIII:::::  " + repositoryClientes.findOneByNomeLike("os"));

            System.out.println(repositoryClientes.findOneByNome("josue"));
            repositoryClientes.findByNomeOrId("josue", 2).forEach(System.out::println);

            System.out.println("");System.out.println("");
            System.out.println("Carregando os repositoryPedidos do cliente ...");
            repositoryPedidos.findByCliente(c1).forEach(System.out::println);


            System.out.println("");System.out.println("");
            System.out.println("DELETANDO TODOS TODOS COM JpaRepositoruy ...");
            //repositoryClientes.findAll().forEach(cliente -> repositoryClientes.delete(cliente));
            repositoryClientes.findAll().forEach(repositoryClientes::delete);*/



        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }


}
