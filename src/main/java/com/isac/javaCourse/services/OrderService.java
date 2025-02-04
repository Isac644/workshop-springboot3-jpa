package com.isac.javaCourse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isac.javaCourse.entities.Order;
import com.isac.javaCourse.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	public OrderRepository repository;
		
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
	public List<Order> findAll(){
		return repository.findAll();
	}
}
