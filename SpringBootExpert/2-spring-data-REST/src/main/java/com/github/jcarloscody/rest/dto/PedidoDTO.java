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


import java.math.BigDecimal;
import java.util.List;

public class PedidoDTO {

    private Integer cliente;
    private BigDecimal total;
    List<ItemPedidoDTO> listaItemPedidoDTO;


}
