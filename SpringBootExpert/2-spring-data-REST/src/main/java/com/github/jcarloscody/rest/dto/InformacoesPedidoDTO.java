package com.github.jcarloscody.rest.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder //vai gerar com todas essas propriedades um objeto respectivo e vai disponibilizar essa instancia para construirmos um objeto desse
public class InformacoesPedidoDTO {
    private Integer codigo;
    private String cpf;
    private String nomeCliente;
    private BigDecimal total;
    private String dataPedido;
    private String status;
    private List<InformacaoItemPedidoDTO> itens;
}
