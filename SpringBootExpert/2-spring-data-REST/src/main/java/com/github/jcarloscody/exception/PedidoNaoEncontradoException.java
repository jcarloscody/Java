package com.github.jcarloscody.exception;

public class PedidoNaoEncontradoException  extends RuntimeException{
    private String messagem;

    public PedidoNaoEncontradoException(String messagem) {
        this.messagem = messagem;
    }
}
