package com.github.jcarloscody.domain.repository;

import com.github.jcarloscody.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> { //quem implementa com os methods mais basicos é a class SimpleJpaRepository
}
