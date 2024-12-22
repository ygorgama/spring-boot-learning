package edu.projectjava.api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.projectjava.api.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
