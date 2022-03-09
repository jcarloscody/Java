package com.github.jcarloscody.rest.dto;

/*É classe simples que representa o padrao dto (data transfer object), é um padrao que serve para mapear o objeto com propriedades simples
e recebemos ele via requisicao e depois transforma ele e pegar os dados dele e cria conforme os modelos de dados

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


import com.github.jcarloscody.validation.NotEmptyList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    @NotNull(message = "{campo.codigo-cliente.obrigatorio}")  //isso é internalicionalizacao - pega uma propriedade do messages.properties
    private Integer cliente;

    @NotNull(message = "informa o total do cliente")
    private BigDecimal total;

    private String status;

   // @NotEmptyList(message = "Pedido nao pode ser realizado se itens")
    List<ItemPedidoDTO> listaItemPedidoDTO;


}
