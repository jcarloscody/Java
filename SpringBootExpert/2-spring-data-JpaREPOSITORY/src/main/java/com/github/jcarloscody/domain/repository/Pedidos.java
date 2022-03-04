package com.github.jcarloscody.domain.repository;

import com.github.jcarloscody.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
}
