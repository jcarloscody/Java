package com.github.jcarloscody.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "produto")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor //gerar construtor sem argumentos
@AllArgsConstructor // construtor com todos os argumentos
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "descricao cpf é obrigatório")
    private String descricao;

    @NotNull(message = "preco obrigatorio")
    private BigDecimal preco;



}
