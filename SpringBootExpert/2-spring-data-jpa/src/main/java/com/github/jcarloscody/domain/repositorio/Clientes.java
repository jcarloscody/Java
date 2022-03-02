package com.github.jcarloscody.domain.repositorio;

import com.github.jcarloscody.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Clientes extends JpaRepository<Cliente, Integer> { //essa é um recurso do spring data q carrega neste jpaRepository um entityManager que faz as operacoes

    // QueryMethod: é um metodo que se transforma numa query. vc apenas faz uma declaracao seguindo a convencao e o spring transforma numa query. neste caso a convencao seria
    //findByParametro - os parametros devem existir na entidade
    List<Cliente> findByNomeLike(String nome);//declarei este metodo aqui e o jparepos vai transformar este metodo em uma query usando uma convencao

    List<Cliente> findByNomeOrId(String nome, Integer id);
    List<Cliente> findByNomeOrIdOrderById(String nome, Integer id);
    boolean existsByNome(String nome);
    Cliente findOneByNome(String nome);//se tiver mais de um tera um exception
}
