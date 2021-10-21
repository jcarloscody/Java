package com.udemy.cursoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.cursoSpring.entities.Product;
import com.udemy.cursoSpring.repositories.ProductRepository;


 /* componente registration
			registra a classe como servico, componente... no mecanismo de injecao
			de dependencia. so assim a injecao de dependencia lá no ProductResource
			vai funcionar*/
@Service
public class ProductService {

	
	//dependencia para o ProductRepository
	@Autowired //indicar a associacao que o spring tem que fazer com a ProductService - injecao de dependencia
	private ProductRepository productRepository;
	
	//busca todos os usuarios
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	
	//busca por Id
	public Product findById(Long id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
		//return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
}
