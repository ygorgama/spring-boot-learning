package edu.projectjava.api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.projectjava.api.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
