package com.github.jcarloscody.domain.entity;

import com.github.jcarloscody.domain.enums.StatusPedido;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pedido")
@Data
public class Pedido{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "data_pedido")
    private LocalDate datePedido;

    @Column(name = "total",precision = 20, scale = 2)//aceita até 20 caracteres com 2 casas decimais
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens; //aqui estamos usando list. podemos usar qq um. um detalhe é que Set nao aceita itens repetidos

    @Enumerated(EnumType.STRING)  //vamos guardar como string,   ordinal seria a posicao
    @Column(name = "status")
    private StatusPedido status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDatePedido() {
        return datePedido;
    }

    public void setDatePedido(LocalDate datePedido) {
        this.datePedido = datePedido;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "datePedido=" + datePedido +
                ", total=" + total ;
    }
}
