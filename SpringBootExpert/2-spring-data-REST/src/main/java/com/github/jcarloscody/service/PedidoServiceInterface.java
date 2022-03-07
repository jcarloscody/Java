package com.github.jcarloscody.service;

import com.github.jcarloscody.domain.entity.Pedido;
import com.github.jcarloscody.rest.dto.PedidoDTO;

public interface PedidoServiceInterface {

    Pedido salvar(PedidoDTO pedidoDTO);
}
