package com.udemy.cursoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import com.udemy.cursoSpring.entities.User;
import com.udemy.cursoSpring.services.UserService;

//para declarar que essa classe é um recurso web e que é implementado por um controlador rest
@RestController
@RequestMapping(value="/users")  //nome do recurso  (caminho do recurso) 
public class UserResource {
	
	//dependencia para o service
	@Autowired //para o spring fazer a injecao de dependencia
	private UserService userService;
	
	//tipo especifico no spring para retornar respostas de requisicoes web
	@GetMapping //indica que esse metodo responde as requisicoes do tipo get do http 
	public ResponseEntity<List<User>> findAll() {
		
		//User n = new User(1L, "sjoue", "sjdo", "12312", "asdim");
		//return ResponseEntity.ok().body(n);
		
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	/* endpoint que vai buscar o User por Id.
	 * vai ser tbm uma requisicao do tipo get 
	 * vai passar na url o valor do Id do User.
	 * para isso colocamos ("parametro")*/
	@GetMapping(value = "/{id}")   
	public ResponseEntity<User> findById(@PathVariable Long id){
		/* @PathVariable > para o string aceitar esse Id e considera-lo como
		 * parametro que vai chegar na url tenho que colocar essa anotacao */
		
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	

	@PostMapping  //usado para fazer insercao por meio do metodo post
	public ResponseEntity<User> insert(@RequestBody User obj) {//@RequestBody - informa que o obj vai chegar no modo json e vai deserializado para o objeto user
		obj = userService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
		//return ResponseEntity.ok().body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {//@PathVariable - para que a variavel Long id sejá reconhecida pela url 
		userService.delete(id);
		return ResponseEntity.noContent().build();
		//noContent() - retorna uma resposta vazia e o codigo http de uma resposta sem conteudo é o 204
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj) {
		obj = userService.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
	

}
