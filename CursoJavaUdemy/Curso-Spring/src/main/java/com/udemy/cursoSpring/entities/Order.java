package com.udemy.cursoSpring.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.udemy.cursoSpring.entities.enums.OrderStatus;

@Entity
@Table(name = "tb_order") // cria uma tabela com esse nome
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd'T'HH:mm:ss'Z'", timezone = "GMT") //
	private Instant moment; // a classe Instant é bem melhor que a Date

	private Integer orderStatus;

	@ManyToOne // tranforma em fk de muitos para um, pois um user pode ter muitos orders
	@JoinColumn(name = "client_id") // dizer qual coluna do bd esta relacionado
	private User client; // um pedido pode ter apenas um usuario. é a fk

	@OneToMany(mappedBy = "id.order")//é mapeado por ele pq no OrderItem tem o id. //id de OrderItem e order de OrderItem
	private Set<OrderItem> itens = new HashSet<OrderItem>();
	
	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)// mapeamando com o mesmo codigo
	private Payment payment;
	
	public Order() {
	}

	public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
		super();
		id = id;
		this.moment = moment;
		setOrderStatus(orderStatus);
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return OrderStatus.valueOf(orderStatus);
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		if (orderStatus != null) {
			this.orderStatus = orderStatus.getCode();
		}
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	
	
	public Set<OrderItem> getItens() {
		return itens;
	}
	
	

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Double getTotal() {
		double sum = 0.0;
		for (OrderItem x : itens) {
			sum += x.getSubTotal();
		}
		return sum;
	}
	
	
	// COMPARAR OBJ
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}

}
