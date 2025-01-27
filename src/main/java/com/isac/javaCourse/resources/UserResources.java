package com.isac.javaCourse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isac.javaCourse.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Walter White", "raisenberg@gmail.com", "1234567-8901", "1234");
		return ResponseEntity.ok().body(u);
	}
}
