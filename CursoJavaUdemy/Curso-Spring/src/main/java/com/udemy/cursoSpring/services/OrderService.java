package com.udemy.cursoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.cursoSpring.entities.Order;
import com.udemy.cursoSpring.repositories.OrderRepository;


 /* componente registration
			registra a classe como servico, componente... no mecanismo de injecao
			de dependencia. so assim a injecao de dependencia lá no UserResource
			vai funcionar*/
@Service
public class OrderService {

	
	//dependencia para o UserRepository
	@Autowired //indicar a associacao que o spring tem que fazer com a UserService - injecao de dependencia
	private OrderRepository orderRepository;
	
	//busca todos os usuarios
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	
	//busca por Id
	public Order findById(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
		//return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
}
