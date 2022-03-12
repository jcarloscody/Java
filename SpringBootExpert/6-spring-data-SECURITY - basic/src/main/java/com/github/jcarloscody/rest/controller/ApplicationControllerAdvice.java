package com.github.jcarloscody.rest.controller;

import com.github.jcarloscody.exception.PedidoNaoEncontradoException;
import com.github.jcarloscody.exception.RegraNegocioException;
import com.github.jcarloscody.rest.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
//vai colocar esta classe dentro do container do spring e consegue fazer tratamento usando exception handlers (metodos que quando algum erro é lançado é capturado e pode fazer tratamento e retornando um codigo statico)
public class ApplicationControllerAdvice {


    @ExceptionHandler(RegraNegocioException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleRegraNegocioException(RegraNegocioException ex){
        String mensagem = ex.getMessage();
        return new ApiErrors(mensagem);
    }

    @ExceptionHandler(PedidoNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public PedidoNaoEncontradoException handlerPedidoNaoEncontradoException(PedidoNaoEncontradoException ex){
        String ms = ex.getMessage();
        return new PedidoNaoEncontradoException(ms);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrors handlerPedidoNaoEncontradoException(MethodArgumentNotValidException ex){
        List<String> ms = ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(objectError -> objectError
                        .getDefaultMessage())
                .collect(Collectors.toList());
        return new ApiErrors(ms);
    }
}
