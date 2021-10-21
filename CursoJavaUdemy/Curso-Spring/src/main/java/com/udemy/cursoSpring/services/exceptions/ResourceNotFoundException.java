package com.udemy.cursoSpring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
//RuntimeException -> super classe que gera excecoes que o compilador nao te obriga a tratar
	
	private static final long serialVersionUID = 1L;//

	public ResourceNotFoundException(Object id) {
		//vai passar o id que nao foi encontrado
		super("Resource not found. Id " + id);//manda uma mensagbem para o construtor
		//da superclass de recurso nao encontrado
	}

}
