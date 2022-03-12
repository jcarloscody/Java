package com.github.jcarloscody.service;

import com.github.jcarloscody.domain.entity.Pedido;
import com.github.jcarloscody.domain.enums.StatusPedido;
import com.github.jcarloscody.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoServiceInterface {

    Pedido salvar(PedidoDTO pedidoDTO);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
