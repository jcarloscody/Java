package com.udemy.cursoSpring.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;/*especificacao do JPA, temos tbm a hibernate que é a implementacao
								//JPA que bfoi baixada pelo maven quando a gente definiu as dependencias no .xml
								//mas sempre importaremos o persistence pq damos preferencia para especificacao*/
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//essa classe sera a entidade do modelo de dominio
//essas anotacoes sao do JPA que servem para instruir o JPA como ele vai converter os objetos
//para o modelo relacional
@Entity
@Table(name = "tb_user") //cria uma tabela com esse nome
public class User implements Serializable {
	/*
	 * vamos usar o Serializable pq queremos que nossos objetos dessa classe sejam
	 * transformados em cadeias de bytes com o fim de eles trafegar bna rede, para
	 * que sejam gravados em arquivos
	 */

	private static final long serialVersionUID = 1L;

	// 1º stap - basic attributes
	@Id // indicamos qual a pk do banco de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY) // informa que ela é autoincrementado no bd
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	@JsonIgnore
	@OneToMany(mappedBy = "client")  //indica o mapeamento da fk do user lá no Order 
	private List<Order> orders = new ArrayList<Order>(); // um usuario pode ter varios pedidos. fk do pedido

	// como estamos usando um framwork entao devemos usar um construtor vazio
	public User() {
	}

	public User(Long id, String name, String email, String phone, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	// get/set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {

		return password;
	}

	public List<Order> getOrders() {

		return orders;
	}

	// comparando obj
	public void setPassword(String password) {
		this.password = password;
	}

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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}
