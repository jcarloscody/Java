package com.udemy.cursoSpring.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.udemy.cursoSpring.entities.User;
import com.udemy.cursoSpring.repositories.UserRepository;
import com.udemy.cursoSpring.services.exceptions.DatabaseException;
import com.udemy.cursoSpring.services.exceptions.ResourceNotFoundException;


 /* componente registration
			registra a classe como servico, componente... no mecanismo de injecao
			de dependencia. so assim a injecao de dependencia lá no UserResource
			vai funcionar*/
@Service
public class UserService {

	
	//dependencia para o UserRepository
	@Autowired //indicar a associacao que o spring tem que fazer com a UserService - injecao de dependencia
	private UserRepository userRepository;
	
	//busca todos os usuarios
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	
	//busca por Id
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		//return obj.get();
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		//orElseThrow -> vai tentar dar um get, se der treta vai lançar uma excecao
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		//userRepository.deleteById(id);
		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		try {
			User entity = userRepository.getOne(id);
			updateData(entity, obj);
			return userRepository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
			
		}	
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
}
