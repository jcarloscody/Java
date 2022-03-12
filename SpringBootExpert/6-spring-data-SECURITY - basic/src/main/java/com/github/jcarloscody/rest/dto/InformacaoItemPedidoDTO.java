package com.github.jcarloscody.rest.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//vai gerar com todas essas propriedades um objeto respectivo e vai disponibilizar essa instancia para construirmos um objeto desse
public class InformacaoItemPedidoDTO {
    private String descricaoProduto;
    private BigDecimal precoUnitario;
    private Integer quantidade;
}
