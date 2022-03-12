package com.github.jcarloscody.rest.controller;

import com.github.jcarloscody.domain.entity.Cliente;
import com.github.jcarloscody.domain.repository.Clientes;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController //é uma anotacao especializada em controle, ele já vem com o responsebody, ou seja, não precisamos colocar o responsebody em nossos metodos
@RequestMapping("/api/clientesoutraforma")
public class ClienteControllerOutraForma {

    private Clientes clientesRepository;

    public ClienteControllerOutraForma(Clientes clientes ) { //aqui o spring já vai injetar
        this.clientesRepository = clientes;
    }


    @GetMapping("/{id}")  //neste agora iremos retornar o proprio objeto cliente
    public Cliente getClienteById(@PathVariable Integer id ){
        return clientesRepository.findById(id)
                .orElseThrow(()-> {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "cliente Não encontrado");
                });
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //aqui irá retornar o staus 200 caso seja efetuado
    public Cliente save (@RequestBody @Valid Cliente c){
        return this.clientesRepository.save(c);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        this.clientesRepository.findById(id).map(cliente ->{
             this.clientesRepository.delete(cliente);
             return Void.TYPE;
        }).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente nao encontrado!"));
    }


    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Integer id, @RequestBody @Valid Cliente c){
         this.clientesRepository.findById(id)
                .map(clienteExistente -> {
                    c.setId(clienteExistente.getId());
                     this.clientesRepository.save(c);
                     return Void.TYPE;
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

        return clientesRepository.findAll(example);
    }
}
