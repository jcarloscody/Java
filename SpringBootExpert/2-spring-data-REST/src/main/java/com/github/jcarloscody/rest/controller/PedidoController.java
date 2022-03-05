package com.github.jcarloscody.rest.controller;

import com.github.jcarloscody.service.PedidoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class PedidoController {


    private PedidoServiceInterface pedidoServiceInterface;

    public PedidoController(PedidoServiceInterface pedidoServiceInterface){
        this.pedidoServiceInterface = pedidoServiceInterface;
    }
}
