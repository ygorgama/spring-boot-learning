package edu.projectjava.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.projectjava.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
