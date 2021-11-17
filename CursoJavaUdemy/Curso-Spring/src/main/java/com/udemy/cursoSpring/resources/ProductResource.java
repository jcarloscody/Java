package com.udemy.cursoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.cursoSpring.entities.Product;
import com.udemy.cursoSpring.services.ProductService;

//para declarar que essa classe é um recurso web e que é implementado por um controlador rest
@RestController
@RequestMapping(value="/products")  //nome do recurso  (caminho do recurso) 
public class ProductResource {
	
	//dependencia para o service
	@Autowired //para o spring fazer a injecao de dependencia
	private ProductService productService;
	
	//tipo especifico no spring para retornar respostas de requisicoes web
	@GetMapping //indica que esse metodo responde as requisicoes do tipo get do http 
	public ResponseEntity<List<Product>> findAll() {
		
		//Product n = new Product(1L, "sjoue", "sjdo", "12312", "asdim");
		//return ResponseEntity.ok().body(n);
		
		List<Product> list = productService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	/* endpoint que vai buscar o Product por Id.
	 * vai ser tbm uma requisicao do tipo get 
	 * vai passar na url o valor do Id do Product.
	 * para isso colocamos ("parametro")*/
	@GetMapping(value = "/{id}")   
	public ResponseEntity<Product> findById(@PathVariable Long id){
		/* @PathVariable > para o string aceitar esse Id e considera-lo como
		 * parametro que vai chegar na url tenho que colocar essa anotacao */
		
		Product obj = productService.findById(id);
		return ResponseEntity.ok().body(obj);
		
		
	}
	

}