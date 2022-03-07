package com.github.jcarloscody.rest.controller;

import com.github.jcarloscody.domain.entity.Pedido;
import com.github.jcarloscody.rest.dto.PedidoDTO;
import com.github.jcarloscody.service.PedidoServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {


    private PedidoServiceInterface pedidoServiceInterface;

    public PedidoController(PedidoServiceInterface pedidoServiceInterface){
        this.pedidoServiceInterface = pedidoServiceInterface;
    }
/*
    recebemos esse json via requisicao e essa classe representará isso
{
    "cliente": 1,
        "total": 100.56,
        "items":[
            {
                "quantidade": 100,
                    "produto": 4
            }
        ]
}

*/

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Integer save (@RequestBody PedidoDTO pedidoDTO){
        Pedido pedido = pedidoServiceInterface.salvar(pedidoDTO);
        return pedido.getId();
    }
}
