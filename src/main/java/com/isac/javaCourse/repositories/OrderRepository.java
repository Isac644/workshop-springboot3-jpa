package com.isac.javaCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isac.javaCourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
