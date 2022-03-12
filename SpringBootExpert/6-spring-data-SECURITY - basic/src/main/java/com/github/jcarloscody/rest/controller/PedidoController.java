package com.github.jcarloscody.rest.controller;

import com.github.jcarloscody.domain.entity.ItemPedido;
import com.github.jcarloscody.domain.entity.Pedido;
import com.github.jcarloscody.domain.enums.StatusPedido;
import com.github.jcarloscody.rest.dto.AtualizacaoStatusPedidoDTO;
import com.github.jcarloscody.rest.dto.InformacaoItemPedidoDTO;
import com.github.jcarloscody.rest.dto.InformacoesPedidoDTO;
import com.github.jcarloscody.rest.dto.PedidoDTO;
import com.github.jcarloscody.service.PedidoServiceInterface;
import org.springframework.expression.ExpressionException;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.NO_CONTENT;

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

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Integer save (@RequestBody @Valid PedidoDTO pedidoDTO){
        Pedido pedido = pedidoServiceInterface.salvar(pedidoDTO);
        return pedido.getId();
    }

    @GetMapping("{id}")
    public InformacoesPedidoDTO getById(@PathVariable Integer id){
        return pedidoServiceInterface.obterPedidoCompleto(id)
                .map(pedidoCompleto -> converter(pedidoCompleto))
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pedido nao encontrado!"));
    }

    @PatchMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void updateStatus(@PathVariable Integer id ,
                             @RequestBody @Valid AtualizacaoStatusPedidoDTO dto){
        String novoStatus = dto.getStatus().equalsIgnoreCase("cancelado")? "CANCELADO" : "REALIZADO";

        pedidoServiceInterface.atualizaStatus(id, StatusPedido.valueOf(novoStatus));
    }


    private InformacoesPedidoDTO converter(Pedido p){
        return InformacoesPedidoDTO  //aqui estamos usando o @builder - temos acesso ao metodo estatico builder que conseguimos setar os valores sem precisar instanciar
                .builder()
                .codigo(p.getId())
                .cpf(p.getCliente().getCpf())
                .dataPedido(p.getDatePedido().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .total(p.getTotal())
                .nomeCliente(p.getCliente().getNome())
                .itens(converter(p.getItens()))
                .status(p.getStatus().name())
                .build();

    }

    private List<InformacaoItemPedidoDTO> converter (List<ItemPedido> itens){
        if (CollectionUtils.isEmpty(itens)){
            return Collections.emptyList();
        }

        return itens.stream().map(
                item -> InformacaoItemPedidoDTO.builder()
                        .descricaoProduto(item.getProduto().getDescricao())
                        .precoUnitario(item.getProduto().getPreco())
                        .quantidade(item.getQuantidade()).build()
        ).collect(Collectors.toList());
    }
}
