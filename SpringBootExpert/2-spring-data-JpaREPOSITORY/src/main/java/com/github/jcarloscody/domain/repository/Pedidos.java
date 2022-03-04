package com.github.jcarloscody.domain.repository;

import com.github.jcarloscody.domain.entity.Cliente;
import com.github.jcarloscody.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
