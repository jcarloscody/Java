package com.udemy.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.cursoSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
