package com.isac.javaCourse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.isac.javaCourse.entities.Category;
import com.isac.javaCourse.entities.Order;
import com.isac.javaCourse.entities.User;
import com.isac.javaCourse.entities.enums.OrderStatus;
import com.isac.javaCourse.repositories.CategoryRepository;
import com.isac.javaCourse.repositories.OrderRepository;
import com.isac.javaCourse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public OrderRepository orderRepository;
	
	@Autowired
	public CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Jesse Pinkman", "pinkman@gmail.com", "0987654-3210", "1122");
		User u2 = new User(null, "Gustavo", "gus@gmail.com", "9876543-2198", "2894");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1); 
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
}
