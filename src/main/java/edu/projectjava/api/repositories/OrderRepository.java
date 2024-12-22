package edu.projectjava.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.projectjava.api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
