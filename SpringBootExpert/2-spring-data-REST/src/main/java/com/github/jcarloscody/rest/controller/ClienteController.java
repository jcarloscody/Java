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
    )//consumes e produces podemos tirar, pq se trabalha so com json  o spring já trabalha por padrao
    @ResponseBody
    public String helloCliente( @PathVariable ("nome") String nomeCliente ){
        nomeCliente = "defaoutl";
        return String.format("hello %s", nomeCliente);
    }




    @GetMapping("/{id}")  //essa anotação junta o metodo e o value do requestmapping
    @ResponseBody //transforma o retorno em objeto de tipo json, se não colocar o spring vai procurar uma pagina web para retornar
    public ResponseEntity<Cliente> getClienteById(@PathVariable Integer id ){
        Optional<Cliente> cliente = clientes.findById(id);

        if(cliente.isPresent()){
            /*HttpHeaders httpHeaders = new HttpHeaders();
            List<String>  list = new ArrayList<>();
            list.add("token");
            httpHeaders.put("Authorization", list);
            ResponseEntity<Cliente> responseEntity = new ResponseEntity<>(cliente.get(), httpHeaders, HttpStatus.OK);*/
            return ResponseEntity.ok( cliente.get() );//ResponseEntity representa o corpo da resposta. ok - indica requisicao com sucesso status 200.
        }

        return ResponseEntity.notFound().build();
    }


    @PostMapping("")
    @ResponseBody
    public ResponseEntity<Cliente> save (@RequestBody Cliente c){
        Cliente cliente =  this.clientes.save(c);

        return ResponseEntity.ok(cliente);
    }


    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity delete (@PathVariable Integer id){
        Optional<Cliente> cliente = this.clientes.findById(id);

        if (cliente.isPresent()){
            this.clientes.delete(cliente.get());
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }

}
