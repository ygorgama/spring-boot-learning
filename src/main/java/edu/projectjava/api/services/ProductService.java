package edu.projectjava.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.projectjava.api.entities.Product;
import edu.projectjava.api.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productyRepository;
	
	public List<Product> findAll(){
		return productyRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> order = productyRepository.findById(id);
		return order.get();
	}
}
