package com.github.jcarloscody.rest.controller;

import com.github.jcarloscody.service.PedidoServiceInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {


    private PedidoServiceInterface pedidoServiceInterface;

    public PedidoController(PedidoServiceInterface pedidoServiceInterface){
        this.pedidoServiceInterface = pedidoServiceInterface;
    }
}
