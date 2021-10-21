package com.udemy.cursoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.cursoSpring.entities.Order;
import com.udemy.cursoSpring.services.OrderService;

//para declarar que essa classe é um recurso web e que é implementado por um controlador rest
@RestController
@RequestMapping(value="/orders")  //nome do recurso  (caminho do recurso) 
public class OrderResource {
	
	//dependencia para o service
	@Autowired //para o spring fazer a injecao de dependencia
	private OrderService orderService;
	
	//tipo especifico no spring para retornar respostas de requisicoes web
	@GetMapping //indica que esse metodo responde as requisicoes do tipo get do http 
	public ResponseEntity<List<Order>> findAll() {
		
		List<Order> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	/* endpoint que vai buscar o User por Id.
	 * vai ser tbm uma requisicao do tipo get 
	 * vai passar na url o valor do Id do User.
	 * para isso colocamos ("parametro")*/
	@GetMapping(value = "/{id}")   
	public ResponseEntity<Order> findById(@PathVariable Long id){
		/* @PathVariable > para o string aceitar esse Id e considera-lo como
		 * parametro que vai chegar na url tenho que colocar essa anotacao */
		
		Order obj = orderService.findById(id);
		return ResponseEntity.ok().body(obj);
		
		
	}
	

}
