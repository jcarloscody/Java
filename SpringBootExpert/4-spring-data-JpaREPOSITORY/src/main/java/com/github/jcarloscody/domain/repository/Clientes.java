package com.github.jcarloscody.domain.repository;

import com.github.jcarloscody.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface Clientes extends JpaRepository<Cliente, Integer> { //essa é um recurso do spring data q carrega neste jpaRepository um entityManager que faz as operacoes

    // QueryMethod: é um metodo que se transforma numa query. vc apenas faz uma declaracao seguindo a convencao e o spring transforma numa query. neste caso a convencao seria
    //findByParametro - os parametros devem existir na entidade
    List<Cliente> findByNomeLike(String nome);//declarei este metodo aqui e o jparepos vai transformar este metodo em uma query usando uma convencao

    List<Cliente> findByNomeOrId(String nome, Integer id);

    List<Cliente> findByNomeOrIdOrderById(String nome, Integer id);

    boolean existsByNome(String nome);

    Cliente findOneByNome(String nome);//se tiver mais de um tera um exception

    Cliente findOneByNomeLike(String nome);//se tiver mais de um tera um exception


    //usando query string - essa anotacao vai injetar no metodo
    @Query(value = "SELECT c FROM Cliente c WHERE c.nome like :nome ") //usei aqui jpql
    List<Cliente> procurarPorNome(@Param(value = "nome") String nome);

    @Query(value = "SELECT * FROM cliente c WHERE c.nome like '%:nome%' ", nativeQuery = true) //usando sql nativo
    List<Cliente> procurarPorNomee(@Param(value = "nome") String nome);

   /* @Query(value = "delete from Cliente c where c.nome =:nome")
    @Modifying //este metodo não é de simples consulta, mas de transacao. entao precisa informar ao jpa
    void deletarPorNome (@Param(value = "nome") String nome);*/

    //fazendo um fatch (trazer junto) dos pedidos relacionados ao cliente
    @Query(" select c FROM Cliente c left join fetch c.pedidos where c.id =:id")
    Cliente findClienteFetchPedidos(@Param("id") Integer id);


}
