package com.isac.javaCourse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.isac.javaCourse.entities.User;
import com.isac.javaCourse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	public UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Jesse Pinkman", "pinkman@gmail.com", "0987654-3210", "1122");
		User u2 = new User(null, "Gustavo", "gus@gmail.com", "9876543-2198", "2894");

		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
