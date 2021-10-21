package com.josue.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.josue.workshopmongo.domain.User;



@Repository
public interface UserRepository extends MongoRepository<User, String> {
	//<tipo da classe de dominio que ele vai gerenciar, tipo do id>

}
