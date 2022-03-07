package com.github.jcarloscody.rest.controller;

import com.github.jcarloscody.exception.RegraNegocioException;
import com.github.jcarloscody.rest.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//vai colocar esta classe dentro do container do spring e consegue fazer tratamento usando exception handlers (metodos que quando algum erro é lançado é capturado e pode fazer tratamento e retornando um codigo statico)
public class ApplicationControllerAdvice {


    @ExceptionHandler(RegraNegocioException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleRegraNegocioException(RegraNegocioException ex){
        String mensagem = ex.getMessage();
        return new ApiErrors(mensagem);
    }
}
