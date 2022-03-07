package com.github.jcarloscody.domain.entity;

import lombok.*;

import javax.persistence.*;
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
    private String descricao;
    private BigDecimal preco;



}
