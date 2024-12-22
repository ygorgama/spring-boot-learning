package edu.projectjava.api.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.projectjava.api.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1, "Jose", "jose@gmail.com", "71902938278", "alasca");
		return ResponseEntity.ok().body(user);
	}
}
