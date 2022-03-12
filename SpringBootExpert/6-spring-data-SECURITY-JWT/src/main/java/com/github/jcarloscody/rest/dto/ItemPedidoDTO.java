package com.github.jcarloscody.rest.dto;

/*
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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedidoDTO {

    private Integer quantidade;
    private Integer produto;
}
