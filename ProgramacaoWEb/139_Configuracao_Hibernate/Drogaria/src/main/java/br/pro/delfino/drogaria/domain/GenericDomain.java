package br.pro.delfino.drogaria.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")//avisa ao compilador para ignorar o serializable
@MappedSuperclass //notacao para dizer q essa classe nao corresponde a uma tabela. apenas para compartilhar a primary key
public class GenericDomain implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
}
