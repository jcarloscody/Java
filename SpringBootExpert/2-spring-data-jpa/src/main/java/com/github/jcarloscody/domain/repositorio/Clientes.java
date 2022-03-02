package com.github.jcarloscody.domain.repositorio;

import com.github.jcarloscody.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Clientes extends JpaRepository<Cliente, Integer> { //essa é um recurso do spring data q carrega neste jpaRepository um entityManager que faz as operacoes
    List<Cliente> findByNomeLike(String nome);//declarei este metodo aqui e o jparepos vai transformar este metodo em uma query usando uma convencao



}
