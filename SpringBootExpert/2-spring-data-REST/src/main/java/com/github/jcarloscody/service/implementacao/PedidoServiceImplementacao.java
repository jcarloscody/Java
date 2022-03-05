package com.github.jcarloscody.service.implementacao;

import com.github.jcarloscody.domain.repository.Pedidos;
import com.github.jcarloscody.service.PedidoServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImplementacao implements PedidoServiceInterface {

    private Pedidos repositoryPedidos;

    public PedidoServiceImplementacao(Pedidos repositoryPedidos) {
        this.repositoryPedidos = repositoryPedidos;
    }
}
