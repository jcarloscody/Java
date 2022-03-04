package com.github.jcarloscody.rest.controller;

import com.github.jcarloscody.domain.entity.Cliente;
import com.github.jcarloscody.domain.repository.Clientes;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/api/clientes")
public class ClienteController {

    private Clientes clientes;


    public ClienteController( Clientes clientes ) { //aqui o spring já vai injetar
        this.clientes = clientes;
    }




    @RequestMapping(
            value = {"/hello/{nome}", "/h/{nome}"},
            method = RequestMethod.GET,
            consumes = {"application/json", "application/xml"},//consumes indica o tipo de conteudo que o metodo pode receber, aqui neste metodo nao faz sentido pq nao tem o requestbody para receber algum conteudo
            produces = {"application/json", "application/xml"} //segue a mesma logica, aqui o cliente vai colocar o valor l[a no content type
    )
    @ResponseBody
    public String helloCliente( @PathVariable ("nome") String nomeCliente ){
        nomeCliente = "defaoutl";
        return String.format("hello %s", nomeCliente);
    }




    @GetMapping("/{id}")  //essa anotação junta o metodo e o value do requestmapping
    @ResponseBody //transforma o retorno em objeto json, se não colocar o spring vai procurar uma pagina web para retornar
    public ResponseEntity getClienteById(@PathVariable Integer id ){
        Optional<Cliente> cliente = clientes.findById(id);

        if(cliente.isPresent()){
            return ResponseEntity.ok( cliente.get() );
        }

        return ResponseEntity.notFound().build();
    }
}
