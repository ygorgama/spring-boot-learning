package edu.projectjava.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.projectjava.api.entities.OrderItem;
import edu.projectjava.api.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
