package com.isac.javaCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isac.javaCourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
