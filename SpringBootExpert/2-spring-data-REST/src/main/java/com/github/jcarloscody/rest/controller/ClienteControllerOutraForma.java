package com.github.jcarloscody.rest.controller;

import com.github.jcarloscody.domain.entity.Cliente;
import com.github.jcarloscody.domain.repository.Clientes;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController //é uma anotacao especializada em controle, ele já vem com o responsebody, ou seja, não precisamos colocar o responsebody em nossos metodos
@RequestMapping("/api/clientesoutraforma")
public class ClienteControllerOutraForma {

    private Clientes clientes;

    public ClienteControllerOutraForma(Clientes clientes ) { //aqui o spring já vai injetar
        this.clientes = clientes;
    }


    @GetMapping("/{id}")  //neste agora iremos retornar o proprio objeto cliente
    public Cliente getClienteById(@PathVariable Integer id ){
        return clientes.findById(id)
                .orElseThrow(()-> {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "cliente Não encontrado");
                });
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //aqui irá retornar o staus 200 caso seja efetuado
    public Cliente save (@RequestBody Cliente c){
        return this.clientes.save(c);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        this.clientes.findById(id).map(cliente ->{
             this.clientes.delete(cliente);
             return cliente;
        }).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente nao encontrado!"));
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Integer id, @RequestBody Cliente c){
         this.clientes.findById(id)
                .map(clienteExistente -> {
                    c.setId(clienteExistente.getId());
                     this.clientes.save(c);
                     return clienteExistente;
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente nao encontrado!"));
    }


    @GetMapping("")   //formato da url  ...?param1=value&param2=value
    public List<Cliente> find( Cliente filtro){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

        Example example = Example.of(filtro, matcher);

        return clientes.findAll(example);
    }
}
