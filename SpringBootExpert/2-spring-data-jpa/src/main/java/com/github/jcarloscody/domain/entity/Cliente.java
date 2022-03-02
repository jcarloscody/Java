package com.github.jcarloscody.domain.entity;

import javax.persistence.*;

@Entity  //mapeando com a especificao jpa
@Table(name = "cliente")  //nao é obrigatorio usar, a mesnos que o nome no banco seja diferente. pode usar o parametro shema=""
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "id") //funciona no msmo raciocinio do @table. pode adicionar outras propriedade tbm
    private  Integer id;

    @Column(length = 100)
    private  String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
