package com.github.jcarloscody.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity  //mapeando com a especificao jpa
@Table(name = "cliente")  //nao é obrigatorio usar, a mesnos que o nome no banco seja diferente. pode usar o parametro shema=""
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor //gerar construtor sem argumentos
@AllArgsConstructor // construtor com todos os argumentos
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "id") //funciona no msmo raciocinio do @table. pode adicionar outras propriedade tbm
    private  Integer id;

    @Column(length = 100)
    @NotEmpty(message = "Campo nome é obrigatório")  //isso é um bean validation
    private  String nome;

    @Length(min = 11, max = 11)
    @NotEmpty(message = "Campo cpf é obrigatório")
    //@CPF(message="cpf inválido")
    private String cpf;

    @JsonIgnore//vai dizer para o passer, para o objeto transformador em json, q deve ignorar esta propriedade
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY) //um client para muitos pedidos - este aqui é opcional, pq quem tem a chave é o pedido a foreign key. por isso o mapeamento
    private Set<Pedido> pedidos; //poderia usar collection, list no lugar de set   //aqui estamos usando list. podemos usar qq um. um detalhe é que Set nao aceita itens repetidos


    public Cliente(String nome, String cpf) {
        this.nome = nome;        this.cpf = cpf;
    }


}
